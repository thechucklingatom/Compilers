// Generated from res/Grammars/scanner.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scannerParser}.
 */
public interface scannerListener extends ParseTreeListener {
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
}