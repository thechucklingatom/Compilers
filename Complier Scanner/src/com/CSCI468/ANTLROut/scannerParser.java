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
		WS=1, KEYWORD=2, COMMENT=3, OPERATOR=4, STRINGLITERAL=5, INTLITERAL=6, 
		FLOATLITERAL=7, IDENTIFIER=8;
	public static final int
		RULE_pre = 0, RULE_start = 1, RULE_declare = 2, RULE_function = 3, RULE_statement = 4, 
		RULE_assignment = 5, RULE_returnstatement = 6, RULE_functiondeclaration = 7, 
		RULE_functionexecute = 8;
	public static final String[] ruleNames = {
		"pre", "start", "declare", "function", "statement", "assignment", "returnstatement", 
		"functiondeclaration", "functionexecute"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "KEYWORD", "COMMENT", "OPERATOR", "STRINGLITERAL", "INTLITERAL", 
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
			setState(18);
			start(0);
			setState(19);
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
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
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
		public FunctionexecuteContext functionexecute() {
			return getRuleContext(FunctionexecuteContext.class,0);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(22);
				match(KEYWORD);
				setState(23);
				match(WS);
				setState(24);
				match(IDENTIFIER);
				setState(25);
				match(WS);
				setState(26);
				match(OPERATOR);
				setState(27);
				match(WS);
				setState(28);
				match(STRINGLITERAL);
				setState(29);
				match(OPERATOR);
				setState(30);
				match(WS);
				}
				break;
			case 2:
				{
				setState(31);
				match(KEYWORD);
				setState(32);
				match(WS);
				setState(34); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(33);
						declare();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(36); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				{
				setState(38);
				match(KEYWORD);
				setState(39);
				match(WS);
				setState(40);
				match(IDENTIFIER);
				setState(41);
				match(WS);
				}
				break;
			case 4:
				{
				setState(42);
				match(KEYWORD);
				setState(43);
				match(WS);
				}
				break;
			case 5:
				{
				setState(44);
				functiondeclaration();
				setState(45);
				match(WS);
				}
				break;
			case 6:
				{
				setState(47);
				statement();
				setState(48);
				match(WS);
				}
				break;
			case 7:
				{
				setState(50);
				assignment();
				setState(51);
				match(WS);
				}
				break;
			case 8:
				{
				setState(53);
				returnstatement();
				setState(54);
				match(WS);
				}
				break;
			case 9:
				{
				setState(56);
				functionexecute();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
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
					setState(59);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(60);
					start(11);
					}
					} 
				}
				setState(65);
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
			setState(66);
			match(IDENTIFIER);
			setState(67);
			match(OPERATOR);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					match(WS);
					}
					} 
				}
				setState(73);
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(KEYWORD);
				setState(75);
				match(WS);
				setState(76);
				match(KEYWORD);
				setState(77);
				match(WS);
				setState(78);
				match(IDENTIFIER);
				setState(79);
				match(WS);
				setState(80);
				match(OPERATOR);
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					match(KEYWORD);
					setState(82);
					match(WS);
					setState(83);
					declare();
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KEYWORD );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(KEYWORD);
				setState(89);
				match(WS);
				setState(90);
				match(OPERATOR);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(91);
					match(WS);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(IDENTIFIER);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(98);
					match(WS);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(OPERATOR);
				setState(105);
				match(OPERATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(KEYWORD);
				setState(107);
				match(WS);
				setState(108);
				match(KEYWORD);
				setState(109);
				match(WS);
				setState(110);
				match(IDENTIFIER);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(111);
					match(WS);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(OPERATOR);
				setState(118);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(KEYWORD);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(122);
					match(WS);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(OPERATOR);
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(130);
				match(WS);
				setState(131);
				match(OPERATOR);
				setState(132);
				match(WS);
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(134);
				match(OPERATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(IDENTIFIER);
				setState(136);
				match(OPERATOR);
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(138);
					match(WS);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(OPERATOR);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(145);
					match(WS);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(152);
				match(OPERATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(KEYWORD);
				setState(154);
				match(OPERATOR);
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(157); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(156);
						match(OPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(159); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(IDENTIFIER);
				setState(162);
				match(OPERATOR);
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(165); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(164);
						match(OPERATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(167); 
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(IDENTIFIER);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(172);
					match(WS);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(OPERATOR);
				setState(197); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(179);
							match(WS);
							}
							}
							setState(184);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(185);
						_la = _input.LA(1);
						if ( !(_la==INTLITERAL || _la==IDENTIFIER) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(186);
							match(WS);
							}
							}
							setState(191);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(193); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(192);
							match(OPERATOR);
							}
							}
							setState(195); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==OPERATOR );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(199); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(IDENTIFIER);
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
				match(OPERATOR);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(209);
					match(WS);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				statement();
				setState(216);
				match(OPERATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(IDENTIFIER);
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219);
						match(WS);
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(225);
					match(OPERATOR);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(231);
					match(WS);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				statement();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(238);
					match(OPERATOR);
					}
					}
					setState(243);
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
			setState(246);
			match(KEYWORD);
			setState(247);
			match(WS);
			setState(260);
			switch (_input.LA(1)) {
			case INTLITERAL:
				{
				setState(248);
				match(INTLITERAL);
				}
				break;
			case KEYWORD:
			case IDENTIFIER:
				{
				setState(249);
				statement();
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(250);
						match(OPERATOR);
						setState(253);
						switch (_input.LA(1)) {
						case KEYWORD:
						case IDENTIFIER:
							{
							setState(251);
							statement();
							}
							break;
						case INTLITERAL:
							{
							setState(252);
							match(INTLITERAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(259);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
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

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORD() { return getTokens(scannerParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(scannerParser.KEYWORD, i);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(scannerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(scannerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(scannerParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(scannerParser.OPERATOR, i);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFunctiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFunctiondeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functiondeclaration);
		int _la;
		try {
			int _alt;
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(KEYWORD);
				setState(265);
				match(WS);
				setState(266);
				match(KEYWORD);
				setState(267);
				match(WS);
				setState(268);
				match(IDENTIFIER);
				setState(269);
				match(WS);
				setState(270);
				match(OPERATOR);
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(271);
					match(KEYWORD);
					setState(272);
					match(WS);
					setState(273);
					match(IDENTIFIER);
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(274);
							match(OPERATOR);
							}
							} 
						}
						setState(279);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					}
					}
					}
					setState(282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KEYWORD );
				setState(284);
				match(OPERATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(KEYWORD);
				setState(286);
				match(WS);
				setState(287);
				match(KEYWORD);
				setState(288);
				match(WS);
				setState(289);
				match(IDENTIFIER);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(290);
					match(WS);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				match(OPERATOR);
				setState(297);
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

	public static class FunctionexecuteContext extends ParserRuleContext {
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
		public FunctionexecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionexecute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFunctionexecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFunctionexecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitFunctionexecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionexecuteContext functionexecute() throws RecognitionException {
		FunctionexecuteContext _localctx = new FunctionexecuteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionexecute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(KEYWORD);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(301);
				match(WS);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(OPERATOR);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(308);
				match(IDENTIFIER);
				setState(309);
				match(OPERATOR);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(OPERATOR);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(316);
					match(WS);
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\u0145\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3%\n\3\r\3"+
		"\16\3&\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\7\3@\n\3\f\3\16\3C\13\3\3\4\3\4\3\4\7\4"+
		"H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5W\n\5"+
		"\r\5\16\5X\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3\5\3\5\7\5f\n\5\f"+
		"\5\16\5i\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5s\n\5\f\5\16\5v\13\5"+
		"\3\5\3\5\5\5z\n\5\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\6\3\6"+
		"\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00a0\n"+
		"\6\r\6\16\6\u00a1\3\6\3\6\3\6\3\6\6\6\u00a8\n\6\r\6\16\6\u00a9\5\6\u00ac"+
		"\n\6\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3\7\3\7\7\7\u00b7\n\7\f"+
		"\7\16\7\u00ba\13\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\3\7\6\7\u00c4"+
		"\n\7\r\7\16\7\u00c5\6\7\u00c8\n\7\r\7\16\7\u00c9\3\7\3\7\7\7\u00ce\n\7"+
		"\f\7\16\7\u00d1\13\7\3\7\3\7\7\7\u00d5\n\7\f\7\16\7\u00d8\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u00df\n\7\f\7\16\7\u00e2\13\7\3\7\7\7\u00e5\n\7\f\7\16"+
		"\7\u00e8\13\7\3\7\7\7\u00eb\n\7\f\7\16\7\u00ee\13\7\3\7\3\7\7\7\u00f2"+
		"\n\7\f\7\16\7\u00f5\13\7\5\7\u00f7\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0100\n\b\7\b\u0102\n\b\f\b\16\b\u0105\13\b\5\b\u0107\n\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0116\n\t\f\t\16\t\u0119"+
		"\13\t\6\t\u011b\n\t\r\t\16\t\u011c\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0126"+
		"\n\t\f\t\16\t\u0129\13\t\3\t\3\t\5\t\u012d\n\t\3\n\3\n\7\n\u0131\n\n\f"+
		"\n\16\n\u0134\13\n\3\n\3\n\3\n\7\n\u0139\n\n\f\n\16\n\u013c\13\n\3\n\3"+
		"\n\7\n\u0140\n\n\f\n\16\n\u0143\13\n\3\n\2\3\4\13\2\4\6\b\n\f\16\20\22"+
		"\2\3\4\2\b\b\n\n\u016b\2\24\3\2\2\2\4;\3\2\2\2\6D\3\2\2\2\by\3\2\2\2\n"+
		"\u00ab\3\2\2\2\f\u00f6\3\2\2\2\16\u00f8\3\2\2\2\20\u012c\3\2\2\2\22\u012e"+
		"\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\b\3\1\2\30\31"+
		"\7\4\2\2\31\32\7\3\2\2\32\33\7\n\2\2\33\34\7\3\2\2\34\35\7\6\2\2\35\36"+
		"\7\3\2\2\36\37\7\7\2\2\37 \7\6\2\2 <\7\3\2\2!\"\7\4\2\2\"$\7\3\2\2#%\5"+
		"\6\4\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'<\3\2\2\2()\7\4\2\2)"+
		"*\7\3\2\2*+\7\n\2\2+<\7\3\2\2,-\7\4\2\2-<\7\3\2\2./\5\20\t\2/\60\7\3\2"+
		"\2\60<\3\2\2\2\61\62\5\n\6\2\62\63\7\3\2\2\63<\3\2\2\2\64\65\5\f\7\2\65"+
		"\66\7\3\2\2\66<\3\2\2\2\678\5\16\b\289\7\3\2\29<\3\2\2\2:<\5\22\n\2;\27"+
		"\3\2\2\2;!\3\2\2\2;(\3\2\2\2;,\3\2\2\2;.\3\2\2\2;\61\3\2\2\2;\64\3\2\2"+
		"\2;\67\3\2\2\2;:\3\2\2\2<A\3\2\2\2=>\f\f\2\2>@\5\4\3\r?=\3\2\2\2@C\3\2"+
		"\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2\2\2DE\7\n\2\2EI\7\6\2\2FH\7"+
		"\3\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LM"+
		"\7\4\2\2MN\7\3\2\2NO\7\4\2\2OP\7\3\2\2PQ\7\n\2\2QR\7\3\2\2RV\7\6\2\2S"+
		"T\7\4\2\2TU\7\3\2\2UW\5\6\4\2VS\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Yz\3\2\2\2Z[\7\4\2\2[\\\7\3\2\2\\`\7\6\2\2]_\7\3\2\2^]\3\2\2\2_b\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cg\7\n\2\2df\7\3\2\2ed\3\2\2"+
		"\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\6\2\2kz\7\6\2"+
		"\2lm\7\4\2\2mn\7\3\2\2no\7\4\2\2op\7\3\2\2pt\7\n\2\2qs\7\3\2\2rq\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\6\2\2xz\7\6\2"+
		"\2yL\3\2\2\2yZ\3\2\2\2yl\3\2\2\2z\t\3\2\2\2{\177\7\4\2\2|~\7\3\2\2}|\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082\u0083\7\6\2\2\u0083\u0084\t\2\2\2\u0084\u0085"+
		"\7\3\2\2\u0085\u0086\7\6\2\2\u0086\u0087\7\3\2\2\u0087\u0088\t\2\2\2\u0088"+
		"\u00ac\7\6\2\2\u0089\u008a\7\n\2\2\u008a\u008b\7\6\2\2\u008b\u008f\t\2"+
		"\2\2\u008c\u008e\7\3\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0096\7\6\2\2\u0093\u0095\7\3\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\t\2\2\2\u009a\u00ac\7\6\2\2\u009b"+
		"\u009c\7\4\2\2\u009c\u009d\7\6\2\2\u009d\u009f\t\2\2\2\u009e\u00a0\7\6"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00ac\3\2\2\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\7\6"+
		"\2\2\u00a5\u00a7\t\2\2\2\u00a6\u00a8\7\6\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab{\3\2\2\2\u00ab\u0089\3\2\2\2\u00ab\u009b\3\2\2\2\u00ab\u00a3"+
		"\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00b1\7\n\2\2\u00ae\u00b0\7\3\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00c7\7\6\2\2\u00b5"+
		"\u00b7\7\3\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bf\t\2\2\2\u00bc\u00be\7\3\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c4\7\6\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00b8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00f7\3\2\2\2\u00cb\u00cf\7\n\2\2\u00cc\u00ce\7\3\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\7\6\2\2\u00d3"+
		"\u00d5\7\3\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\5\n\6\2\u00da\u00db\7\6\2\2\u00db\u00f7\3\2\2\2\u00dc\u00e0\7\n"+
		"\2\2\u00dd\u00df\7\3\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e5\7\6\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ec\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00eb\7\3\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f3\5\n\6\2\u00f0\u00f2\7\6\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00ad\3\2\2\2\u00f6\u00cb\3\2\2\2\u00f6"+
		"\u00dc\3\2\2\2\u00f7\r\3\2\2\2\u00f8\u00f9\7\4\2\2\u00f9\u0106\7\3\2\2"+
		"\u00fa\u0107\7\b\2\2\u00fb\u0103\5\n\6\2\u00fc\u00ff\7\6\2\2\u00fd\u0100"+
		"\5\n\6\2\u00fe\u0100\7\b\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00fc\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u00fa\3\2\2\2\u0106\u00fb\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\6"+
		"\2\2\u0109\17\3\2\2\2\u010a\u010b\7\4\2\2\u010b\u010c\7\3\2\2\u010c\u010d"+
		"\7\4\2\2\u010d\u010e\7\3\2\2\u010e\u010f\7\n\2\2\u010f\u0110\7\3\2\2\u0110"+
		"\u011a\7\6\2\2\u0111\u0112\7\4\2\2\u0112\u0113\7\3\2\2\u0113\u0117\7\n"+
		"\2\2\u0114\u0116\7\6\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u0111\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u012d\7\6\2\2\u011f\u0120\7\4"+
		"\2\2\u0120\u0121\7\3\2\2\u0121\u0122\7\4\2\2\u0122\u0123\7\3\2\2\u0123"+
		"\u0127\7\n\2\2\u0124\u0126\7\3\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\7\6\2\2\u012b\u012d\7\6\2\2\u012c\u010a\3\2"+
		"\2\2\u012c\u011f\3\2\2\2\u012d\21\3\2\2\2\u012e\u0132\7\4\2\2\u012f\u0131"+
		"\7\3\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u013a\7\6"+
		"\2\2\u0136\u0137\7\n\2\2\u0137\u0139\7\6\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u0141\7\6\2\2\u013e\u0140\7\3\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\23\3\2\2\2\u0143\u0141\3\2\2\2\'&;AIX`gty\177\u008f\u0096\u00a1"+
		"\u00a9\u00ab\u00b1\u00b8\u00bf\u00c5\u00c9\u00cf\u00d6\u00e0\u00e6\u00ec"+
		"\u00f3\u00f6\u00ff\u0103\u0106\u0117\u011c\u0127\u012c\u0132\u013a\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}