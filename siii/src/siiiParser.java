// Generated from siii.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class siiiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, WHITESPACE=13, WHILE=14, FOR=15, IF=16, ELIF=17, 
		ELSE=18, BREAK=19, CONTINUE=20, RET=21, NULL=22, PRINT=23, READ=24, LPAR=25, 
		RPAR=26, LBRACK=27, RBRACK=28, LKUC=29, RKUC=30, BLOCK_START=31, BLOCK_END=32, 
		AND=33, OR=34, NOT=35, ADD=36, SUB=37, MUL=38, DIV=39, MOD=40, ADD_ASSIGN=41, 
		SUB_ASSIGN=42, MUL_ASSIGN=43, DIV_ASSIGN=44, MOD_ASSIGN=45, AND_ASSIGN=46, 
		OR_ASSIGN=47, EQ=48, NE=49, LE=50, GE=51, GT=52, LT=53, BOOL=54, INT=55, 
		ID=56, STRING=57, CHAR=58, COMMENT=59, MULTI_COMMENT=60, NL=61;
	public static final String[] tokenNames = {
		"<INVALID>", "'def'", "'char'", "'v'", "':'", "'|'", "'='", "'bool'", 
		"'string'", "'zvonku'", "'int'", "'&'", "','", "WHITESPACE", "'pokial'", 
		"'pre'", "'ak'", "'inakak'", "'inak'", "'prerus'", "'pokracuj'", "'vrat'", 
		"'nic'", "'vypis'", "'nacitaj'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'<'", "'>'", "'a'", "'alebo'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'++'", "'--'", "'**'", "'//'", "'%%'", "'&&'", "'||'", "'=='", "'!='", 
		"'<='", "'>='", "'>>'", "'<<'", "BOOL", "INT", "ID", "STRING", "CHAR", 
		"COMMENT", "MULTI_COMMENT", "NL"
	};
	public static final int
		RULE_init = 0, RULE_block = 1, RULE_statement = 2, RULE_simple_statement = 3, 
		RULE_block_statement = 4, RULE_var = 5, RULE_print = 6, RULE_read = 7, 
		RULE_val = 8, RULE_simple_assignment = 9, RULE_complex_assignment = 10, 
		RULE_assignment = 11, RULE_if_statement = 12, RULE_while_statement = 13, 
		RULE_for_statement = 14, RULE_list = 15, RULE_range = 16, RULE_param_list = 17, 
		RULE_func_def = 18, RULE_extern_func_def = 19, RULE_arglist = 20, RULE_typelist = 21, 
		RULE_func_call = 22, RULE_var_def = 23, RULE_ret = 24, RULE_type = 25, 
		RULE_expression = 26;
	public static final String[] ruleNames = {
		"init", "block", "statement", "simple_statement", "block_statement", "var", 
		"print", "read", "val", "simple_assignment", "complex_assignment", "assignment", 
		"if_statement", "while_statement", "for_statement", "list", "range", "param_list", 
		"func_def", "extern_func_def", "arglist", "typelist", "func_call", "var_def", 
		"ret", "type", "expression"
	};

	@Override
	public String getGrammarFileName() { return "siii.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public siiiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public Extern_func_defContext extern_func_def(int i) {
			return getRuleContext(Extern_func_defContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(siiiParser.NL); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NL(int i) {
			return getToken(siiiParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<Extern_func_defContext> extern_func_def() {
			return getRuleContexts(Extern_func_defContext.class);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54); extern_func_def();
					setState(55); match(NL);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__10) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << RET) | (1L << NULL) | (1L << PRINT) | (1L << READ) | (1L << LPAR) | (1L << LBRACK) | (1L << BLOCK_START) | (1L << NOT) | (1L << SUB) | (1L << BOOL) | (1L << INT) | (1L << ID) | (1L << STRING) | (1L << CHAR))) != 0)) {
				{
				{
				setState(62); statement();
				}
				}
				setState(67);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(siiiParser.NL, 0); }
		public TerminalNode BLOCK_END() { return getToken(siiiParser.BLOCK_END, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BLOCK_START() { return getToken(siiiParser.BLOCK_START, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(BLOCK_START);
			setState(69); match(NL);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70); statement();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__10) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << RET) | (1L << NULL) | (1L << PRINT) | (1L << READ) | (1L << LPAR) | (1L << LBRACK) | (1L << BLOCK_START) | (1L << NOT) | (1L << SUB) | (1L << BOOL) | (1L << INT) | (1L << ID) | (1L << STRING) | (1L << CHAR))) != 0) );
			setState(75); match(BLOCK_END);
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

	public static class StatementContext extends ParserRuleContext {
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public TerminalNode NL() { return getToken(siiiParser.NL, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case T__10:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case BREAK:
			case CONTINUE:
			case RET:
			case NULL:
			case PRINT:
			case READ:
			case LPAR:
			case LBRACK:
			case NOT:
			case SUB:
			case BOOL:
			case INT:
			case ID:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); simple_statement();
				setState(78); match(NL);
				}
				break;
			case T__11:
			case WHILE:
			case FOR:
			case IF:
			case BLOCK_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); block_statement();
				setState(81); match(NL);
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

	public static class Simple_statementContext extends ParserRuleContext {
		public Token stat;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(siiiParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(siiiParser.CONTINUE, 0); }
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Extern_func_defContext extern_func_def() {
			return getRuleContext(Extern_func_defContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_statement);
		int _la;
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); var_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88); ret();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89); print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90); read();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91); extern_func_def();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				((Simple_statementContext)_localctx).stat = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BREAK || _la==CONTINUE) ) {
					((Simple_statementContext)_localctx).stat = (Token)_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Block_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_statement);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); for_statement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(98); func_def();
				}
				break;
			case BLOCK_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(99); block();
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

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarIDContext extends VarContext {
		public TerminalNode ID() { return getToken(siiiParser.ID, 0); }
		public VarIDContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarListContext extends VarContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(siiiParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(siiiParser.LBRACK, 0); }
		public VarListContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		return var(0);
	}

	private VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState);
		VarContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VarIDContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(103); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarListContext(new VarContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(105);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(106); match(LBRACK);
					setState(107); expression(0);
					setState(108); match(RBRACK);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(siiiParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(PRINT);
			setState(116); expression(0);
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

	public static class ReadContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode READ() { return getToken(siiiParser.READ, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(READ);
			setState(119); var(0);
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValRangeContext extends ValContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ValRangeContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends ValContext {
		public TerminalNode BOOL() { return getToken(siiiParser.BOOL, 0); }
		public ValBoolContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIntContext extends ValContext {
		public TerminalNode INT() { return getToken(siiiParser.INT, 0); }
		public ValIntContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStringContext extends ValContext {
		public TerminalNode STRING() { return getToken(siiiParser.STRING, 0); }
		public ValStringContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValCharContext extends ValContext {
		public TerminalNode CHAR() { return getToken(siiiParser.CHAR, 0); }
		public ValCharContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValListContext extends ValContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ValListContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValVarContext extends ValContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValVarContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValNullContext extends ValContext {
		public TerminalNode NULL() { return getToken(siiiParser.NULL, 0); }
		public ValNullContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_val);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ValVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121); var(0);
				}
				break;
			case 2:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122); match(INT);
				}
				break;
			case 3:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123); match(STRING);
				}
				break;
			case 4:
				_localctx = new ValCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124); match(CHAR);
				}
				break;
			case 5:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125); match(BOOL);
				}
				break;
			case 6:
				_localctx = new ValNullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(126); match(NULL);
				}
				break;
			case 7:
				_localctx = new ValListContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(127); list();
				}
				break;
			case 8:
				_localctx = new ValRangeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(128); range();
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

	public static class Simple_assignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Simple_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterSimple_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitSimple_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitSimple_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_assignmentContext simple_assignment() throws RecognitionException {
		Simple_assignmentContext _localctx = new Simple_assignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); var(0);
			setState(132); match(T__6);
			setState(133); expression(0);
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

	public static class Complex_assignmentContext extends ParserRuleContext {
		public Token op;
		public TerminalNode MUL_ASSIGN() { return getToken(siiiParser.MUL_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(siiiParser.OR_ASSIGN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode DIV_ASSIGN() { return getToken(siiiParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(siiiParser.MOD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(siiiParser.SUB_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(siiiParser.AND_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(siiiParser.ADD_ASSIGN, 0); }
		public Complex_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterComplex_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitComplex_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitComplex_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_assignmentContext complex_assignment() throws RecognitionException {
		Complex_assignmentContext _localctx = new Complex_assignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_complex_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); var(0);
			setState(136);
			((Complex_assignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << OR_ASSIGN))) != 0)) ) {
				((Complex_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(137); expression(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Simple_assignmentContext simple_assignment() {
			return getRuleContext(Simple_assignmentContext.class,0);
		}
		public Complex_assignmentContext complex_assignment() {
			return getRuleContext(Complex_assignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); simple_assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); complex_assignment();
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(siiiParser.NL); }
		public TerminalNode ELSE() { return getToken(siiiParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(siiiParser.IF, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LPAR() { return getTokens(siiiParser.LPAR); }
		public TerminalNode NL(int i) {
			return getToken(siiiParser.NL, i);
		}
		public TerminalNode RPAR(int i) {
			return getToken(siiiParser.RPAR, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(siiiParser.ELIF); }
		public TerminalNode LPAR(int i) {
			return getToken(siiiParser.LPAR, i);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELIF(int i) {
			return getToken(siiiParser.ELIF, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(siiiParser.RPAR); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(IF);
			setState(144); match(LPAR);
			setState(145); expression(0);
			setState(146); match(RPAR);
			setState(147); match(NL);
			setState(148); block();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(149); match(ELIF);
				setState(150); match(LPAR);
				setState(151); expression(0);
				setState(152); match(RPAR);
				setState(153); match(NL);
				setState(154); block();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(161); match(ELSE);
				setState(162); match(NL);
				setState(163); block();
				}
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(siiiParser.NL, 0); }
		public TerminalNode LPAR() { return getToken(siiiParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(siiiParser.RPAR, 0); }
		public TerminalNode WHILE() { return getToken(siiiParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(WHILE);
			setState(167); match(LPAR);
			setState(168); expression(0);
			setState(169); match(RPAR);
			setState(170); match(NL);
			setState(171); block();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(siiiParser.NL, 0); }
		public TerminalNode ID() { return getToken(siiiParser.ID, 0); }
		public TerminalNode FOR() { return getToken(siiiParser.FOR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(FOR);
			setState(174); match(ID);
			setState(175); match(T__9);
			setState(176); range();
			setState(177); match(NL);
			setState(178); block();
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

	public static class ListContext extends ParserRuleContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(siiiParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(siiiParser.LBRACK, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(LBRACK);
			setState(181); param_list();
			setState(182); match(RBRACK);
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

	public static class RangeContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(siiiParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LBRACK() { return getToken(siiiParser.LBRACK, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(LBRACK);
			setState(185); expression(0);
			setState(186); match(T__8);
			setState(187); expression(0);
			setState(190);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(188); match(T__8);
				setState(189); expression(0);
				}
			}

			setState(192); match(RBRACK);
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

	public static class Param_listContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAR) | (1L << LBRACK) | (1L << NOT) | (1L << SUB) | (1L << BOOL) | (1L << INT) | (1L << ID) | (1L << STRING) | (1L << CHAR))) != 0)) {
				{
				setState(194); expression(0);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(195); match(T__0);
					setState(196); expression(0);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(siiiParser.NL, 0); }
		public TerminalNode ID() { return getToken(siiiParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(siiiParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(siiiParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(T__11);
			setState(205); match(ID);
			setState(206); type(0);
			setState(207); match(LPAR);
			setState(208); arglist();
			setState(209); match(RPAR);
			setState(210); match(NL);
			setState(211); block();
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

	public static class Extern_func_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(siiiParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(siiiParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(siiiParser.RPAR, 0); }
		public TypelistContext typelist() {
			return getRuleContext(TypelistContext.class,0);
		}
		public Extern_func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterExtern_func_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitExtern_func_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitExtern_func_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_func_defContext extern_func_def() throws RecognitionException {
		Extern_func_defContext _localctx = new Extern_func_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_extern_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(T__3);
			setState(214); match(ID);
			setState(215); type(0);
			setState(216); match(LPAR);
			setState(217); typelist();
			setState(218); match(RPAR);
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

	public static class ArglistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(siiiParser.ID); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(siiiParser.ID, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__5) | (1L << T__4) | (1L << T__2) | (1L << NULL))) != 0)) {
				{
				setState(220); type(0);
				setState(221); match(ID);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(222); match(T__0);
					setState(223); type(0);
					setState(224); match(ID);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class TypelistContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterTypelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitTypelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitTypelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypelistContext typelist() throws RecognitionException {
		TypelistContext _localctx = new TypelistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__5) | (1L << T__4) | (1L << T__2) | (1L << NULL))) != 0)) {
				{
				setState(233); type(0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(234); match(T__0);
					setState(235); type(0);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(siiiParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(siiiParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(siiiParser.RPAR, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(ID);
			setState(244); match(LPAR);
			setState(245); param_list();
			setState(246); match(RPAR);
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

	public static class Var_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(siiiParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); type(0);
			setState(249); match(ID);
			setState(252);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(250); match(T__6);
				setState(251); expression(0);
				}
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(siiiParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(RET);
			setState(256);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAR) | (1L << LBRACK) | (1L << NOT) | (1L << SUB) | (1L << BOOL) | (1L << INT) | (1L << ID) | (1L << STRING) | (1L << CHAR))) != 0)) {
				{
				setState(255); expression(0);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeListContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(siiiParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(siiiParser.LBRACK, 0); }
		public TypeListContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBasicContext extends TypeContext {
		public TypeBasicContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitTypeBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TypeBasicContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__5) | (1L << T__4) | (1L << T__2) | (1L << NULL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeListContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(261);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(262); match(LBRACK);
					setState(263); match(RBRACK);
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public TerminalNode SUB() { return getToken(siiiParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(siiiParser.ADD, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitOrContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BitOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterBitOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitBitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitBitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends ExpressionContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(siiiParser.MOD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(siiiParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(siiiParser.MUL, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExpressionContext {
		public Token op;
		public TerminalNode SUB() { return getToken(siiiParser.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LKUC() { return getToken(siiiParser.LKUC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode RKUC() { return getToken(siiiParser.RKUC, 0); }
		public IndexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitAndContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BitAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterBitAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitBitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitBitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueContext extends ExpressionContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(siiiParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExpressionContext {
		public Token op;
		public TerminalNode GE() { return getToken(siiiParser.GE, 0); }
		public TerminalNode LT() { return getToken(siiiParser.LT, 0); }
		public TerminalNode GT() { return getToken(siiiParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(siiiParser.LE, 0); }
		public TerminalNode EQ() { return getToken(siiiParser.EQ, 0); }
		public TerminalNode NE() { return getToken(siiiParser.NE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolOrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(siiiParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoolOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitBoolOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitBoolOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(siiiParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoolAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitBoolAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitBoolAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExpressionContext {
		public TerminalNode LPAR() { return getToken(siiiParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(siiiParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof siiiListener ) ((siiiListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof siiiVisitor ) return ((siiiVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(270); ((UnaryMinusContext)_localctx).op = match(SUB);
				setState(271); expression(10);
				}
				break;
			case 2:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); ((BoolNotContext)_localctx).op = match(NOT);
				setState(273); expression(4);
				}
				break;
			case 3:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274); match(LPAR);
				setState(275); expression(0);
				setState(276); match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278); func_call();
				}
				break;
			case 5:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279); val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(306);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(283);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(284); expression(10);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(286);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(287); expression(9);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(289);
						((CompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(290); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new BoolAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292); ((BoolAndContext)_localctx).op = match(AND);
						setState(293); expression(4);
						}
						break;
					case 5:
						{
						_localctx = new BoolOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(295); ((BoolOrContext)_localctx).op = match(OR);
						setState(296); expression(3);
						}
						break;
					case 6:
						{
						_localctx = new IndexContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(298); match(LKUC);
						setState(299); expression(0);
						setState(300); match(RKUC);
						}
						break;
					case 7:
						{
						_localctx = new BitAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(303); match(T__1);
						}
						break;
					case 8:
						{
						_localctx = new BitOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(305); match(T__7);
						}
						break;
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		case 5: return var_sempred((VarContext)_localctx, predIndex);
		case 25: return type_sempred((TypeContext)_localctx, predIndex);
		case 26: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 9);
		case 3: return precpred(_ctx, 8);
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 3);
		case 6: return precpred(_ctx, 2);
		case 7: return precpred(_ctx, 11);
		case 8: return precpred(_ctx, 7);
		case 9: return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u013a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f"+
		"\7\16\7t\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0084\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u0090\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u009f\n\16\f\16\16\16\u00a2\13\16\3\16\3\16\3\16\5\16\u00a7\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c1\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\7\23\u00c8\n\23\f\23\16\23\u00cb\13\23\5\23\u00cd"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e5\n\26\f\26\16"+
		"\26\u00e8\13\26\5\26\u00ea\n\26\3\27\3\27\3\27\7\27\u00ef\n\27\f\27\16"+
		"\27\u00f2\13\27\5\27\u00f4\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\5\31\u00ff\n\31\3\32\3\32\5\32\u0103\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\7\33\u010b\n\33\f\33\16\33\u010e\13\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u011b\n\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0135\n\34\f\34\16\34\u0138\13\34"+
		"\3\34\2\5\f\64\66\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\b\3\2\25\26\3\2+\61\6\2\4\4\t\n\f\f\30\30\3\2(*\3\2&\'\3\2"+
		"\62\67\u014e\2=\3\2\2\2\4F\3\2\2\2\6U\3\2\2\2\b_\3\2\2\2\nf\3\2\2\2\f"+
		"h\3\2\2\2\16u\3\2\2\2\20x\3\2\2\2\22\u0083\3\2\2\2\24\u0085\3\2\2\2\26"+
		"\u0089\3\2\2\2\30\u008f\3\2\2\2\32\u0091\3\2\2\2\34\u00a8\3\2\2\2\36\u00af"+
		"\3\2\2\2 \u00b6\3\2\2\2\"\u00ba\3\2\2\2$\u00cc\3\2\2\2&\u00ce\3\2\2\2"+
		"(\u00d7\3\2\2\2*\u00e9\3\2\2\2,\u00f3\3\2\2\2.\u00f5\3\2\2\2\60\u00fa"+
		"\3\2\2\2\62\u0100\3\2\2\2\64\u0104\3\2\2\2\66\u011a\3\2\2\289\5(\25\2"+
		"9:\7?\2\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2"+
		"?=\3\2\2\2@B\5\6\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2"+
		"\2EC\3\2\2\2FG\7!\2\2GI\7?\2\2HJ\5\6\4\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LM\3\2\2\2MN\7\"\2\2N\5\3\2\2\2OP\5\b\5\2PQ\7?\2\2QV\3\2\2\2"+
		"RS\5\n\6\2ST\7?\2\2TV\3\2\2\2UO\3\2\2\2UR\3\2\2\2V\7\3\2\2\2W`\5\30\r"+
		"\2X`\5\60\31\2Y`\5\66\34\2Z`\5\62\32\2[`\5\16\b\2\\`\5\20\t\2]`\5(\25"+
		"\2^`\t\2\2\2_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2"+
		"\2\2_]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ag\5\32\16\2bg\5\34\17\2cg\5\36\20"+
		"\2dg\5&\24\2eg\5\4\3\2fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2"+
		"\2g\13\3\2\2\2hi\b\7\1\2ij\7:\2\2jr\3\2\2\2kl\f\3\2\2lm\7\35\2\2mn\5\66"+
		"\34\2no\7\36\2\2oq\3\2\2\2pk\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r"+
		"\3\2\2\2tr\3\2\2\2uv\7\31\2\2vw\5\66\34\2w\17\3\2\2\2xy\7\32\2\2yz\5\f"+
		"\7\2z\21\3\2\2\2{\u0084\5\f\7\2|\u0084\79\2\2}\u0084\7;\2\2~\u0084\7<"+
		"\2\2\177\u0084\78\2\2\u0080\u0084\7\30\2\2\u0081\u0084\5 \21\2\u0082\u0084"+
		"\5\"\22\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2"+
		"\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\5\f\7\2\u0086\u0087\7\b\2\2\u0087"+
		"\u0088\5\66\34\2\u0088\25\3\2\2\2\u0089\u008a\5\f\7\2\u008a\u008b\t\3"+
		"\2\2\u008b\u008c\5\66\34\2\u008c\27\3\2\2\2\u008d\u0090\5\24\13\2\u008e"+
		"\u0090\5\26\f\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\31\3\2\2"+
		"\2\u0091\u0092\7\22\2\2\u0092\u0093\7\33\2\2\u0093\u0094\5\66\34\2\u0094"+
		"\u0095\7\34\2\2\u0095\u0096\7?\2\2\u0096\u00a0\5\4\3\2\u0097\u0098\7\23"+
		"\2\2\u0098\u0099\7\33\2\2\u0099\u009a\5\66\34\2\u009a\u009b\7\34\2\2\u009b"+
		"\u009c\7?\2\2\u009c\u009d\5\4\3\2\u009d\u009f\3\2\2\2\u009e\u0097\3\2"+
		"\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a6\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\7"+
		"?\2\2\u00a5\u00a7\5\4\3\2\u00a6\u00a3\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\33\3\2\2\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\5\66"+
		"\34\2\u00ab\u00ac\7\34\2\2\u00ac\u00ad\7?\2\2\u00ad\u00ae\5\4\3\2\u00ae"+
		"\35\3\2\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\7:\2\2\u00b1\u00b2\7\5\2"+
		"\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\7?\2\2\u00b4\u00b5\5\4\3\2\u00b5\37"+
		"\3\2\2\2\u00b6\u00b7\7\35\2\2\u00b7\u00b8\5$\23\2\u00b8\u00b9\7\36\2\2"+
		"\u00b9!\3\2\2\2\u00ba\u00bb\7\35\2\2\u00bb\u00bc\5\66\34\2\u00bc\u00bd"+
		"\7\6\2\2\u00bd\u00c0\5\66\34\2\u00be\u00bf\7\6\2\2\u00bf\u00c1\5\66\34"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\7\36\2\2\u00c3#\3\2\2\2\u00c4\u00c9\5\66\34\2\u00c5\u00c6\7\16\2\2\u00c6"+
		"\u00c8\5\66\34\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00c4\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cf\7\3\2\2"+
		"\u00cf\u00d0\7:\2\2\u00d0\u00d1\5\64\33\2\u00d1\u00d2\7\33\2\2\u00d2\u00d3"+
		"\5*\26\2\u00d3\u00d4\7\34\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d6\5\4\3\2\u00d6"+
		"\'\3\2\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\7:\2\2\u00d9\u00da\5\64\33"+
		"\2\u00da\u00db\7\33\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7\34\2\2\u00dd"+
		")\3\2\2\2\u00de\u00df\5\64\33\2\u00df\u00e6\7:\2\2\u00e0\u00e1\7\16\2"+
		"\2\u00e1\u00e2\5\64\33\2\u00e2\u00e3\7:\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00de\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea+\3\2\2\2\u00eb\u00f0\5\64\33\2\u00ec\u00ed\7\16\2"+
		"\2\u00ed\u00ef\5\64\33\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00f6"+
		"\7:\2\2\u00f6\u00f7\7\33\2\2\u00f7\u00f8\5$\23\2\u00f8\u00f9\7\34\2\2"+
		"\u00f9/\3\2\2\2\u00fa\u00fb\5\64\33\2\u00fb\u00fe\7:\2\2\u00fc\u00fd\7"+
		"\b\2\2\u00fd\u00ff\5\66\34\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\61\3\2\2\2\u0100\u0102\7\27\2\2\u0101\u0103\5\66\34\2\u0102\u0101\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\63\3\2\2\2\u0104\u0105\b\33\1\2\u0105\u0106"+
		"\t\4\2\2\u0106\u010c\3\2\2\2\u0107\u0108\f\4\2\2\u0108\u0109\7\35\2\2"+
		"\u0109\u010b\7\36\2\2\u010a\u0107\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\65\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0110\b\34\1\2\u0110\u0111\7\'\2\2\u0111\u011b\5\66\34\f\u0112\u0113"+
		"\7%\2\2\u0113\u011b\5\66\34\6\u0114\u0115\7\33\2\2\u0115\u0116\5\66\34"+
		"\2\u0116\u0117\7\34\2\2\u0117\u011b\3\2\2\2\u0118\u011b\5.\30\2\u0119"+
		"\u011b\5\22\n\2\u011a\u010f\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0114\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u0136\3\2\2\2\u011c"+
		"\u011d\f\13\2\2\u011d\u011e\t\5\2\2\u011e\u0135\5\66\34\f\u011f\u0120"+
		"\f\n\2\2\u0120\u0121\t\6\2\2\u0121\u0135\5\66\34\13\u0122\u0123\f\7\2"+
		"\2\u0123\u0124\t\7\2\2\u0124\u0135\5\66\34\b\u0125\u0126\f\5\2\2\u0126"+
		"\u0127\7#\2\2\u0127\u0135\5\66\34\6\u0128\u0129\f\4\2\2\u0129\u012a\7"+
		"$\2\2\u012a\u0135\5\66\34\5\u012b\u012c\f\r\2\2\u012c\u012d\7\37\2\2\u012d"+
		"\u012e\5\66\34\2\u012e\u012f\7 \2\2\u012f\u0135\3\2\2\2\u0130\u0131\f"+
		"\t\2\2\u0131\u0135\7\r\2\2\u0132\u0133\f\b\2\2\u0133\u0135\7\7\2\2\u0134"+
		"\u011c\3\2\2\2\u0134\u011f\3\2\2\2\u0134\u0122\3\2\2\2\u0134\u0125\3\2"+
		"\2\2\u0134\u0128\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u0130\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\67\3\2\2\2\u0138\u0136\3\2\2\2\32=CKU_fr\u0083\u008f\u00a0"+
		"\u00a6\u00c0\u00c9\u00cc\u00e6\u00e9\u00f0\u00f3\u00fe\u0102\u010c\u011a"+
		"\u0134\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}