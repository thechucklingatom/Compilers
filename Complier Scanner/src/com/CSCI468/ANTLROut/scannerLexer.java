// Generated from res/Grammars/scanner.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;


import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.ArrayList;
import com.CSCI468.IR2TinyConverter.IR2Tiny;



import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scannerLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"WS", "STRINGTYPE", "SYSTEMFUNCTION", "CONDITIONAL", "KEYWORD", "ELSEBLOCK", 
		"SCOPEEND", "INTTYPE", "FLOATTYPE", "COMMENT", "OPERATOR", "MATHOPERATOR", 
		"COMPARISONOPERATOR", "STRINGLITERAL", "INTLITERAL", "FLOATLITERAL", "IDENTIFIER"
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


	public scannerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00f5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\6\13a\n\13\r\13\16"+
		"\13b\3\13\5\13f\n\13\3\13\7\13i\n\13\f\13\16\13l\13\13\6\13n\n\13\r\13"+
		"\16\13o\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0082\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a8"+
		"\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\7\24\u00b8\n\24\f\24\16\24\u00bb\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u00c2\n\25\3\26\3\26\3\26\3\26\5\26\u00c8\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d4\n\27\3\30\3\30\7\30\u00d8"+
		"\n\30\f\30\16\30\u00db\13\30\3\30\3\30\3\31\6\31\u00e0\n\31\r\31\16\31"+
		"\u00e1\3\32\6\32\u00e5\n\32\r\32\16\32\u00e6\3\32\3\32\6\32\u00eb\n\32"+
		"\r\32\16\32\u00ec\3\33\3\33\7\33\u00f1\n\33\f\33\16\33\u00f4\13\33\2\2"+
		"\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\f\5\2"+
		"\13\f\17\17\"\"\4\2\f\f\17\17\4\2*+..\5\2,-//\61\61\4\2>>@@\3\2$$\3\2"+
		"\62;\3\2\60\60\4\2C\\c|\5\2\62;C\\c|\u010a\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\3\67\3\2\2\2\5?\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13M\3\2\2"+
		"\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23]\3\2\2\2\25m\3\2\2\2\27q\3\2"+
		"\2\2\31\u0081\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u0092\3\2\2"+
		"\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ad\3\2\2\2\'\u00b3\3\2\2\2)\u00c1"+
		"\3\2\2\2+\u00c7\3\2\2\2-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61\u00df\3\2\2\2"+
		"\63\u00e4\3\2\2\2\65\u00ee\3\2\2\2\678\7R\2\289\7T\2\29:\7Q\2\2:;\7I\2"+
		"\2;<\7T\2\2<=\7C\2\2=>\7O\2\2>\4\3\2\2\2?@\7<\2\2@A\7?\2\2A\6\3\2\2\2"+
		"BC\7=\2\2C\b\3\2\2\2DE\7H\2\2EF\7W\2\2FG\7P\2\2GH\7E\2\2HI\7V\2\2IJ\7"+
		"K\2\2JK\7Q\2\2KL\7P\2\2L\n\3\2\2\2MN\7X\2\2NO\7Q\2\2OP\7K\2\2PQ\7F\2\2"+
		"Q\f\3\2\2\2RS\7*\2\2S\16\3\2\2\2TU\7+\2\2U\20\3\2\2\2VW\7T\2\2WX\7G\2"+
		"\2XY\7V\2\2YZ\7W\2\2Z[\7T\2\2[\\\7P\2\2\\\22\3\2\2\2]^\7.\2\2^\24\3\2"+
		"\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\'"+
		"\24\2ed\3\2\2\2ef\3\2\2\2fj\3\2\2\2gi\t\2\2\2hg\3\2\2\2il\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2m`\3\2\2\2no\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2p\26\3\2\2\2qr\7U\2\2rs\7V\2\2st\7T\2\2tu\7K\2\2uv\7P\2\2vw\7I\2"+
		"\2w\30\3\2\2\2xy\7T\2\2yz\7G\2\2z{\7C\2\2{\u0082\7F\2\2|}\7Y\2\2}~\7T"+
		"\2\2~\177\7K\2\2\177\u0080\7V\2\2\u0080\u0082\7G\2\2\u0081x\3\2\2\2\u0081"+
		"|\3\2\2\2\u0082\32\3\2\2\2\u0083\u0084\7K\2\2\u0084\u008b\7H\2\2\u0085"+
		"\u0086\7Y\2\2\u0086\u0087\7J\2\2\u0087\u0088\7K\2\2\u0088\u0089\7N\2\2"+
		"\u0089\u008b\7G\2\2\u008a\u0083\3\2\2\2\u008a\u0085\3\2\2\2\u008b\34\3"+
		"\2\2\2\u008c\u008d\7D\2\2\u008d\u008e\7G\2\2\u008e\u008f\7I\2\2\u008f"+
		"\u0090\7K\2\2\u0090\u0091\7P\2\2\u0091\36\3\2\2\2\u0092\u0093\7G\2\2\u0093"+
		"\u0094\7N\2\2\u0094\u0095\7U\2\2\u0095\u0096\7G\2\2\u0096 \3\2\2\2\u0097"+
		"\u0098\7G\2\2\u0098\u0099\7P\2\2\u0099\u00a8\7F\2\2\u009a\u009b\7G\2\2"+
		"\u009b\u009c\7P\2\2\u009c\u009d\7F\2\2\u009d\u009e\7K\2\2\u009e\u00a8"+
		"\7H\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7F\2\2\u00a2"+
		"\u00a3\7Y\2\2\u00a3\u00a4\7J\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7N\2\2"+
		"\u00a6\u00a8\7G\2\2\u00a7\u0097\3\2\2\2\u00a7\u009a\3\2\2\2\u00a7\u009f"+
		"\3\2\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac"+
		"\7V\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7H\2\2\u00ae\u00af\7N\2\2\u00af\u00b0"+
		"\7Q\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7V\2\2\u00b2&\3\2\2\2\u00b3\u00b4"+
		"\7/\2\2\u00b4\u00b5\7/\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b8\n\3\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\b\24\2\2\u00bd"+
		"(\3\2\2\2\u00be\u00c2\t\4\2\2\u00bf\u00c0\7<\2\2\u00c0\u00c2\7?\2\2\u00c1"+
		"\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2*\3\2\2\2\u00c3\u00c8\t\5\2\2"+
		"\u00c4\u00c5\7(\2\2\u00c5\u00c8\7(\2\2\u00c6\u00c8\7~\2\2\u00c7\u00c3"+
		"\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8,\3\2\2\2\u00c9"+
		"\u00d4\t\6\2\2\u00ca\u00cb\7@\2\2\u00cb\u00d4\7?\2\2\u00cc\u00cd\7>\2"+
		"\2\u00cd\u00d4\7?\2\2\u00ce\u00cf\7#\2\2\u00cf\u00d4\7?\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1\u00d4\7?\2\2\u00d2\u00d4\7?\2\2\u00d3\u00c9\3\2\2\2\u00d3"+
		"\u00ca\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d0\3\2"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4.\3\2\2\2\u00d5\u00d9\7$\2\2\u00d6\u00d8"+
		"\n\7\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7$"+
		"\2\2\u00dd\60\3\2\2\2\u00de\u00e0\t\b\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\62\3\2\2\2\u00e3"+
		"\u00e5\t\b\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\t\t\2\2\u00e9"+
		"\u00eb\t\b\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\64\3\2\2\2\u00ee\u00f2\t\n\2\2\u00ef\u00f1"+
		"\t\13\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\66\3\2\2\2\u00f4\u00f2\3\2\2\2\23\2bejo\u0081"+
		"\u008a\u00a7\u00b9\u00c1\u00c7\u00d3\u00d9\u00e1\u00e6\u00ec\u00f2\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}