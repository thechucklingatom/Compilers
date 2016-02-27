// Generated from res/Grammars/scanner.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scannerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scannerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link scannerParser#pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre(scannerParser.PreContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(scannerParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(scannerParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(scannerParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(scannerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(scannerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(scannerParser.ReturnstatementContext ctx);
}