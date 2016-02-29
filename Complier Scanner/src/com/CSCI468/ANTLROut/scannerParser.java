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
<<<<<<< HEAD
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, SYSTEMFUNCTION=11, CONDITIONAL=12, KEYWORD=13, TYPE=14, COMMENT=15, 
		OPERATOR=16, MATHOPERATOR=17, COMPARISONOPERATOR=18, STRINGLITERAL=19, 
		INTLITERAL=20, FLOATLITERAL=21, IDENTIFIER=22;
	public static final int
		RULE_pre = 0, RULE_start = 1, RULE_variabledeclaration = 2, RULE_mathoperation = 3, 
		RULE_functionargs = 4, RULE_functionargs2 = 5, RULE_inputargs = 6, RULE_inputargs2 = 7, 
		RULE_conditionalargs = 8, RULE_conditionalargs2 = 9, RULE_variable = 10, 
		RULE_functionvariable = 11;
	public static final String[] ruleNames = {
		"pre", "start", "variabledeclaration", "mathoperation", "functionargs", 
		"functionargs2", "inputargs", "inputargs2", "conditionalargs", "conditionalargs2", 
		"variable", "functionvariable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "':='", "';'", "'FUNCTION'", "'VOID'", "'('", "')'", 
		"'RETURN'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WS", "SYSTEMFUNCTION", 
		"CONDITIONAL", "KEYWORD", "TYPE", "COMMENT", "OPERATOR", "MATHOPERATOR", 
		"COMPARISONOPERATOR", "STRINGLITERAL", "INTLITERAL", "FLOATLITERAL", "IDENTIFIER"
=======
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
>>>>>>> origin/master
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
<<<<<<< HEAD
			setState(24);
			start(0);
			setState(25);
=======
			setState(18);
			start(0);
			setState(19);
>>>>>>> origin/master
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
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public TerminalNode KEYWORD() { return getToken(scannerParser.KEYWORD, 0); }
		public TerminalNode TYPE() { return getToken(scannerParser.TYPE, 0); }
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public TerminalNode STRINGLITERAL() { return getToken(scannerParser.STRINGLITERAL, 0); }
		public TerminalNode INTLITERAL() { return getToken(scannerParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(scannerParser.FLOATLITERAL, 0); }
		public FunctionargsContext functionargs() {
			return getRuleContext(FunctionargsContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
<<<<<<< HEAD
		public MathoperationContext mathoperation() {
			return getRuleContext(MathoperationContext.class,0);
=======
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
>>>>>>> origin/master
		}
		public TerminalNode SYSTEMFUNCTION() { return getToken(scannerParser.SYSTEMFUNCTION, 0); }
		public InputargsContext inputargs() {
			return getRuleContext(InputargsContext.class,0);
		}
		public TerminalNode CONDITIONAL() { return getToken(scannerParser.CONDITIONAL, 0); }
		public ConditionalargsContext conditionalargs() {
			return getRuleContext(ConditionalargsContext.class,0);
		}
<<<<<<< HEAD
		public TerminalNode COMMENT() { return getToken(scannerParser.COMMENT, 0); }
=======
		public FunctionexecuteContext functionexecute() {
			return getRuleContext(FunctionexecuteContext.class,0);
		}
>>>>>>> origin/master
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(160);
=======
			setState(57);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(28);
				match(T__0);
				setState(29);
				match(WS);
				setState(30);
				match(IDENTIFIER);
				setState(31);
=======
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
>>>>>>> origin/master
				match(WS);
				}
				break;
			case 2:
				{
<<<<<<< HEAD
				setState(32);
				match(T__0);
				setState(33);
				match(WS);
				setState(34);
				match(IDENTIFIER);
				setState(35);
				match(WS);
				setState(36);
				match(KEYWORD);
				setState(37);
=======
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
>>>>>>> origin/master
				match(WS);
				}
				break;
			case 3:
				{
				setState(42);
				match(KEYWORD);
				setState(43);
				match(WS);
				}
				break;
			case 4:
				{
<<<<<<< HEAD
				setState(40);
				match(TYPE);
				setState(41);
=======
				setState(44);
				functiondeclaration();
				setState(45);
>>>>>>> origin/master
				match(WS);
				setState(42);
				match(IDENTIFIER);
				setState(43);
				variabledeclaration();
				}
				break;
			case 5:
				{
				setState(46);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(44);
					match(TYPE);
					setState(45);
					match(WS);
					}
				}

				setState(48);
				match(IDENTIFIER);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(49);
					match(WS);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__1);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(56);
					match(WS);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(STRINGLITERAL);
				setState(63);
				match(T__2);
				setState(64);
				match(WS);
				}
				break;
			case 6:
				{
<<<<<<< HEAD
				setState(67);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(65);
					match(TYPE);
					setState(66);
					match(WS);
					}
				}

				setState(69);
				match(IDENTIFIER);
				setState(70);
				match(T__1);
				setState(71);
				match(INTLITERAL);
				setState(72);
				match(T__2);
				setState(73);
