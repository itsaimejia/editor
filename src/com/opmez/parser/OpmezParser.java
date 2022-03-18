// Generated from .\Opmez.g4 by ANTLR 4.9.2
package com.opmez.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpmezParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DEFINEFUNC=2, KEYSOC=3, ARROWOPEN=4, ARROWCLOSE=5, INITIAL=6, 
		ENDLINE=7, PRINT=8, INT=9, MULT=10, DIV=11, SUM=12, SUB=13, NUM=14, ID=15, 
		LINECOM=16, MULTILINECOM=17, WS=18;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "expr"
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

	@Override
	public String getGrammarFileName() { return "Opmez.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OpmezParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CuerpoContext extends ProgramContext {
		public TerminalNode DEFINEFUNC() { return getToken(OpmezParser.DEFINEFUNC, 0); }
		public TerminalNode INITIAL() { return getToken(OpmezParser.INITIAL, 0); }
		public TerminalNode ARROWOPEN() { return getToken(OpmezParser.ARROWOPEN, 0); }
		public TerminalNode ARROWCLOSE() { return getToken(OpmezParser.ARROWCLOSE, 0); }
		public List<TerminalNode> KEYSOC() { return getTokens(OpmezParser.KEYSOC); }
		public TerminalNode KEYSOC(int i) {
			return getToken(OpmezParser.KEYSOC, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public CuerpoContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new CuerpoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(DEFINEFUNC);
			setState(7);
			match(INITIAL);
			setState(8);
			match(ARROWOPEN);
			setState(9);
			match(ARROWCLOSE);
			setState(10);
			match(KEYSOC);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(11);
				body();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(KEYSOC);
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

	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	 
		public BodyContext() { }
		public void copyFrom(BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignacionContext extends BodyContext {
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(OpmezParser.ENDLINE, 0); }
		public AsignacionContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends BodyContext {
		public TerminalNode INT() { return getToken(OpmezParser.INT, 0); }
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode ENDLINE() { return getToken(OpmezParser.ENDLINE, 0); }
		public DeclaracionContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionContext extends BodyContext {
		public TerminalNode PRINT() { return getToken(OpmezParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(OpmezParser.ENDLINE, 0); }
		public ImpresionContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigDeclarContext extends BodyContext {
		public TerminalNode INT() { return getToken(OpmezParser.INT, 0); }
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(OpmezParser.ENDLINE, 0); }
		public AsigDeclarContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitAsigDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(PRINT);
				setState(20);
				expr(0);
				setState(21);
				match(ENDLINE);
				}
				break;
			case 2:
				_localctx = new AsigDeclarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(INT);
				setState(24);
				match(ID);
				setState(25);
				match(T__0);
				setState(26);
				expr(0);
				setState(27);
				match(ENDLINE);
				}
				break;
			case 3:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				match(INT);
				setState(30);
				match(ID);
				setState(31);
				match(ENDLINE);
				}
				break;
			case 4:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(ID);
				setState(33);
				match(T__0);
				setState(34);
				expr(0);
				setState(35);
				match(ENDLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode ARROWOPEN() { return getToken(OpmezParser.ARROWOPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ARROWCLOSE() { return getToken(OpmezParser.ARROWCLOSE, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(OpmezParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(OpmezParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(OpmezParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(OpmezParser.SUB, 0); }
		public SumSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitSumSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(OpmezParser.NUM, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(40);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(ID);
				}
				break;
			case ARROWOPEN:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(ARROWOPEN);
				setState(43);
				expr(0);
				setState(44);
				match(ARROWCLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(54);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(49);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(52);
						((SumSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==SUB) ) {
							((SumSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(53);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\2\3\6\5\2\4\6\2\4\3\2\f\r\3\2\16\17\2"+
		"B\2\b\3\2\2\2\4\'\3\2\2\2\6\60\3\2\2\2\b\t\7\4\2\2\t\n\7\b\2\2\n\13\7"+
		"\6\2\2\13\f\7\7\2\2\f\20\7\5\2\2\r\17\5\4\3\2\16\r\3\2\2\2\17\22\3\2\2"+
		"\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7\5\2"+
		"\2\24\3\3\2\2\2\25\26\7\n\2\2\26\27\5\6\4\2\27\30\7\t\2\2\30(\3\2\2\2"+
		"\31\32\7\13\2\2\32\33\7\21\2\2\33\34\7\3\2\2\34\35\5\6\4\2\35\36\7\t\2"+
		"\2\36(\3\2\2\2\37 \7\13\2\2 !\7\21\2\2!(\7\t\2\2\"#\7\21\2\2#$\7\3\2\2"+
		"$%\5\6\4\2%&\7\t\2\2&(\3\2\2\2\'\25\3\2\2\2\'\31\3\2\2\2\'\37\3\2\2\2"+
		"\'\"\3\2\2\2(\5\3\2\2\2)*\b\4\1\2*\61\7\20\2\2+\61\7\21\2\2,-\7\6\2\2"+
		"-.\5\6\4\2./\7\7\2\2/\61\3\2\2\2\60)\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\61"+
		":\3\2\2\2\62\63\f\7\2\2\63\64\t\2\2\2\649\5\6\4\b\65\66\f\6\2\2\66\67"+
		"\t\3\2\2\679\5\6\4\78\62\3\2\2\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2"+
		"\2\2;\7\3\2\2\2<:\3\2\2\2\7\20\'\608:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}