// Generated from res/Grammars/scanner.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;


import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.ArrayList;
import com.CSCI468.IR2TinyConverter.IR2Tiny;



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
		WS=10, STRINGTYPE=11, SYSTEMFUNCTION=12, CONDITIONAL=13, KEYWORD=14, ELSEBLOCK=15, 
		SCOPEEND=16, INTTYPE=17, FLOATTYPE=18, COMMENT=19, OPERATOR=20, MATHOPERATOR=21, 
		COMPARISONOPERATOR=22, STRINGLITERAL=23, INTLITERAL=24, FLOATLITERAL=25, 
		IDENTIFIER=26;
	public static final int
		RULE_pre = 0, RULE_start = 1, RULE_intvariabledeclaration = 2, RULE_floatvariabledeclaration = 3, 
		RULE_mathoperation = 4, RULE_functionargs = 5, RULE_functionargs2 = 6, 
		RULE_inputargs = 7, RULE_inputargs2 = 8, RULE_conditionalargs = 9, RULE_conditionalargs2 = 10, 
		RULE_variable = 11, RULE_functionvariable = 12;
	public static final String[] ruleNames = {
		"pre", "start", "intvariabledeclaration", "floatvariabledeclaration", 
		"mathoperation", "functionargs", "functionargs2", "inputargs", "inputargs2", 
		"conditionalargs", "conditionalargs2", "variable", "functionvariable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "':='", "';'", "'FUNCTION'", "'VOID'", "'('", "')'", 
		"'RETURN'", "','", null, "'STRING'", null, null, "'BEGIN'", "'ELSE'", 
		null, "'INT'", "'FLOAT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WS", "STRINGTYPE", 
		"SYSTEMFUNCTION", "CONDITIONAL", "KEYWORD", "ELSEBLOCK", "SCOPEEND", "INTTYPE", 
		"FLOATTYPE", "COMMENT", "OPERATOR", "MATHOPERATOR", "COMPARISONOPERATOR", 
		"STRINGLITERAL", "INTLITERAL", "FLOATLITERAL", "IDENTIFIER"
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



	    
	    int numBlock = 0;
	    int registerCounter = 1;
	    int labelCounter = 1;

	    ArrayList<String> textArray = new ArrayList<>();
	    ArrayList<String> IRList = new ArrayList<>();
	    ArrayList<String> variableList = new ArrayList<>();
	    public HashMap<String, STC> ST = new HashMap();
	    static Stack<String> myStack = new Stack();
	    static Stack<String> tempStack = new Stack();
	    PriorityBlockingQueue<String> writeStack = new PriorityBlockingQueue();
	    IR2Tiny irConverter = new IR2Tiny();



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
			setState(26);
			start(0);
			setState(27);
			match(EOF);



			//Pop global String stack here

			for (String s : textArray)
			{
			System.out.println(s);

			}
			IRList.add(";RET");
			IRList.add(";tiny code");
			for(String s : IRList){
			    System.out.println(s);                         
			}

			irConverter.startConversion(IRList);






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
		public Token IDENTIFIER;
		public Token INTTYPE;
		public Token FLOATTYPE;
		public Token STRINGTYPE;
		public Token STRINGLITERAL;
		public Token INTLITERAL;
		public Token FLOATLITERAL;
		public Token SYSTEMFUNCTION;
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public TerminalNode KEYWORD() { return getToken(scannerParser.KEYWORD, 0); }
		public TerminalNode SCOPEEND() { return getToken(scannerParser.SCOPEEND, 0); }
		public IntvariabledeclarationContext intvariabledeclaration() {
			return getRuleContext(IntvariabledeclarationContext.class,0);
		}
		public TerminalNode INTTYPE() { return getToken(scannerParser.INTTYPE, 0); }
		public FloatvariabledeclarationContext floatvariabledeclaration() {
			return getRuleContext(FloatvariabledeclarationContext.class,0);
		}
		public TerminalNode FLOATTYPE() { return getToken(scannerParser.FLOATTYPE, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(scannerParser.STRINGLITERAL, 0); }
		public TerminalNode STRINGTYPE() { return getToken(scannerParser.STRINGTYPE, 0); }
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
		public TerminalNode ELSEBLOCK() { return getToken(scannerParser.ELSEBLOCK, 0); }
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(31);
				match(T__0);
				setState(32);
				match(WS);
				setState(33);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(34);
				match(WS);


				        myStack.push("GLOBAL");
				        textArray.add("Symbol table GLOBAL");
				        IRList.add(";IR Code");

				        
				}
				break;
			case 2:
				{
				setState(36);
				match(T__0);
				setState(37);
				match(WS);
				setState(38);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(39);
				match(WS);
				setState(40);
				match(KEYWORD);
				setState(41);
				match(WS);


				        myStack.push("GLOBAL");
				        textArray.add("Symbol table GLOBAL");
				        
				}
				break;
			case 3:
				{
				setState(43);
				match(KEYWORD);
				setState(44);
				match(WS);
				}
				break;
			case 4:
				{
				setState(45);
				match(SCOPEEND);
				setState(46);
				match(WS);
				myStack.pop();
				}
				break;
			case 5:
				{
				{
				setState(48);
				((StartContext)_localctx).INTTYPE = match(INTTYPE);
				}
				setState(49);
				match(WS);
				setState(50);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(51);
				intvariabledeclaration();

				        if (!ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)))
				        {
				            ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC((((StartContext)_localctx).INTTYPE!=null?((StartContext)_localctx).INTTYPE.getText():null), "noValue", (String) myStack.peek())));

				            //textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				            String text = ("var" + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				            tempStack.push(text);

				            //POP Stack here
				            ////////
				            while (!tempStack.empty())
				            {
				                variableList.add(tempStack.pop());
				            }
				        }
				         //Scope is different between two variables of the same name. Ex Int a (Scope Global), Int a (Scope FunctionName)
				        else if (!ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope.equals((String) myStack.peek()))
				        {
				            ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("INT", (((StartContext)_localctx).INTLITERAL!=null?((StartContext)_localctx).INTLITERAL.getText():null), (String) myStack.peek())));


				            //textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				            String text = ("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				            tempStack.push(text);

				            //POP Stack here
				            while (!tempStack.empty())
				            {
				            textArray.add(tempStack.pop());
				            }
				        }
				        else
				            {
				            System.out.println("DECLARATION ERROR " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				            System.exit(0);
				            }
				        
				}
				break;
			case 6:
				{
				{
				setState(54);
				((StartContext)_localctx).FLOATTYPE = match(FLOATTYPE);
				}
				setState(55);
				match(WS);
				setState(56);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(57);
				floatvariabledeclaration();

				        if (!ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)))
				            {
				            ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC((((StartContext)_localctx).FLOATTYPE!=null?((StartContext)_localctx).FLOATTYPE.getText():null), "noValue", (String) myStack.peek())));
				            //textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				            String text = "name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT";
				            tempStack.push(text);


				            //POP stack here
				            while (!tempStack.empty())
				        {
				        textArray.add(tempStack.pop());
				        }

				            
				            }
				         else if (!ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope.equals((String) myStack.peek()))
				         {
				         ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("FLOAT", (((StartContext)_localctx).FLOATLITERAL!=null?((StartContext)_localctx).FLOATLITERAL.getText():null), (String) myStack.peek())));
				         //textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				         String text = "name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT";
				         tempStack.push(text);

				         //POP Stack here
				         while (!tempStack.empty())
				        {
				        textArray.add(tempStack.pop());
				        }
				         }
				         

				        else
				            {
				            System.out.println("DECLARATION ERROR " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				            System.exit(0);
				            }
				        
				}
				break;
			case 7:
				{
				setState(62);
				_la = _input.LA(1);
				if (_la==STRINGTYPE) {
					{
					setState(60);
					((StartContext)_localctx).STRINGTYPE = match(STRINGTYPE);
					setState(61);
					match(WS);
					}
				}

				setState(64);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(65);
					match(WS);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(T__1);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(72);
					match(WS);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				((StartContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				setState(79);
				match(T__2);
				setState(80);
				match(WS);

				        if (!ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)) || (ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)) && ((StartContext)_localctx).STRINGTYPE == null))
				            {
				            ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("STRING", ((((StartContext)_localctx).STRINGLITERAL!=null?((StartContext)_localctx).STRINGLITERAL.getText():null)).substring(1, ((((StartContext)_localctx).STRINGLITERAL!=null?((StartContext)_localctx).STRINGLITERAL.getText():null)).length()-1), (String) myStack.peek())));
				            textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type STRING value " + (((StartContext)_localctx).STRINGLITERAL!=null?((StartContext)_localctx).STRINGLITERAL.getText():null));
				            }
				         else if (ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)) && ((StartContext)_localctx).STRINGTYPE == null)
				         {
				         ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("STRING", (((StartContext)_localctx).STRINGLITERAL!=null?((StartContext)_localctx).STRINGLITERAL.getText():null), ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope)));
				         }
				         else if (!ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope.equals((String) myStack.peek()))
				         {
				         ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("STRING", (((StartContext)_localctx).STRINGLITERAL!=null?((StartContext)_localctx).STRINGLITERAL.getText():null), (String) myStack.peek())));
				         }
				         
				        else
				            {
				            System.out.println("DECLARATION ERROR " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				            System.exit(0);
				            }
				        
				        variableList.add("str " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " " + (((StartContext)_localctx).STRINGLITERAL!=null?((StartContext)_localctx).STRINGLITERAL.getText():null));

				        
				}
				break;
			case 8:
				{
				setState(84);
				_la = _input.LA(1);
				if (_la==INTTYPE) {
					{
					setState(82);
					((StartContext)_localctx).INTTYPE = match(INTTYPE);
					setState(83);
					match(WS);
					}
				}

				setState(86);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(87);
				match(T__1);
				setState(88);
				((StartContext)_localctx).INTLITERAL = match(INTLITERAL);
				setState(89);
				match(T__2);
				setState(90);
				match(WS);

				        if (!ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)))
				            {
				            ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("INT", (((StartContext)_localctx).INTLITERAL!=null?((StartContext)_localctx).INTLITERAL.getText():null), (String) myStack.peek())));
				            textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				            }
				         //Modifying the value of the given variable
				         else if (ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)) && ((StartContext)_localctx).INTTYPE == null)
				         {
				         ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("INT", (((StartContext)_localctx).INTLITERAL!=null?((StartContext)_localctx).INTLITERAL.getText():null), ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope)));
				         }
				         //Creating a new variable with the same name, but in a different scope
				         else if (!ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope.equals((String) myStack.peek()))
				         {
				         ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("INT", (((StartContext)_localctx).INTLITERAL!=null?((StartContext)_localctx).INTLITERAL.getText():null),(String) myStack.peek())));
				         textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				         }
				        else
				         {
				            textArray.add(ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope);
				            textArray.add((String) myStack.peek());

				            System.out.println("DECLARATION ERROR " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				            //System.exit(0);
				         }
				        
				        IRList.add(";STOREI " + (((StartContext)_localctx).INTLITERAL!=null?((StartContext)_localctx).INTLITERAL.getText():null) + " $T" + registerCounter);
				        IRList.add(";STOREI $T" + registerCounter++ + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				        
				}
				break;
			case 9:
				{
				setState(94);
				_la = _input.LA(1);
				if (_la==FLOATTYPE) {
					{
					setState(92);
					((StartContext)_localctx).FLOATTYPE = match(FLOATTYPE);
					setState(93);
					match(WS);
					}
				}

				setState(96);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(97);
				match(T__1);
				setState(98);
				((StartContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				setState(99);
				match(T__2);
				setState(100);
				match(WS);

				        if (!ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)))
				            {
				            ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("FLOAT", (((StartContext)_localctx).FLOATLITERAL!=null?((StartContext)_localctx).FLOATLITERAL.getText():null), (String) myStack.peek())));
				            textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				            }
				         //Modifying the given variable
				         else if (ST.containsKey((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)) && ((StartContext)_localctx).FLOATTYPE == null)
				         {
				         ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("FLOAT", (((StartContext)_localctx).FLOATLITERAL!=null?((StartContext)_localctx).FLOATLITERAL.getText():null), ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope)));
				         }
				         //Creating a new variable with the same name, but in a different scope
				         else if (!ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).scope.equals((String) myStack.peek()))
				         {
				         ST.put((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null), (new STC("FLOAT", (((StartContext)_localctx).FLOATLITERAL!=null?((StartContext)_localctx).FLOATLITERAL.getText():null), (String) myStack.peek())));
				         textArray.add("name " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				         }
				        else
				            {
				            System.out.println("DECLARATION ERROR " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				            System.exit(0);
				            }
				        
				        IRList.add(";STOREF " + (((StartContext)_localctx).INTLITERAL!=null?((StartContext)_localctx).INTLITERAL.getText():null) + " $T" + registerCounter);
				        IRList.add(";STOREF $T" + registerCounter++ + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				            
				        
				}
				break;
			case 10:
				{
				setState(102);
				match(T__3);
				setState(103);
				match(WS);
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << INTTYPE) | (1L << FLOATTYPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(105);
				match(WS);
				setState(106);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
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
				setState(113);
				match(T__5);
				setState(114);
				functionargs();
				setState(115);
				match(T__6);
				setState(116);
				match(WS);


				        myStack.push((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				        //textArray.add();
				        //textArray.add("Symbol table " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));

				         String text = (System.lineSeparator() + "Symbol table " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				         tempStack.push(text);
				         IRList.add(";LABEL " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				         IRList.add(";LINK");
				        //POP Stack here
				         while (!tempStack.empty())
				        {
				        textArray.add(tempStack.pop());
				        }


				        
				        
				}
				break;
			case 11:
				{
				setState(119);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(120);
					match(WS);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__1);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(127);
					match(WS);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(133);
					match(T__5);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				variable();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(140);
					match(T__6);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				mathoperation();

				                //var declaration happening here, instead of the other two places
				                //fixing the store.
				                PriorityBlockingQueue<String> temp = new PriorityBlockingQueue<>();
				                boolean varAssignment = false;
				                while(!writeStack.isEmpty()){ 
				                    if(writeStack.size() == 1 && ST.containsKey(writeStack.peek())){
				                        varAssignment = true;                           
				                    }
				                    temp.add(writeStack.remove());
				                }
				                //incorrect need to refactor to make math operations work.
				                if(varAssignment && temp.size() == 2){
				                    String literal = temp.remove();
				                    String var = temp.remove();
				                    if(ST.get(var).getType().matches("INT")){
				                        IRList.add(";STOREI " + literal + " $T" + registerCounter);
				                        IRList.add(";STOREI $T" + registerCounter++ + " " + var);                    
				                    }else if(ST.get(var).getType().matches("FLOAT")){
				                        IRList.add(";STOREF " + literal + " $T" + registerCounter);
				                        IRList.add(";STOREF $T" + registerCounter++ + " " + var);      
				                    }else if(ST.get(var).getType().matches("STRING")){                     
				                    }
				                }else if(varAssignment && temp.size() > 2){
				                    System.out.println("Large assignment, maybe math");
				                }else if(temp.size() == 1){
				                    String literal = temp.remove();
				                    if(ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).getType().matches("INT")){
				                        IRList.add(";STOREI " + literal + " $T" + registerCounter);
				                        IRList.add(";STOREI $T" + registerCounter++ + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));                    
				                    }else if(ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).getType().matches("FLOAT")){
				                        IRList.add(";STOREF " + literal + " $T" + registerCounter);
				                        IRList.add(";STOREF $T" + registerCounter++ + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));      
				                    }else if(ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).getType().matches("STRING")){                     
				                    }
				                }
				                
				            





				}
				break;
			case 12:
				{
				setState(150);
				match(T__7);
				setState(151);
				match(WS);
				setState(152);
				variable();
				setState(153);
				mathoperation();

				                while(!writeStack.isEmpty()){
				                    writeStack.remove();
				                }
				            
				}
				break;
			case 13:
				{
				setState(156);
				((StartContext)_localctx).SYSTEMFUNCTION = match(SYSTEMFUNCTION);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(157);
					match(WS);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(T__5);
				setState(164);
				inputargs();
				setState(165);
				match(T__6);
				setState(166);
				match(T__2);
				setState(167);
				match(WS);

				            if((((StartContext)_localctx).SYSTEMFUNCTION!=null?((StartContext)_localctx).SYSTEMFUNCTION.getText():null).equals("WRITE")){
				                while(!writeStack.isEmpty()){
				                    String temp = writeStack.remove();
				                    if(ST.containsKey(temp)){
				                        if(ST.get(temp).getType().matches("INT")){
				                            IRList.add(";WRITEI " + temp);                     
				                        }else if(ST.get(temp).getType().matches("FLOAT")){
				                            IRList.add(";WRITEF " + temp);                     
				                        }else if(ST.get(temp).getType().matches("STRING")){
				                            IRList.add(";WRITES " + temp);                     
				                        }
				                    }else{
				                         
				                    }
				                }
				            }else if((((StartContext)_localctx).SYSTEMFUNCTION!=null?((StartContext)_localctx).SYSTEMFUNCTION.getText():null).equals("READ")){
				                while(!writeStack.isEmpty()){
				                    String temp = writeStack.remove();
				                    if(ST.containsKey(temp)){
				                        if(ST.get(temp).getType().matches("INT")){
				                            IRList.add(";READI " + temp);                     
				                        }else if(ST.get(temp).getType().matches("FLOAT")){
				                            IRList.add(";READF " + temp);                     
				                        }else if(ST.get(temp).getType().matches("STRING")){                 
				                        }
				                    }else{
				                         
				                    }
				                }
				            }else{
				                while(!writeStack.isEmpty()){
				                    writeStack.remove();
				                }
				            }
				        
				}
				break;
			case 14:
				{
				setState(170);
				match(CONDITIONAL);
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
				match(T__5);
				setState(178);
				variable();
				setState(179);
				conditionalargs();
				setState(180);
				match(T__6);
				setState(181);
				match(WS);

				        numBlock++;
				        myStack.push("BLOCK " + numBlock);

				        textArray.add("");
				        textArray.add("Symbol table BLOCK " + numBlock);
				        
				        IRList.add(";LABEL label" + labelCounter++);

				        while(!writeStack.isEmpty()){
				            writeStack.remove();
				        }


				        
				}
				break;
			case 15:
				{
				setState(184);
				match(ELSEBLOCK);
				setState(185);
				match(WS);

				        numBlock++;
				        myStack.push("BLOCK " + numBlock);


				        textArray.add("");
				        textArray.add("Symbol table BLOCK " + numBlock);
				        
				        IRList.add(";LABEL label" + labelCounter++);

				        
				}
				break;
			case 16:
				{
				setState(187);
				match(COMMENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
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
					setState(190);
					if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
					setState(191);
					start(18);
					}
					} 
				}
				setState(196);
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

	public static class IntvariabledeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public IntvariabledeclarationContext intvariabledeclaration() {
			return getRuleContext(IntvariabledeclarationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public IntvariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intvariabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterIntvariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitIntvariabledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitIntvariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntvariabledeclarationContext intvariabledeclaration() throws RecognitionException {
		IntvariabledeclarationContext _localctx = new IntvariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_intvariabledeclaration);
		int _la;
		try {
			setState(210);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__8);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(198);
					match(WS);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				((IntvariabledeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(205);
				intvariabledeclaration();

				        {
				        if (!ST.containsKey((((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null)))
				            {
				            ST.put((((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null), (new STC("INT", "noValue", (String) myStack.peek())));
				            //textArray.add("name " + (((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				            String text = ("name " + (((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				            tempStack.push(text);
				            }
				         else if (!ST.get((((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null)).scope.equals((String) myStack.peek()))
				         {
				         ST.put((((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null), (new STC("INT", "noValue", (String) myStack.peek())));
				         //textArray.add("name " + (((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				         String text = ("name " + (((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				         tempStack.push(text);
				         }
				        else
				            {
				            System.out.println("DECLARATION ERROR " + (((IntvariabledeclarationContext)_localctx).IDENTIFIER!=null?((IntvariabledeclarationContext)_localctx).IDENTIFIER.getText():null));
				            System.exit(0);
				            }
				        }

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__2);
				setState(209);
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

	public static class FloatvariabledeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public FloatvariabledeclarationContext floatvariabledeclaration() {
			return getRuleContext(FloatvariabledeclarationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public FloatvariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatvariabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFloatvariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFloatvariabledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitFloatvariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatvariabledeclarationContext floatvariabledeclaration() throws RecognitionException {
		FloatvariabledeclarationContext _localctx = new FloatvariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_floatvariabledeclaration);
		int _la;
		try {
			setState(225);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__8);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(213);
					match(WS);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				((FloatvariabledeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(220);
				floatvariabledeclaration();

				        {
				        if (!ST.containsKey((((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null)))
				            {
				            ST.put((((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null), (new STC("FLOAT", "noValue", (String) myStack.peek())));
				            //textArray.add("name " + (((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				            String text = "name " + (((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT";
				            tempStack.push(text);
				            }
				         else if (!ST.get((((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null)).scope.equals((String) myStack.peek()))
				         {
				         ST.put((((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null), (new STC("FLOAT", "noValue", (String) myStack.peek())));
				         textArray.add("name " + (((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				         String text = "name " + (((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT";
				         tempStack.push(text);
				         }
				        else
				            {
				            System.out.println("DECLARATION ERROR " + (((FloatvariabledeclarationContext)_localctx).IDENTIFIER!=null?((FloatvariabledeclarationContext)_localctx).IDENTIFIER.getText():null));
				            System.exit(0);
				            }
				        }

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(T__2);
				setState(224);
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
		public Token MATHOPERATOR;
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
		enterRule(_localctx, 8, RULE_mathoperation);
		int _la;
		try {
			setState(258);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__2);
				setState(228);
				match(WS);
				}
				break;
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(229);
					match(WS);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				((MathoperationContext)_localctx).MATHOPERATOR = match(MATHOPERATOR);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(236);
					match(WS);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(242);
					match(T__5);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				variable();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(249);
					match(T__6);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				mathoperation();
				 writeStack.add((((MathoperationContext)_localctx).MATHOPERATOR!=null?((MathoperationContext)_localctx).MATHOPERATOR.getText():null)); 
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
		public Token INTTYPE;
		public Token FLOATTYPE;
		public Token IDENTIFIER;
		public TerminalNode WS() { return getToken(scannerParser.WS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public Functionargs2Context functionargs2() {
			return getRuleContext(Functionargs2Context.class,0);
		}
		public TerminalNode INTTYPE() { return getToken(scannerParser.INTTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(scannerParser.FLOATTYPE, 0); }
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
		enterRule(_localctx, 10, RULE_functionargs);
		int _la;
		try {
			setState(267);
			switch (_input.LA(1)) {
			case INTTYPE:
			case FLOATTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==INTTYPE || _la==FLOATTYPE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(261);
				match(WS);
				setState(262);
				((FunctionargsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(263);
				functionargs2();




				if (((FunctionargsContext)_localctx).FLOATTYPE != null)
				{

				            ST.put((((FunctionargsContext)_localctx).IDENTIFIER!=null?((FunctionargsContext)_localctx).IDENTIFIER.getText():null), (new STC((((FunctionargsContext)_localctx).FLOATTYPE!=null?((FunctionargsContext)_localctx).FLOATTYPE.getText():null), "noValue", (String) myStack.peek())));
				            //textArray.add("name " + (((FunctionargsContext)_localctx).IDENTIFIER!=null?((FunctionargsContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				            String text = ("name " + (((FunctionargsContext)_localctx).IDENTIFIER!=null?((FunctionargsContext)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				            tempStack.push(text);            

				}
				else
				{
				            ST.put((((FunctionargsContext)_localctx).IDENTIFIER!=null?((FunctionargsContext)_localctx).IDENTIFIER.getText():null), (new STC((((FunctionargsContext)_localctx).INTTYPE!=null?((FunctionargsContext)_localctx).INTTYPE.getText():null), "noValue", (String) myStack.peek())));
				            //textArray.add("name " + (((FunctionargsContext)_localctx).IDENTIFIER!=null?((FunctionargsContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				            String text = ("name " + (((FunctionargsContext)_localctx).IDENTIFIER!=null?((FunctionargsContext)_localctx).IDENTIFIER.getText():null) + " type INT");
				            tempStack.push(text);
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

	public static class Functionargs2Context extends ParserRuleContext {
		public Token INTTYPE;
		public Token FLOATTYPE;
		public Token IDENTIFIER;
		public List<TerminalNode> WS() { return getTokens(scannerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(scannerParser.WS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(scannerParser.IDENTIFIER, 0); }
		public Functionargs2Context functionargs2() {
			return getRuleContext(Functionargs2Context.class,0);
		}
		public TerminalNode INTTYPE() { return getToken(scannerParser.INTTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(scannerParser.FLOATTYPE, 0); }
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
		enterRule(_localctx, 12, RULE_functionargs2);
		int _la;
		try {
			setState(283);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__8);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(270);
					match(WS);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==INTTYPE || _la==FLOATTYPE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(277);
				match(WS);
				setState(278);
				((Functionargs2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(279);
				functionargs2();

				if (((Functionargs2Context)_localctx).FLOATTYPE != null)
				{

				            ST.put((((Functionargs2Context)_localctx).IDENTIFIER!=null?((Functionargs2Context)_localctx).IDENTIFIER.getText():null), (new STC((((Functionargs2Context)_localctx).FLOATTYPE!=null?((Functionargs2Context)_localctx).FLOATTYPE.getText():null), "noValue", (String) myStack.peek())));
				            //textArray.add("name " + (((Functionargs2Context)_localctx).IDENTIFIER!=null?((Functionargs2Context)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				            String text = ("name " + (((Functionargs2Context)_localctx).IDENTIFIER!=null?((Functionargs2Context)_localctx).IDENTIFIER.getText():null) + " type FLOAT");
				            tempStack.push(text);            

				}
				else
				{
				            ST.put((((Functionargs2Context)_localctx).IDENTIFIER!=null?((Functionargs2Context)_localctx).IDENTIFIER.getText():null), (new STC((((Functionargs2Context)_localctx).INTTYPE!=null?((Functionargs2Context)_localctx).INTTYPE.getText():null), "noValue", (String) myStack.peek())));
				            //textArray.add("name " + (((Functionargs2Context)_localctx).IDENTIFIER!=null?((Functionargs2Context)_localctx).IDENTIFIER.getText():null) + " type INT");
				            String text = ("name " + (((Functionargs2Context)_localctx).IDENTIFIER!=null?((Functionargs2Context)_localctx).IDENTIFIER.getText():null) + " type INT");
				            tempStack.push(text);
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
		enterRule(_localctx, 14, RULE_inputargs);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case INTLITERAL:
			case FLOATLITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				variable();
				setState(286);
				inputargs2();
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

	public static class Inputargs2Context extends ParserRuleContext {
		public Token IDENTIFIER;
		public Token MATHOPERATOR;
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
		enterRule(_localctx, 16, RULE_inputargs2);
		int _la;
		try {
			int _alt;
			setState(332);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(T__8);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(292);
					match(WS);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				((Inputargs2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(299);
				inputargs2();
				 writeStack.add((((Inputargs2Context)_localctx).IDENTIFIER!=null?((Inputargs2Context)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(302);
					match(WS);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(308);
				((Inputargs2Context)_localctx).MATHOPERATOR = match(MATHOPERATOR);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(309);
					match(WS);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(315);
					match(T__5);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				variable();
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(322);
						match(T__6);
						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(328);
				inputargs2();
				 writeStack.add((((Inputargs2Context)_localctx).MATHOPERATOR!=null?((Inputargs2Context)_localctx).MATHOPERATOR.getText():null)); 
				}
				break;
			case T__6:
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
		public Token MATHOPERATOR;
		public Token COMPARISONOPERATOR;
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
		enterRule(_localctx, 18, RULE_conditionalargs);
		int _la;
		try {
			int _alt;
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(334);
					match(WS);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				((ConditionalargsContext)_localctx).MATHOPERATOR = match(MATHOPERATOR);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(341);
					match(WS);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
				variable();
				setState(348);
				conditionalargs();
				 writeStack.add((((ConditionalargsContext)_localctx).MATHOPERATOR!=null?((ConditionalargsContext)_localctx).MATHOPERATOR.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(351);
					match(WS);
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
				((ConditionalargsContext)_localctx).COMPARISONOPERATOR = match(COMPARISONOPERATOR);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(358);
					match(WS);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(364);
					match(T__5);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				variable();
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(371);
						match(T__6);
						}
						} 
					}
					setState(376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(377);
				conditionalargs2();

				        String rightHandSide = writeStack.remove();
				        String leftHandSide = writeStack.remove();
				        if((((ConditionalargsContext)_localctx).COMPARISONOPERATOR!=null?((ConditionalargsContext)_localctx).COMPARISONOPERATOR.getText():null).equals("<=")){
				            IRList.add(";GT " + leftHandSide + " " + rightHandSide + " LABEL" + (labelCounter + 1));
				        }else if((((ConditionalargsContext)_localctx).COMPARISONOPERATOR!=null?((ConditionalargsContext)_localctx).COMPARISONOPERATOR.getText():null).equals("==")){
				            IRList.add(";NE " + leftHandSide + " " + rightHandSide + " LABEL" + (labelCounter + 1));
				        }else if((((ConditionalargsContext)_localctx).COMPARISONOPERATOR!=null?((ConditionalargsContext)_localctx).COMPARISONOPERATOR.getText():null).equals("!=")){
				            IRList.add(";EQ " + leftHandSide + " " + rightHandSide + " LABEL" + (labelCounter + 1));
				        }else if((((ConditionalargsContext)_localctx).COMPARISONOPERATOR!=null?((ConditionalargsContext)_localctx).COMPARISONOPERATOR.getText():null).equals(">=")){
				            IRList.add(";LT " + leftHandSide + " " + rightHandSide + " LABEL" + (labelCounter + 1));
				        }else if((((ConditionalargsContext)_localctx).COMPARISONOPERATOR!=null?((ConditionalargsContext)_localctx).COMPARISONOPERATOR.getText():null).equals("<")){
				            IRList.add(";GE " + leftHandSide + " " + rightHandSide + " LABEL" + (labelCounter + 1));
				        }else if((((ConditionalargsContext)_localctx).COMPARISONOPERATOR!=null?((ConditionalargsContext)_localctx).COMPARISONOPERATOR.getText():null).equals(">")){
				            IRList.add(";LE " + leftHandSide + " " + rightHandSide + " LABEL" + (labelCounter + 1));
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

	public static class Conditionalargs2Context extends ParserRuleContext {
		public Token MATHOPERATOR;
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
		enterRule(_localctx, 20, RULE_conditionalargs2);
		int _la;
		try {
			int _alt;
			setState(412);
			switch (_input.LA(1)) {
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(382);
					match(WS);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				((Conditionalargs2Context)_localctx).MATHOPERATOR = match(MATHOPERATOR);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(389);
					match(WS);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				variable();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(396);
					match(T__5);
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				conditionalargs2();
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						match(T__6);
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				 writeStack.add((((Conditionalargs2Context)_localctx).MATHOPERATOR!=null?((Conditionalargs2Context)_localctx).MATHOPERATOR.getText():null)); 
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
		public Token IDENTIFIER;
		public Token INTLITERAL;
		public Token FLOATLITERAL;
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
		enterRule(_localctx, 22, RULE_variable);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				((VariableContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 writeStack.add((((VariableContext)_localctx).IDENTIFIER!=null?((VariableContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				((VariableContext)_localctx).INTLITERAL = match(INTLITERAL);
				 writeStack.add((((VariableContext)_localctx).INTLITERAL!=null?((VariableContext)_localctx).INTLITERAL.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				((VariableContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				 writeStack.add((((VariableContext)_localctx).FLOATLITERAL!=null?((VariableContext)_localctx).FLOATLITERAL.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
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
		enterRule(_localctx, 24, RULE_functionvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(IDENTIFIER);
			setState(424);
			match(T__5);
			setState(425);
			inputargs();
			setState(426);
			match(T__6);
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
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u01af\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\3\3\3\3\7\3E\n\3\f\3\16"+
		"\3H\13\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3W"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3o\n\3\f\3\16\3r\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086"+
		"\13\3\3\3\7\3\u0089\n\3\f\3\16\3\u008c\13\3\3\3\3\3\7\3\u0090\n\3\f\3"+
		"\16\3\u0093\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00a1"+
		"\n\3\f\3\16\3\u00a4\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00af"+
		"\n\3\f\3\16\3\u00b2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u00bf\n\3\3\3\3\3\7\3\u00c3\n\3\f\3\16\3\u00c6\13\3\3\4\3\4\7\4\u00ca"+
		"\n\4\f\4\16\4\u00cd\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d5\n\4\3\5\3\5"+
		"\7\5\u00d9\n\5\f\5\16\5\u00dc\13\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00e4\n"+
		"\5\3\6\3\6\3\6\7\6\u00e9\n\6\f\6\16\6\u00ec\13\6\3\6\3\6\7\6\u00f0\n\6"+
		"\f\6\16\6\u00f3\13\6\3\6\7\6\u00f6\n\6\f\6\16\6\u00f9\13\6\3\6\3\6\7\6"+
		"\u00fd\n\6\f\6\16\6\u0100\13\6\3\6\3\6\3\6\5\6\u0105\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u010e\n\7\3\b\3\b\7\b\u0112\n\b\f\b\16\b\u0115\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u011e\n\b\3\t\3\t\3\t\3\t\5\t\u0124\n"+
		"\t\3\n\3\n\7\n\u0128\n\n\f\n\16\n\u012b\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u0132"+
		"\n\n\f\n\16\n\u0135\13\n\3\n\3\n\7\n\u0139\n\n\f\n\16\n\u013c\13\n\3\n"+
		"\7\n\u013f\n\n\f\n\16\n\u0142\13\n\3\n\3\n\7\n\u0146\n\n\f\n\16\n\u0149"+
		"\13\n\3\n\3\n\3\n\3\n\5\n\u014f\n\n\3\13\7\13\u0152\n\13\f\13\16\13\u0155"+
		"\13\13\3\13\3\13\7\13\u0159\n\13\f\13\16\13\u015c\13\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0163\n\13\f\13\16\13\u0166\13\13\3\13\3\13\7\13\u016a"+
		"\n\13\f\13\16\13\u016d\13\13\3\13\7\13\u0170\n\13\f\13\16\13\u0173\13"+
		"\13\3\13\3\13\7\13\u0177\n\13\f\13\16\13\u017a\13\13\3\13\3\13\3\13\5"+
		"\13\u017f\n\13\3\f\7\f\u0182\n\f\f\f\16\f\u0185\13\f\3\f\3\f\7\f\u0189"+
		"\n\f\f\f\16\f\u018c\13\f\3\f\3\f\7\f\u0190\n\f\f\f\16\f\u0193\13\f\3\f"+
		"\3\f\7\f\u0197\n\f\f\f\16\f\u019a\13\f\3\f\3\f\3\f\5\f\u019f\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u01a8\n\r\3\16\3\16\3\16\3\16\3\16\3\16\2\3"+
		"\4\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\4\2\7\7\23\24\3\2\23\24\u01e0"+
		"\2\34\3\2\2\2\4\u00be\3\2\2\2\6\u00d4\3\2\2\2\b\u00e3\3\2\2\2\n\u0104"+
		"\3\2\2\2\f\u010d\3\2\2\2\16\u011d\3\2\2\2\20\u0123\3\2\2\2\22\u014e\3"+
		"\2\2\2\24\u017e\3\2\2\2\26\u019e\3\2\2\2\30\u01a7\3\2\2\2\32\u01a9\3\2"+
		"\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\37\b\2\1\2\37\3\3\2\2\2 !\b\3\1\2"+
		"!\"\7\3\2\2\"#\7\f\2\2#$\7\34\2\2$%\7\f\2\2%\u00bf\b\3\1\2&\'\7\3\2\2"+
		"\'(\7\f\2\2()\7\34\2\2)*\7\f\2\2*+\7\20\2\2+,\7\f\2\2,\u00bf\b\3\1\2-"+
		".\7\20\2\2.\u00bf\7\f\2\2/\60\7\22\2\2\60\61\7\f\2\2\61\u00bf\b\3\1\2"+
		"\62\63\7\23\2\2\63\64\7\f\2\2\64\65\7\34\2\2\65\66\5\6\4\2\66\67\b\3\1"+
		"\2\67\u00bf\3\2\2\289\7\24\2\29:\7\f\2\2:;\7\34\2\2;<\5\b\5\2<=\b\3\1"+
		"\2=\u00bf\3\2\2\2>?\7\r\2\2?A\7\f\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BF"+
		"\7\34\2\2CE\7\f\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2"+
		"HF\3\2\2\2IM\7\4\2\2JL\7\f\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NP\3\2\2\2OM\3\2\2\2PQ\7\31\2\2QR\7\5\2\2RS\7\f\2\2S\u00bf\b\3\1\2TU\7"+
		"\23\2\2UW\7\f\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\34\2\2YZ\7\4\2\2Z"+
		"[\7\32\2\2[\\\7\5\2\2\\]\7\f\2\2]\u00bf\b\3\1\2^_\7\24\2\2_a\7\f\2\2`"+
		"^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\34\2\2cd\7\4\2\2de\7\33\2\2ef\7\5\2"+
		"\2fg\7\f\2\2g\u00bf\b\3\1\2hi\7\6\2\2ij\7\f\2\2jk\t\2\2\2kl\7\f\2\2lp"+
		"\7\34\2\2mo\7\f\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2"+
		"rp\3\2\2\2st\7\b\2\2tu\5\f\7\2uv\7\t\2\2vw\7\f\2\2wx\b\3\1\2x\u00bf\3"+
		"\2\2\2y}\7\34\2\2z|\7\f\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084\7\4\2\2\u0081\u0083\7\f\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u008a\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\7\b\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0091\5\30\r\2\u008e"+
		"\u0090\7\t\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\5\n\6\2\u0095\u0096\b\3\1\2\u0096\u0097\b\3\1\2\u0097\u00bf\3\2"+
		"\2\2\u0098\u0099\7\n\2\2\u0099\u009a\7\f\2\2\u009a\u009b\5\30\r\2\u009b"+
		"\u009c\5\n\6\2\u009c\u009d\b\3\1\2\u009d\u00bf\3\2\2\2\u009e\u00a2\7\16"+
		"\2\2\u009f\u00a1\7\f\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7\t\2\2\u00a8"+
		"\u00a9\7\5\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\b\3\1\2\u00ab\u00bf\3\2"+
		"\2\2\u00ac\u00b0\7\17\2\2\u00ad\u00af\7\f\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\b\2\2\u00b4\u00b5\5\30\r\2\u00b5"+
		"\u00b6\5\24\13\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\b"+
		"\3\1\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\7\f\2\2\u00bc"+
		"\u00bf\b\3\1\2\u00bd\u00bf\7\25\2\2\u00be \3\2\2\2\u00be&\3\2\2\2\u00be"+
		"-\3\2\2\2\u00be/\3\2\2\2\u00be\62\3\2\2\2\u00be8\3\2\2\2\u00be@\3\2\2"+
		"\2\u00beV\3\2\2\2\u00be`\3\2\2\2\u00beh\3\2\2\2\u00bey\3\2\2\2\u00be\u0098"+
		"\3\2\2\2\u00be\u009e\3\2\2\2\u00be\u00ac\3\2\2\2\u00be\u00ba\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00c1\f\23\2\2\u00c1\u00c3\5"+
		"\4\3\24\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\5\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cb\7\13\2"+
		"\2\u00c8\u00ca\7\f\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\7\34\2\2\u00cf\u00d0\5\6\4\2\u00d0\u00d1\b\4\1\2\u00d1\u00d5\3"+
		"\2\2\2\u00d2\u00d3\7\5\2\2\u00d3\u00d5\7\f\2\2\u00d4\u00c7\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\7\3\2\2\2\u00d6\u00da\7\13\2\2\u00d7\u00d9\7\f\2"+
		"\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\34\2\2"+
		"\u00de\u00df\5\b\5\2\u00df\u00e0\b\5\1\2\u00e0\u00e4\3\2\2\2\u00e1\u00e2"+
		"\7\5\2\2\u00e2\u00e4\7\f\2\2\u00e3\u00d6\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\t\3\2\2\2\u00e5\u00e6\7\5\2\2\u00e6\u0105\7\f\2\2\u00e7\u00e9\7\f\2\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f1\7\27\2\2"+
		"\u00ee\u00f0\7\f\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f7\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f6\7\b\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fe\5\30\r\2\u00fb\u00fd\7\t\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\5\n\6\2\u0102\u0103\b\6\1\2\u0103\u0105\3\2"+
		"\2\2\u0104\u00e5\3\2\2\2\u0104\u00ea\3\2\2\2\u0105\13\3\2\2\2\u0106\u0107"+
		"\t\3\2\2\u0107\u0108\7\f\2\2\u0108\u0109\7\34\2\2\u0109\u010a\5\16\b\2"+
		"\u010a\u010b\b\7\1\2\u010b\u010e\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0106"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010e\r\3\2\2\2\u010f\u0113\7\13\2\2\u0110"+
		"\u0112\7\f\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\t\3\2\2\u0117\u0118\7\f\2\2\u0118\u0119\7\34\2\2\u0119\u011a\5"+
		"\16\b\2\u011a\u011b\b\b\1\2\u011b\u011e\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u010f\3\2\2\2\u011d\u011c\3\2\2\2\u011e\17\3\2\2\2\u011f\u0120\5\30\r"+
		"\2\u0120\u0121\5\22\n\2\u0121\u0124\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u011f\3\2\2\2\u0123\u0122\3\2\2\2\u0124\21\3\2\2\2\u0125\u0129\7\13\2"+
		"\2\u0126\u0128\7\f\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7\34\2\2\u012d\u012e\5\22\n\2\u012e\u012f\b\n\1\2\u012f\u014f\3"+
		"\2\2\2\u0130\u0132\7\f\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u013a\7\27\2\2\u0137\u0139\7\f\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0140\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013f\7\b\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0147\5\30\r\2\u0144\u0146\7\t\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\5\22\n\2\u014b"+
		"\u014c\b\n\1\2\u014c\u014f\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0125\3\2"+
		"\2\2\u014e\u0133\3\2\2\2\u014e\u014d\3\2\2\2\u014f\23\3\2\2\2\u0150\u0152"+
		"\7\f\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015a\7\27"+
		"\2\2\u0157\u0159\7\f\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015d\u015e\5\30\r\2\u015e\u015f\5\24\13\2\u015f\u0160\b\13\1\2\u0160"+
		"\u017f\3\2\2\2\u0161\u0163\7\f\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u016b\7\30\2\2\u0168\u016a\7\f\2\2\u0169\u0168\3"+
		"\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u0171\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\7\b\2\2\u016f\u016e\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0178\5\30\r\2\u0175\u0177\7"+
		"\t\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\5\26"+
		"\f\2\u017c\u017d\b\13\1\2\u017d\u017f\3\2\2\2\u017e\u0153\3\2\2\2\u017e"+
		"\u0164\3\2\2\2\u017f\25\3\2\2\2\u0180\u0182\7\f\2\2\u0181\u0180\3\2\2"+
		"\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u018a\7\27\2\2\u0187\u0189\7\f\2\2"+
		"\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0191\5\30\r\2"+
		"\u018e\u0190\7\b\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0198\5\26\f\2\u0195\u0197\7\t\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3"+
		"\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019c\b\f\1\2\u019c\u019f\3\2\2\2\u019d\u019f\3\2"+
		"\2\2\u019e\u0183\3\2\2\2\u019e\u019d\3\2\2\2\u019f\27\3\2\2\2\u01a0\u01a1"+
		"\7\34\2\2\u01a1\u01a8\b\r\1\2\u01a2\u01a3\7\32\2\2\u01a3\u01a8\b\r\1\2"+
		"\u01a4\u01a5\7\33\2\2\u01a5\u01a8\b\r\1\2\u01a6\u01a8\5\32\16\2\u01a7"+
		"\u01a0\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a6\3\2"+
		"\2\2\u01a8\31\3\2\2\2\u01a9\u01aa\7\34\2\2\u01aa\u01ab\7\b\2\2\u01ab\u01ac"+
		"\5\20\t\2\u01ac\u01ad\7\t\2\2\u01ad\33\3\2\2\2\60@FMV`p}\u0084\u008a\u0091"+
		"\u00a2\u00b0\u00be\u00c4\u00cb\u00d4\u00da\u00e3\u00ea\u00f1\u00f7\u00fe"+
		"\u0104\u010d\u0113\u011d\u0123\u0129\u0133\u013a\u0140\u0147\u014e\u0153"+
		"\u015a\u0164\u016b\u0171\u0178\u017e\u0183\u018a\u0191\u0198\u019e\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}