=======
				setState(47);
				statement();
				setState(48);
>>>>>>> origin/master
				match(WS);
				}
				break;
			case 7:
				{
<<<<<<< HEAD
				setState(76);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(74);
					match(TYPE);
					setState(75);
					match(WS);
					}
				}

				setState(78);
				match(IDENTIFIER);
				setState(79);
				match(T__1);
				setState(80);
				match(FLOATLITERAL);
				setState(81);
				match(T__2);
				setState(82);
=======
				setState(50);
				assignment();
				setState(51);
>>>>>>> origin/master
				match(WS);
				}
				break;
			case 8:
				{
<<<<<<< HEAD
				setState(83);
				match(T__3);
				setState(84);
				match(WS);
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==TYPE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(86);
				match(WS);
				setState(87);
				match(IDENTIFIER);
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
				match(T__5);
				setState(95);
				functionargs();
				setState(96);
				match(T__6);
				setState(97);
=======
				setState(53);
				returnstatement();
				setState(54);
>>>>>>> origin/master
				match(WS);
				}
				break;
			case 9:
				{
<<<<<<< HEAD
				setState(99);
				match(IDENTIFIER);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(100);
					match(WS);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__1);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(107);
					match(WS);
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(113);
					match(T__5);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				variable();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(120);
					match(T__6);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				mathoperation();
				}
				break;
			case 10:
				{
				setState(128);
				match(T__7);
				setState(129);
				match(WS);
				setState(130);
				variable();
				setState(131);
				mathoperation();
				}
				break;
			case 11:
				{
				setState(133);
				match(SYSTEMFUNCTION);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(134);
					match(WS);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__5);
				setState(141);
				inputargs();
				setState(142);
				match(T__6);
				setState(143);
				match(T__2);
				setState(144);
				match(WS);
				}
				break;
			case 12:
				{
				setState(146);
				match(CONDITIONAL);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(147);
					match(WS);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__5);
				setState(154);
				variable();
				setState(155);
				conditionalargs();
				setState(156);
				match(T__6);
				setState(157);
				match(WS);
				}
				break;
			case 13:
				{
				setState(159);
				match(COMMENT);
=======
				setState(56);
				functionexecute();
>>>>>>> origin/master
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
<<<<<<< HEAD
			setState(166);
=======
			setState(63);
>>>>>>> origin/master
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StartContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_start);
<<<<<<< HEAD
					setState(162);
					if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
					setState(163);
					start(15);
					}
					} 
				}
				setState(168);
=======
					setState(59);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(60);
					start(11);
					}
					} 
				}
				setState(65);
>>>>>>> origin/master
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterVariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitVariabledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitVariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variabledeclaration);
		int _la;
		try {
<<<<<<< HEAD
			setState(180);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__8);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(170);
=======
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
>>>>>>> origin/master
					match(WS);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
