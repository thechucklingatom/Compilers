// Generated from res/Grammars/scanner.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scannerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, KEYWORD=3, COMMENT=4, OPERATOR=5, STRINGLITERAL=6, INTLITERAL=7, 
		FLOATLITERAL=8, IDENTIFIER=9;
	public static final int
		RULE_pre = 0, RULE_start = 1, RULE_declare = 2, RULE_function = 3, RULE_statement = 4, 
		RULE_assignment = 5, RULE_returnstatement = 6;
	public static final String[] ruleNames = {
		"pre", "start", "declare", "function", "statement", "assignment", "returnstatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ELSE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "KEYWORD", "COMMENT", "OPERATOR", "STRINGLITERAL", "INTLITERAL", 
		"FLOATLITERAL", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public scannerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PreContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode EOF() { return getToken(scannerParser.EOF, 0); }
		public PreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreContext pre() throws RecognitionException {
		PreContext _localctx = new PreContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			start(0);
			setState(15);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(scannerParser.KEYWORD, 0); }
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public List<TerminalNode> OPERATOR() { return getTokens(scannerParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(scannerParser.OPERATOR, i);
		}
		public TerminalNode STRINGLITERAL() { return getToken(scannerParser.STRINGLITERAL, 0); }
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		return start(0);
	}

	private StartContext start(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StartContext _localctx = new StartContext(_ctx, _parentState);
		StartContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_start, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(18);
				match(KEYWORD);
				setState(19);
				match(WS);
				setState(20);
				match(IDENTIFIER);
				setState(21);
				match(WS);
				setState(22);
				match(OPERATOR);
				setState(23);
				match(WS);
				setState(24);
				match(STRINGLITERAL);
				setState(25);
				match(OPERATOR);
				setState(26);
				match(WS);
				}
				break;
			case 2:
				{
				setState(27);
				match(KEYWORD);
				setState(28);
				match(WS);
				setState(30); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(29);
						declare();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(32); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				{
				setState(34);
				match(KEYWORD);
				setState(35);
				match(WS);
				setState(36);
				match(IDENTIFIER);
				setState(37);
				match(WS);
				}
				break;
			case 4:
				{
				setState(38);
				match(KEYWORD);
				setState(39);
				match(WS);
				}
				break;
			case 5:
				{
				setState(40);
				function();
				setState(41);
				match(WS);
				}
				break;
			case 6:
				{
				setState(43);
				statement();
				setState(44);
				match(WS);
				}
				break;
			case 7:
				{
				setState(46);
				assignment();
				setState(47);
				match(WS);
				}
				break;
			case 8:
				{
				setState(49);
				match(T__0);
				setState(50);
				match(WS);
				}
				break;
			case 9:
				{
				setState(51);
				returnstatement();
				setState(52);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StartContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_start);
					setState(56);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(57);
					start(11);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public TerminalNode OPERATOR() { return getToken(scannerParser.OPERATOR, 0); }
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IDENTIFIER);
			setState(64);
			match(OPERATOR);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(WS);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORD() { return getTokens(scannerParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(scannerParser.KEYWORD, i);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public List<TerminalNode> OPERATOR() { return getTokens(scannerParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(scannerParser.OPERATOR, i);
		}
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(KEYWORD);
				setState(72);
				match(WS);
				setState(73);
				match(KEYWORD);
				setState(74);
				match(WS);
				setState(75);
				match(IDENTIFIER);
				setState(76);
				match(WS);
				setState(77);
				match(OPERATOR);
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					match(KEYWORD);
					setState(79);
					match(WS);
					setState(80);
					declare();
					}
					}
					setState(83); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KEYWORD );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(KEYWORD);
				setState(86);
				match(WS);
				setState(87);
				match(OPERATOR);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(88);
					match(WS);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(IDENTIFIER);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(95);
					match(WS);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(OPERATOR);
				setState(102);
				match(OPERATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(KEYWORD);
				setState(104);
				match(WS);
				setState(105);
				match(KEYWORD);
				setState(106);
				match(WS);
				setState(107);
				match(IDENTIFIER);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(108);
					match(WS);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(OPERATOR);
				setState(115);
				match(OPERATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(scannerParser.KEYWORD, 0); }
		public List<TerminalNode> OPERATOR() { return getTokens(scannerParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(scannerParser.OPERATOR, i);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(scannerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(scannerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(scannerParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(scannerParser.INTLITERAL, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(KEYWORD);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(119);
					match(WS);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(OPERATOR);
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(127);
				match(WS);
				setState(128);
				match(OPERATOR);
				setState(129);
				match(WS);
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(131);
				match(OPERATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(IDENTIFIER);
				setState(133);
				match(OPERATOR);
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(135);
					match(WS);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(OPERATOR);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(142);
					match(WS);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(149);
				match(OPERATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(KEYWORD);
				setState(151);
				match(OPERATOR);
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(153);
						match(OPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(156); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(OPERATOR);
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(162); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(161);
						match(OPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(164); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(scannerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(scannerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(scannerParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(scannerParser.OPERATOR, i);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(scannerParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(scannerParser.INTLITERAL, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(IDENTIFIER);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(169);
					match(WS);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(OPERATOR);
				setState(190); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(176);
							match(WS);
							}
							}
							setState(181);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(182);
						_la = _input.LA(1);
						if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(183);
							match(WS);
							}
							}
							setState(188);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(189);
						match(OPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(192); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(IDENTIFIER);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(195);
					match(WS);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(OPERATOR);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(202);
					match(WS);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				statement();
				setState(209);
				match(OPERATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(IDENTIFIER);
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						match(WS);
						}
						} 
					}
					setState(217);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(218);
					match(OPERATOR);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(224);
					match(WS);
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				statement();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(231);
					match(OPERATOR);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(scannerParser.KEYWORD, 0); }
		public TerminalNode WS() { return getToken(scannerParser.WS, 0); }
		public List<TerminalNode> OPERATOR() { return getTokens(scannerParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(scannerParser.OPERATOR, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(scannerParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(scannerParser.INTLITERAL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(KEYWORD);
			setState(240);
			match(WS);
			setState(253);
			switch (_input.LA(1)) {
			case INTLITERAL:
				{
				setState(241);
				match(INTLITERAL);
				}
				break;
			case KEYWORD:
			case IDENTIFIER:
				{
				setState(242);
				statement();
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(243);
						match(OPERATOR);
						setState(246);
						switch (_input.LA(1)) {
						case KEYWORD:
						case IDENTIFIER:
							{
							setState(244);
							statement();
							}
							break;
						case INTLITERAL:
							{
							setState(245);
							match(INTLITERAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(255);
			match(OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return start_sempred((StartContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean start_sempred(StartContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3!\n\3\r\3\16\3\"\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\39\n\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\4\3\4\3\4\7\4E\n\4\f\4\16"+
		"\4H\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5T\n\5\r\5\16\5U\3"+
		"\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\3\5\7\5c\n\5\f\5\16\5f\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13\5\3\5\3\5\5\5"+
		"w\n\5\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6\3\6\7\6\u0092\n\6\f"+
		"\6\16\6\u0095\13\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u009d\n\6\r\6\16\6\u009e"+
		"\3\6\3\6\3\6\3\6\6\6\u00a5\n\6\r\6\16\6\u00a6\5\6\u00a9\n\6\3\7\3\7\7"+
		"\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\7\3\7\7\7\u00b4\n\7\f\7\16\7\u00b7"+
		"\13\7\3\7\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3\7\6\7\u00c1\n\7\r\7"+
		"\16\7\u00c2\3\7\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca\13\7\3\7\3\7\7\7\u00ce"+
		"\n\7\f\7\16\7\u00d1\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d8\n\7\f\7\16\7\u00db"+
		"\13\7\3\7\7\7\u00de\n\7\f\7\16\7\u00e1\13\7\3\7\7\7\u00e4\n\7\f\7\16\7"+
		"\u00e7\13\7\3\7\3\7\7\7\u00eb\n\7\f\7\16\7\u00ee\13\7\5\7\u00f0\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f9\n\b\7\b\u00fb\n\b\f\b\16\b\u00fe"+
		"\13\b\5\b\u0100\n\b\3\b\3\b\3\b\2\3\4\t\2\4\6\b\n\f\16\2\3\4\2\t\t\13"+
		"\13\u0124\2\20\3\2\2\2\48\3\2\2\2\6A\3\2\2\2\bv\3\2\2\2\n\u00a8\3\2\2"+
		"\2\f\u00ef\3\2\2\2\16\u00f1\3\2\2\2\20\21\5\4\3\2\21\22\7\2\2\3\22\3\3"+
		"\2\2\2\23\24\b\3\1\2\24\25\7\5\2\2\25\26\7\4\2\2\26\27\7\13\2\2\27\30"+
		"\7\4\2\2\30\31\7\7\2\2\31\32\7\4\2\2\32\33\7\b\2\2\33\34\7\7\2\2\349\7"+
		"\4\2\2\35\36\7\5\2\2\36 \7\4\2\2\37!\5\6\4\2 \37\3\2\2\2!\"\3\2\2\2\""+
		" \3\2\2\2\"#\3\2\2\2#9\3\2\2\2$%\7\5\2\2%&\7\4\2\2&\'\7\13\2\2\'9\7\4"+
		"\2\2()\7\5\2\2)9\7\4\2\2*+\5\b\5\2+,\7\4\2\2,9\3\2\2\2-.\5\n\6\2./\7\4"+
		"\2\2/9\3\2\2\2\60\61\5\f\7\2\61\62\7\4\2\2\629\3\2\2\2\63\64\7\3\2\2\64"+
		"9\7\4\2\2\65\66\5\16\b\2\66\67\7\4\2\2\679\3\2\2\28\23\3\2\2\28\35\3\2"+
		"\2\28$\3\2\2\28(\3\2\2\28*\3\2\2\28-\3\2\2\28\60\3\2\2\28\63\3\2\2\28"+
		"\65\3\2\2\29>\3\2\2\2:;\f\f\2\2;=\5\4\3\r<:\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AB\7\13\2\2BF\7\7\2\2CE\7\4\2\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IJ\7\5\2\2JK\7"+
		"\4\2\2KL\7\5\2\2LM\7\4\2\2MN\7\13\2\2NO\7\4\2\2OS\7\7\2\2PQ\7\5\2\2QR"+
		"\7\4\2\2RT\5\6\4\2SP\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2Vw\3\2\2\2W"+
		"X\7\5\2\2XY\7\4\2\2Y]\7\7\2\2Z\\\7\4\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`d\7\13\2\2ac\7\4\2\2ba\3\2\2\2cf\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\7\2\2hw\7\7\2\2ij\7\5"+
		"\2\2jk\7\4\2\2kl\7\5\2\2lm\7\4\2\2mq\7\13\2\2np\7\4\2\2on\3\2\2\2ps\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\7\2\2uw\7\7\2\2vI\3"+
		"\2\2\2vW\3\2\2\2vi\3\2\2\2w\t\3\2\2\2x|\7\5\2\2y{\7\4\2\2zy\3\2\2\2{~"+
		"\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\7\2\2"+
		"\u0080\u0081\t\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083\7\7\2\2\u0083\u0084"+
		"\7\4\2\2\u0084\u0085\t\2\2\2\u0085\u00a9\7\7\2\2\u0086\u0087\7\13\2\2"+
		"\u0087\u0088\7\7\2\2\u0088\u008c\t\2\2\2\u0089\u008b\7\4\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0093\7\7\2\2\u0090\u0092\7\4"+
		"\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\t\2"+
		"\2\2\u0097\u00a9\7\7\2\2\u0098\u0099\7\5\2\2\u0099\u009a\7\7\2\2\u009a"+
		"\u009c\t\2\2\2\u009b\u009d\7\7\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a9\3\2\2\2\u00a0"+
		"\u00a1\7\13\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a5\7"+
		"\7\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8x\3\2\2\2\u00a8\u0086\3\2\2\2"+
		"\u00a8\u0098\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a9\13\3\2\2\2\u00aa\u00ae"+
		"\7\13\2\2\u00ab\u00ad\7\4\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00c0\7\7\2\2\u00b2\u00b4\7\4\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bc\t\2\2\2\u00b9\u00bb\7\4\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7\7\2\2\u00c0"+
		"\u00b5\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00f0\3\2\2\2\u00c4\u00c8\7\13\2\2\u00c5\u00c7\7\4\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\7\7\2\2\u00cc"+
		"\u00ce\7\4\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\5\n\6\2\u00d3\u00d4\7\7\2\2\u00d4\u00f0\3\2\2\2\u00d5\u00d9\7\13"+
		"\2\2\u00d6\u00d8\7\4\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00df\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00de\7\7\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e5\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e4\7\4\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00ec\5\n\6\2\u00e9\u00eb\7\7\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00aa\3\2\2\2\u00ef\u00c4\3\2\2\2\u00ef"+
		"\u00d5\3\2\2\2\u00f0\r\3\2\2\2\u00f1\u00f2\7\5\2\2\u00f2\u00ff\7\4\2\2"+
		"\u00f3\u0100\7\t\2\2\u00f4\u00fc\5\n\6\2\u00f5\u00f8\7\7\2\2\u00f6\u00f9"+
		"\5\n\6\2\u00f7\u00f9\7\t\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u00f3\3\2\2\2\u00ff\u00f4\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\7"+
		"\2\2\u0102\17\3\2\2\2\37\"8>FU]dqv|\u008c\u0093\u009e\u00a6\u00a8\u00ae"+
		"\u00b5\u00bc\u00c2\u00c8\u00cf\u00d9\u00df\u00e5\u00ec\u00ef\u00f8\u00fc"+
		"\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}