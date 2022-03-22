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
		DEFINEFUNC=1, INITIAL=2, KO=3, KC=4, PO=5, PC=6, IF=7, ELSE=8, SCOL=9, 
		ASSIGN=10, PRINT=11, INT=12, EQT=13, NEQT=14, GT=15, LT=16, GEQT=17, LEQT=18, 
		AND=19, OR=20, TRUE=21, FALSE=22, NOT=23, MULT=24, DIV=25, SUM=26, SUB=27, 
		NUM=28, ID=29, LINECOM=30, MULTILINECOM=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", "ELSE", "SCOL", 
			"ASSIGN", "PRINT", "INT", "EQT", "NEQT", "GT", "LT", "GEQT", "LEQT", 
			"AND", "OR", "TRUE", "FALSE", "NOT", "MULT", "DIV", "SUM", "SUB", "NUM", 
			"ID", "LINECOM", "MULTILINECOM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'initial'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
			"';'", "'='", "'systalk'", "'decimalnt'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", "'!'", "'*'", "'/'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", "ELSE", 
			"SCOL", "ASSIGN", "PRINT", "INT", "EQT", "NEQT", "GT", "LT", "GEQT", 
			"LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", "DIV", "SUM", "SUB", 
			"NUM", "ID", "LINECOM", "MULTILINECOM", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6"+
		"\35\u00a0\n\35\r\35\16\35\u00a1\3\36\6\36\u00a5\n\36\r\36\16\36\u00a6"+
		"\3\36\7\36\u00aa\n\36\f\36\16\36\u00ad\13\36\3\37\3\37\7\37\u00b1\n\37"+
		"\f\37\16\37\u00b4\13\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u00be\n \f"+
		" \16 \u00c1\13 \3 \3 \3 \3 \3 \3!\6!\u00c9\n!\r!\16!\u00ca\3!\3!\4\u00b2"+
		"\u00bf\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17"+
		"\"\"\2\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2"+
		"\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21X\3\2\2"+
		"\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31i\3\2\2\2\33s\3\2\2\2\35v\3\2"+
		"\2\2\37y\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\u0080\3\2\2\2\'\u0083\3\2\2\2)\u0086"+
		"\3\2\2\2+\u0089\3\2\2\2-\u008e\3\2\2\2/\u0094\3\2\2\2\61\u0096\3\2\2\2"+
		"\63\u0098\3\2\2\2\65\u009a\3\2\2\2\67\u009c\3\2\2\29\u009f\3\2\2\2;\u00a4"+
		"\3\2\2\2=\u00ae\3\2\2\2?\u00b9\3\2\2\2A\u00c8\3\2\2\2CD\7%\2\2D\4\3\2"+
		"\2\2EF\7k\2\2FG\7p\2\2GH\7k\2\2HI\7v\2\2IJ\7k\2\2JK\7c\2\2KL\7n\2\2L\6"+
		"\3\2\2\2MN\7}\2\2N\b\3\2\2\2OP\7\177\2\2P\n\3\2\2\2QR\7*\2\2R\f\3\2\2"+
		"\2ST\7+\2\2T\16\3\2\2\2UV\7k\2\2VW\7h\2\2W\20\3\2\2\2XY\7g\2\2YZ\7n\2"+
		"\2Z[\7u\2\2[\\\7g\2\2\\\22\3\2\2\2]^\7=\2\2^\24\3\2\2\2_`\7?\2\2`\26\3"+
		"\2\2\2ab\7u\2\2bc\7{\2\2cd\7u\2\2de\7v\2\2ef\7c\2\2fg\7n\2\2gh\7m\2\2"+
		"h\30\3\2\2\2ij\7f\2\2jk\7g\2\2kl\7e\2\2lm\7k\2\2mn\7o\2\2no\7c\2\2op\7"+
		"n\2\2pq\7p\2\2qr\7v\2\2r\32\3\2\2\2st\7?\2\2tu\7?\2\2u\34\3\2\2\2vw\7"+
		"#\2\2wx\7?\2\2x\36\3\2\2\2yz\7@\2\2z \3\2\2\2{|\7>\2\2|\"\3\2\2\2}~\7"+
		"@\2\2~\177\7?\2\2\177$\3\2\2\2\u0080\u0081\7>\2\2\u0081\u0082\7?\2\2\u0082"+
		"&\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0085\7(\2\2\u0085(\3\2\2\2\u0086\u0087"+
		"\7~\2\2\u0087\u0088\7~\2\2\u0088*\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2\u008d,\3\2\2\2\u008e\u008f"+
		"\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0093\7g\2\2\u0093.\3\2\2\2\u0094\u0095\7#\2\2\u0095\60\3\2\2\2\u0096"+
		"\u0097\7,\2\2\u0097\62\3\2\2\2\u0098\u0099\7\61\2\2\u0099\64\3\2\2\2\u009a"+
		"\u009b\7-\2\2\u009b\66\3\2\2\2\u009c\u009d\7/\2\2\u009d8\3\2\2\2\u009e"+
		"\u00a0\t\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2:\3\2\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00ab\3\2\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac<\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b2\7B\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\b\37\2\2\u00b8>\3\2\2\2\u00b9\u00ba\7B\2\2\u00ba\u00bb\7}\2\2\u00bb"+
		"\u00bf\3\2\2\2\u00bc\u00be\13\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7\177\2\2\u00c3\u00c4\7B\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c6\b \2\2\u00c6@\3\2\2\2\u00c7\u00c9\t\5\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\b!\2\2\u00cdB\3\2\2\2\t\2\u00a1\u00a6\u00ab"+
		"\u00b2\u00bf\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}