<<<<<<< HEAD
				setState(176);
				match(IDENTIFIER);
				setState(177);
				variabledeclaration();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__2);
				setState(179);
				match(WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
=======
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
>>>>>>> origin/master
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

	public static class MathoperationContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode MATHOPERATOR() { return getToken(scannerParser.MATHOPERATOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MathoperationContext mathoperation() {
			return getRuleContext(MathoperationContext.class,0);
		}
		public MathoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterMathoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitMathoperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitMathoperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathoperationContext mathoperation() throws RecognitionException {
		MathoperationContext _localctx = new MathoperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mathoperation);
		int _la;
		try {
<<<<<<< HEAD
			setState(212);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__2);
				setState(183);
				match(WS);
				}
				break;
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(184);
					match(WS);
					}
					}
					setState(189);
=======
					setState(81);
					match(KEYWORD);
					setState(82);
					match(WS);
					setState(83);
					declare();
					}
					}
					setState(86); 
>>>>>>> origin/master
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
<<<<<<< HEAD
				setState(190);
				match(MATHOPERATOR);
				setState(194);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(191);
					match(WS);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
<<<<<<< HEAD
					setState(197);
					match(T__5);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				variable();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(204);
					match(T__6);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				mathoperation();
=======
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
>>>>>>> origin/master
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionargsContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(scannerParser.TYPE, 0); }
		public TerminalNode WS() { return getToken(scannerParser.WS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public Functionargs2Context functionargs2() {
			return getRuleContext(Functionargs2Context.class,0);
		}
		public FunctionargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFunctionargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFunctionargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitFunctionargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionargsContext functionargs() throws RecognitionException {
		FunctionargsContext _localctx = new FunctionargsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionargs);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(214);
				match(TYPE);
				setState(215);
				match(WS);
				setState(216);
				match(IDENTIFIER);
				setState(217);
				functionargs2();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Functionargs2Context extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(scannerParser.TYPE, 0); }
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public Functionargs2Context functionargs2() {
			return getRuleContext(Functionargs2Context.class,0);
		}
		public Functionargs2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionargs2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFunctionargs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFunctionargs2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitFunctionargs2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functionargs2Context functionargs2() throws RecognitionException {
		Functionargs2Context _localctx = new Functionargs2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionargs2);
		int _la;
		try {
			setState(233);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__8);
				setState(225);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(222);
					match(WS);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(TYPE);
				setState(229);
				match(WS);
				setState(230);
				match(IDENTIFIER);
				setState(231);
				functionargs2();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InputargsContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Inputargs2Context inputargs2() {
			return getRuleContext(Inputargs2Context.class,0);
		}
		public InputargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterInputargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitInputargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitInputargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputargsContext inputargs() throws RecognitionException {
		InputargsContext _localctx = new InputargsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inputargs);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case INTLITERAL:
			case FLOATLITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				variable();
				setState(236);
				inputargs2();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
=======
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
>>>>>>> origin/master
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Inputargs2Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public Inputargs2Context inputargs2() {
			return getRuleContext(Inputargs2Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode MATHOPERATOR() { return getToken(scannerParser.MATHOPERATOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Inputargs2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputargs2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterInputargs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitInputargs2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitInputargs2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inputargs2Context inputargs2() throws RecognitionException {
		Inputargs2Context _localctx = new Inputargs2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_inputargs2);
		int _la;
		try {
			int _alt;
<<<<<<< HEAD
			setState(279);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__8);
				setState(245);
=======
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(KEYWORD);
				setState(125);
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(242);
					match(WS);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(IDENTIFIER);
				setState(249);
				inputargs2();
=======
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
>>>>>>> origin/master
				}
				break;
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(253);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(250);
					match(WS);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(MATHOPERATOR);
				setState(260);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(257);
					match(WS);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				_errHandler.sync(this);
=======
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
>>>>>>> origin/master
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(263);
					match(T__5);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
<<<<<<< HEAD
				setState(269);
				variable();
				setState(273);
=======
				setState(157); 
>>>>>>> origin/master
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< HEAD
						setState(270);
						match(T__6);
=======
						setState(156);
						match(OPERATOR);
						}
>>>>>>> origin/master
						}
						} 
					}
