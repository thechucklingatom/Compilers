// Generated from res/Grammars/scanner.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;


import java.util.HashMap;


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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, SYSTEMFUNCTION=12, CONDITIONAL=13, KEYWORD=14, NUMTYPE=15, 
		COMMENT=16, OPERATOR=17, MATHOPERATOR=18, COMPARISONOPERATOR=19, STRINGLITERAL=20, 
		INTLITERAL=21, FLOATLITERAL=22, IDENTIFIER=23;
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
		null, "'PROGRAM'", "'STRING'", "':='", "';'", "'FUNCTION'", "'VOID'", 
		"'('", "')'", "'RETURN'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "WS", 
		"SYSTEMFUNCTION", "CONDITIONAL", "KEYWORD", "NUMTYPE", "COMMENT", "OPERATOR", 
		"MATHOPERATOR", "COMPARISONOPERATOR", "STRINGLITERAL", "INTLITERAL", "FLOATLITERAL", 
		"IDENTIFIER"
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


	    
	    public HashMap<String, STC> ST = new HashMap();

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
			setState(24);
			start(0);
			setState(25);
			match(EOF);
			ST.put("asdf", new STC("asdf", "asdf"));
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
		public TerminalNode NUMTYPE() { return getToken(scannerParser.NUMTYPE, 0); }
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
		public MathoperationContext mathoperation() {
			return getRuleContext(MathoperationContext.class,0);
		}
		public TerminalNode SYSTEMFUNCTION() { return getToken(scannerParser.SYSTEMFUNCTION, 0); }
		public InputargsContext inputargs() {
			return getRuleContext(InputargsContext.class,0);
		}
		public TerminalNode CONDITIONAL() { return getToken(scannerParser.CONDITIONAL, 0); }
		public ConditionalargsContext conditionalargs() {
			return getRuleContext(ConditionalargsContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(scannerParser.COMMENT, 0); }
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(29);
				match(T__0);
				setState(30);
				match(WS);
				setState(31);
				match(IDENTIFIER);
				setState(32);
				match(WS);
				}
				break;
			case 2:
				{
				setState(33);
				match(T__0);
				setState(34);
				match(WS);
				setState(35);
				match(IDENTIFIER);
				setState(36);
				match(WS);
				setState(37);
				match(KEYWORD);
				setState(38);
				match(WS);
				}
				break;
			case 3:
				{
				setState(39);
				match(KEYWORD);
				setState(40);
				match(WS);
				}
				break;
			case 4:
				{
				setState(41);
				match(NUMTYPE);
				setState(42);
				match(WS);
				setState(43);
				match(IDENTIFIER);
				setState(44);
				variabledeclaration();
				}
				break;
			case 5:
				{
				setState(47);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(45);
					match(T__1);
					setState(46);
					match(WS);
					}
				}

				setState(49);
				match(IDENTIFIER);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(50);
					match(WS);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				match(T__2);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(57);
					match(WS);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(STRINGLITERAL);
				setState(64);
				match(T__3);
				setState(65);
				match(WS);
				}
				break;
			case 6:
				{
				setState(68);
				_la = _input.LA(1);
				if (_la==NUMTYPE) {
					{
					setState(66);
					match(NUMTYPE);
					setState(67);
					match(WS);
					}
				}

				setState(70);
				match(IDENTIFIER);
				setState(71);
				match(T__2);
				setState(72);
				match(INTLITERAL);
				setState(73);
				match(T__3);
				setState(74);
				match(WS);
				}
				break;
			case 7:
				{
				setState(77);
				_la = _input.LA(1);
				if (_la==NUMTYPE) {
					{
					setState(75);
					match(NUMTYPE);
					setState(76);
					match(WS);
					}
				}

				setState(79);
				match(IDENTIFIER);
				setState(80);
				match(T__2);
				setState(81);
				match(FLOATLITERAL);
				setState(82);
				match(T__3);
				setState(83);
				match(WS);
				}
				break;
			case 8:
				{
				setState(84);
				match(T__4);
				setState(85);
				match(WS);
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==NUMTYPE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(87);
				match(WS);
				setState(88);
				match(IDENTIFIER);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(89);
					match(WS);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(T__6);
				setState(96);
				functionargs();
				setState(97);
				match(T__7);
				setState(98);
				match(WS);
				}
				break;
			case 9:
				{
				setState(100);
				match(IDENTIFIER);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(101);
					match(WS);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__2);
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
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(114);
					match(T__6);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				variable();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(121);
					match(T__7);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				mathoperation();
				}
				break;
			case 10:
				{
				setState(129);
				match(T__8);
				setState(130);
				match(WS);
				setState(131);
				variable();
				setState(132);
				mathoperation();
				}
				break;
			case 11:
				{
				setState(134);
				match(SYSTEMFUNCTION);
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
				match(T__6);
				setState(142);
				inputargs();
				setState(143);
				match(T__7);
				setState(144);
				match(T__3);
				setState(145);
				match(WS);
				}
				break;
			case 12:
				{
				setState(147);
				match(CONDITIONAL);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(148);
					match(WS);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(T__6);
				setState(155);
				variable();
				setState(156);
				conditionalargs();
				setState(157);
				match(T__7);
				setState(158);
				match(WS);
				}
				break;
			case 13:
				{
				setState(160);
				match(COMMENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
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
					setState(163);
					if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
					setState(164);
					start(15);
					}
					} 
				}
				setState(169);
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
			setState(181);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__9);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(171);
					match(WS);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(IDENTIFIER);
				setState(178);
				variabledeclaration();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__3);
				setState(180);
				match(WS);
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
			setState(213);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__3);
				setState(184);
				match(WS);
				}
				break;
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(185);
					match(WS);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(MATHOPERATOR);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(192);
					match(WS);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(198);
					match(T__6);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				variable();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(205);
					match(T__7);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				mathoperation();
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
		public TerminalNode NUMTYPE() { return getToken(scannerParser.NUMTYPE, 0); }
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
			setState(220);
			switch (_input.LA(1)) {
			case NUMTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(NUMTYPE);
				setState(216);
				match(WS);
				setState(217);
				match(IDENTIFIER);
				setState(218);
				functionargs2();
				}
				break;
			case T__7:
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
		public TerminalNode NUMTYPE() { return getToken(scannerParser.NUMTYPE, 0); }
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
			setState(234);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__9);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(223);
					match(WS);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(NUMTYPE);
				setState(230);
				match(WS);
				setState(231);
				match(IDENTIFIER);
				setState(232);
				functionargs2();
				}
				break;
			case T__7:
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
			setState(240);
			switch (_input.LA(1)) {
			case INTLITERAL:
			case FLOATLITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				variable();
				setState(237);
				inputargs2();
				}
				break;
			case T__7:
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
			setState(280);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__9);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(243);
					match(WS);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(IDENTIFIER);
				setState(250);
				inputargs2();
				}
				break;
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(251);
					match(WS);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(MATHOPERATOR);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(258);
					match(WS);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(264);
					match(T__6);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				variable();
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(271);
						match(T__7);
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(277);
				inputargs2();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(282);
					match(WS);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(MATHOPERATOR);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(289);
					match(WS);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				variable();
				setState(296);
				conditionalargs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(298);
					match(WS);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(COMPARISONOPERATOR);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(305);
					match(WS);
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(311);
					match(T__6);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				variable();
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(318);
						match(T__7);
						}
						} 
					}
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(324);
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
			setState(356);
			switch (_input.LA(1)) {
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(328);
					match(WS);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(MATHOPERATOR);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(335);
					match(WS);
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				variable();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(342);
					match(T__6);
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				conditionalargs2();
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(349);
						match(T__7);
						}
						} 
					}
					setState(354);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case T__7:
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
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(INTLITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(FLOATLITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				functionvariable();
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
			setState(364);
			match(IDENTIFIER);
			setState(365);
			match(T__6);
			setState(366);
			inputargs();
			setState(367);
			match(T__7);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0174\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3\3\7\3\66"+
		"\n\3\f\3\16\39\13\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3G\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3i\n\3\f\3\16\3l\13\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\7\3v"+
		"\n\3\f\3\16\3y\13\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3\u008b\n\3\f\3\16\3\u008e\13\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3\u0098\n\3\f\3\16\3\u009b\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u00a4\n\3\3\3\3\3\7\3\u00a8\n\3\f\3\16\3\u00ab\13\3\3\4"+
		"\3\4\7\4\u00af\n\4\f\4\16\4\u00b2\13\4\3\4\3\4\3\4\3\4\5\4\u00b8\n\4\3"+
		"\5\3\5\3\5\7\5\u00bd\n\5\f\5\16\5\u00c0\13\5\3\5\3\5\7\5\u00c4\n\5\f\5"+
		"\16\5\u00c7\13\5\3\5\7\5\u00ca\n\5\f\5\16\5\u00cd\13\5\3\5\3\5\7\5\u00d1"+
		"\n\5\f\5\16\5\u00d4\13\5\3\5\3\5\5\5\u00d8\n\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00df\n\6\3\7\3\7\7\7\u00e3\n\7\f\7\16\7\u00e6\13\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00ed\n\7\3\b\3\b\3\b\3\b\5\b\u00f3\n\b\3\t\3\t\7\t\u00f7\n\t\f"+
		"\t\16\t\u00fa\13\t\3\t\3\t\3\t\7\t\u00ff\n\t\f\t\16\t\u0102\13\t\3\t\3"+
		"\t\7\t\u0106\n\t\f\t\16\t\u0109\13\t\3\t\7\t\u010c\n\t\f\t\16\t\u010f"+
		"\13\t\3\t\3\t\7\t\u0113\n\t\f\t\16\t\u0116\13\t\3\t\3\t\3\t\5\t\u011b"+
		"\n\t\3\n\7\n\u011e\n\n\f\n\16\n\u0121\13\n\3\n\3\n\7\n\u0125\n\n\f\n\16"+
		"\n\u0128\13\n\3\n\3\n\3\n\3\n\7\n\u012e\n\n\f\n\16\n\u0131\13\n\3\n\3"+
		"\n\7\n\u0135\n\n\f\n\16\n\u0138\13\n\3\n\7\n\u013b\n\n\f\n\16\n\u013e"+
		"\13\n\3\n\3\n\7\n\u0142\n\n\f\n\16\n\u0145\13\n\3\n\3\n\5\n\u0149\n\n"+
		"\3\13\7\13\u014c\n\13\f\13\16\13\u014f\13\13\3\13\3\13\7\13\u0153\n\13"+
		"\f\13\16\13\u0156\13\13\3\13\3\13\7\13\u015a\n\13\f\13\16\13\u015d\13"+
		"\13\3\13\3\13\7\13\u0161\n\13\f\13\16\13\u0164\13\13\3\13\5\13\u0167\n"+
		"\13\3\f\3\f\3\f\3\f\5\f\u016d\n\f\3\r\3\r\3\r\3\r\3\r\3\r\2\3\4\16\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\2\3\4\2\b\b\21\21\u01a1\2\32\3\2\2\2\4\u00a3"+
		"\3\2\2\2\6\u00b7\3\2\2\2\b\u00d7\3\2\2\2\n\u00de\3\2\2\2\f\u00ec\3\2\2"+
		"\2\16\u00f2\3\2\2\2\20\u011a\3\2\2\2\22\u0148\3\2\2\2\24\u0166\3\2\2\2"+
		"\26\u016c\3\2\2\2\30\u016e\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\35\b"+
		"\2\1\2\35\3\3\2\2\2\36\37\b\3\1\2\37 \7\3\2\2 !\7\r\2\2!\"\7\31\2\2\""+
		"\u00a4\7\r\2\2#$\7\3\2\2$%\7\r\2\2%&\7\31\2\2&\'\7\r\2\2\'(\7\20\2\2("+
		"\u00a4\7\r\2\2)*\7\20\2\2*\u00a4\7\r\2\2+,\7\21\2\2,-\7\r\2\2-.\7\31\2"+
		"\2.\u00a4\5\6\4\2/\60\7\4\2\2\60\62\7\r\2\2\61/\3\2\2\2\61\62\3\2\2\2"+
		"\62\63\3\2\2\2\63\67\7\31\2\2\64\66\7\r\2\2\65\64\3\2\2\2\669\3\2\2\2"+
		"\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:>\7\5\2\2;=\7\r\2\2<"+
		";\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\26\2\2"+
		"BC\7\6\2\2C\u00a4\7\r\2\2DE\7\21\2\2EG\7\r\2\2FD\3\2\2\2FG\3\2\2\2GH\3"+
		"\2\2\2HI\7\31\2\2IJ\7\5\2\2JK\7\27\2\2KL\7\6\2\2L\u00a4\7\r\2\2MN\7\21"+
		"\2\2NP\7\r\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\31\2\2RS\7\5\2\2ST\7"+
		"\30\2\2TU\7\6\2\2U\u00a4\7\r\2\2VW\7\7\2\2WX\7\r\2\2XY\t\2\2\2YZ\7\r\2"+
		"\2Z^\7\31\2\2[]\7\r\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3"+
		"\2\2\2`^\3\2\2\2ab\7\t\2\2bc\5\n\6\2cd\7\n\2\2de\7\r\2\2e\u00a4\3\2\2"+
		"\2fj\7\31\2\2gi\7\r\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2"+
		"\2\2lj\3\2\2\2mq\7\5\2\2np\7\r\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2rw\3\2\2\2sq\3\2\2\2tv\7\t\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2"+
		"\2\2xz\3\2\2\2yw\3\2\2\2z~\5\26\f\2{}\7\n\2\2|{\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5"+
		"\b\5\2\u0082\u00a4\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\7\r\2\2\u0085"+
		"\u0086\5\26\f\2\u0086\u0087\5\b\5\2\u0087\u00a4\3\2\2\2\u0088\u008c\7"+
		"\16\2\2\u0089\u008b\7\r\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\7\t\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\n\2\2\u0092"+
		"\u0093\7\6\2\2\u0093\u0094\7\r\2\2\u0094\u00a4\3\2\2\2\u0095\u0099\7\17"+
		"\2\2\u0096\u0098\7\r\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\7\t\2\2\u009d\u009e\5\26\f\2\u009e\u009f\5\22\n\2\u009f"+
		"\u00a0\7\n\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4\7\22"+
		"\2\2\u00a3\36\3\2\2\2\u00a3#\3\2\2\2\u00a3)\3\2\2\2\u00a3+\3\2\2\2\u00a3"+
		"\61\3\2\2\2\u00a3F\3\2\2\2\u00a3O\3\2\2\2\u00a3V\3\2\2\2\u00a3f\3\2\2"+
		"\2\u00a3\u0083\3\2\2\2\u00a3\u0088\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a6\f\20\2\2\u00a6\u00a8\5\4\3\21"+
		"\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\5\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\7\f\2\2\u00ad"+
		"\u00af\7\r\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\7\31\2\2\u00b4\u00b8\5\6\4\2\u00b5\u00b6\7\6\2\2\u00b6\u00b8\7"+
		"\r\2\2\u00b7\u00ac\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\7\3\2\2\2\u00b9\u00ba"+
		"\7\6\2\2\u00ba\u00d8\7\r\2\2\u00bb\u00bd\7\r\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c5\7\24\2\2\u00c2\u00c4\7\r\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00cb\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7\t\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\5\26\f\2\u00cf"+
		"\u00d1\7\n\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\5\b\5\2\u00d6\u00d8\3\2\2\2\u00d7\u00b9\3\2\2\2\u00d7\u00be\3\2"+
		"\2\2\u00d8\t\3\2\2\2\u00d9\u00da\7\21\2\2\u00da\u00db\7\r\2\2\u00db\u00dc"+
		"\7\31\2\2\u00dc\u00df\5\f\7\2\u00dd\u00df\3\2\2\2\u00de\u00d9\3\2\2\2"+
		"\u00de\u00dd\3\2\2\2\u00df\13\3\2\2\2\u00e0\u00e4\7\f\2\2\u00e1\u00e3"+
		"\7\r\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\21"+
		"\2\2\u00e8\u00e9\7\r\2\2\u00e9\u00ea\7\31\2\2\u00ea\u00ed\5\f\7\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\r\3\2\2\2"+
		"\u00ee\u00ef\5\26\f\2\u00ef\u00f0\5\20\t\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\17\3\2\2\2\u00f4"+
		"\u00f8\7\f\2\2\u00f5\u00f7\7\r\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\31\2\2\u00fc\u011b\5\20\t\2\u00fd\u00ff\7"+
		"\r\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0107\7\24"+
		"\2\2\u0104\u0106\7\r\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010d\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010c\7\t\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u0110\u0114\5\26\f\2\u0111\u0113\7\n\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0118\5\20\t\2\u0118\u011b\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u00f4\3\2\2\2\u011a\u0100\3\2\2\2\u011a\u0119\3\2"+
		"\2\2\u011b\21\3\2\2\2\u011c\u011e\7\r\2\2\u011d\u011c\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0126\7\24\2\2\u0123\u0125\7\r\2\2\u0124\u0123\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\5\26\f\2\u012a\u012b\5"+
		"\22\n\2\u012b\u0149\3\2\2\2\u012c\u012e\7\r\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0136\7\25\2\2\u0133\u0135\7\r\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u013c\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\7\t\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0143\5\26\f\2\u0140"+
		"\u0142\7\n\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0147\5\24\13\2\u0147\u0149\3\2\2\2\u0148\u011f\3\2\2\2\u0148\u012f\3"+
		"\2\2\2\u0149\23\3\2\2\2\u014a\u014c\7\r\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0154\7\24\2\2\u0151\u0153\7\r\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015b\5\26\f\2\u0158"+
		"\u015a\7\t\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0162\5\24\13\2\u015f\u0161\7\n\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3"+
		"\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0167\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u014d\3\2\2\2\u0166\u0165\3\2"+
		"\2\2\u0167\25\3\2\2\2\u0168\u016d\7\31\2\2\u0169\u016d\7\27\2\2\u016a"+
		"\u016d\7\30\2\2\u016b\u016d\5\30\r\2\u016c\u0168\3\2\2\2\u016c\u0169\3"+
		"\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\27\3\2\2\2\u016e"+
		"\u016f\7\31\2\2\u016f\u0170\7\t\2\2\u0170\u0171\5\16\b\2\u0171\u0172\7"+
		"\n\2\2\u0172\31\3\2\2\2.\61\67>FO^jqw~\u008c\u0099\u00a3\u00a9\u00b0\u00b7"+
		"\u00be\u00c5\u00cb\u00d2\u00d7\u00de\u00e4\u00ec\u00f2\u00f8\u0100\u0107"+
		"\u010d\u0114\u011a\u011f\u0126\u012f\u0136\u013c\u0143\u0148\u014d\u0154"+
		"\u015b\u0162\u0166\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}