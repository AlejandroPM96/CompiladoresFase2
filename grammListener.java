// Generated from C:/Users/yoa_a/Desktop/CompiladoresFase2\gramm.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammParser}.
 */
public interface grammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammParser#corrule}.
	 * @param ctx the parse tree
	 */
	void enterCorrule(grammParser.CorruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#corrule}.
	 * @param ctx the parse tree
	 */
	void exitCorrule(grammParser.CorruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(grammParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(grammParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(grammParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(grammParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#queryObject}.
	 * @param ctx the parse tree
	 */
	void enterQueryObject(grammParser.QueryObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#queryObject}.
	 * @param ctx the parse tree
	 */
	void exitQueryObject(grammParser.QueryObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(grammParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(grammParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#mainCondition}.
	 * @param ctx the parse tree
	 */
	void enterMainCondition(grammParser.MainConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#mainCondition}.
	 * @param ctx the parse tree
	 */
	void exitMainCondition(grammParser.MainConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#complement}.
	 * @param ctx the parse tree
	 */
	void enterComplement(grammParser.ComplementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#complement}.
	 * @param ctx the parse tree
	 */
	void exitComplement(grammParser.ComplementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#events}.
	 * @param ctx the parse tree
	 */
	void enterEvents(grammParser.EventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#events}.
	 * @param ctx the parse tree
	 */
	void exitEvents(grammParser.EventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grammParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grammParser.ConditionContext ctx);
}