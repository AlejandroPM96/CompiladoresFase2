
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args)  {
    	
        try {
            CharStream input = CharStreams.fromStream(System.in);
            grammLexer lexer = new grammLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            grammParser parser = new grammParser(tokens);
            ParseTree tree = parser.corrule();
            System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            miListener listener = new miListener();
            walker.walk(listener, tree);
        }
        catch(Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}