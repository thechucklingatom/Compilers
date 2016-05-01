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
			setState(189);
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
				 //IRList.add(";LABEL label" + labelCounter++);
				                       
				myStack.pop();
				}
				break;
			case 5:
				{
				{
				setState(49);
				((StartContext)_localctx).INTTYPE = match(INTTYPE);
				}
				setState(50);
				match(WS);
				setState(51);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(52);
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
				setState(55);
				((StartContext)_localctx).FLOATTYPE = match(FLOATTYPE);
				}
				setState(56);
				match(WS);
				setState(57);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(58);
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
				setState(63);
				_la = _input.LA(1);
				if (_la==STRINGTYPE) {
					{
					setState(61);
					((StartContext)_localctx).STRINGTYPE = match(STRINGTYPE);
					setState(62);
					match(WS);
					}
				}

				setState(65);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(66);
					match(WS);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(T__1);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(73);
					match(WS);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				((StartContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				setState(80);
				match(T__2);
				setState(81);
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
				setState(85);
				_la = _input.LA(1);
				if (_la==INTTYPE) {
					{
					setState(83);
					((StartContext)_localctx).INTTYPE = match(INTTYPE);
					setState(84);
					match(WS);
					}
				}

				setState(87);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(88);
				match(T__1);
				setState(89);
				((StartContext)_localctx).INTLITERAL = match(INTLITERAL);
				setState(90);
				match(T__2);
				setState(91);
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
				setState(95);
				_la = _input.LA(1);
				if (_la==FLOATTYPE) {
					{
					setState(93);
					((StartContext)_localctx).FLOATTYPE = match(FLOATTYPE);
					setState(94);
					match(WS);
					}
				}

				setState(97);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(98);
				match(T__1);
				setState(99);
				((StartContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				setState(100);
				match(T__2);
				setState(101);
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
				setState(103);
				match(T__3);
				setState(104);
				match(WS);
				setState(105);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << INTTYPE) | (1L << FLOATTYPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(106);
				match(WS);
				setState(107);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
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
				match(T__5);
				setState(115);
				functionargs();
				setState(116);
				match(T__6);
				setState(117);
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
				setState(120);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(121);
					match(WS);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__1);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(128);
					match(WS);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(134);
					match(T__5);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				variable();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(141);
					match(T__6);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
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
				                    
				                    while(temp.size() > 0){
				                        String mathOperation = temp.remove();
				                        if(ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).getType().matches("INT")){
				                            if("+".equals(mathOperation)){
				                                IRList.add(";ADDI " + temp.remove() + " " + temp.remove() + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				                            }else if("*".equals(mathOperation)){
				                                IRList.add(";MULTI " + temp.remove() + " " + temp.remove() + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				                            }else if("\\".equals(mathOperation)){
				                                IRList.add(";DIVI " + temp.remove() + " " + temp.remove() + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				                            }
				                        }else if(ST.get((((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null)).getType().matches("FLOAT")){
				                            if("+".equals(mathOperation)){
				                                IRList.add(";ADDF " + temp.remove() + " " + temp.remove() + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				                            }else if("*".equals(mathOperation)){
				                                IRList.add(";MULTF " + temp.remove() + " " + temp.remove() + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				                            }else if("\\".equals(mathOperation)){
				                                IRList.add(";DIVF " + temp.remove() + " " + temp.remove() + " " + (((StartContext)_localctx).IDENTIFIER!=null?((StartContext)_localctx).IDENTIFIER.getText():null));
				                            }
				                        }
				                    }
				                    
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
				setState(151);
				match(T__7);
				setState(152);
				match(WS);
				setState(153);
				variable();
				setState(154);
				mathoperation();

				                while(!writeStack.isEmpty()){
				                    writeStack.remove();
				                }
				            
				}
				break;
			case 13:
				{
				setState(157);
				((StartContext)_localctx).SYSTEMFUNCTION = match(SYSTEMFUNCTION);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(158);
					match(WS);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(T__5);
				setState(165);
				inputargs();
				setState(166);
				match(T__6);
				setState(167);
				match(T__2);
				setState(168);
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
				setState(171);
				match(CONDITIONAL);
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
				match(T__5);
				setState(179);
				variable();
				setState(180);
				conditionalargs();
				setState(181);
				match(T__6);
				setState(182);
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
				setState(185);
				match(ELSEBLOCK);
				setState(186);
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
				setState(188);
				match(COMMENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
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
					setState(191);
					if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
					setState(192);
					start(18);
					}
					} 
				}
				setState(197);
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
			setState(211);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__8);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(199);
					match(WS);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				((IntvariabledeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(206);
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
				setState(209);
				match(T__2);
				setState(210);
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
			setState(226);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__8);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(214);
					match(WS);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				((FloatvariabledeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(221);
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
				setState(224);
				match(T__2);
				setState(225);
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
			setState(259);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__2);
				setState(229);
				match(WS);
				}
				break;
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(230);
					match(WS);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				((MathoperationContext)_localctx).MATHOPERATOR = match(MATHOPERATOR);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(237);
					match(WS);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(243);
					match(T__5);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				variable();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(250);
					match(T__6);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
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
			setState(268);
			switch (_input.LA(1)) {
			case INTTYPE:
			case FLOATTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==INTTYPE || _la==FLOATTYPE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(262);
				match(WS);
				setState(263);
				((FunctionargsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(264);
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
			setState(284);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__8);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(271);
					match(WS);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				_la = _input.LA(1);
				if ( !(_la==INTTYPE || _la==FLOATTYPE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(278);
				match(WS);
				setState(279);
				((Functionargs2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(280);
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
			setState(290);
			switch (_input.LA(1)) {
			case INTLITERAL:
			case FLOATLITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				variable();
				setState(287);
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
			setState(333);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(T__8);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(293);
					match(WS);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				((Inputargs2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(300);
				inputargs2();
				 writeStack.add((((Inputargs2Context)_localctx).IDENTIFIER!=null?((Inputargs2Context)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(303);
					match(WS);
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				((Inputargs2Context)_localctx).MATHOPERATOR = match(MATHOPERATOR);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(310);
					match(WS);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(316);
					match(T__5);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				variable();
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323);
						match(T__6);
						}
						} 
					}
					setState(328);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(329);
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
				((ConditionalargsContext)_localctx).MATHOPERATOR = match(MATHOPERATOR);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(342);
					match(WS);
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				variable();
				setState(349);
				conditionalargs();
				 writeStack.add((((ConditionalargsContext)_localctx).MATHOPERATOR!=null?((ConditionalargsContext)_localctx).MATHOPERATOR.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(352);
					match(WS);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				((ConditionalargsContext)_localctx).COMPARISONOPERATOR = match(COMPARISONOPERATOR);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(359);
					match(WS);
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(365);
					match(T__5);
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				variable();
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(372);
						match(T__6);
						}
						} 
					}
					setState(377);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(378);
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
			setState(413);
			switch (_input.LA(1)) {
			case WS:
			case MATHOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(383);
					match(WS);
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(389);
				((Conditionalargs2Context)_localctx).MATHOPERATOR = match(MATHOPERATOR);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(390);
					match(WS);
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				variable();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(397);
					match(T__5);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				conditionalargs2();
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(404);
						match(T__6);
						}
						} 
					}
					setState(409);
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				((VariableContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 writeStack.add((((VariableContext)_localctx).IDENTIFIER!=null?((VariableContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				((VariableContext)_localctx).INTLITERAL = match(INTLITERAL);
				 writeStack.add((((VariableContext)_localctx).INTLITERAL!=null?((VariableContext)_localctx).INTLITERAL.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				((VariableContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				 writeStack.add((((VariableContext)_localctx).FLOATLITERAL!=null?((VariableContext)_localctx).FLOATLITERAL.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
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
			setState(424);
			match(IDENTIFIER);
			setState(425);
			match(T__5);
			setState(426);
			inputargs();
			setState(427);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u01b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3\3\3\7\3F\n\3\f\3"+
		"\16\3I\13\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3X\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\7\3\u0084\n\3\f\3\16"+
		"\3\u0087\13\3\3\3\7\3\u008a\n\3\f\3\16\3\u008d\13\3\3\3\3\3\7\3\u0091"+
		"\n\3\f\3\16\3\u0094\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\u00a2\n\3\f\3\16\3\u00a5\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\u00b0\n\3\f\3\16\3\u00b3\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u00c0\n\3\3\3\3\3\7\3\u00c4\n\3\f\3\16\3\u00c7\13\3\3\4"+
		"\3\4\7\4\u00cb\n\4\f\4\16\4\u00ce\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d6"+
		"\n\4\3\5\3\5\7\5\u00da\n\5\f\5\16\5\u00dd\13\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00e5\n\5\3\6\3\6\3\6\7\6\u00ea\n\6\f\6\16\6\u00ed\13\6\3\6\3\6\7"+
		"\6\u00f1\n\6\f\6\16\6\u00f4\13\6\3\6\7\6\u00f7\n\6\f\6\16\6\u00fa\13\6"+
		"\3\6\3\6\7\6\u00fe\n\6\f\6\16\6\u0101\13\6\3\6\3\6\3\6\5\6\u0106\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u010f\n\7\3\b\3\b\7\b\u0113\n\b\f\b\16"+
		"\b\u0116\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u011f\n\b\3\t\3\t\3\t\3"+
		"\t\5\t\u0125\n\t\3\n\3\n\7\n\u0129\n\n\f\n\16\n\u012c\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u0133\n\n\f\n\16\n\u0136\13\n\3\n\3\n\7\n\u013a\n\n\f\n\16"+
		"\n\u013d\13\n\3\n\7\n\u0140\n\n\f\n\16\n\u0143\13\n\3\n\3\n\7\n\u0147"+
		"\n\n\f\n\16\n\u014a\13\n\3\n\3\n\3\n\3\n\5\n\u0150\n\n\3\13\7\13\u0153"+
		"\n\13\f\13\16\13\u0156\13\13\3\13\3\13\7\13\u015a\n\13\f\13\16\13\u015d"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u0164\n\13\f\13\16\13\u0167\13\13"+
		"\3\13\3\13\7\13\u016b\n\13\f\13\16\13\u016e\13\13\3\13\7\13\u0171\n\13"+
		"\f\13\16\13\u0174\13\13\3\13\3\13\7\13\u0178\n\13\f\13\16\13\u017b\13"+
		"\13\3\13\3\13\3\13\5\13\u0180\n\13\3\f\7\f\u0183\n\f\f\f\16\f\u0186\13"+
		"\f\3\f\3\f\7\f\u018a\n\f\f\f\16\f\u018d\13\f\3\f\3\f\7\f\u0191\n\f\f\f"+
		"\16\f\u0194\13\f\3\f\3\f\7\f\u0198\n\f\f\f\16\f\u019b\13\f\3\f\3\f\3\f"+
		"\5\f\u01a0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01a9\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\2\3\4\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\4\2\7\7"+
		"\23\24\3\2\23\24\u01e1\2\34\3\2\2\2\4\u00bf\3\2\2\2\6\u00d5\3\2\2\2\b"+
		"\u00e4\3\2\2\2\n\u0105\3\2\2\2\f\u010e\3\2\2\2\16\u011e\3\2\2\2\20\u0124"+
		"\3\2\2\2\22\u014f\3\2\2\2\24\u017f\3\2\2\2\26\u019f\3\2\2\2\30\u01a8\3"+
		"\2\2\2\32\u01aa\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\37\b\2\1\2\37\3"+
		"\3\2\2\2 !\b\3\1\2!\"\7\3\2\2\"#\7\f\2\2#$\7\34\2\2$%\7\f\2\2%\u00c0\b"+
		"\3\1\2&\'\7\3\2\2\'(\7\f\2\2()\7\34\2\2)*\7\f\2\2*+\7\20\2\2+,\7\f\2\2"+
		",\u00c0\b\3\1\2-.\7\20\2\2.\u00c0\7\f\2\2/\60\7\22\2\2\60\61\7\f\2\2\61"+
		"\62\b\3\1\2\62\u00c0\b\3\1\2\63\64\7\23\2\2\64\65\7\f\2\2\65\66\7\34\2"+
		"\2\66\67\5\6\4\2\678\b\3\1\28\u00c0\3\2\2\29:\7\24\2\2:;\7\f\2\2;<\7\34"+
		"\2\2<=\5\b\5\2=>\b\3\1\2>\u00c0\3\2\2\2?@\7\r\2\2@B\7\f\2\2A?\3\2\2\2"+
		"AB\3\2\2\2BC\3\2\2\2CG\7\34\2\2DF\7\f\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\7\4\2\2KM\7\f\2\2LK\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\31\2\2RS\7\5\2\2ST\7\f"+
		"\2\2T\u00c0\b\3\1\2UV\7\23\2\2VX\7\f\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2"+
		"YZ\7\34\2\2Z[\7\4\2\2[\\\7\32\2\2\\]\7\5\2\2]^\7\f\2\2^\u00c0\b\3\1\2"+
		"_`\7\24\2\2`b\7\f\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\34\2\2de\7\4\2"+
		"\2ef\7\33\2\2fg\7\5\2\2gh\7\f\2\2h\u00c0\b\3\1\2ij\7\6\2\2jk\7\f\2\2k"+
		"l\t\2\2\2lm\7\f\2\2mq\7\34\2\2np\7\f\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\b\2\2uv\5\f\7\2vw\7\t\2\2wx\7\f\2\2"+
		"xy\b\3\1\2y\u00c0\3\2\2\2z~\7\34\2\2{}\7\f\2\2|{\3\2\2\2}\u0080\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0085"+
		"\7\4\2\2\u0082\u0084\7\f\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u008a\7\b\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0092\5\30\r\2\u008f\u0091\7\t\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\5\n\6\2\u0096\u0097\b\3\1\2\u0097"+
		"\u0098\b\3\1\2\u0098\u00c0\3\2\2\2\u0099\u009a\7\n\2\2\u009a\u009b\7\f"+
		"\2\2\u009b\u009c\5\30\r\2\u009c\u009d\5\n\6\2\u009d\u009e\b\3\1\2\u009e"+
		"\u00c0\3\2\2\2\u009f\u00a3\7\16\2\2\u00a0\u00a2\7\f\2\2\u00a1\u00a0\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\5\20"+
		"\t\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\7\f\2\2\u00ab"+
		"\u00ac\b\3\1\2\u00ac\u00c0\3\2\2\2\u00ad\u00b1\7\17\2\2\u00ae\u00b0\7"+
		"\f\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\b"+
		"\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\7\t\2\2\u00b8"+
		"\u00b9\7\f\2\2\u00b9\u00ba\b\3\1\2\u00ba\u00c0\3\2\2\2\u00bb\u00bc\7\21"+
		"\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00c0\b\3\1\2\u00be\u00c0\7\25\2\2\u00bf"+
		" \3\2\2\2\u00bf&\3\2\2\2\u00bf-\3\2\2\2\u00bf/\3\2\2\2\u00bf\63\3\2\2"+
		"\2\u00bf9\3\2\2\2\u00bfA\3\2\2\2\u00bfW\3\2\2\2\u00bfa\3\2\2\2\u00bfi"+
		"\3\2\2\2\u00bfz\3\2\2\2\u00bf\u0099\3\2\2\2\u00bf\u009f\3\2\2\2\u00bf"+
		"\u00ad\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c5\3\2"+
		"\2\2\u00c1\u00c2\f\23\2\2\u00c2\u00c4\5\4\3\24\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\5\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c8\u00cc\7\13\2\2\u00c9\u00cb\7\f\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\34\2\2\u00d0\u00d1\5"+
		"\6\4\2\u00d1\u00d2\b\4\1\2\u00d2\u00d6\3\2\2\2\u00d3\u00d4\7\5\2\2\u00d4"+
		"\u00d6\7\f\2\2\u00d5\u00c8\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\7\3\2\2\2"+
		"\u00d7\u00db\7\13\2\2\u00d8\u00da\7\f\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\7\34\2\2\u00df\u00e0\5\b\5\2\u00e0\u00e1\b"+
		"\5\1\2\u00e1\u00e5\3\2\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e5\7\f\2\2\u00e4"+
		"\u00d7\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\t\3\2\2\2\u00e6\u00e7\7\5\2\2"+
		"\u00e7\u0106\7\f\2\2\u00e8\u00ea\7\f\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f2\7\27\2\2\u00ef\u00f1\7\f\2\2\u00f0\u00ef\3"+
		"\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f8\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7\b\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ff\5\30\r\2\u00fc\u00fe\7"+
		"\t\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5\n"+
		"\6\2\u0103\u0104\b\6\1\2\u0104\u0106\3\2\2\2\u0105\u00e6\3\2\2\2\u0105"+
		"\u00eb\3\2\2\2\u0106\13\3\2\2\2\u0107\u0108\t\3\2\2\u0108\u0109\7\f\2"+
		"\2\u0109\u010a\7\34\2\2\u010a\u010b\5\16\b\2\u010b\u010c\b\7\1\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u010d\3\2"+
		"\2\2\u010f\r\3\2\2\2\u0110\u0114\7\13\2\2\u0111\u0113\7\f\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\t\3\2\2\u0118\u0119\7\f"+
		"\2\2\u0119\u011a\7\34\2\2\u011a\u011b\5\16\b\2\u011b\u011c\b\b\1\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0110\3\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\17\3\2\2\2\u0120\u0121\5\30\r\2\u0121\u0122\5\22\n\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0123\3\2"+
		"\2\2\u0125\21\3\2\2\2\u0126\u012a\7\13\2\2\u0127\u0129\7\f\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\34\2\2\u012e\u012f\5"+
		"\22\n\2\u012f\u0130\b\n\1\2\u0130\u0150\3\2\2\2\u0131\u0133\7\f\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013b\7\27\2\2\u0138"+
		"\u013a\7\f\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u0141\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0140\7\b\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0148\5\30\r\2\u0145\u0147\7\t\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3"+
		"\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014c\5\22\n\2\u014c\u014d\b\n\1\2\u014d\u0150\3"+
		"\2\2\2\u014e\u0150\3\2\2\2\u014f\u0126\3\2\2\2\u014f\u0134\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\23\3\2\2\2\u0151\u0153\7\f\2\2\u0152\u0151\3\2\2"+
		"\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015b\7\27\2\2\u0158\u015a\7\f\2\2"+
		"\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\5\30\r\2"+
		"\u015f\u0160\5\24\13\2\u0160\u0161\b\13\1\2\u0161\u0180\3\2\2\2\u0162"+
		"\u0164\7\f\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u016c\7\30\2\2\u0169\u016b\7\f\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3"+
		"\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0172\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0171\7\b\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0179\5\30\r\2\u0176\u0178\7\t\2\2\u0177\u0176\3"+
		"\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\5\26\f\2\u017d\u017e\b"+
		"\13\1\2\u017e\u0180\3\2\2\2\u017f\u0154\3\2\2\2\u017f\u0165\3\2\2\2\u0180"+
		"\25\3\2\2\2\u0181\u0183\7\f\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2"+
		"\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u018b\7\27\2\2\u0188\u018a\7\f\2\2\u0189\u0188\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0192\5\30\r\2\u018f\u0191\7\b\2\2"+
		"\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0199\5\26\f\2"+
		"\u0196\u0198\7\t\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019d\b\f\1\2\u019d\u01a0\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u0184\3\2"+
		"\2\2\u019f\u019e\3\2\2\2\u01a0\27\3\2\2\2\u01a1\u01a2\7\34\2\2\u01a2\u01a9"+
		"\b\r\1\2\u01a3\u01a4\7\32\2\2\u01a4\u01a9\b\r\1\2\u01a5\u01a6\7\33\2\2"+
		"\u01a6\u01a9\b\r\1\2\u01a7\u01a9\5\32\16\2\u01a8\u01a1\3\2\2\2\u01a8\u01a3"+
		"\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\31\3\2\2\2\u01aa"+
		"\u01ab\7\34\2\2\u01ab\u01ac\7\b\2\2\u01ac\u01ad\5\20\t\2\u01ad\u01ae\7"+
		"\t\2\2\u01ae\33\3\2\2\2\60AGNWaq~\u0085\u008b\u0092\u00a3\u00b1\u00bf"+
		"\u00c5\u00cc\u00d5\u00db\u00e4\u00eb\u00f2\u00f8\u00ff\u0105\u010e\u0114"+
		"\u011e\u0124\u012a\u0134\u013b\u0141\u0148\u014f\u0154\u015b\u0165\u016c"+
		"\u0172\u0179\u017f\u0184\u018b\u0192\u0199\u019f\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}