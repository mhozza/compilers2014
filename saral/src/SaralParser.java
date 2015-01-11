// Generated from Saral.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SaralParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, INDENT=7, DEDENT=8, VARIABLE=9, 
		CONST=10, ARRAY=11, WHILE=12, DO=13, FOR=14, FROM=15, TO=16, IF=17, THEN=18, 
		ELSE=19, FUNCTION=20, EXTERN=21, RET=22, FUNC_CALL=23, PROC_CALL=24, LPAR=25, 
		RPAR=26, LBRACK=27, RBRACK=28, AND=29, OR=30, NOT=31, ADD=32, SUB=33, 
		MUL=34, DIV=35, MOD=36, EQ=37, NE=38, LE=39, GE=40, GT=41, LT=42, BOOL_T=43, 
		INT_T=44, FLOAT_T=45, CHAR_T=46, STRING_T=47, BOOL=48, INT=49, FLOAT=50, 
		STRING=51, CHAR=52, ID=53, LETTER=54, EMPTY_LINE=55, COMMENT=56, EOL=57, 
		WS=58, NUMBER=59, DIGIT=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'vežmi'", "'sluchaj'", "'povidz'", "'ciskaj'", "','", "'='", 
		"'__INDENT'", "'__DEDENT'", "'meňak'", "'furt'", "ARRAY", "'kým'", "'rob'", 
		"'zrob s meňakom'", "'od'", "'do'", "'keď'", "'potom'", "'inak'", "'bar'", 
		"'inakši'", "'vrac'", "'vrac mi z baru'", "'paľ do baru'", "'('", "')'", 
		"'['", "']'", "'a'", "'alebo'", "'ne'", "'+'", "'-'", "'*'", "DIV", "'%'", 
		"'=='", "'<>'", "'<='", "'>='", "'>'", "'<'", "'logický'", "'neskutočné numeralio'", 
		"'skutočné numeralio'", "'písmeno'", "'slovo'", "BOOL", "INT", "FLOAT", 
		"STRING", "CHAR", "ID", "LETTER", "EMPTY_LINE", "COMMENT", "EOL", "WS", 
		"NUMBER", "DIGIT"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_block = 2, RULE_func_block = 3, 
		RULE_ret = 4, RULE_statement = 5, RULE_simple_statement = 6, RULE_block_statement = 7, 
		RULE_var = 8, RULE_val = 9, RULE_assignment = 10, RULE_if_statement = 11, 
		RULE_while_statement = 12, RULE_for_statement = 13, RULE_func_definition = 14, 
		RULE_proc_definition = 15, RULE_extern_func_declaration = 16, RULE_extern_proc_declaration = 17, 
		RULE_func_call = 18, RULE_proc_call = 19, RULE_arglist = 20, RULE_paramlist = 21, 
		RULE_read = 22, RULE_write = 23, RULE_read2 = 24, RULE_write2 = 25, RULE_var_definition = 26, 
		RULE_var_declaration = 27, RULE_const_definition = 28, RULE_array_declaration = 29, 
		RULE_type = 30, RULE_typeArray = 31, RULE_typeSimple = 32, RULE_typeBasic = 33, 
		RULE_expression = 34;
	public static final String[] ruleNames = {
		"init", "statements", "block", "func_block", "ret", "statement", "simple_statement", 
		"block_statement", "var", "val", "assignment", "if_statement", "while_statement", 
		"for_statement", "func_definition", "proc_definition", "extern_func_declaration", 
		"extern_proc_declaration", "func_call", "proc_call", "arglist", "paramlist", 
		"read", "write", "read2", "write2", "var_definition", "var_declaration", 
		"const_definition", "array_declaration", "type", "typeArray", "typeSimple", 
		"typeBasic", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Saral.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SaralParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public Extern_proc_declarationContext extern_proc_declaration(int i) {
			return getRuleContext(Extern_proc_declarationContext.class,i);
		}
		public Extern_func_declarationContext extern_func_declaration(int i) {
			return getRuleContext(Extern_func_declarationContext.class,i);
		}
		public List<Extern_proc_declarationContext> extern_proc_declaration() {
			return getRuleContexts(Extern_proc_declarationContext.class);
		}
		public List<TerminalNode> EOL() { return getTokens(SaralParser.EOL); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOL(int i) {
			return getToken(SaralParser.EOL, i);
		}
		public List<Extern_func_declarationContext> extern_func_declaration() {
			return getRuleContexts(Extern_func_declarationContext.class);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXTERN) {
				{
				{
				setState(72);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(70); extern_func_declaration();
					}
					break;
				case 2:
					{
					setState(71); extern_proc_declaration();
					}
					break;
				}
				setState(74); match(EOL);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << INDENT) | (1L << VARIABLE) | (1L << CONST) | (1L << ARRAY) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << FUNCTION) | (1L << PROC_CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(83); statement();
				}
				}
				setState(88);
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
		public TerminalNode DEDENT() { return getToken(SaralParser.DEDENT, 0); }
		public TerminalNode INDENT() { return getToken(SaralParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(INDENT);
			setState(90); statements();
			setState(91); match(DEDENT);
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

	public static class Func_blockContext extends ParserRuleContext {
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(SaralParser.DEDENT, 0); }
		public TerminalNode INDENT() { return getToken(SaralParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Func_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterFunc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitFunc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitFunc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_blockContext func_block() throws RecognitionException {
		Func_blockContext _localctx = new Func_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(INDENT);
			setState(94); statements();
			setState(95); ret();
			setState(96); match(DEDENT);
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
		public TerminalNode RET() { return getToken(SaralParser.RET, 0); }
		public TerminalNode EOL() { return getToken(SaralParser.EOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(RET);
			setState(99); expression(0);
			setState(100); match(EOL);
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
		public TerminalNode EOL() { return getToken(SaralParser.EOL, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(109);
			switch (_input.LA(1)) {
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case VARIABLE:
			case CONST:
			case ARRAY:
			case PROC_CALL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); simple_statement();
				setState(103); match(EOL);
				}
				break;
			case INDENT:
			case WHILE:
			case FOR:
			case IF:
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); block_statement();
				setState(107);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(106); match(EOL);
					}
				}

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
		public Read2Context read2() {
			return getRuleContext(Read2Context.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Const_definitionContext const_definition() {
			return getRuleContext(Const_definitionContext.class,0);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Write2Context write2() {
			return getRuleContext(Write2Context.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_statement);
		try {
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); var_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); var_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114); const_definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115); array_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116); proc_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117); write();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118); read();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119); write2();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(120); read2();
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
		public Func_definitionContext func_definition() {
			return getRuleContext(Func_definitionContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Proc_definitionContext proc_definition() {
			return getRuleContext(Proc_definitionContext.class,0);
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
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block_statement);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); func_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); proc_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127); for_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128); block();
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
	public static class VarArrayContext extends VarContext {
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TerminalNode RBRACK() { return getToken(SaralParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SaralParser.LBRACK, 0); }
		public VarArrayContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterVarArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitVarArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitVarArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIDContext extends VarContext {
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public VarIDContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VarIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131); match(ID);
				}
				break;
			case 2:
				_localctx = new VarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(ID);
				setState(133); match(LBRACK);
				setState(134); expression(0);
				setState(135); match(RBRACK);
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
	public static class ValFloatContext extends ValContext {
		public TerminalNode FLOAT() { return getToken(SaralParser.FLOAT, 0); }
		public ValFloatContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterValFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitValFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitValFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends ValContext {
		public TerminalNode BOOL() { return getToken(SaralParser.BOOL, 0); }
		public ValBoolContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterValBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitValBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIntContext extends ValContext {
		public TerminalNode INT() { return getToken(SaralParser.INT, 0); }
		public ValIntContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStringContext extends ValContext {
		public TerminalNode STRING() { return getToken(SaralParser.STRING, 0); }
		public ValStringContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterValString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitValString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitValString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValCharContext extends ValContext {
		public TerminalNode CHAR() { return getToken(SaralParser.CHAR, 0); }
		public ValCharContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterValChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitValChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitValChar(this);
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
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterValVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitValVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitValVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_val);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ValVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139); var();
				}
				break;
			case INT:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new ValFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141); match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142); match(STRING);
				}
				break;
			case CHAR:
				_localctx = new ValCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143); match(CHAR);
				}
				break;
			case BOOL:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(144); match(BOOL);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); var();
			setState(148); match(T__0);
			setState(149); expression(0);
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
		public TerminalNode ELSE() { return getToken(SaralParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(SaralParser.IF, 0); }
		public List<TerminalNode> EOL() { return getTokens(SaralParser.EOL); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SaralParser.THEN, 0); }
		public TerminalNode EOL(int i) {
			return getToken(SaralParser.EOL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(IF);
			setState(152); expression(0);
			setState(153); match(THEN);
			setState(154); match(EOL);
			setState(155); block();
			setState(159);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(156); match(ELSE);
				setState(157); match(EOL);
				setState(158); block();
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
		public TerminalNode EOL() { return getToken(SaralParser.EOL, 0); }
		public TerminalNode DO() { return getToken(SaralParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(SaralParser.WHILE, 0); }
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
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(WHILE);
			setState(162); expression(0);
			setState(163); match(DO);
			setState(164); match(EOL);
			setState(165); block();
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
		public TerminalNode EOL() { return getToken(SaralParser.EOL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SaralParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(SaralParser.FROM, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public TerminalNode TO() { return getToken(SaralParser.TO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(FOR);
			setState(168); var();
			setState(169); match(FROM);
			setState(170); val();
			setState(171); match(TO);
			setState(172); val();
			setState(173); match(EOL);
			setState(174); block();
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

	public static class Func_definitionContext extends ParserRuleContext {
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(SaralParser.FUNCTION, 0); }
		public TerminalNode EOL() { return getToken(SaralParser.EOL, 0); }
		public Func_blockContext func_block() {
			return getRuleContext(Func_blockContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SaralParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SaralParser.RPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterFunc_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitFunc_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitFunc_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(FUNCTION);
			setState(177); typeBasic();
			setState(178); match(ID);
			setState(179); match(LPAR);
			setState(180); arglist();
			setState(181); match(RPAR);
			setState(182); match(EOL);
			setState(183); func_block();
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

	public static class Proc_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(SaralParser.FUNCTION, 0); }
		public TerminalNode EOL() { return getToken(SaralParser.EOL, 0); }
		public TerminalNode LPAR() { return getToken(SaralParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SaralParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Proc_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterProc_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitProc_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitProc_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_definitionContext proc_definition() throws RecognitionException {
		Proc_definitionContext _localctx = new Proc_definitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_proc_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(FUNCTION);
			setState(186); match(ID);
			setState(187); match(LPAR);
			setState(188); arglist();
			setState(189); match(RPAR);
			setState(190); match(EOL);
			setState(191); block();
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

	public static class Extern_func_declarationContext extends ParserRuleContext {
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(SaralParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(SaralParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SaralParser.RPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode EXTERN() { return getToken(SaralParser.EXTERN, 0); }
		public Extern_func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_func_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterExtern_func_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitExtern_func_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitExtern_func_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_func_declarationContext extern_func_declaration() throws RecognitionException {
		Extern_func_declarationContext _localctx = new Extern_func_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_extern_func_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(EXTERN);
			setState(194); match(FUNCTION);
			setState(195); typeBasic();
			setState(196); match(ID);
			setState(197); match(LPAR);
			setState(198); arglist();
			setState(199); match(RPAR);
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

	public static class Extern_proc_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(SaralParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(SaralParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SaralParser.RPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode EXTERN() { return getToken(SaralParser.EXTERN, 0); }
		public Extern_proc_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_proc_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterExtern_proc_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitExtern_proc_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitExtern_proc_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_proc_declarationContext extern_proc_declaration() throws RecognitionException {
		Extern_proc_declarationContext _localctx = new Extern_proc_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extern_proc_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(EXTERN);
			setState(202); match(FUNCTION);
			setState(203); match(ID);
			setState(204); match(LPAR);
			setState(205); arglist();
			setState(206); match(RPAR);
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
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode FUNC_CALL() { return getToken(SaralParser.FUNC_CALL, 0); }
		public TerminalNode LPAR() { return getToken(SaralParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SaralParser.RPAR, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(FUNC_CALL);
			setState(209); match(ID);
			setState(210); match(LPAR);
			setState(211); paramlist();
			setState(212); match(RPAR);
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

	public static class Proc_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode PROC_CALL() { return getToken(SaralParser.PROC_CALL, 0); }
		public TerminalNode LPAR() { return getToken(SaralParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SaralParser.RPAR, 0); }
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(PROC_CALL);
			setState(215); match(ID);
			setState(216); match(LPAR);
			setState(217); paramlist();
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
		public List<TerminalNode> ID() { return getTokens(SaralParser.ID); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(SaralParser.ID, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitArglist(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL_T) | (1L << INT_T) | (1L << FLOAT_T) | (1L << CHAR_T) | (1L << STRING_T))) != 0)) {
				{
				setState(220); type();
				setState(221); match(ID);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(222); match(T__1);
					setState(223); type();
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

	public static class ParamlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(233); var();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(234); match(T__1);
					setState(235); var();
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

	public static class ReadContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(T__5);
			setState(244); var();
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

	public static class WriteContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(T__2);
			setState(247); var();
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

	public static class Read2Context extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Read2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterRead2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitRead2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitRead2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read2Context read2() throws RecognitionException {
		Read2Context _localctx = new Read2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_read2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(T__4);
			setState(250); var();
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

	public static class Write2Context extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Write2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterWrite2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitWrite2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitWrite2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write2Context write2() throws RecognitionException {
		Write2Context _localctx = new Write2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_write2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(T__3);
			setState(253); var();
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

	public static class Var_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(SaralParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterVar_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitVar_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_var_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(VARIABLE);
			setState(256); type();
			setState(257); match(ID);
			setState(258); match(T__0);
			setState(259); expression(0);
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

	public static class Var_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(SaralParser.VARIABLE, 0); }
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitVar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(VARIABLE);
			setState(262); type();
			setState(263); match(ID);
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

	public static class Const_definitionContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SaralParser.CONST, 0); }
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Const_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterConst_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitConst_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitConst_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_definitionContext const_definition() throws RecognitionException {
		Const_definitionContext _localctx = new Const_definitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_const_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(CONST);
			setState(266); type();
			setState(267); match(ID);
			setState(268); match(T__0);
			setState(269); expression(0);
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

	public static class Array_declarationContext extends ParserRuleContext {
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public TerminalNode ID() { return getToken(SaralParser.ID, 0); }
		public TerminalNode RBRACK() { return getToken(SaralParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SaralParser.LBRACK, 0); }
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitArray_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); typeArray();
			setState(272); match(ID);
			setState(273); match(LBRACK);
			setState(274); expression(0);
			setState(275); match(RBRACK);
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
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); typeArray();
				}
				break;
			case BOOL_T:
			case INT_T:
			case FLOAT_T:
			case CHAR_T:
			case STRING_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); typeBasic();
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

	public static class TypeArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SaralParser.ARRAY, 0); }
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(ARRAY);
			setState(282); typeBasic();
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

	public static class TypeSimpleContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(SaralParser.INT_T, 0); }
		public TerminalNode CHAR_T() { return getToken(SaralParser.CHAR_T, 0); }
		public TerminalNode BOOL_T() { return getToken(SaralParser.BOOL_T, 0); }
		public TerminalNode FLOAT_T() { return getToken(SaralParser.FLOAT_T, 0); }
		public TypeSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterTypeSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitTypeSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitTypeSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSimpleContext typeSimple() throws RecognitionException {
		TypeSimpleContext _localctx = new TypeSimpleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_T) | (1L << INT_T) | (1L << FLOAT_T) | (1L << CHAR_T))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeBasicContext extends ParserRuleContext {
		public TerminalNode STRING_T() { return getToken(SaralParser.STRING_T, 0); }
		public TypeSimpleContext typeSimple() {
			return getRuleContext(TypeSimpleContext.class,0);
		}
		public TypeBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitTypeBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBasicContext typeBasic() throws RecognitionException {
		TypeBasicContext _localctx = new TypeBasicContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeBasic);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case BOOL_T:
			case INT_T:
			case FLOAT_T:
			case CHAR_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(286); typeSimple();
				}
				break;
			case STRING_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); match(STRING_T);
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
		public TerminalNode SUB() { return getToken(SaralParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(SaralParser.ADD, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitAdd(this);
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
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(SaralParser.MOD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(SaralParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(SaralParser.MUL, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitMul(this);
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
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExpressionContext {
		public Token op;
		public TerminalNode SUB() { return getToken(SaralParser.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(SaralParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExpressionContext {
		public Token op;
		public TerminalNode GE() { return getToken(SaralParser.GE, 0); }
		public TerminalNode LT() { return getToken(SaralParser.LT, 0); }
		public TerminalNode GT() { return getToken(SaralParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(SaralParser.LE, 0); }
		public TerminalNode EQ() { return getToken(SaralParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SaralParser.NE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolOrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(SaralParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoolOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitBoolOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitBoolOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SaralParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoolAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitBoolAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitBoolAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExpressionContext {
		public TerminalNode LPAR() { return getToken(SaralParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SaralParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaralListener ) ((SaralListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaralVisitor ) return ((SaralVisitor<? extends T>)visitor).visitParen(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(291); ((UnaryMinusContext)_localctx).op = match(SUB);
				setState(292); expression(8);
				}
				break;
			case NOT:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293); ((BoolNotContext)_localctx).op = match(NOT);
				setState(294); expression(4);
				}
				break;
			case LPAR:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295); match(LPAR);
				setState(296); expression(0);
				setState(297); match(RPAR);
				}
				break;
			case FUNC_CALL:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299); func_call();
				}
				break;
			case BOOL:
			case INT:
			case FLOAT:
			case STRING:
			case CHAR:
			case ID:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300); val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(304);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(305); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(306);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(307);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(308); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(310);
						((CompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(311); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new BoolAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(313); ((BoolAndContext)_localctx).op = match(AND);
						setState(314); expression(4);
						}
						break;
					case 5:
						{
						_localctx = new BoolOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(316); ((BoolOrContext)_localctx).op = match(OR);
						setState(317); expression(3);
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		case 34: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 3);
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\5\2K\n\2\3\2\3\2\7\2O\n\2\f\2\16\2R\13"+
		"\2\3\2\3\2\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\5\7p\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0094\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00a2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e5"+
		"\n\26\f\26\16\26\u00e8\13\26\5\26\u00ea\n\26\3\27\3\27\3\27\7\27\u00ef"+
		"\n\27\f\27\16\27\u00f2\13\27\5\27\u00f4\n\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \5 \u011a\n \3!\3!\3!\3\"\3\"\3#\3#\5#\u0123\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u0130\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\7$\u0141\n$\f$\16$\u0144\13$\3$\2\3F%\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\6\3\2-\60\3\2$&\3\2"+
		"\"#\3\2\',\u014b\2P\3\2\2\2\4X\3\2\2\2\6[\3\2\2\2\b_\3\2\2\2\nd\3\2\2"+
		"\2\fo\3\2\2\2\16{\3\2\2\2\20\u0083\3\2\2\2\22\u008b\3\2\2\2\24\u0093\3"+
		"\2\2\2\26\u0095\3\2\2\2\30\u0099\3\2\2\2\32\u00a3\3\2\2\2\34\u00a9\3\2"+
		"\2\2\36\u00b2\3\2\2\2 \u00bb\3\2\2\2\"\u00c3\3\2\2\2$\u00cb\3\2\2\2&\u00d2"+
		"\3\2\2\2(\u00d8\3\2\2\2*\u00e9\3\2\2\2,\u00f3\3\2\2\2.\u00f5\3\2\2\2\60"+
		"\u00f8\3\2\2\2\62\u00fb\3\2\2\2\64\u00fe\3\2\2\2\66\u0101\3\2\2\28\u0107"+
		"\3\2\2\2:\u010b\3\2\2\2<\u0111\3\2\2\2>\u0119\3\2\2\2@\u011b\3\2\2\2B"+
		"\u011e\3\2\2\2D\u0122\3\2\2\2F\u012f\3\2\2\2HK\5\"\22\2IK\5$\23\2JH\3"+
		"\2\2\2JI\3\2\2\2KL\3\2\2\2LM\7;\2\2MO\3\2\2\2NJ\3\2\2\2OR\3\2\2\2PN\3"+
		"\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\4\3\2T\3\3\2\2\2UW\5\f\7\2VU"+
		"\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\5\3\2\2\2ZX\3\2\2\2[\\\7\t\2\2"+
		"\\]\5\4\3\2]^\7\n\2\2^\7\3\2\2\2_`\7\t\2\2`a\5\4\3\2ab\5\n\6\2bc\7\n\2"+
		"\2c\t\3\2\2\2de\7\30\2\2ef\5F$\2fg\7;\2\2g\13\3\2\2\2hi\5\16\b\2ij\7;"+
		"\2\2jp\3\2\2\2km\5\20\t\2ln\7;\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oh\3\2"+
		"\2\2ok\3\2\2\2p\r\3\2\2\2q|\5\26\f\2r|\58\35\2s|\5\66\34\2t|\5:\36\2u"+
		"|\5<\37\2v|\5(\25\2w|\5\60\31\2x|\5.\30\2y|\5\64\33\2z|\5\62\32\2{q\3"+
		"\2\2\2{r\3\2\2\2{s\3\2\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3"+
		"\2\2\2{y\3\2\2\2{z\3\2\2\2|\17\3\2\2\2}\u0084\5\36\20\2~\u0084\5 \21\2"+
		"\177\u0084\5\30\r\2\u0080\u0084\5\32\16\2\u0081\u0084\5\34\17\2\u0082"+
		"\u0084\5\6\4\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\21\3\2\2\2\u0085"+
		"\u008c\7\67\2\2\u0086\u0087\7\67\2\2\u0087\u0088\7\35\2\2\u0088\u0089"+
		"\5F$\2\u0089\u008a\7\36\2\2\u008a\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008c\23\3\2\2\2\u008d\u0094\5\22\n\2\u008e\u0094\7\63"+
		"\2\2\u008f\u0094\7\64\2\2\u0090\u0094\7\65\2\2\u0091\u0094\7\66\2\2\u0092"+
		"\u0094\7\62\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3"+
		"\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\25\3\2\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\b\2\2\u0097\u0098\5F$\2"+
		"\u0098\27\3\2\2\2\u0099\u009a\7\23\2\2\u009a\u009b\5F$\2\u009b\u009c\7"+
		"\24\2\2\u009c\u009d\7;\2\2\u009d\u00a1\5\6\4\2\u009e\u009f\7\25\2\2\u009f"+
		"\u00a0\7;\2\2\u00a0\u00a2\5\6\4\2\u00a1\u009e\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5F$\2\u00a5\u00a6"+
		"\7\17\2\2\u00a6\u00a7\7;\2\2\u00a7\u00a8\5\6\4\2\u00a8\33\3\2\2\2\u00a9"+
		"\u00aa\7\20\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\7\21\2\2\u00ac\u00ad"+
		"\5\24\13\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\7;\2"+
		"\2\u00b0\u00b1\5\6\4\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4"+
		"\5D#\2\u00b4\u00b5\7\67\2\2\u00b5\u00b6\7\33\2\2\u00b6\u00b7\5*\26\2\u00b7"+
		"\u00b8\7\34\2\2\u00b8\u00b9\7;\2\2\u00b9\u00ba\5\b\5\2\u00ba\37\3\2\2"+
		"\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\7\67\2\2\u00bd\u00be\7\33\2\2\u00be"+
		"\u00bf\5*\26\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\7;\2\2\u00c1\u00c2\5\6"+
		"\4\2\u00c2!\3\2\2\2\u00c3\u00c4\7\27\2\2\u00c4\u00c5\7\26\2\2\u00c5\u00c6"+
		"\5D#\2\u00c6\u00c7\7\67\2\2\u00c7\u00c8\7\33\2\2\u00c8\u00c9\5*\26\2\u00c9"+
		"\u00ca\7\34\2\2\u00ca#\3\2\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd\7\26\2"+
		"\2\u00cd\u00ce\7\67\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\5*\26\2\u00d0"+
		"\u00d1\7\34\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d4\7\67\2"+
		"\2\u00d4\u00d5\7\33\2\2\u00d5\u00d6\5,\27\2\u00d6\u00d7\7\34\2\2\u00d7"+
		"\'\3\2\2\2\u00d8\u00d9\7\32\2\2\u00d9\u00da\7\67\2\2\u00da\u00db\7\33"+
		"\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7\34\2\2\u00dd)\3\2\2\2\u00de\u00df"+
		"\5> \2\u00df\u00e6\7\67\2\2\u00e0\u00e1\7\7\2\2\u00e1\u00e2\5> \2\u00e2"+
		"\u00e3\7\67\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00de\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea+\3\2\2\2"+
		"\u00eb\u00f0\5\22\n\2\u00ec\u00ed\7\7\2\2\u00ed\u00ef\5\22\n\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4-\3\2\2\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7\5\22\n\2\u00f7/\3"+
		"\2\2\2\u00f8\u00f9\7\6\2\2\u00f9\u00fa\5\22\n\2\u00fa\61\3\2\2\2\u00fb"+
		"\u00fc\7\4\2\2\u00fc\u00fd\5\22\n\2\u00fd\63\3\2\2\2\u00fe\u00ff\7\5\2"+
		"\2\u00ff\u0100\5\22\n\2\u0100\65\3\2\2\2\u0101\u0102\7\13\2\2\u0102\u0103"+
		"\5> \2\u0103\u0104\7\67\2\2\u0104\u0105\7\b\2\2\u0105\u0106\5F$\2\u0106"+
		"\67\3\2\2\2\u0107\u0108\7\13\2\2\u0108\u0109\5> \2\u0109\u010a\7\67\2"+
		"\2\u010a9\3\2\2\2\u010b\u010c\7\f\2\2\u010c\u010d\5> \2\u010d\u010e\7"+
		"\67\2\2\u010e\u010f\7\b\2\2\u010f\u0110\5F$\2\u0110;\3\2\2\2\u0111\u0112"+
		"\5@!\2\u0112\u0113\7\67\2\2\u0113\u0114\7\35\2\2\u0114\u0115\5F$\2\u0115"+
		"\u0116\7\36\2\2\u0116=\3\2\2\2\u0117\u011a\5@!\2\u0118\u011a\5D#\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a?\3\2\2\2\u011b\u011c\7\r\2\2"+
		"\u011c\u011d\5D#\2\u011dA\3\2\2\2\u011e\u011f\t\2\2\2\u011fC\3\2\2\2\u0120"+
		"\u0123\5B\"\2\u0121\u0123\7\61\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123E\3\2\2\2\u0124\u0125\b$\1\2\u0125\u0126\7#\2\2\u0126\u0130"+
		"\5F$\n\u0127\u0128\7!\2\2\u0128\u0130\5F$\6\u0129\u012a\7\33\2\2\u012a"+
		"\u012b\5F$\2\u012b\u012c\7\34\2\2\u012c\u0130\3\2\2\2\u012d\u0130\5&\24"+
		"\2\u012e\u0130\5\24\13\2\u012f\u0124\3\2\2\2\u012f\u0127\3\2\2\2\u012f"+
		"\u0129\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0142\3\2"+
		"\2\2\u0131\u0132\f\t\2\2\u0132\u0133\t\3\2\2\u0133\u0141\5F$\n\u0134\u0135"+
		"\f\b\2\2\u0135\u0136\t\4\2\2\u0136\u0141\5F$\t\u0137\u0138\f\7\2\2\u0138"+
		"\u0139\t\5\2\2\u0139\u0141\5F$\b\u013a\u013b\f\5\2\2\u013b\u013c\7\37"+
		"\2\2\u013c\u0141\5F$\6\u013d\u013e\f\4\2\2\u013e\u013f\7 \2\2\u013f\u0141"+
		"\5F$\5\u0140\u0131\3\2\2\2\u0140\u0134\3\2\2\2\u0140\u0137\3\2\2\2\u0140"+
		"\u013a\3\2\2\2\u0140\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143G\3\2\2\2\u0144\u0142\3\2\2\2\25JPXmo{\u0083"+
		"\u008b\u0093\u00a1\u00e6\u00e9\u00f0\u00f3\u0119\u0122\u012f\u0140\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}