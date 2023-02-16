// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BigCalcProgParser}.
 */
public interface BigCalcProgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BigCalcProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BigCalcProgParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigCalcProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BigCalcProgParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(BigCalcProgParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(BigCalcProgParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BigCalcProgParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BigCalcProgParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(BigCalcProgParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(BigCalcProgParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional(BigCalcProgParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional(BigCalcProgParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(BigCalcProgParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(BigCalcProgParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(BigCalcProgParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(BigCalcProgParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(BigCalcProgParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(BigCalcProgParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(BigCalcProgParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(BigCalcProgParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(BigCalcProgParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(BigCalcProgParser.MulDivContext ctx);
}