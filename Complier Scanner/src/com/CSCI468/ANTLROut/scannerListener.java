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
	 * Enter a parse tree produced by {@link scannerParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(scannerParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(scannerParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(scannerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(scannerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(scannerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(scannerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(scannerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(scannerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(scannerParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(scannerParser.ReturnstatementContext ctx);
}