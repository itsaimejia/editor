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
		T__0=1, T__1=2, DEFINEFUNC=3, INITIAL=4, KO=5, KC=6, PO=7, PC=8, IF=9, 
		ELSE=10, ELIF=11, SCOL=12, ASSIGN=13, PRINT=14, DECLARE=15, EQT=16, NEQT=17, 
		GT=18, LT=19, GEQT=20, LEQT=21, AND=22, OR=23, TRUE=24, FALSE=25, NOT=26, 
		MULT=27, DIV=28, SUM=29, SUB=30, INT=31, DOUBLE=32, ID=33, LINECOM=34, 
		MULTILINECOM=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", 
			"ELSE", "ELIF", "SCOL", "ASSIGN", "PRINT", "DECLARE", "EQT", "NEQT", 
			"GT", "LT", "GEQT", "LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", 
			"DIV", "SUM", "SUB", "INT", "DOUBLE", "ID", "LINECOM", "MULTILINECOM", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'1'", "'0'", "'#'", "'initial'", "'->'", "'<-'", "'('", "')'", 
			"'if'", "'else'", "'elif'", "';'", "'='", "'systalk'", "'use'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", 
			"'!'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", 
			"ELSE", "ELIF", "SCOL", "ASSIGN", "PRINT", "DECLARE", "EQT", "NEQT", 
			"GT", "LT", "GEQT", "LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", 
			"DIV", "SUM", "SUB", "INT", "DOUBLE", "ID", "LINECOM", "MULTILINECOM", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \6 \u00ad\n"+
		" \r \16 \u00ae\3!\6!\u00b2\n!\r!\16!\u00b3\3!\3!\6!\u00b8\n!\r!\16!\u00b9"+
		"\3\"\6\"\u00bd\n\"\r\"\16\"\u00be\3\"\7\"\u00c2\n\"\f\"\16\"\u00c5\13"+
		"\"\3#\3#\7#\u00c9\n#\f#\16#\u00cc\13#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00d6"+
		"\n$\f$\16$\u00d9\13$\3$\3$\3$\3$\3$\3%\6%\u00e1\n%\r%\16%\u00e2\3%\3%"+
		"\5\u00b9\u00ca\u00d7\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\6\3\2\62;\4\2C\\c|\5\2\62;"+
		"C\\c|\5\2\13\f\17\17\"\"\2\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O"+
		"\3\2\2\2\tQ\3\2\2\2\13Y\3\2\2\2\r\\\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23"+
		"c\3\2\2\2\25f\3\2\2\2\27k\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2"+
		"\37|\3\2\2\2!\u0080\3\2\2\2#\u0083\3\2\2\2%\u0086\3\2\2\2\'\u0088\3\2"+
		"\2\2)\u008a\3\2\2\2+\u008d\3\2\2\2-\u0090\3\2\2\2/\u0093\3\2\2\2\61\u0096"+
		"\3\2\2\2\63\u009b\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00a5\3\2"+
		"\2\2;\u00a7\3\2\2\2=\u00a9\3\2\2\2?\u00ac\3\2\2\2A\u00b1\3\2\2\2C\u00bc"+
		"\3\2\2\2E\u00c6\3\2\2\2G\u00d1\3\2\2\2I\u00e0\3\2\2\2KL\7\63\2\2L\4\3"+
		"\2\2\2MN\7\62\2\2N\6\3\2\2\2OP\7%\2\2P\b\3\2\2\2QR\7k\2\2RS\7p\2\2ST\7"+
		"k\2\2TU\7v\2\2UV\7k\2\2VW\7c\2\2WX\7n\2\2X\n\3\2\2\2YZ\7/\2\2Z[\7@\2\2"+
		"[\f\3\2\2\2\\]\7>\2\2]^\7/\2\2^\16\3\2\2\2_`\7*\2\2`\20\3\2\2\2ab\7+\2"+
		"\2b\22\3\2\2\2cd\7k\2\2de\7h\2\2e\24\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2"+
		"\2ij\7g\2\2j\26\3\2\2\2kl\7g\2\2lm\7n\2\2mn\7k\2\2no\7h\2\2o\30\3\2\2"+
		"\2pq\7=\2\2q\32\3\2\2\2rs\7?\2\2s\34\3\2\2\2tu\7u\2\2uv\7{\2\2vw\7u\2"+
		"\2wx\7v\2\2xy\7c\2\2yz\7n\2\2z{\7m\2\2{\36\3\2\2\2|}\7w\2\2}~\7u\2\2~"+
		"\177\7g\2\2\177 \3\2\2\2\u0080\u0081\7?\2\2\u0081\u0082\7?\2\2\u0082\""+
		"\3\2\2\2\u0083\u0084\7#\2\2\u0084\u0085\7?\2\2\u0085$\3\2\2\2\u0086\u0087"+
		"\7@\2\2\u0087&\3\2\2\2\u0088\u0089\7>\2\2\u0089(\3\2\2\2\u008a\u008b\7"+
		"@\2\2\u008b\u008c\7?\2\2\u008c*\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f"+
		"\7?\2\2\u008f,\3\2\2\2\u0090\u0091\7(\2\2\u0091\u0092\7(\2\2\u0092.\3"+
		"\2\2\2\u0093\u0094\7~\2\2\u0094\u0095\7~\2\2\u0095\60\3\2\2\2\u0096\u0097"+
		"\7v\2\2\u0097\u0098\7t\2\2\u0098\u0099\7w\2\2\u0099\u009a\7g\2\2\u009a"+
		"\62\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2\u009e"+
		"\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7#\2\2\u00a2"+
		"\66\3\2\2\2\u00a3\u00a4\7,\2\2\u00a48\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6"+
		":\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8<\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa>"+
		"\3\2\2\2\u00ab\u00ad\t\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af@\3\2\2\2\u00b0\u00b2\t\2\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7\60\2\2\u00b6\u00b8\t\2\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00baB\3\2\2\2\u00bb\u00bd\t\3\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\3\2"+
		"\2\2\u00c0\u00c2\t\4\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4D\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00ca\7B\2\2\u00c7\u00c9\13\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b#"+
		"\2\2\u00d0F\3\2\2\2\u00d1\u00d2\7B\2\2\u00d2\u00d3\7}\2\2\u00d3\u00d7"+
		"\3\2\2\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00db\7\177\2\2\u00db\u00dc\7B\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00de\b$\2\2\u00deH\3\2\2\2\u00df\u00e1\t\5\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\b%\2\2\u00e5J\3\2\2\2\13\2\u00ae\u00b3\u00b9"+
		"\u00be\u00c3\u00ca\u00d7\u00e2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}