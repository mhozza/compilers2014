// Generated from scapy.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scapyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, STRING=4, CHAR=5, MUL=6, DIV=7, ADD=8, SUB=9, 
		MOD=10, EXP=11, EQ=12, NE=13, LE=14, GE=15, GT=16, LT=17, ADD_ASS=18, 
		SUB_ASS=19, MUL_ASS=20, DIV_ASS=21, MOD_ASS=22, TYPE_INT=23, TYPE_CHAR=24, 
		TYPE_STRING=25, TYPE_BOOLEAN=26, TYPE_FLOAT=27, TYPE_ARRAY=28, ASSIGN=29, 
		IF=30, ELSE=31, WHILE=32, AND=33, OR=34, NOT=35, VAR=36, VAL=37, DEF=38, 
		RET=39, IMPORT=40, FOR=41, ARROW=42, UNTIL=43, OPENBLOCK=44, CLOSEBLOCK=45, 
		OPENPARENT=46, CLOSEPARENT=47, OPENBRACKET=48, CLOSEBRACKET=49, COMMA=50, 
		COLON=51, NEWLINE=52, ID=53, COMMENT=54, WHITESPACE=55;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "FLOAT", "BOOL", "STRING", "CHAR", "'*'", "'/'", "'+'", 
		"'-'", "'%'", "'^'", "'=='", "'!='", "'<='", "'>='", "'>'", "'<'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'Int'", "'Char'", "'String'", "'Boolean'", 
		"'Float'", "'Array'", "'='", "'if'", "'else'", "'while'", "'and'", "'or'", 
		"'not'", "'var'", "'val'", "'def'", "'return'", "'import'", "'for'", "'<-'", 
		"'until'", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", "':'", "'\n'", 
		"ID", "COMMENT", "WHITESPACE"
	};
	public static final int
		RULE_init = 0, RULE_import_function = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_assignment = 4, RULE_array_list = 5, RULE_declare_const = 6, RULE_declare_variable = 7, 
		RULE_base_statement = 8, RULE_func_statements = 9, RULE_proc_statements = 10, 
		RULE_func_statement = 11, RULE_arglist = 12, RULE_func_def = 13, RULE_proc_def = 14, 
		RULE_paramlist = 15, RULE_func_call = 16, RULE_id = 17, RULE_type = 18, 
		RULE_var = 19, RULE_expression = 20;
	public static final String[] ruleNames = {
		"init", "import_function", "statements", "statement", "assignment", "array_list", 
		"declare_const", "declare_variable", "base_statement", "func_statements", 
		"proc_statements", "func_statement", "arglist", "func_def", "proc_def", 
		"paramlist", "func_call", "id", "type", "var", "expression"
	};

	@Override
	public String getGrammarFileName() { return "scapy.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public scapyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(scapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(scapyParser.NEWLINE, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Import_functionContext import_function(int i) {
			return getRuleContext(Import_functionContext.class,i);
		}
		public List<Import_functionContext> import_function() {
			return getRuleContexts(Import_functionContext.class);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitInit(this);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(42); import_function();
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(43); match(NEWLINE);
						}
						} 
					}
					setState(48);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); statements();
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

	public static class Import_functionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public TerminalNode IMPORT() { return getToken(scapyParser.IMPORT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(scapyParser.COLON, 0); }
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Import_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterImport_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitImport_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitImport_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_functionContext import_function() throws RecognitionException {
		Import_functionContext _localctx = new Import_functionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(IMPORT);
			setState(57); id();
			setState(58); match(OPENPARENT);
			setState(59); arglist();
			setState(60); match(CLOSEPARENT);
			setState(61); match(COLON);
			setState(62); type();
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
		public List<TerminalNode> NEWLINE() { return getTokens(scapyParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(scapyParser.NEWLINE, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); statement();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(65); match(NEWLINE);
				setState(66); statement();
				}
				}
				setState(71);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseContext extends StatementContext {
		public Base_statementContext base_statement() {
			return getRuleContext(Base_statementContext.class,0);
		}
		public BaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDefContext extends StatementContext {
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public FuncDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcDefContext extends StatementContext {
		public Proc_defContext proc_def() {
			return getRuleContext(Proc_defContext.class,0);
		}
		public ProcDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterProcDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitProcDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitProcDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72); base_statement();
				}
				break;
			case 2:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73); func_def();
				}
				break;
			case 3:
				_localctx = new ProcDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74); proc_def();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Super_assignmentContext extends AssignmentContext {
		public Token op;
		public TerminalNode MOD_ASS() { return getToken(scapyParser.MOD_ASS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DIV_ASS() { return getToken(scapyParser.DIV_ASS, 0); }
		public TerminalNode MUL_ASS() { return getToken(scapyParser.MUL_ASS, 0); }
		public TerminalNode SUB_ASS() { return getToken(scapyParser.SUB_ASS, 0); }
		public Array_listContext array_list() {
			return getRuleContext(Array_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD_ASS() { return getToken(scapyParser.ADD_ASS, 0); }
		public Super_assignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterSuper_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitSuper_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitSuper_assignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Create_array_assignmentContext extends AssignmentContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(scapyParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(scapyParser.CLOSEBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(scapyParser.ASSIGN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_listContext array_list() {
			return getRuleContext(Array_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TYPE_ARRAY() { return getToken(scapyParser.TYPE_ARRAY, 0); }
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public Create_array_assignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterCreate_array_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitCreate_array_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitCreate_array_assignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Simple_assignmentContext extends AssignmentContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(scapyParser.ASSIGN, 0); }
		public Array_listContext array_list() {
			return getRuleContext(Array_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Simple_assignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterSimple_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitSimple_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitSimple_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Simple_assignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77); id();
				setState(79);
				_la = _input.LA(1);
				if (_la==OPENBRACKET) {
					{
					setState(78); array_list();
					}
				}

				setState(81); match(ASSIGN);
				setState(82); expression(0);
				}
				break;
			case 2:
				_localctx = new Create_array_assignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84); id();
				setState(86);
				_la = _input.LA(1);
				if (_la==OPENBRACKET) {
					{
					setState(85); array_list();
					}
				}

				setState(88); match(ASSIGN);
				setState(89); match(TYPE_ARRAY);
				setState(90); match(OPENBRACKET);
				setState(91); type();
				setState(92); match(CLOSEBRACKET);
				setState(93); match(OPENPARENT);
				setState(94); expression(0);
				setState(95); match(CLOSEPARENT);
				}
				break;
			case 3:
				_localctx = new Super_assignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97); id();
				setState(99);
				_la = _input.LA(1);
				if (_la==OPENBRACKET) {
					{
					setState(98); array_list();
					}
				}

				setState(101);
				((Super_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASS) | (1L << SUB_ASS) | (1L << MUL_ASS) | (1L << DIV_ASS) | (1L << MOD_ASS))) != 0)) ) {
					((Super_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(102); expression(0);
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

	public static class Array_listContext extends ParserRuleContext {
		public Array_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_list; }
	 
		public Array_listContext() { }
		public void copyFrom(Array_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArraylistContext extends Array_listContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(scapyParser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(scapyParser.OPENBRACKET, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(scapyParser.CLOSEBRACKET); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(scapyParser.CLOSEBRACKET, i);
		}
		public ArraylistContext(Array_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterArraylist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitArraylist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitArraylist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_listContext array_list() throws RecognitionException {
		Array_listContext _localctx = new Array_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_list);
		try {
			int _alt;
			_localctx = new ArraylistContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(106); match(OPENBRACKET);
					setState(107); expression(0);
					setState(108); match(CLOSEBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Declare_constContext extends ParserRuleContext {
		public Declare_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_const; }
	 
		public Declare_constContext() { }
		public void copyFrom(Declare_constContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declare_simple_constContext extends Declare_constContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(scapyParser.ASSIGN, 0); }
		public TerminalNode VAL() { return getToken(scapyParser.VAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(scapyParser.COLON, 0); }
		public Declare_simple_constContext(Declare_constContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterDeclare_simple_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitDeclare_simple_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitDeclare_simple_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_constContext declare_const() throws RecognitionException {
		Declare_constContext _localctx = new Declare_constContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declare_const);
		int _la;
		try {
			_localctx = new Declare_simple_constContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(VAL);
			setState(115); id();
			setState(118);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(116); match(COLON);
				setState(117); type();
				}
			}

			setState(120); match(ASSIGN);
			setState(121); expression(0);
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

	public static class Declare_variableContext extends ParserRuleContext {
		public Declare_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_variable; }
	 
		public Declare_variableContext() { }
		public void copyFrom(Declare_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declare_simple_varContext extends Declare_variableContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(scapyParser.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(scapyParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(scapyParser.COLON, 0); }
		public Declare_simple_varContext(Declare_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterDeclare_simple_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitDeclare_simple_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitDeclare_simple_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declare_array_varContext extends Declare_variableContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENBRACKET(int i) {
			return getToken(scapyParser.OPENBRACKET, i);
		}
		public TerminalNode VAL() { return getToken(scapyParser.VAL, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(scapyParser.CLOSEBRACKET, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(scapyParser.OPENBRACKET); }
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public TerminalNode ASSIGN() { return getToken(scapyParser.ASSIGN, 0); }
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(scapyParser.CLOSEBRACKET); }
		public TerminalNode TYPE_ARRAY(int i) {
			return getToken(scapyParser.TYPE_ARRAY, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TerminalNode> TYPE_ARRAY() { return getTokens(scapyParser.TYPE_ARRAY); }
		public TerminalNode COLON() { return getToken(scapyParser.COLON, 0); }
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public Declare_array_varContext(Declare_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterDeclare_array_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitDeclare_array_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitDeclare_array_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_variableContext declare_variable() throws RecognitionException {
		Declare_variableContext _localctx = new Declare_variableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declare_variable);
		int _la;
		try {
			setState(151);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new Declare_simple_varContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123); match(VAR);
				setState(124); id();
				setState(127);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(125); match(COLON);
					setState(126); type();
					}
				}

				setState(129); match(ASSIGN);
				setState(130); expression(0);
				}
				break;
			case VAL:
				_localctx = new Declare_array_varContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(VAL);
				setState(133); id();
				setState(140);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(134); match(COLON);
					setState(135); match(TYPE_ARRAY);
					setState(136); match(OPENBRACKET);
					setState(137); type();
					setState(138); match(CLOSEBRACKET);
					}
				}

				setState(142); match(ASSIGN);
				setState(143); match(TYPE_ARRAY);
				setState(144); match(OPENBRACKET);
				setState(145); type();
				setState(146); match(CLOSEBRACKET);
				setState(147); match(OPENPARENT);
				setState(148); expression(0);
				setState(149); match(CLOSEPARENT);
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

	public static class Base_statementContext extends ParserRuleContext {
		public Base_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_statement; }
	 
		public Base_statementContext() { }
		public void copyFrom(Base_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmpContext extends Base_statementContext {
		public EmpContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterEmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitEmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitEmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends Base_statementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends Base_statementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(scapyParser.WHILE, 0); }
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public WhileContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declare_conContext extends Base_statementContext {
		public Declare_constContext declare_const() {
			return getRuleContext(Declare_constContext.class,0);
		}
		public Declare_conContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterDeclare_con(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitDeclare_con(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitDeclare_con(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BReturnContext extends Base_statementContext {
		public TerminalNode RET() { return getToken(scapyParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BReturnContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterBReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitBReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitBReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends Base_statementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public TerminalNode FOR() { return getToken(scapyParser.FOR, 0); }
		public TerminalNode ARROW() { return getToken(scapyParser.ARROW, 0); }
		public TerminalNode UNTIL() { return getToken(scapyParser.UNTIL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public ForContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends Base_statementContext {
		public StatementContext tr;
		public StatementContext fa;
		public List<TerminalNode> NEWLINE() { return getTokens(scapyParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IF() { return getToken(scapyParser.IF, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(scapyParser.NEWLINE, i);
		}
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public TerminalNode ELSE() { return getToken(scapyParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public IfContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends Base_statementContext {
		public TerminalNode CLOSEBLOCK() { return getToken(scapyParser.CLOSEBLOCK, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode OPENBLOCK() { return getToken(scapyParser.OPENBLOCK, 0); }
		public BlockContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BCallContext extends Base_statementContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public BCallContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterBCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitBCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitBCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declare_varContext extends Base_statementContext {
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public Declare_varContext(Base_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterDeclare_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitDeclare_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitDeclare_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_statementContext base_statement() throws RecognitionException {
		Base_statementContext _localctx = new Base_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_base_statement);
		int _la;
		try {
			int _alt;
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Declare_conContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153); declare_const();
				}
				break;
			case 2:
				_localctx = new Declare_varContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154); declare_variable();
				}
				break;
			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155); assignment();
				}
				break;
			case 4:
				_localctx = new BCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156); func_call();
				}
				break;
			case 5:
				_localctx = new BReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(157); match(RET);
				setState(158); expression(0);
				}
				break;
			case 6:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(159); match(OPENBLOCK);
				setState(160); statements();
				setState(161); match(CLOSEBLOCK);
				}
				break;
			case 7:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(163); match(IF);
				setState(164); match(OPENPARENT);
				setState(165); expression(0);
				setState(166); match(CLOSEPARENT);
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(167); match(NEWLINE);
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(173); ((IfContext)_localctx).tr = statement();
				setState(182);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(174); match(NEWLINE);
						}
						}
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(180); match(ELSE);
					setState(181); ((IfContext)_localctx).fa = statement();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(184); match(WHILE);
				setState(185); match(OPENPARENT);
				setState(186); expression(0);
				setState(187); match(CLOSEPARENT);
				setState(188); statement();
				}
				break;
			case 9:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(190); match(FOR);
				setState(191); match(OPENPARENT);
				setState(192); id();
				setState(193); match(ARROW);
				setState(194); expression(0);
				setState(195); match(UNTIL);
				setState(196); expression(0);
				setState(197); match(CLOSEPARENT);
				setState(198); statement();
				}
				break;
			case 10:
				_localctx = new EmpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
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

	public static class Func_statementsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(scapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(scapyParser.NEWLINE, i);
		}
		public Func_statementContext func_statement(int i) {
			return getRuleContext(Func_statementContext.class,i);
		}
		public List<Func_statementContext> func_statement() {
			return getRuleContexts(Func_statementContext.class);
		}
		public Func_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterFunc_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitFunc_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitFunc_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_statementsContext func_statements() throws RecognitionException {
		Func_statementsContext _localctx = new Func_statementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); func_statement();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(204); match(NEWLINE);
				setState(205); func_statement();
				}
				}
				setState(210);
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

	public static class Proc_statementsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(scapyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(scapyParser.NEWLINE, i);
		}
		public List<Base_statementContext> base_statement() {
			return getRuleContexts(Base_statementContext.class);
		}
		public Base_statementContext base_statement(int i) {
			return getRuleContext(Base_statementContext.class,i);
		}
		public Proc_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterProc_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitProc_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitProc_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_statementsContext proc_statements() throws RecognitionException {
		Proc_statementsContext _localctx = new Proc_statementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_proc_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); base_statement();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(212); match(NEWLINE);
				setState(213); base_statement();
				}
				}
				setState(218);
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

	public static class Func_statementContext extends ParserRuleContext {
		public Func_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_statement; }
	 
		public Func_statementContext() { }
		public void copyFrom(Func_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class F_BaseContext extends Func_statementContext {
		public Base_statementContext base_statement() {
			return getRuleContext(Base_statementContext.class,0);
		}
		public F_BaseContext(Func_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterF_Base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitF_Base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitF_Base(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_ReturnContext extends Func_statementContext {
		public TerminalNode RET() { return getToken(scapyParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public F_ReturnContext(Func_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterF_Return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitF_Return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitF_Return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_statementContext func_statement() throws RecognitionException {
		Func_statementContext _localctx = new Func_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_statement);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new F_BaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219); base_statement();
				}
				break;
			case 2:
				_localctx = new F_ReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220); match(RET);
				setState(221); expression(0);
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

	public static class ArglistContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(scapyParser.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode COLON(int i) {
			return getToken(scapyParser.COLON, i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(scapyParser.COLON); }
		public TerminalNode COMMA(int i) {
			return getToken(scapyParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(224); id();
				setState(225); match(COLON);
				setState(226); type();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227); match(COMMA);
					setState(228); id();
					setState(229); match(COLON);
					setState(230); type();
					}
					}
					setState(236);
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
		public TerminalNode CLOSEBLOCK() { return getToken(scapyParser.CLOSEBLOCK, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DEF() { return getToken(scapyParser.DEF, 0); }
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public TerminalNode ASSIGN() { return getToken(scapyParser.ASSIGN, 0); }
		public TerminalNode OPENBLOCK() { return getToken(scapyParser.OPENBLOCK, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Func_statementsContext func_statements() {
			return getRuleContext(Func_statementsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(scapyParser.COLON, 0); }
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(DEF);
			setState(240); id();
			setState(241); match(OPENPARENT);
			setState(242); arglist();
			setState(243); match(CLOSEPARENT);
			setState(244); match(COLON);
			setState(245); type();
			setState(246); match(ASSIGN);
			setState(247); match(OPENBLOCK);
			setState(248); func_statements();
			setState(249); match(CLOSEBLOCK);
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

	public static class Proc_defContext extends ParserRuleContext {
		public TerminalNode CLOSEBLOCK() { return getToken(scapyParser.CLOSEBLOCK, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DEF() { return getToken(scapyParser.DEF, 0); }
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public Proc_statementsContext proc_statements() {
			return getRuleContext(Proc_statementsContext.class,0);
		}
		public TerminalNode OPENBLOCK() { return getToken(scapyParser.OPENBLOCK, 0); }
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Proc_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterProc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitProc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitProc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_defContext proc_def() throws RecognitionException {
		Proc_defContext _localctx = new Proc_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_proc_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(DEF);
			setState(252); id();
			setState(253); match(OPENPARENT);
			setState(254); arglist();
			setState(255); match(CLOSEPARENT);
			setState(256); match(OPENBLOCK);
			setState(257); proc_statements();
			setState(258); match(CLOSEBLOCK);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(scapyParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(scapyParser.COMMA, i);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << CHAR) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << OPENPARENT) | (1L << ID))) != 0)) {
				{
				setState(260); expression(0);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(261); match(COMMA);
					setState(262); expression(0);
					}
					}
					setState(267);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); id();
			setState(271); match(OPENPARENT);
			setState(272); paramlist();
			setState(273); match(CLOSEPARENT);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(scapyParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(ID);
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
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode OPENBRACKET() { return getToken(scapyParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(scapyParser.CLOSEBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TYPE_ARRAY() { return getToken(scapyParser.TYPE_ARRAY, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicTypeContext extends TypeContext {
		public TerminalNode TYPE_BOOLEAN() { return getToken(scapyParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_STRING() { return getToken(scapyParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(scapyParser.TYPE_CHAR, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(scapyParser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_INT() { return getToken(scapyParser.TYPE_INT, 0); }
		public BasicTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(283);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_CHAR:
			case TYPE_STRING:
			case TYPE_BOOLEAN:
			case TYPE_FLOAT:
				_localctx = new BasicTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_CHAR) | (1L << TYPE_STRING) | (1L << TYPE_BOOLEAN) | (1L << TYPE_FLOAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case TYPE_ARRAY:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278); match(TYPE_ARRAY);
				setState(279); match(OPENBRACKET);
				setState(280); type();
				setState(281); match(CLOSEBRACKET);
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
	public static class VarVarContext extends VarContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VarVarContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterVarVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitVarVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitVarVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarStringContext extends VarContext {
		public TerminalNode STRING() { return getToken(scapyParser.STRING, 0); }
		public VarStringContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterVarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitVarString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitVarString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIntContext extends VarContext {
		public TerminalNode INT() { return getToken(scapyParser.INT, 0); }
		public VarIntContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterVarInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitVarInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitVarInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarArrayContext extends VarContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Array_listContext array_list() {
			return getRuleContext(Array_listContext.class,0);
		}
		public VarArrayContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterVarArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitVarArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitVarArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarCharContext extends VarContext {
		public TerminalNode CHAR() { return getToken(scapyParser.CHAR, 0); }
		public VarCharContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterVarChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitVarChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitVarChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarBoolContext extends VarContext {
		public TerminalNode BOOL() { return getToken(scapyParser.BOOL, 0); }
		public VarBoolContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterVarBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitVarBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitVarBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarFloatContext extends VarContext {
		public TerminalNode FLOAT() { return getToken(scapyParser.FLOAT, 0); }
		public VarFloatContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterVarFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitVarFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitVarFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		try {
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new VarVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285); id();
				}
				break;
			case 2:
				_localctx = new VarIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(INT);
				}
				break;
			case 3:
				_localctx = new VarFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287); match(FLOAT);
				}
				break;
			case 4:
				_localctx = new VarBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(288); match(BOOL);
				}
				break;
			case 5:
				_localctx = new VarCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(289); match(CHAR);
				}
				break;
			case 6:
				_localctx = new VarStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(290); match(STRING);
				}
				break;
			case 7:
				_localctx = new VarArrayContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(291); id();
				setState(292); array_list();
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
	public static class ExpContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXP() { return getToken(scapyParser.EXP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(scapyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(scapyParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode MOD() { return getToken(scapyParser.MOD, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends ExpressionContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public CallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(scapyParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(scapyParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(scapyParser.ADD, 0); }
		public UnaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(scapyParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(scapyParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public TerminalNode CLOSEPARENT() { return getToken(scapyParser.CLOSEPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPENPARENT() { return getToken(scapyParser.OPENPARENT, 0); }
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(scapyParser.LT, 0); }
		public TerminalNode LE() { return getToken(scapyParser.LE, 0); }
		public TerminalNode NE() { return getToken(scapyParser.NE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(scapyParser.GT, 0); }
		public TerminalNode GE() { return getToken(scapyParser.GE, 0); }
		public TerminalNode EQ() { return getToken(scapyParser.EQ, 0); }
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(scapyParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(scapyParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scapyListener ) ((scapyListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scapyVisitor ) return ((scapyVisitor<? extends T>)visitor).visitNot(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(297);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(298); expression(11);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299); ((NotContext)_localctx).op = match(NOT);
				setState(300); expression(6);
				}
				break;
			case 3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301); match(OPENPARENT);
				setState(302); expression(0);
				setState(303); match(CLOSEPARENT);
				}
				break;
			case 4:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305); func_call();
				}
				break;
			case 5:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306); var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(310); ((ExpContext)_localctx).op = match(EXP);
						setState(311); expression(10);
						}
						break;
					case 2:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(313);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(314); expression(10);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(316);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(317); expression(9);
						}
						break;
					case 4:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(319);
						((CompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(320); expression(8);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(322); ((AndContext)_localctx).op = match(AND);
						setState(323); expression(6);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(325); ((OrContext)_localctx).op = match(OR);
						setState(326); expression(5);
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		case 20: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);
		case 1: return precpred(_ctx, 9);
		case 2: return precpred(_ctx, 8);
		case 3: return precpred(_ctx, 7);
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\5\3\5\3\5\5\5N\n\5\3\6\3\6"+
		"\5\6R\n\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6f\n\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\6\7q\n\7\r"+
		"\7\16\7r\3\b\3\b\3\b\3\b\5\by\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0082"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ab\n\n\f\n\16\n\u00ae\13\n\3\n"+
		"\3\n\7\n\u00b2\n\n\f\n\16\n\u00b5\13\n\3\n\3\n\5\n\u00b9\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cc\n"+
		"\n\3\13\3\13\3\13\7\13\u00d1\n\13\f\13\16\13\u00d4\13\13\3\f\3\f\3\f\7"+
		"\f\u00d9\n\f\f\f\16\f\u00dc\13\f\3\r\3\r\3\r\5\r\u00e1\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u00eb\n\16\f\16\16\16\u00ee\13\16\5"+
		"\16\u00f0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u010a\n\21\f\21\16\21\u010d\13\21\5\21\u010f\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011e\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0129\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0136\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u014a\n\26\f\26\16\26\u014d\13\26\3\26\2\3*\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\7\3\2\24\30\3\2\31\35\3\2\n\13\4\2\b\t"+
		"\f\f\3\2\16\23\u016c\2\65\3\2\2\2\4:\3\2\2\2\6B\3\2\2\2\bM\3\2\2\2\nj"+
		"\3\2\2\2\fp\3\2\2\2\16t\3\2\2\2\20\u0099\3\2\2\2\22\u00cb\3\2\2\2\24\u00cd"+
		"\3\2\2\2\26\u00d5\3\2\2\2\30\u00e0\3\2\2\2\32\u00ef\3\2\2\2\34\u00f1\3"+
		"\2\2\2\36\u00fd\3\2\2\2 \u010e\3\2\2\2\"\u0110\3\2\2\2$\u0115\3\2\2\2"+
		"&\u011d\3\2\2\2(\u0128\3\2\2\2*\u0135\3\2\2\2,\60\5\4\3\2-/\7\66\2\2."+
		"-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3"+
		"\2\2\2\63,\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2"+
		"\2\67\65\3\2\2\289\5\6\4\29\3\3\2\2\2:;\7*\2\2;<\5$\23\2<=\7\60\2\2=>"+
		"\5\32\16\2>?\7\61\2\2?@\7\65\2\2@A\5&\24\2A\5\3\2\2\2BG\5\b\5\2CD\7\66"+
		"\2\2DF\5\b\5\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG\3"+
		"\2\2\2JN\5\22\n\2KN\5\34\17\2LN\5\36\20\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2"+
		"\2N\t\3\2\2\2OQ\5$\23\2PR\5\f\7\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\37"+
		"\2\2TU\5*\26\2Uk\3\2\2\2VX\5$\23\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2YZ\3\2"+
		"\2\2Z[\7\37\2\2[\\\7\36\2\2\\]\7\62\2\2]^\5&\24\2^_\7\63\2\2_`\7\60\2"+
		"\2`a\5*\26\2ab\7\61\2\2bk\3\2\2\2ce\5$\23\2df\5\f\7\2ed\3\2\2\2ef\3\2"+
		"\2\2fg\3\2\2\2gh\t\2\2\2hi\5*\26\2ik\3\2\2\2jO\3\2\2\2jV\3\2\2\2jc\3\2"+
		"\2\2k\13\3\2\2\2lm\7\62\2\2mn\5*\26\2no\7\63\2\2oq\3\2\2\2pl\3\2\2\2q"+
		"r\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tu\7\'\2\2ux\5$\23\2vw\7\65\2"+
		"\2wy\5&\24\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\37\2\2{|\5*\26\2|\17\3"+
		"\2\2\2}~\7&\2\2~\u0081\5$\23\2\177\u0080\7\65\2\2\u0080\u0082\5&\24\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\7\37\2\2\u0084\u0085\5*\26\2\u0085\u009a\3\2\2\2\u0086\u0087\7\'\2\2"+
		"\u0087\u008e\5$\23\2\u0088\u0089\7\65\2\2\u0089\u008a\7\36\2\2\u008a\u008b"+
		"\7\62\2\2\u008b\u008c\5&\24\2\u008c\u008d\7\63\2\2\u008d\u008f\3\2\2\2"+
		"\u008e\u0088\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\7\37\2\2\u0091\u0092\7\36\2\2\u0092\u0093\7\62\2\2\u0093\u0094\5&\24"+
		"\2\u0094\u0095\7\63\2\2\u0095\u0096\7\60\2\2\u0096\u0097\5*\26\2\u0097"+
		"\u0098\7\61\2\2\u0098\u009a\3\2\2\2\u0099}\3\2\2\2\u0099\u0086\3\2\2\2"+
		"\u009a\21\3\2\2\2\u009b\u00cc\5\16\b\2\u009c\u00cc\5\20\t\2\u009d\u00cc"+
		"\5\n\6\2\u009e\u00cc\5\"\22\2\u009f\u00a0\7)\2\2\u00a0\u00cc\5*\26\2\u00a1"+
		"\u00a2\7.\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\7/\2\2\u00a4\u00cc\3\2\2"+
		"\2\u00a5\u00a6\7 \2\2\u00a6\u00a7\7\60\2\2\u00a7\u00a8\5*\26\2\u00a8\u00ac"+
		"\7\61\2\2\u00a9\u00ab\7\66\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\u00b8\5\b\5\2\u00b0\u00b2\7\66\2\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b9\5\b\5\2\u00b8"+
		"\u00b3\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00cc\3\2\2\2\u00ba\u00bb\7\""+
		"\2\2\u00bb\u00bc\7\60\2\2\u00bc\u00bd\5*\26\2\u00bd\u00be\7\61\2\2\u00be"+
		"\u00bf\5\b\5\2\u00bf\u00cc\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1\u00c2\7\60"+
		"\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\5*\26\2\u00c5"+
		"\u00c6\7-\2\2\u00c6\u00c7\5*\26\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9\5\b"+
		"\5\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u009b\3\2\2\2\u00cb"+
		"\u009c\3\2\2\2\u00cb\u009d\3\2\2\2\u00cb\u009e\3\2\2\2\u00cb\u009f\3\2"+
		"\2\2\u00cb\u00a1\3\2\2\2\u00cb\u00a5\3\2\2\2\u00cb\u00ba\3\2\2\2\u00cb"+
		"\u00c0\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\23\3\2\2\2\u00cd\u00d2\5\30\r"+
		"\2\u00ce\u00cf\7\66\2\2\u00cf\u00d1\5\30\r\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\25\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\5\22\n\2\u00d6\u00d7\7\66\2\2\u00d7"+
		"\u00d9\5\22\n\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\27\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e1\5\22\n\2\u00de\u00df\7)\2\2\u00df\u00e1\5*\26\2\u00e0\u00dd\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4"+
		"\7\65\2\2\u00e4\u00ec\5&\24\2\u00e5\u00e6\7\64\2\2\u00e6\u00e7\5$\23\2"+
		"\u00e7\u00e8\7\65\2\2\u00e8\u00e9\5&\24\2\u00e9\u00eb\3\2\2\2\u00ea\u00e5"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2\u00f3\5$\23\2\u00f3\u00f4"+
		"\7\60\2\2\u00f4\u00f5\5\32\16\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\7\65"+
		"\2\2\u00f7\u00f8\5&\24\2\u00f8\u00f9\7\37\2\2\u00f9\u00fa\7.\2\2\u00fa"+
		"\u00fb\5\24\13\2\u00fb\u00fc\7/\2\2\u00fc\35\3\2\2\2\u00fd\u00fe\7(\2"+
		"\2\u00fe\u00ff\5$\23\2\u00ff\u0100\7\60\2\2\u0100\u0101\5\32\16\2\u0101"+
		"\u0102\7\61\2\2\u0102\u0103\7.\2\2\u0103\u0104\5\26\f\2\u0104\u0105\7"+
		"/\2\2\u0105\37\3\2\2\2\u0106\u010b\5*\26\2\u0107\u0108\7\64\2\2\u0108"+
		"\u010a\5*\26\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0106\3\2\2\2\u010e\u010f\3\2\2\2\u010f!\3\2\2\2\u0110\u0111\5$\23\2"+
		"\u0111\u0112\7\60\2\2\u0112\u0113\5 \21\2\u0113\u0114\7\61\2\2\u0114#"+
		"\3\2\2\2\u0115\u0116\7\67\2\2\u0116%\3\2\2\2\u0117\u011e\t\3\2\2\u0118"+
		"\u0119\7\36\2\2\u0119\u011a\7\62\2\2\u011a\u011b\5&\24\2\u011b\u011c\7"+
		"\63\2\2\u011c\u011e\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011e"+
		"\'\3\2\2\2\u011f\u0129\5$\23\2\u0120\u0129\7\3\2\2\u0121\u0129\7\4\2\2"+
		"\u0122\u0129\7\5\2\2\u0123\u0129\7\7\2\2\u0124\u0129\7\6\2\2\u0125\u0126"+
		"\5$\23\2\u0126\u0127\5\f\7\2\u0127\u0129\3\2\2\2\u0128\u011f\3\2\2\2\u0128"+
		"\u0120\3\2\2\2\u0128\u0121\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2"+
		"\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0129)\3\2\2\2\u012a\u012b"+
		"\b\26\1\2\u012b\u012c\t\4\2\2\u012c\u0136\5*\26\r\u012d\u012e\7%\2\2\u012e"+
		"\u0136\5*\26\b\u012f\u0130\7\60\2\2\u0130\u0131\5*\26\2\u0131\u0132\7"+
		"\61\2\2\u0132\u0136\3\2\2\2\u0133\u0136\5\"\22\2\u0134\u0136\5(\25\2\u0135"+
		"\u012a\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0134\3\2\2\2\u0136\u014b\3\2\2\2\u0137\u0138\f\f\2\2\u0138"+
		"\u0139\7\r\2\2\u0139\u014a\5*\26\f\u013a\u013b\f\13\2\2\u013b\u013c\t"+
		"\5\2\2\u013c\u014a\5*\26\f\u013d\u013e\f\n\2\2\u013e\u013f\t\4\2\2\u013f"+
		"\u014a\5*\26\13\u0140\u0141\f\t\2\2\u0141\u0142\t\6\2\2\u0142\u014a\5"+
		"*\26\n\u0143\u0144\f\7\2\2\u0144\u0145\7#\2\2\u0145\u014a\5*\26\b\u0146"+
		"\u0147\f\6\2\2\u0147\u0148\7$\2\2\u0148\u014a\5*\26\7\u0149\u0137\3\2"+
		"\2\2\u0149\u013a\3\2\2\2\u0149\u013d\3\2\2\2\u0149\u0140\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c+\3\2\2\2\u014d\u014b\3\2\2\2\37\60\65G"+
		"MQXejrx\u0081\u008e\u0099\u00ac\u00b3\u00b8\u00cb\u00d2\u00da\u00e0\u00ec"+
		"\u00ef\u010b\u010e\u011d\u0128\u0135\u0149\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}