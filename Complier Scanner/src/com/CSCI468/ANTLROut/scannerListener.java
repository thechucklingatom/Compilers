// Generated from res/Grammars/scanner.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scannerParser}.
 */
public interface scannerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link scannerParser#pre}.
	 * @param ctx the parse tree
	 */
	void enterPre(scannerParser.PreContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#pre}.
	 * @param ctx the parse tree
	 */
	void exitPre(scannerParser.PreContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(scannerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(scannerParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclaration(scannerParser.VariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclaration(scannerParser.VariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#mathoperation}.
	 * @param ctx the parse tree
	 */
	void enterMathoperation(scannerParser.MathoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#mathoperation}.
	 * @param ctx the parse tree
	 */
	void exitMathoperation(scannerParser.MathoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#functionargs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionargs(scannerParser.FunctionargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#functionargs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionargs(scannerParser.FunctionargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#functionargs2}.
	 * @param ctx the parse tree
	 */
	void enterFunctionargs2(scannerParser.Functionargs2Context ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#functionargs2}.
	 * @param ctx the parse tree
	 */
	void exitFunctionargs2(scannerParser.Functionargs2Context ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#inputargs}.
	 * @param ctx the parse tree
	 */
	void enterInputargs(scannerParser.InputargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#inputargs}.
	 * @param ctx the parse tree
	 */
	void exitInputargs(scannerParser.InputargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#inputargs2}.
	 * @param ctx the parse tree
	 */
	void enterInputargs2(scannerParser.Inputargs2Context ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#inputargs2}.
	 * @param ctx the parse tree
	 */
	void exitInputargs2(scannerParser.Inputargs2Context ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#conditionalargs}.
	 * @param ctx the parse tree
	 */
	void enterConditionalargs(scannerParser.ConditionalargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#conditionalargs}.
	 * @param ctx the parse tree
	 */
	void exitConditionalargs(scannerParser.ConditionalargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#conditionalargs2}.
	 * @param ctx the parse tree
	 */
	void enterConditionalargs2(scannerParser.Conditionalargs2Context ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#conditionalargs2}.
	 * @param ctx the parse tree
	 */
	void exitConditionalargs2(scannerParser.Conditionalargs2Context ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(scannerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(scannerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#functionvariable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionvariable(scannerParser.FunctionvariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#functionvariable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionvariable(scannerParser.FunctionvariableContext ctx);
}