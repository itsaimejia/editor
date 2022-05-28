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
		DEFINEFUNC=1, INITIAL=2, KO=3, KC=4, PO=5, PC=6, IF=7, ELSE=8, ELIF=9, 
		SCOL=10, ASSIGN=11, PRINT=12, DECLARE=13, EQT=14, NEQT=15, GT=16, LT=17, 
		GEQT=18, LEQT=19, AND=20, OR=21, TRUE=22, FALSE=23, NOT=24, MULT=25, DIV=26, 
		SUM=27, SUB=28, INT=29, DOUBLE=30, ID=31, STRING=32, LINECOM=33, MULTILINECOM=34, 
		WS=35;
	public static final int
		RULE_program = 0, RULE_instructions = 1, RULE_elif_sentence = 2, RULE_elif_frag_condition = 3, 
		RULE_if_sentence = 4, RULE_else_sentence = 5, RULE_body = 6, RULE_condition = 7, 
		RULE_string = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instructions", "elif_sentence", "elif_frag_condition", "if_sentence", 
			"else_sentence", "body", "condition", "string", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'initial'", "'->'", "'<-'", "'('", "')'", "'if'", "'else'", 
			"'elif'", "';'", "'='", "'systalk'", "'use'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", "'!'", "'*'", 
			"'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", "ELSE", 
			"ELIF", "SCOL", "ASSIGN", "PRINT", "DECLARE", "EQT", "NEQT", "GT", "LT", 
			"GEQT", "LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", "DIV", "SUM", 
			"SUB", "INT", "DOUBLE", "ID", "STRING", "LINECOM", "MULTILINECOM", "WS"
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
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
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
			setState(20);
			match(DEFINEFUNC);
			setState(21);
			match(INITIAL);
			setState(22);
			match(PO);
			setState(23);
			match(PC);
			setState(24);
			match(KO);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DECLARE) | (1L << ID))) != 0)) {
				{
				{
				setState(25);
				instructions();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(KC);
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
	 
		public InstructionsContext() { }
		public void copyFrom(InstructionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignacionContext extends InstructionsContext {
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(OpmezParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public AsignacionContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends InstructionsContext {
		public TerminalNode DECLARE() { return getToken(OpmezParser.DECLARE, 0); }
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public DeclaracionContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionStringContext extends InstructionsContext {
		public TerminalNode PRINT() { return getToken(OpmezParser.PRINT, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public TerminalNode STRING() { return getToken(OpmezParser.STRING, 0); }
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public ImpresionStringContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitImpresionString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionExprContext extends InstructionsContext {
		public TerminalNode PRINT() { return getToken(OpmezParser.PRINT, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public ImpresionExprContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitImpresionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends InstructionsContext {
		public If_sentenceContext if_sentence() {
			return getRuleContext(If_sentenceContext.class,0);
		}
		public Elif_sentenceContext elif_sentence() {
			return getRuleContext(Elif_sentenceContext.class,0);
		}
		public Else_sentenceContext else_sentence() {
			return getRuleContext(Else_sentenceContext.class,0);
		}
		public IfElseContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigDeclarContext extends InstructionsContext {
		public TerminalNode DECLARE() { return getToken(OpmezParser.DECLARE, 0); }
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(OpmezParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public AsigDeclarContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitAsigDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ImpresionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(PRINT);
				setState(34);
				match(PO);
				setState(35);
				expr(0);
				setState(36);
				match(PC);
				setState(37);
				match(SCOL);
				}
				break;
			case 2:
				_localctx = new ImpresionStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(PRINT);
				setState(40);
				match(PO);
				setState(41);
				match(STRING);
				setState(42);
				match(PC);
				setState(43);
				match(SCOL);
				}
				break;
			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				if_sentence();
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(45);
					elif_sentence();
					}
					break;
				case ELSE:
					{
					setState(46);
					else_sentence();
					}
					break;
				case KC:
				case IF:
				case PRINT:
				case DECLARE:
				case ID:
					break;
				default:
					break;
				}
				}
				break;
			case 4:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(DECLARE);
				setState(50);
				match(ID);
				setState(51);
				match(SCOL);
				}
				break;
			case 5:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(ID);
				setState(53);
				match(ASSIGN);
				setState(54);
				expr(0);
				setState(55);
				match(SCOL);
				}
				break;
			case 6:
				_localctx = new AsigDeclarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				match(DECLARE);
				setState(58);
				match(ID);
				setState(59);
				match(ASSIGN);
				setState(60);
				expr(0);
				setState(61);
				match(SCOL);
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

	public static class Elif_sentenceContext extends ParserRuleContext {
		public Elif_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_sentence; }
	 
		public Elif_sentenceContext() { }
		public void copyFrom(Elif_sentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SentenciaElifContext extends Elif_sentenceContext {
		public Elif_frag_conditionContext elif_frag_condition() {
			return getRuleContext(Elif_frag_conditionContext.class,0);
		}
		public Elif_sentenceContext elif_sentence() {
			return getRuleContext(Elif_sentenceContext.class,0);
		}
		public Else_sentenceContext else_sentence() {
			return getRuleContext(Else_sentenceContext.class,0);
		}
		public SentenciaElifContext(Elif_sentenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitSentenciaElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_sentenceContext elif_sentence() throws RecognitionException {
		Elif_sentenceContext _localctx = new Elif_sentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elif_sentence);
		try {
			_localctx = new SentenciaElifContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			elif_frag_condition();
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(66);
				elif_sentence();
				}
				break;
			case ELSE:
				{
				setState(67);
				else_sentence();
				}
				break;
			case KC:
			case IF:
			case PRINT:
			case DECLARE:
			case ID:
				break;
			default:
				break;
			}
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

	public static class Elif_frag_conditionContext extends ParserRuleContext {
		public Elif_frag_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_frag_condition; }
	 
		public Elif_frag_conditionContext() { }
		public void copyFrom(Elif_frag_conditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicionElifContext extends Elif_frag_conditionContext {
		public TerminalNode ELIF() { return getToken(OpmezParser.ELIF, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public CondicionElifContext(Elif_frag_conditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_frag_conditionContext elif_frag_condition() throws RecognitionException {
		Elif_frag_conditionContext _localctx = new Elif_frag_conditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elif_frag_condition);
		try {
			_localctx = new CondicionElifContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ELIF);
			setState(71);
			match(PO);
			setState(72);
			condition(0);
			setState(73);
			match(PC);
			setState(74);
			match(KO);
			setState(75);
			body();
			setState(76);
			match(KC);
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

	public static class If_sentenceContext extends ParserRuleContext {
		public If_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentence; }
	 
		public If_sentenceContext() { }
		public void copyFrom(If_sentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SentenciaIfContext extends If_sentenceContext {
		public TerminalNode IF() { return getToken(OpmezParser.IF, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public SentenciaIfContext(If_sentenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitSentenciaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentenceContext if_sentence() throws RecognitionException {
		If_sentenceContext _localctx = new If_sentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_sentence);
		try {
			_localctx = new SentenciaIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IF);
			setState(79);
			match(PO);
			setState(80);
			condition(0);
			setState(81);
			match(PC);
			setState(82);
			match(KO);
			setState(83);
			body();
			setState(84);
			match(KC);
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

	public static class Else_sentenceContext extends ParserRuleContext {
		public Else_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_sentence; }
	 
		public Else_sentenceContext() { }
		public void copyFrom(Else_sentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SentenciaElseContext extends Else_sentenceContext {
		public TerminalNode ELSE() { return getToken(OpmezParser.ELSE, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public SentenciaElseContext(Else_sentenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitSentenciaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_sentenceContext else_sentence() throws RecognitionException {
		Else_sentenceContext _localctx = new Else_sentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_sentence);
		try {
			_localctx = new SentenciaElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ELSE);
			setState(87);
			match(KO);
			setState(88);
			body();
			setState(89);
			match(KC);
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
	public static class CuerpoScopeContext extends BodyContext {
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public CuerpoScopeContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCuerpoScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			_localctx = new CuerpoScopeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DECLARE) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				instructions();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpresionContext extends ConditionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpresionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionNegacionContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(OpmezParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CondicionNegacionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionNegacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionParentesisContext extends ConditionContext {
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public CondicionParentesisContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesMayMenContext extends ConditionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(OpmezParser.GT, 0); }
		public TerminalNode LT() { return getToken(OpmezParser.LT, 0); }
		public CondicionesMayMenContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionesMayMen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalsoContext extends ConditionContext {
		public TerminalNode FALSE() { return getToken(OpmezParser.FALSE, 0); }
		public FalsoContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitFalso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesIgualdadContext extends ConditionContext {
		public Token op;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode EQT() { return getToken(OpmezParser.EQT, 0); }
		public TerminalNode NEQT() { return getToken(OpmezParser.NEQT, 0); }
		public CondicionesIgualdadContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionesIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionOContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(OpmezParser.OR, 0); }
		public CondicionOContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionYContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(OpmezParser.AND, 0); }
		public CondicionYContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesIgualdadExprContext extends ConditionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQT() { return getToken(OpmezParser.EQT, 0); }
		public TerminalNode NEQT() { return getToken(OpmezParser.NEQT, 0); }
		public CondicionesIgualdadExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionesIgualdadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesMayMenIgualContext extends ConditionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GEQT() { return getToken(OpmezParser.GEQT, 0); }
		public TerminalNode LEQT() { return getToken(OpmezParser.LEQT, 0); }
		public CondicionesMayMenIgualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionesMayMenIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdaderoContext extends ConditionContext {
		public TerminalNode TRUE() { return getToken(OpmezParser.TRUE, 0); }
		public VerdaderoContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitVerdadero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new CondicionNegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				match(NOT);
				setState(99);
				condition(11);
				}
				break;
			case 2:
				{
				_localctx = new CondicionesIgualdadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				expr(0);
				setState(101);
				((CondicionesIgualdadExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQT || _la==NEQT) ) {
					((CondicionesIgualdadExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new CondicionesMayMenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				expr(0);
				setState(105);
				((CondicionesMayMenContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GT || _la==LT) ) {
					((CondicionesMayMenContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				expr(0);
				}
				break;
			case 4:
				{
				_localctx = new CondicionesMayMenIgualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				expr(0);
				setState(109);
				((CondicionesMayMenIgualContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GEQT || _la==LEQT) ) {
					((CondicionesMayMenIgualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new CondicionParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(PO);
				setState(113);
				condition(0);
				setState(114);
				match(PC);
				}
				break;
			case 6:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new ExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new CondicionesIgualdadContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(121);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(122);
						((CondicionesIgualdadContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQT || _la==NEQT) ) {
							((CondicionesIgualdadContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(123);
						condition(10);
						}
						break;
					case 2:
						{
						_localctx = new CondicionYContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(124);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(125);
						match(AND);
						setState(126);
						condition(7);
						}
						break;
					case 3:
						{
						_localctx = new CondicionOContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(127);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(128);
						match(OR);
						setState(129);
						condition(6);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CadenaTextoContext extends StringContext {
		public TerminalNode STRING() { return getToken(OpmezParser.STRING, 0); }
		public CadenaTextoContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCadenaTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		try {
			_localctx = new CadenaTextoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(STRING);
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
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroContext extends ExprContext {
		public TerminalNode INT() { return getToken(OpmezParser.INT, 0); }
		public TerminalNode SUB() { return getToken(OpmezParser.SUB, 0); }
		public NumeroContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitNumero(this);
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
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode SUB() { return getToken(OpmezParser.SUB, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(138);
					match(SUB);
					}
				}

				setState(141);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(142);
					match(SUB);
					}
				}

				setState(145);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(PO);
				setState(147);
				expr(0);
				setState(148);
				match(PC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
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
						setState(154);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
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
						setState(157);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		case 7:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\3\4\3\4\5"+
		"\4G\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\7\b_\n\b\f\b\16\bb\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tz\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088"+
		"\13\t\3\n\3\n\3\13\3\13\5\13\u008e\n\13\3\13\3\13\5\13\u0092\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00a1\n\13\f\13\16\13\u00a4\13\13\3\13\2\4\20\24\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\7\3\2\20\21\3\2\22\23\3\2\24\25\3\2\33\34\3\2\35\36\2\u00b6\2"+
		"\26\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bH\3\2\2\2\nP\3\2\2\2\fX\3\2\2\2\16"+
		"`\3\2\2\2\20y\3\2\2\2\22\u0089\3\2\2\2\24\u0098\3\2\2\2\26\27\7\3\2\2"+
		"\27\30\7\4\2\2\30\31\7\7\2\2\31\32\7\b\2\2\32\36\7\5\2\2\33\35\5\4\3\2"+
		"\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36"+
		"\3\2\2\2!\"\7\6\2\2\"\3\3\2\2\2#$\7\16\2\2$%\7\7\2\2%&\5\24\13\2&\'\7"+
		"\b\2\2\'(\7\f\2\2(B\3\2\2\2)*\7\16\2\2*+\7\7\2\2+,\7\"\2\2,-\7\b\2\2-"+
		"B\7\f\2\2.\61\5\n\6\2/\62\5\6\4\2\60\62\5\f\7\2\61/\3\2\2\2\61\60\3\2"+
		"\2\2\61\62\3\2\2\2\62B\3\2\2\2\63\64\7\17\2\2\64\65\7!\2\2\65B\7\f\2\2"+
		"\66\67\7!\2\2\678\7\r\2\289\5\24\13\29:\7\f\2\2:B\3\2\2\2;<\7\17\2\2<"+
		"=\7!\2\2=>\7\r\2\2>?\5\24\13\2?@\7\f\2\2@B\3\2\2\2A#\3\2\2\2A)\3\2\2\2"+
		"A.\3\2\2\2A\63\3\2\2\2A\66\3\2\2\2A;\3\2\2\2B\5\3\2\2\2CF\5\b\5\2DG\5"+
		"\6\4\2EG\5\f\7\2FD\3\2\2\2FE\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HI\7\13\2\2I"+
		"J\7\7\2\2JK\5\20\t\2KL\7\b\2\2LM\7\5\2\2MN\5\16\b\2NO\7\6\2\2O\t\3\2\2"+
		"\2PQ\7\t\2\2QR\7\7\2\2RS\5\20\t\2ST\7\b\2\2TU\7\5\2\2UV\5\16\b\2VW\7\6"+
		"\2\2W\13\3\2\2\2XY\7\n\2\2YZ\7\5\2\2Z[\5\16\b\2[\\\7\6\2\2\\\r\3\2\2\2"+
		"]_\5\4\3\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\17\3\2\2\2b`\3\2\2"+
		"\2cd\b\t\1\2de\7\32\2\2ez\5\20\t\rfg\5\24\13\2gh\t\2\2\2hi\5\24\13\2i"+
		"z\3\2\2\2jk\5\24\13\2kl\t\3\2\2lm\5\24\13\2mz\3\2\2\2no\5\24\13\2op\t"+
		"\4\2\2pq\5\24\13\2qz\3\2\2\2rs\7\7\2\2st\5\20\t\2tu\7\b\2\2uz\3\2\2\2"+
		"vz\7\30\2\2wz\7\31\2\2xz\5\24\13\2yc\3\2\2\2yf\3\2\2\2yj\3\2\2\2yn\3\2"+
		"\2\2yr\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\u0086\3\2\2\2{|\f\13\2\2"+
		"|}\t\2\2\2}\u0085\5\20\t\f~\177\f\b\2\2\177\u0080\7\26\2\2\u0080\u0085"+
		"\5\20\t\t\u0081\u0082\f\7\2\2\u0082\u0083\7\27\2\2\u0083\u0085\5\20\t"+
		"\b\u0084{\3\2\2\2\u0084~\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7\"\2\2\u008a\23\3\2\2\2\u008b\u008d\b\13\1\2\u008c"+
		"\u008e\7\36\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0099\7\37\2\2\u0090\u0092\7\36\2\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0099\7!\2\2\u0094\u0095\7\7"+
		"\2\2\u0095\u0096\5\24\13\2\u0096\u0097\7\b\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u008b\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0094\3\2\2\2\u0099\u00a2\3\2"+
		"\2\2\u009a\u009b\f\7\2\2\u009b\u009c\t\5\2\2\u009c\u00a1\5\24\13\b\u009d"+
		"\u009e\f\6\2\2\u009e\u009f\t\6\2\2\u009f\u00a1\5\24\13\7\u00a0\u009a\3"+
		"\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a2\3\2\2\2\17\36\61AF`y\u0084"+
		"\u0086\u008d\u0091\u0098\u00a0\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}