<<<<<<< HEAD
					setState(275);
=======
					setState(159); 
>>>>>>> origin/master
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(276);
				inputargs2();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
=======
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
>>>>>>> origin/master
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionalargsContext extends ParserRuleContext {
		public TerminalNode MATHOPERATOR() { return getToken(scannerParser.MATHOPERATOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConditionalargsContext conditionalargs() {
			return getRuleContext(ConditionalargsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode COMPARISONOPERATOR() { return getToken(scannerParser.COMPARISONOPERATOR, 0); }
		public Conditionalargs2Context conditionalargs2() {
			return getRuleContext(Conditionalargs2Context.class,0);
		}
		public ConditionalargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterConditionalargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitConditionalargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitConditionalargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalargsContext conditionalargs() throws RecognitionException {
		ConditionalargsContext _localctx = new ConditionalargsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalargs);
		int _la;
		try {
			int _alt;
<<<<<<< HEAD
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
=======
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(IDENTIFIER);
				setState(175);
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(281);
					match(WS);
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				match(MATHOPERATOR);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(288);
					match(WS);
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(294);
				variable();
				setState(295);
				conditionalargs();
=======
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
>>>>>>> origin/master
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(300);
=======
				setState(201);
				match(IDENTIFIER);
				setState(205);
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(297);
					match(WS);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				match(COMPARISONOPERATOR);
				setState(307);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(304);
					match(WS);
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(310);
					match(T__5);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
				variable();
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
=======
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
>>>>>>> origin/master
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< HEAD
						setState(317);
						match(T__6);
						}
						} 
					}
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(323);
				conditionalargs2();
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

	public static class Conditionalargs2Context extends ParserRuleContext {
		public TerminalNode MATHOPERATOR() { return getToken(scannerParser.MATHOPERATOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Conditionalargs2Context conditionalargs2() {
			return getRuleContext(Conditionalargs2Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public Conditionalargs2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalargs2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterConditionalargs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitConditionalargs2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitConditionalargs2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditionalargs2Context conditionalargs2() throws RecognitionException {
		Conditionalargs2Context _localctx = new Conditionalargs2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionalargs2);
		int _la;
		try {
			int _alt;
			setState(355);
			switch (_input.LA(1)) {
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(327);
					match(WS);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333);
				match(MATHOPERATOR);
				setState(337);
=======
					setState(225);
					match(OPERATOR);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
<<<<<<< HEAD
					setState(334);
					match(WS);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				variable();
				setState(344);
=======
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
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
<<<<<<< HEAD
					setState(341);
					match(T__5);
					}
					}
					setState(346);
=======
					setState(238);
					match(OPERATOR);
					}
					}
					setState(243);
>>>>>>> origin/master
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
				conditionalargs2();
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						match(T__6);
						}
						} 
					}
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public TerminalNode INTLITERAL() { return getToken(scannerParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(scannerParser.FLOATLITERAL, 0); }
		public FunctionvariableContext functionvariable() {
			return getRuleContext(FunctionvariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
<<<<<<< HEAD
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
=======
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
>>>>>>> origin/master
				match(INTLITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(359);
				match(FLOATLITERAL);
=======
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
>>>>>>> origin/master
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				functionvariable();
				}
				break;
			}
<<<<<<< HEAD
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

	public static class FunctionvariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public InputargsContext inputargs() {
			return getRuleContext(InputargsContext.class,0);
		}
		public FunctionvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionvariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFunctionvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFunctionvariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitFunctionvariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionvariableContext functionvariable() throws RecognitionException {
		FunctionvariableContext _localctx = new FunctionvariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(IDENTIFIER);
			setState(364);
			match(T__5);
			setState(365);
			inputargs();
			setState(366);
			match(T__6);
=======
			setState(262);
			match(OPERATOR);
>>>>>>> origin/master
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
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
<<<<<<< HEAD
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u0173\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3\3\7\3\65\n\3"+
		"\f\3\16\38\13\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3F\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3\3\7\3o\n\3\f\3\16\3r\13\3\3\3\7\3u\n"+
		"\3\f\3\16\3x\13\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3\u008a\n\3\f\3\16\3\u008d\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3\u0097\n\3\f\3\16\3\u009a\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00a3\n\3\3\3\3\3\7\3\u00a7\n\3\f\3\16\3\u00aa\13\3\3\4\3\4"+
		"\7\4\u00ae\n\4\f\4\16\4\u00b1\13\4\3\4\3\4\3\4\3\4\5\4\u00b7\n\4\3\5\3"+
		"\5\3\5\7\5\u00bc\n\5\f\5\16\5\u00bf\13\5\3\5\3\5\7\5\u00c3\n\5\f\5\16"+
		"\5\u00c6\13\5\3\5\7\5\u00c9\n\5\f\5\16\5\u00cc\13\5\3\5\3\5\7\5\u00d0"+
		"\n\5\f\5\16\5\u00d3\13\5\3\5\3\5\5\5\u00d7\n\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00de\n\6\3\7\3\7\7\7\u00e2\n\7\f\7\16\7\u00e5\13\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00ec\n\7\3\b\3\b\3\b\3\b\5\b\u00f2\n\b\3\t\3\t\7\t\u00f6\n\t\f"+
		"\t\16\t\u00f9\13\t\3\t\3\t\3\t\7\t\u00fe\n\t\f\t\16\t\u0101\13\t\3\t\3"+
		"\t\7\t\u0105\n\t\f\t\16\t\u0108\13\t\3\t\7\t\u010b\n\t\f\t\16\t\u010e"+
		"\13\t\3\t\3\t\7\t\u0112\n\t\f\t\16\t\u0115\13\t\3\t\3\t\3\t\5\t\u011a"+
		"\n\t\3\n\7\n\u011d\n\n\f\n\16\n\u0120\13\n\3\n\3\n\7\n\u0124\n\n\f\n\16"+
		"\n\u0127\13\n\3\n\3\n\3\n\3\n\7\n\u012d\n\n\f\n\16\n\u0130\13\n\3\n\3"+
		"\n\7\n\u0134\n\n\f\n\16\n\u0137\13\n\3\n\7\n\u013a\n\n\f\n\16\n\u013d"+
		"\13\n\3\n\3\n\7\n\u0141\n\n\f\n\16\n\u0144\13\n\3\n\3\n\5\n\u0148\n\n"+
		"\3\13\7\13\u014b\n\13\f\13\16\13\u014e\13\13\3\13\3\13\7\13\u0152\n\13"+
		"\f\13\16\13\u0155\13\13\3\13\3\13\7\13\u0159\n\13\f\13\16\13\u015c\13"+
		"\13\3\13\3\13\7\13\u0160\n\13\f\13\16\13\u0163\13\13\3\13\5\13\u0166\n"+
		"\13\3\f\3\f\3\f\3\f\5\f\u016c\n\f\3\r\3\r\3\r\3\r\3\r\3\r\2\3\4\16\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\2\3\4\2\7\7\20\20\u01a0\2\32\3\2\2\2\4\u00a2"+
		"\3\2\2\2\6\u00b6\3\2\2\2\b\u00d6\3\2\2\2\n\u00dd\3\2\2\2\f\u00eb\3\2\2"+
		"\2\16\u00f1\3\2\2\2\20\u0119\3\2\2\2\22\u0147\3\2\2\2\24\u0165\3\2\2\2"+
		"\26\u016b\3\2\2\2\30\u016d\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3"+
		"\2\2\2\35\36\b\3\1\2\36\37\7\3\2\2\37 \7\f\2\2 !\7\30\2\2!\u00a3\7\f\2"+
		"\2\"#\7\3\2\2#$\7\f\2\2$%\7\30\2\2%&\7\f\2\2&\'\7\17\2\2\'\u00a3\7\f\2"+
		"\2()\7\17\2\2)\u00a3\7\f\2\2*+\7\20\2\2+,\7\f\2\2,-\7\30\2\2-\u00a3\5"+
		"\6\4\2./\7\20\2\2/\61\7\f\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2"+
		"\62\66\7\30\2\2\63\65\7\f\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29=\7\4\2\2:<\7\f\2\2;:\3\2\2\2<"+
		"?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\25\2\2AB\7\5\2\2"+
		"B\u00a3\7\f\2\2CD\7\20\2\2DF\7\f\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7"+
		"\30\2\2HI\7\4\2\2IJ\7\26\2\2JK\7\5\2\2K\u00a3\7\f\2\2LM\7\20\2\2MO\7\f"+
		"\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\30\2\2QR\7\4\2\2RS\7\27\2\2ST\7"+
		"\5\2\2T\u00a3\7\f\2\2UV\7\6\2\2VW\7\f\2\2WX\t\2\2\2XY\7\f\2\2Y]\7\30\2"+
		"\2Z\\\7\f\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2"+
		"\2\2`a\7\b\2\2ab\5\n\6\2bc\7\t\2\2cd\7\f\2\2d\u00a3\3\2\2\2ei\7\30\2\2"+
		"fh\7\f\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2"+
		"lp\7\4\2\2mo\7\f\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qv\3\2\2\2"+
		"rp\3\2\2\2su\7\b\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2"+
		"xv\3\2\2\2y}\5\26\f\2z|\7\t\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2"+
		"\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\5\b\5\2\u0081\u00a3\3\2\2"+
		"\2\u0082\u0083\7\n\2\2\u0083\u0084\7\f\2\2\u0084\u0085\5\26\f\2\u0085"+
		"\u0086\5\b\5\2\u0086\u00a3\3\2\2\2\u0087\u008b\7\r\2\2\u0088\u008a\7\f"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\b"+
		"\2\2\u008f\u0090\5\16\b\2\u0090\u0091\7\t\2\2\u0091\u0092\7\5\2\2\u0092"+
		"\u0093\7\f\2\2\u0093\u00a3\3\2\2\2\u0094\u0098\7\16\2\2\u0095\u0097\7"+
		"\f\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\b"+
		"\2\2\u009c\u009d\5\26\f\2\u009d\u009e\5\22\n\2\u009e\u009f\7\t\2\2\u009f"+
		"\u00a0\7\f\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\7\21\2\2\u00a2\35\3\2\2"+
		"\2\u00a2\"\3\2\2\2\u00a2(\3\2\2\2\u00a2*\3\2\2\2\u00a2\60\3\2\2\2\u00a2"+
		"E\3\2\2\2\u00a2N\3\2\2\2\u00a2U\3\2\2\2\u00a2e\3\2\2\2\u00a2\u0082\3\2"+
		"\2\2\u00a2\u0087\3\2\2\2\u00a2\u0094\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a8\3\2\2\2\u00a4\u00a5\f\20\2\2\u00a5\u00a7\5\4\3\21\u00a6\u00a4\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\5\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00af\7\13\2\2\u00ac\u00ae\7\f\2"+
		"\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\30\2\2"+
		"\u00b3\u00b7\5\6\4\2\u00b4\u00b5\7\5\2\2\u00b5\u00b7\7\f\2\2\u00b6\u00ab"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\7\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9"+
		"\u00d7\7\f\2\2\u00ba\u00bc\7\f\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c4\7\23\2\2\u00c1\u00c3\7\f\2\2\u00c2\u00c1\3"+
		"\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00ca\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7\b\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\5\26\f\2\u00ce\u00d0\7"+
		"\t\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\5\b"+
		"\5\2\u00d5\u00d7\3\2\2\2\u00d6\u00b8\3\2\2\2\u00d6\u00bd\3\2\2\2\u00d7"+
		"\t\3\2\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00da\7\f\2\2\u00da\u00db\7\30\2"+
		"\2\u00db\u00de\5\f\7\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\13\3\2\2\2\u00df\u00e3\7\13\2\2\u00e0\u00e2\7\f\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\20\2\2\u00e7"+
		"\u00e8\7\f\2\2\u00e8\u00e9\7\30\2\2\u00e9\u00ec\5\f\7\2\u00ea\u00ec\3"+
		"\2\2\2\u00eb\u00df\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\r\3\2\2\2\u00ed\u00ee"+
		"\5\26\f\2\u00ee\u00ef\5\20\t\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\3\2\2\2"+
		"\u00f1\u00ed\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\17\3\2\2\2\u00f3\u00f7"+
		"\7\13\2\2\u00f4\u00f6\7\f\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00fa\u00fb\7\30\2\2\u00fb\u011a\5\20\t\2\u00fc\u00fe\7\f\2\2"+
		"\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0106\7\23\2\2"+
		"\u0103\u0105\7\f\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010c\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010b\7\b\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0113\5\26\f\2\u0110\u0112\7\t\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\5\20\t\2\u0117\u011a\3\2\2\2\u0118\u011a\3"+
		"\2\2\2\u0119\u00f3\3\2\2\2\u0119\u00ff\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"\21\3\2\2\2\u011b\u011d\7\f\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2"+
		"\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0121\u0125\7\23\2\2\u0122\u0124\7\f\2\2\u0123\u0122\3\2\2\2"+
		"\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\5\26\f\2\u0129\u012a\5\22\n\2"+
		"\u012a\u0148\3\2\2\2\u012b\u012d\7\f\2\2\u012c\u012b\3\2\2\2\u012d\u0130"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0135\7\24\2\2\u0132\u0134\7\f\2\2\u0133\u0132\3"+
		"\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u013b\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\7\b\2\2\u0139\u0138\3\2"+
		"\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0142\5\26\f\2\u013f\u0141\7"+
		"\t\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\5\24"+
		"\13\2\u0146\u0148\3\2\2\2\u0147\u011e\3\2\2\2\u0147\u012e\3\2\2\2\u0148"+
		"\23\3\2\2\2\u0149\u014b\7\f\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0153\7\23\2\2\u0150\u0152\7\f\2\2\u0151\u0150\3\2\2\2"+
		"\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015a\5\26\f\2\u0157\u0159\7\b\2\2"+
		"\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161\5\24\13\2"+
		"\u015e\u0160\7\t\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0166\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u014c\3\2\2\2\u0165\u0164\3\2\2\2\u0166\25\3\2\2"+
		"\2\u0167\u016c\7\30\2\2\u0168\u016c\7\26\2\2\u0169\u016c\7\27\2\2\u016a"+
		"\u016c\5\30\r\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3"+
		"\2\2\2\u016b\u016a\3\2\2\2\u016c\27\3\2\2\2\u016d\u016e\7\30\2\2\u016e"+
		"\u016f\7\b\2\2\u016f\u0170\5\16\b\2\u0170\u0171\7\t\2\2\u0171\31\3\2\2"+
		"\2.\60\66=EN]ipv}\u008b\u0098\u00a2\u00a8\u00af\u00b6\u00bd\u00c4\u00ca"+
		"\u00d1\u00d6\u00dd\u00e3\u00eb\u00f1\u00f7\u00ff\u0106\u010c\u0113\u0119"+
		"\u011e\u0125\u012e\u0135\u013b\u0142\u0147\u014c\u0153\u015a\u0161\u0165"+
		"\u016b";
=======
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
>>>>>>> origin/master
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}