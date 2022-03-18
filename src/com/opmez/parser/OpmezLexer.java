// Generated from .\Opmez.g4 by ANTLR 4.9.2
package com.opmez.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpmezLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DEFINEFUNC=2, KEYSOC=3, ARROWOPEN=4, ARROWCLOSE=5, INITIAL=6, 
		ENDLINE=7, PRINT=8, INT=9, MULT=10, DIV=11, SUM=12, SUB=13, NUM=14, ID=15, 
		LINECOM=16, MULTILINECOM=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DEFINEFUNC", "KEYSOC", "ARROWOPEN", "ARROWCLOSE", "INITIAL", 
			"ENDLINE", "PRINT", "INT", "MULT", "DIV", "SUM", "SUB", "NUM", "ID", 
			"LINECOM", "MULTILINECOM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'#'", "'|'", "'<'", "'>'", "'initial'", "'!'", "'systalk'", 
			"'decimalnt'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DEFINEFUNC", "KEYSOC", "ARROWOPEN", "ARROWCLOSE", "INITIAL", 
			"ENDLINE", "PRINT", "INT", "MULT", "DIV", "SUM", "SUB", "NUM", "ID", 
			"LINECOM", "MULTILINECOM", "WS"
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


	public OpmezLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Opmez.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\6\17W\n\17\r\17\16\17X\3\20\6\20\\\n\20\r\20\16\20]\3\20\7\20a\n\20\f"+
		"\20\16\20d\13\20\3\21\3\21\7\21h\n\21\f\21\16\21k\13\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\7\22u\n\22\f\22\16\22x\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\6\23\u0080\n\23\r\23\16\23\u0081\3\23\3\23\4iv\2\24\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\""+
		"\2\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2"+
		"\13/\3\2\2\2\r\61\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23C\3\2\2\2\25M\3\2"+
		"\2\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35V\3\2\2\2\37[\3\2\2\2!e\3\2"+
		"\2\2#p\3\2\2\2%\177\3\2\2\2\'(\7?\2\2(\4\3\2\2\2)*\7%\2\2*\6\3\2\2\2+"+
		",\7~\2\2,\b\3\2\2\2-.\7>\2\2.\n\3\2\2\2/\60\7@\2\2\60\f\3\2\2\2\61\62"+
		"\7k\2\2\62\63\7p\2\2\63\64\7k\2\2\64\65\7v\2\2\65\66\7k\2\2\66\67\7c\2"+
		"\2\678\7n\2\28\16\3\2\2\29:\7#\2\2:\20\3\2\2\2;<\7u\2\2<=\7{\2\2=>\7u"+
		"\2\2>?\7v\2\2?@\7c\2\2@A\7n\2\2AB\7m\2\2B\22\3\2\2\2CD\7f\2\2DE\7g\2\2"+
		"EF\7e\2\2FG\7k\2\2GH\7o\2\2HI\7c\2\2IJ\7n\2\2JK\7p\2\2KL\7v\2\2L\24\3"+
		"\2\2\2MN\7,\2\2N\26\3\2\2\2OP\7\61\2\2P\30\3\2\2\2QR\7-\2\2R\32\3\2\2"+
		"\2ST\7/\2\2T\34\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\36\3\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^"+
		"b\3\2\2\2_a\t\4\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c \3\2\2\2"+
		"db\3\2\2\2ei\7B\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2\2\2"+
		"jl\3\2\2\2ki\3\2\2\2lm\7\f\2\2mn\3\2\2\2no\b\21\2\2o\"\3\2\2\2pq\7B\2"+
		"\2qr\7}\2\2rv\3\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2"+
		"\2wy\3\2\2\2xv\3\2\2\2yz\7\177\2\2z{\7B\2\2{|\3\2\2\2|}\b\22\2\2}$\3\2"+
		"\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\23\2\2\u0084&\3"+
		"\2\2\2\t\2X]biv\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}