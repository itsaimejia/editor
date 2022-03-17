// Generated from .\Lenguaje.g4 by ANTLR 4.9.2
package com.lenguaje.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, VOID=7, MAIN=8, PRINTF=9, 
		INT=10, MULT=11, DIV=12, SUM=13, SUB=14, NUM=15, ID=16, LINECOM=17, MULTILINECOM=18, 
		WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "VOID", "MAIN", "PRINTF", 
			"INT", "MULT", "DIV", "SUM", "SUB", "NUM", "ID", "LINECOM", "MULTILINECOM", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'='", "'void'", "'main'", "'printf'", 
			"'int'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "VOID", "MAIN", "PRINTF", "INT", 
			"MULT", "DIV", "SUM", "SUB", "NUM", "ID", "LINECOM", "MULTILINECOM", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20T"+
		"\n\20\r\20\16\20U\3\21\6\21Y\n\21\r\21\16\21Z\3\21\7\21^\n\21\f\21\16"+
		"\21a\13\21\3\22\3\22\3\22\3\22\7\22g\n\22\f\22\16\22j\13\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\7\23t\n\23\f\23\16\23w\13\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\6\24\177\n\24\r\24\16\24\u0080\3\24\3\24\4hu\2\25"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2"+
		"\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21:\3\2\2\2\23"+
		"?\3\2\2\2\25F\3\2\2\2\27J\3\2\2\2\31L\3\2\2\2\33N\3\2\2\2\35P\3\2\2\2"+
		"\37S\3\2\2\2!X\3\2\2\2#b\3\2\2\2%o\3\2\2\2\'~\3\2\2\2)*\7*\2\2*\4\3\2"+
		"\2\2+,\7+\2\2,\6\3\2\2\2-.\7}\2\2.\b\3\2\2\2/\60\7\177\2\2\60\n\3\2\2"+
		"\2\61\62\7=\2\2\62\f\3\2\2\2\63\64\7?\2\2\64\16\3\2\2\2\65\66\7x\2\2\66"+
		"\67\7q\2\2\678\7k\2\289\7f\2\29\20\3\2\2\2:;\7o\2\2;<\7c\2\2<=\7k\2\2"+
		"=>\7p\2\2>\22\3\2\2\2?@\7r\2\2@A\7t\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2DE\7"+
		"h\2\2E\24\3\2\2\2FG\7k\2\2GH\7p\2\2HI\7v\2\2I\26\3\2\2\2JK\7,\2\2K\30"+
		"\3\2\2\2LM\7\61\2\2M\32\3\2\2\2NO\7-\2\2O\34\3\2\2\2PQ\7/\2\2Q\36\3\2"+
		"\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V \3\2\2\2WY\t\3"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\^\t\4\2\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\"\3\2\2\2a_\3\2\2\2bc\7\61\2\2c"+
		"d\7\61\2\2dh\3\2\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2"+
		"\2ik\3\2\2\2jh\3\2\2\2kl\7\f\2\2lm\3\2\2\2mn\b\22\2\2n$\3\2\2\2op\7\61"+
		"\2\2pq\7,\2\2qu\3\2\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2"+
		"\2\2vx\3\2\2\2wu\3\2\2\2xy\7,\2\2yz\7\61\2\2z{\3\2\2\2{|\b\23\2\2|&\3"+
		"\2\2\2}\177\t\5\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\24\2\2\u0083(\3\2\2\2\t\2U"+
		"Z_hu\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}