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
	 * Visit a parse tree produced by {@link scannerParser#variabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclaration(scannerParser.VariabledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#mathoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathoperation(scannerParser.MathoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#functionargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionargs(scannerParser.FunctionargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#functionargs2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionargs2(scannerParser.Functionargs2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#inputargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
<<<<<<< HEAD
	T visitInputargs(scannerParser.InputargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#inputargs2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputargs2(scannerParser.Inputargs2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#conditionalargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalargs(scannerParser.ConditionalargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#conditionalargs2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalargs2(scannerParser.Conditionalargs2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(scannerParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#functionvariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionvariable(scannerParser.FunctionvariableContext ctx);
=======
	T visitReturnstatement(scannerParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(scannerParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#functionexecute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionexecute(scannerParser.FunctionexecuteContext ctx);
>>>>>>> origin/master
}