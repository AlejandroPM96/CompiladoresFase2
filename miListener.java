import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class miListener extends grammBaseListener {

    // main XML
    private ArrayList<String> XML = new ArrayList<>();
    private ArrayList<String> EPL = new ArrayList<>();

    // main rule
    private String ruleGroup = "";

    private String subcheck = "";
    private String operator1 = "";

    private String qualifier = "";

    private String status = "";

    // array for second test group
    private ArrayList<String> objectArray = new ArrayList<>();

    private int propertiesCounter = 0;
    private ArrayList<String> propertiesArray = new ArrayList<>();
    private ArrayList<String> valueArray = new ArrayList<>();

    // to help save relational operators inside properties
    private Stack<String> relopArray = new Stack<>();
    // linked with relop array
    private Stack<String> numberRelopArray = new Stack<>();
    // aux var
    private boolean relopBool = false;

    // time aux
    private int numberAux = 0;
    // units aux
    private String unitAux = "";
    private String ip = "";
    private String userID = "";
    private String userStatus = "";

    @Override
    public void exitCorrule(grammParser.CorruleContext ctx) {
        fillXML();
        fillEPL();
        try {
            printXML();
            printEPL();
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    @Override
    public void exitCheck(grammParser.CheckContext ctx) {
        super.exitCheck(ctx);
        if (ctx.LOGICALOPERATOR().size() > 0) {
            // Rule 1
            operator1 = ctx.LOGICALOPERATOR(0).getText();
        } else {
            if (ctx.IP() != null) {

                // Rule 2
                ip = ctx.IP().getText();
            } else {
                // Rule 3
                userID = ctx.ID().getText();
                userStatus = ctx.STATUSUSER().getText();
            }
        }
    }

    public void exitQueryObject(grammParser.QueryObjectContext ctx) {
        ruleGroup = ctx.getText();
    }

    @Override
    public void exitQuery(grammParser.QueryContext ctx) {
        status = ctx.STATUS().getText();
    }

    @Override
    public void exitEvents(grammParser.EventsContext ctx) {
        super.exitEvents(ctx);
        relopArray.push(ctx.RELOP().getText());
        numberRelopArray.add(ctx.INT().getText());
        relopBool = true;
    }

    @Override
    public void exitMainCondition(grammParser.MainConditionContext ctx) {
        super.exitMainCondition(ctx);
        subcheck = ctx.SUBCHECK().getText();
        status = ctx.STATUS().getText();
    }

    @Override
    public void exitComplement(grammParser.ComplementContext ctx) {
        super.exitComplement(ctx); // number units events
        relopArray.push(ctx.RELOP().getText());
        numberAux = Integer.parseInt(ctx.INT().getText());
        unitAux = ctx.TIMEUNIT().getText();
    }

    @Override
    public void exitCondition(grammParser.ConditionContext ctx) {
        super.exitCondition(ctx); // propertiesop value object
        propertiesCounter++;
        if (ctx.children.size() == 4)
            propertiesArray.add(ctx.LOGICALOPERATOR(0).getText());
        valueArray.add(ctx.QUANTITATIVE().getText());
        objectArray.add(ctx.OBJECT().getText());
        if (!relopBool) {
            relopArray.push("");
            numberRelopArray.add("");
        }
        relopBool = false;
    }

    private void printEPL() throws IOException {
        System.out.println();
        String fileContent = "";
        for (int i = 0; i < EPL.size(); i++) {
            System.out.println(EPL.get(i));
            fileContent += EPL.get(i) + "\n";
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("EPL.txt"));
        writer.write(fileContent);
        writer.close();
    }

    private void fillEPL() {
        EPL.add("@Name' " + status + " " + ruleGroup + "'");

        EPL.add("select * from eParser_eventStream.win:time_batch(" + numberAux + " min)");

        EPL.add("where (" + subcheck + status + ")");
    }

    @Override
    public void exitCond(grammParser.CondContext ctx) {
        super.exitCond(ctx);
        qualifier = ctx.QUANTITATIVE().getText();
    }

    private void printXML() {
        System.out.println();
        for (int i = 0; i < XML.size(); i++) {
            System.out.println((i + 1) + ". " + XML.get(i));
        }
    }

    private String concatenateObjects() {
        StringBuilder auxObjects = new StringBuilder();
        for (String anObjectArray : objectArray) {
            if (!auxObjects.toString().equals("")) {
                auxObjects.append(" and ");
            }
            auxObjects.append(anObjectArray);
        }
        return auxObjects.toString();
    }

    private String relopAux(int i) {
        String aux = "";

        switch (relopArray.pop()) {
        case "less than":
            aux = "lt";
            break;
        case "greater than":
            aux = "gt";
            break;
        case "equals to":
            aux = "et";
            break;
        case "within":
            return ("<property id=\"" + (i + 1) + "\" name=\"time\" unit=\"" + unitAux + "\" value=\"" + numberAux
                    + "\"/>");
        case "":
            return ("<property id=\"" + (i + 1) + "\" name=\"" + objectArray.get(i - 1) + "\" value=\""
                    + valueArray.get(i - 1).toUpperCase() + "\"/>");
        }
        return ("<property count=\"&" + aux + ";" + numberRelopArray.pop() + "\" id=\"" + (i + 1) + "\" name=\""
                + objectArray.get(i - 1) + "\" value=\"" + valueArray.get(i - 1).toUpperCase() + "\"/>");
    }

    private void fillXML() {
        int i = 0;
        // main id
        int id = 1;
        if (ip != "") {

        } else if (userStatus != "") {

        } else {
            XML.add("\t<rule group=\"" + ruleGroup + "\" id =\"" + id + "\" name =\"Authentication Rule " + id + "\">");
            int groupID = 1;
            XML.add("\t\t<test group=\"" + subcheck + "\" id=\"" + groupID + "\" operator=\"" + operator1.toUpperCase()
                    + "\">");
            XML.add("\t\t\t<properties>");
            int propertyID = 1;
            XML.add("\t\t\t\t<property id=\"" + propertyID + "\" name=\"" + subcheck + "\" qualifier=\""
                    + qualifier.toUpperCase() + "\" value=\"" + subcheck + " " + status + "\"/>");
            XML.add("\t\t\t</properties>");
            XML.add("\t\t</test>");
            // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            XML.add("\t\t<test group=\"" + concatenateObjects() + "\" id=\"" + (groupID + 1) + "\" operator=\""
                    + propertiesArray.get(groupID - 1).toUpperCase() + "\">");
            XML.add("\t\t\t<properties>");
            while (i < propertiesCounter + 1) {
                XML.add("\t\t\t\t" + relopAux(i));
                i++;
            }
            XML.add("\t\t\t</properties>");
            XML.add("\t\t</test>");
            // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            XML.add("\t</rule>");
        }

    }
}
