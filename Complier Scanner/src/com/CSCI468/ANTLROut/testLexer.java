// Generated from res/Grammars/test.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD=1, OPERATOR=2, STATEMENT=3, IDENTIFIER=4, FUNCTION=5, LITERAL=6, 
		ASSIGNMENT=7, STRINGLITERAL=8, FLOATLITERAL=9, INTLITERAL=10, ENDOFLINE=11, 
		WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"KEYWORD", "OPERATOR", "STATEMENT", "IDENTIFIER", "FUNCTION", "LITERAL", 
		"ASSIGNMENT", "STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", "ENDOFLINE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KEYWORD", "OPERATOR", "STATEMENT", "IDENTIFIER", "FUNCTION", "LITERAL", 
		"ASSIGNMENT", "STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", "ENDOFLINE", 
		"WS"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u00dc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2l"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3}"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00a2\n\4\3\5\6\5\u00a5\n\5\r\5\16\5\u00a6\3\6\3\6\3\6\7\6\u00ac"+
		"\n\6\f\6\16\6\u00af\13\6\3\7\3\7\3\7\5\7\u00b4\n\7\3\b\3\b\3\b\3\t\3\t"+
		"\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t\3\t\3\n\6\n\u00c3\n\n\r\n\16\n"+
		"\u00c4\3\n\3\n\6\n\u00c9\n\n\r\n\16\n\u00ca\3\13\6\13\u00ce\n\13\r\13"+
		"\16\13\u00cf\3\f\3\f\5\f\u00d4\n\f\3\f\3\f\3\r\6\r\u00d9\n\r\r\r\16\r"+
		"\u00da\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\3\2\13\5\2--==??\5\2//>>@@\5\2*+..~~\4\2,,\61\61\4\2C\\c|\6\2\"\"\60"+
		"\60<<^^\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\"\u0103\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3k\3\2\2"+
		"\2\5|\3\2\2\2\7\u00a1\3\2\2\2\t\u00a4\3\2\2\2\13\u00a8\3\2\2\2\r\u00b3"+
		"\3\2\2\2\17\u00b5\3\2\2\2\21\u00b8\3\2\2\2\23\u00c2\3\2\2\2\25\u00cd\3"+
		"\2\2\2\27\u00d1\3\2\2\2\31\u00d8\3\2\2\2\33\34\7R\2\2\34\35\7T\2\2\35"+
		"\36\7Q\2\2\36\37\7I\2\2\37 \7T\2\2 !\7C\2\2!l\7O\2\2\"#\7U\2\2#$\7V\2"+
		"\2$%\7T\2\2%&\7K\2\2&\'\7P\2\2\'l\7I\2\2()\7D\2\2)*\7G\2\2*+\7I\2\2+,"+
		"\7K\2\2,l\7P\2\2-.\7G\2\2./\7P\2\2/l\7F\2\2\60\61\7K\2\2\61\62\7P\2\2"+
		"\62l\7V\2\2\63\64\7H\2\2\64\65\7W\2\2\65\66\7P\2\2\66\67\7E\2\2\678\7"+
		"V\2\289\7K\2\29:\7Q\2\2:l\7P\2\2;<\7X\2\2<=\7Q\2\2=>\7K\2\2>l\7F\2\2?"+
		"@\7Y\2\2@A\7J\2\2AB\7K\2\2BC\7N\2\2Cl\7G\2\2DE\7Y\2\2EF\7T\2\2FG\7K\2"+
		"\2GH\7V\2\2Hl\7G\2\2IJ\7H\2\2JK\7N\2\2KL\7Q\2\2LM\7C\2\2Ml\7V\2\2NO\7"+
		"T\2\2OP\7G\2\2PQ\7C\2\2Ql\7F\2\2RS\7G\2\2ST\7P\2\2TU\7F\2\2UV\7Y\2\2V"+
		"W\7J\2\2WX\7K\2\2XY\7N\2\2Yl\7G\2\2Z[\7G\2\2[\\\7P\2\2\\]\7F\2\2]^\7K"+
		"\2\2^l\7H\2\2_`\7K\2\2`l\7H\2\2ab\7T\2\2bc\7G\2\2cd\7V\2\2de\7W\2\2ef"+
		"\7T\2\2fl\7P\2\2gh\7G\2\2hi\7N\2\2ij\7U\2\2jl\7G\2\2k\33\3\2\2\2k\"\3"+
		"\2\2\2k(\3\2\2\2k-\3\2\2\2k\60\3\2\2\2k\63\3\2\2\2k;\3\2\2\2k?\3\2\2\2"+
		"kD\3\2\2\2kI\3\2\2\2kN\3\2\2\2kR\3\2\2\2kZ\3\2\2\2k_\3\2\2\2ka\3\2\2\2"+
		"kg\3\2\2\2l\4\3\2\2\2m}\t\2\2\2n}\5\17\b\2o}\t\3\2\2pq\7@\2\2q}\7?\2\2"+
		"rs\7>\2\2s}\7?\2\2tu\7#\2\2u}\7?\2\2vw\7?\2\2w}\7?\2\2x}\t\4\2\2yz\7("+
		"\2\2z}\7(\2\2{}\t\5\2\2|m\3\2\2\2|n\3\2\2\2|o\3\2\2\2|p\3\2\2\2|r\3\2"+
		"\2\2|t\3\2\2\2|v\3\2\2\2|x\3\2\2\2|y\3\2\2\2|{\3\2\2\2}\6\3\2\2\2~\177"+
		"\5\3\2\2\177\u0080\5\31\r\2\u0080\u0081\5\t\5\2\u0081\u0082\5\31\r\2\u0082"+
		"\u0083\5\17\b\2\u0083\u0084\5\31\r\2\u0084\u0085\5\r\7\2\u0085\u0086\5"+
		"\27\f\2\u0086\u00a2\3\2\2\2\u0087\u0088\5\3\2\2\u0088\u0089\5\31\r\2\u0089"+
		"\u008a\5\t\5\2\u008a\u008b\5\27\f\2\u008b\u00a2\3\2\2\2\u008c\u008d\5"+
		"\t\5\2\u008d\u008e\5\31\r\2\u008e\u008f\5\17\b\2\u008f\u0090\5\31\r\2"+
		"\u0090\u0091\5\r\7\2\u0091\u0092\5\27\f\2\u0092\u00a2\3\2\2\2\u0093\u0094"+
		"\5\3\2\2\u0094\u0095\5\27\f\2\u0095\u00a2\3\2\2\2\u0096\u0097\5\13\6\2"+
		"\u0097\u0098\5\27\f\2\u0098\u00a2\3\2\2\2\u0099\u009a\5\31\r\2\u009a\u009b"+
		"\5\7\4\2\u009b\u00a2\3\2\2\2\u009c\u009d\5\3\2\2\u009d\u009e\5\31\r\2"+
		"\u009e\u009f\5\t\5\2\u009f\u00a0\5\31\r\2\u00a0\u00a2\3\2\2\2\u00a1~\3"+
		"\2\2\2\u00a1\u0087\3\2\2\2\u00a1\u008c\3\2\2\2\u00a1\u0093\3\2\2\2\u00a1"+
		"\u0096\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\b\3\2\2\2"+
		"\u00a3\u00a5\t\6\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\5\5\3\2\u00a9"+
		"\u00ad\5\7\4\2\u00aa\u00ac\5\5\3\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\f\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00b4\5\21\t\2\u00b1\u00b4\5\23\n\2\u00b2\u00b4\5\25\13"+
		"\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\16"+
		"\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6\u00b7\7?\2\2\u00b7\20\3\2\2\2\u00b8"+
		"\u00bc\7$\2\2\u00b9\u00bb\t\7\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0\22\3\2\2\2\u00c1\u00c3\t\b\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\t\t\2\2\u00c7\u00c9\t\b\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\24\3\2\2\2\u00cc\u00ce\t\b\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\26\3\2\2\2\u00d1"+
		"\u00d3\7=\2\2\u00d2\u00d4\7\17\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\30\3\2\2\2\u00d7\u00d9"+
		"\t\n\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\32\3\2\2\2\17\2k|\u00a1\u00a6\u00ad\u00b3\u00bc\u00c4"+
		"\u00ca\u00cf\u00d3\u00da\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}