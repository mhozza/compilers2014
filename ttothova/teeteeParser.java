// Generated from teetee.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class teeteeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, IF=6, ELIF=7, ELSE=8, FOR=9, IN=10, 
		DO=11, WHILE=12, RETURN=13, BREAK=14, CONTINUE=15, OPEN_PAR=16, CLOSE_PAR=17, 
		LBRACK=18, RBRACK=19, LBRACE=20, RBRACE=21, COMMA=22, SEMICOLON=23, ASSIGN=24, 
		ADD=25, SUB=26, MUL=27, DIV=28, MOD=29, EXP=30, AND=31, OR=32, NOT=33, 
		EQ=34, NE=35, LT=36, LE=37, GT=38, GE=39, VOID=40, INT=41, FLOAT=42, BOOL=43, 
		STRING=44, CHAR=45, NEWLINE=46, WHITESPACE=47, COMMENT=48, ID=49, DIGIT=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'string'", "'char'", "'int'", "'float'", "'bool'", "'if'", 
		"'elif'", "'else'", "'for'", "'in'", "'do'", "'while'", "'return'", "'break'", 
		"'continue'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", 
		"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "AND", "OR", "NOT", "'=='", 
		"'!='", "'<'", "LE", "'>'", "GE", "'void'", "INT", "FLOAT", "BOOL", "STRING", 
		"CHAR", "NEWLINE", "WHITESPACE", "COMMENT", "ID", "DIGIT"
	};
	public static final int
		RULE_init = 0, RULE_block = 1, RULE_statements = 2, RULE_functions = 3, 
		RULE_function = 4, RULE_ftype = 5, RULE_fname = 6, RULE_fparameters = 7, 
		RULE_aarray = 8, RULE_statement = 9, RULE_assignment = 10, RULE_array_resize = 11, 
		RULE_declaration = 12, RULE_decl_var = 13, RULE_return_statement = 14, 
		RULE_if_statement = 15, RULE_if_form = 16, RULE_for_statement = 17, RULE_while_statement = 18, 
		RULE_var = 19, RULE_expression = 20, RULE_callfunction = 21, RULE_type = 22, 
		RULE_id = 23;
	public static final String[] ruleNames = {
		"init", "block", "statements", "functions", "function", "ftype", "fname", 
		"fparameters", "aarray", "statement", "assignment", "array_resize", "declaration", 
		"decl_var", "return_statement", "if_statement", "if_form", "for_statement", 
		"while_statement", "var", "expression", "callfunction", "type", "id"
	};

	@Override
	public String getGrammarFileName() { return "teetee.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public teeteeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	 
		public InitContext() { }
		public void copyFrom(InitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitFunctionsContext extends InitContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public InitFunctionsContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterInitFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitInitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitInitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitStatementsContext extends InitContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public InitStatementsContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterInitStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitInitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitInitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new InitFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48); functions();
				}
				break;
			case 2:
				_localctx = new InitStatementsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49); statements();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode RBRACE() { return getToken(teeteeParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(teeteeParser.LBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(LBRACE);
			setState(53); statements();
			setState(54); match(RBRACE);
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
		public List<TerminalNode> NEWLINE() { return getTokens(teeteeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(teeteeParser.NEWLINE, i);
		}
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
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitStatements(this);
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
			setState(56); statement();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(57); match(NEWLINE);
				setState(58); statement();
				}
				}
				setState(63);
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

	public static class FunctionsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(teeteeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(teeteeParser.NEWLINE, i);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); function();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65); match(NEWLINE);
					}
					}
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(70); function();
				}
				}
				setState(75);
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

	public static class FunctionContext extends ParserRuleContext {
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(teeteeParser.OPEN_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(teeteeParser.CLOSE_PAR, 0); }
		public FtypeContext ftype() {
			return getRuleContext(FtypeContext.class,0);
		}
		public FparametersContext fparameters() {
			return getRuleContext(FparametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); ftype();
			setState(77); fname();
			setState(78); match(OPEN_PAR);
			setState(79); fparameters();
			setState(80); match(CLOSE_PAR);
			setState(81); block();
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

	public static class FtypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(teeteeParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(teeteeParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(teeteeParser.LBRACK, 0); }
		public FtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ftype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FtypeContext ftype() throws RecognitionException {
		FtypeContext _localctx = new FtypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ftype);
		int _la;
		try {
			setState(89);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); match(VOID);
				}
				break;
			case T__4:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); type();
				setState(87);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(85); match(LBRACK);
					setState(86); match(RBRACK);
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

	public static class FnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(teeteeParser.ID, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(ID);
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

	public static class FparametersContext extends ParserRuleContext {
		public List<AarrayContext> aarray() {
			return getRuleContexts(AarrayContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public AarrayContext aarray(int i) {
			return getRuleContext(AarrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teeteeParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(teeteeParser.COMMA, i);
		}
		public FparametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFparameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFparameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFparameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparametersContext fparameters() throws RecognitionException {
		FparametersContext _localctx = new FparametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fparameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) {
				{
				setState(93); type();
				setState(94); id();
				setState(95); aarray();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96); match(COMMA);
					setState(97); type();
					setState(98); id();
					setState(99); aarray();
					}
					}
					setState(105);
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

	public static class AarrayContext extends ParserRuleContext {
		public AarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aarray; }
	 
		public AarrayContext() { }
		public void copyFrom(AarrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayContext extends AarrayContext {
		public TerminalNode RBRACK() { return getToken(teeteeParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(teeteeParser.LBRACK, 0); }
		public ArrayContext(AarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotArrayContext extends AarrayContext {
		public NotArrayContext(AarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterNotArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitNotArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitNotArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AarrayContext aarray() throws RecognitionException {
		AarrayContext _localctx = new AarrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aarray);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108); match(LBRACK);
				setState(109); match(RBRACK);
				}
				break;
			case CLOSE_PAR:
			case COMMA:
				_localctx = new NotArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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
	public static class RetContext extends StatementContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public RetContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyContext extends StatementContext {
		public EmptyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResizeContext extends StatementContext {
		public Array_resizeContext array_resize() {
			return getRuleContext(Array_resizeContext.class,0);
		}
		public ResizeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterResize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitResize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitResize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(teeteeParser.BREAK, 0); }
		public BreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_stmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitBlock_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitBlock_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(teeteeParser.CONTINUE, 0); }
		public ContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_stmtContext extends StatementContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public While_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113); assignment();
				}
				break;
			case 2:
				_localctx = new ResizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114); array_resize();
				}
				break;
			case 3:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115); declaration();
				}
				break;
			case 4:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116); expression(0);
				}
				break;
			case 5:
				_localctx = new RetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117); return_statement();
				}
				break;
			case 6:
				_localctx = new Block_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118); block();
				}
				break;
			case 7:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(119); if_statement();
				}
				break;
			case 8:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(120); for_statement();
				}
				break;
			case 9:
				_localctx = new While_stmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(121); while_statement();
				}
				break;
			case 10:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(122); match(BREAK);
				}
				break;
			case 11:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(123); match(CONTINUE);
				}
				break;
			case 12:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 12);
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
	public static class AssignArrayContext extends AssignmentContext {
		public TerminalNode ASSIGN() { return getToken(teeteeParser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(teeteeParser.COMMA); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(teeteeParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LBRACK() { return getToken(teeteeParser.LBRACK, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(teeteeParser.COMMA, i);
		}
		public AssignArrayContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitAssignArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVarContext extends AssignmentContext {
		public TerminalNode ASSIGN() { return getToken(teeteeParser.ASSIGN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssignArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); id();
				setState(128); match(LBRACK);
				setState(129); expression(0);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(130); match(COMMA);
					setState(131); expression(0);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137); match(RBRACK);
				setState(138); match(ASSIGN);
				setState(139); expression(0);
				}
				break;
			case 2:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141); id();
				setState(142); match(ASSIGN);
				setState(143); expression(0);
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

	public static class Array_resizeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(teeteeParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(teeteeParser.LBRACK, 0); }
		public Array_resizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_resize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterArray_resize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitArray_resize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitArray_resize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_resizeContext array_resize() throws RecognitionException {
		Array_resizeContext _localctx = new Array_resizeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_resize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); id();
			setState(148); match(LBRACK);
			setState(149); expression(0);
			setState(150); match(RBRACK);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(teeteeParser.ASSIGN, 0); }
		public Decl_varContext decl_var() {
			return getRuleContext(Decl_varContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); decl_var(0);
			setState(155);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(153); match(ASSIGN);
				setState(154); expression(0);
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

	public static class Decl_varContext extends ParserRuleContext {
		public Decl_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_var; }
	 
		public Decl_varContext() { }
		public void copyFrom(Decl_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclContext extends Decl_varContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(Decl_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclContext extends Decl_varContext {
		public Decl_varContext decl_var() {
			return getRuleContext(Decl_varContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(teeteeParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(teeteeParser.LBRACK, 0); }
		public ArrayDeclContext(Decl_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_varContext decl_var() throws RecognitionException {
		return decl_var(0);
	}

	private Decl_varContext decl_var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Decl_varContext _localctx = new Decl_varContext(_ctx, _parentState);
		Decl_varContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_decl_var, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VarDeclContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(158); type();
			setState(159); id();
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayDeclContext(new Decl_varContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_decl_var);
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162); match(LBRACK);
					setState(164);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) {
						{
						setState(163); expression(0);
						}
					}

					setState(166); match(RBRACK);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(teeteeParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(RETURN);
			setState(174);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(173); expression(0);
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> ELIF() { return getTokens(teeteeParser.ELIF); }
		public TerminalNode ELSE() { return getToken(teeteeParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(teeteeParser.IF, 0); }
		public If_formContext if_form(int i) {
			return getRuleContext(If_formContext.class,i);
		}
		public TerminalNode ELIF(int i) {
			return getToken(teeteeParser.ELIF, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<If_formContext> if_form() {
			return getRuleContexts(If_formContext.class);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(IF);
			setState(177); expression(0);
			setState(178); if_form();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179); match(ELIF);
					setState(180); expression(0);
					setState(181); if_form();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(188); match(ELSE);
				setState(189); if_form();
				}
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

	public static class If_formContext extends ParserRuleContext {
		public If_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_form; }
	 
		public If_formContext() { }
		public void copyFrom(If_formContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShortIfContext extends If_formContext {
		public TerminalNode SEMICOLON() { return getToken(teeteeParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(teeteeParser.NEWLINE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ShortIfContext(If_formContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitShortIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongIfContext extends If_formContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LongIfContext(If_formContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterLongIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitLongIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitLongIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_formContext if_form() throws RecognitionException {
		If_formContext _localctx = new If_formContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_form);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case SEMICOLON:
				_localctx = new ShortIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192); match(SEMICOLON);
				setState(194);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(193); match(NEWLINE);
					}
					break;
				}
				setState(196); statement();
				}
				break;
			case LBRACE:
				_localctx = new LongIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197); block();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(teeteeParser.DO, 0); }
		public TerminalNode COMMA() { return getToken(teeteeParser.COMMA, 0); }
		public TerminalNode FOR() { return getToken(teeteeParser.FOR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(teeteeParser.OPEN_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IN() { return getToken(teeteeParser.IN, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(teeteeParser.CLOSE_PAR, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(FOR);
			setState(201); id();
			setState(202); match(IN);
			setState(203); match(OPEN_PAR);
			setState(204); expression(0);
			setState(205); match(COMMA);
			setState(206); expression(0);
			setState(207); match(CLOSE_PAR);
			setState(210);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(208); match(DO);
				setState(209); expression(0);
				}
			}

			setState(212); block();
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
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	 
		public While_statementContext() { }
		public void copyFrom(While_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhileContext extends While_statementContext {
		public TerminalNode DO() { return getToken(teeteeParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(teeteeParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileContext(While_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends While_statementContext {
		public TerminalNode WHILE() { return getToken(teeteeParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(While_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_statement);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214); match(WHILE);
				setState(215); expression(0);
				setState(216); block();
				}
				break;
			case DO:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(DO);
				setState(219); block();
				setState(220); match(WHILE);
				setState(221); expression(0);
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
	public static class ArrayVarContext extends VarContext {
		public List<TerminalNode> COMMA() { return getTokens(teeteeParser.COMMA); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(teeteeParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LBRACK() { return getToken(teeteeParser.LBRACK, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(teeteeParser.COMMA, i);
		}
		public ArrayVarContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterArrayVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitArrayVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitArrayVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleVarContext extends VarContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SimpleVarContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterSimpleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitSimpleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitSimpleVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		int _la;
		try {
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ArrayVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225); id();
				setState(226); match(LBRACK);
				setState(227); expression(0);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(228); match(COMMA);
					setState(229); expression(0);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235); match(RBRACK);
				}
				break;
			case 2:
				_localctx = new SimpleVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237); id();
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
	public static class ParContext extends ExpressionContext {
		public TerminalNode OPEN_PAR() { return getToken(teeteeParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(teeteeParser.CLOSE_PAR, 0); }
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public TerminalNode SUB() { return getToken(teeteeParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(teeteeParser.ADD, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComContext extends ExpressionContext {
		public Token op;
		public TerminalNode GE() { return getToken(teeteeParser.GE, 0); }
		public TerminalNode LT() { return getToken(teeteeParser.LT, 0); }
		public TerminalNode GT() { return getToken(teeteeParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(teeteeParser.LE, 0); }
		public TerminalNode EQ() { return getToken(teeteeParser.EQ, 0); }
		public TerminalNode NE() { return getToken(teeteeParser.NE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ComContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitCom(this);
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
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(teeteeParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(teeteeParser.MOD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(teeteeParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(teeteeParser.MUL, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(teeteeParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(teeteeParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(teeteeParser.FLOAT, 0); }
		public FloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(teeteeParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(teeteeParser.BOOL, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(teeteeParser.CHAR, 0); }
		public CharContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(teeteeParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ExpressionContext {
		public Token op;
		public TerminalNode EXP() { return getToken(teeteeParser.EXP, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitExp(this);
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
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(242); expression(16);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); ((NotContext)_localctx).op = match(NOT);
				setState(244); expression(11);
				}
				break;
			case 3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245); match(OPEN_PAR);
				setState(246); expression(0);
				setState(247); match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249); callfunction();
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250); match(INT);
				}
				break;
			case 6:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); match(FLOAT);
				}
				break;
			case 7:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252); match(BOOL);
				}
				break;
			case 8:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253); match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255); var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(259); ((ExpContext)_localctx).op = match(EXP);
						setState(260); expression(15);
						}
						break;
					case 2:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(262);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(263); expression(14);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(265);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(266); expression(13);
						}
						break;
					case 4:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(268); ((AndContext)_localctx).op = match(AND);
						setState(269); expression(11);
						}
						break;
					case 5:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(271); ((OrContext)_localctx).op = match(OR);
						setState(272); expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ComContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(274);
						((ComContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
							((ComContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(275); expression(9);
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class CallfunctionContext extends ParserRuleContext {
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(teeteeParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(teeteeParser.OPEN_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CLOSE_PAR() { return getToken(teeteeParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(teeteeParser.COMMA, i);
		}
		public CallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallfunctionContext callfunction() throws RecognitionException {
		CallfunctionContext _localctx = new CallfunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_callfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); fname();
			setState(282); match(OPEN_PAR);
			setState(291);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(283); expression(0);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284); match(COMMA);
					setState(285); expression(0);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(293); match(CLOSE_PAR);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) ) {
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(teeteeParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teeteeListener ) ((teeteeListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof teeteeVisitor ) return ((teeteeVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13: return decl_var_sempred((Decl_varContext)_localctx, predIndex);
		case 20: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 14);
		case 2: return precpred(_ctx, 13);
		case 3: return precpred(_ctx, 12);
		case 4: return precpred(_ctx, 10);
		case 5: return precpred(_ctx, 9);
		case 6: return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean decl_var_sempred(Decl_varContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u012e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13"+
		"\4\3\5\3\5\6\5E\n\5\r\5\16\5F\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7Z\n\7\5\7\\\n\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\5\tm\n\t\3\n\3\n\3\n\5"+
		"\nr\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0080\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\5\16\u009e\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a7"+
		"\n\17\3\17\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17\3\20\3\20\5\20\u00b1"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ba\n\21\f\21\16\21\u00bd"+
		"\13\21\3\21\3\21\5\21\u00c1\n\21\3\22\3\22\5\22\u00c5\n\22\3\22\3\22\5"+
		"\22\u00c9\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00d5\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00e2\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u00e9\n\25\f\25\16\25\u00ec"+
		"\13\25\3\25\3\25\3\25\5\25\u00f1\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0103\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u0117\n\26\f\26\16\26\u011a\13\26\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0121\n\27\f\27\16\27\u0124\13\27\5\27\u0126\n\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\2\4\34*\32\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\2\6\3\2\33\34\3\2\35\37\3\2$)\3\2\3\7\u0148\2\64"+
		"\3\2\2\2\4\66\3\2\2\2\6:\3\2\2\2\bB\3\2\2\2\nN\3\2\2\2\f[\3\2\2\2\16]"+
		"\3\2\2\2\20l\3\2\2\2\22q\3\2\2\2\24\177\3\2\2\2\26\u0093\3\2\2\2\30\u0095"+
		"\3\2\2\2\32\u009a\3\2\2\2\34\u009f\3\2\2\2\36\u00ae\3\2\2\2 \u00b2\3\2"+
		"\2\2\"\u00c8\3\2\2\2$\u00ca\3\2\2\2&\u00e1\3\2\2\2(\u00f0\3\2\2\2*\u0102"+
		"\3\2\2\2,\u011b\3\2\2\2.\u0129\3\2\2\2\60\u012b\3\2\2\2\62\65\5\b\5\2"+
		"\63\65\5\6\4\2\64\62\3\2\2\2\64\63\3\2\2\2\65\3\3\2\2\2\66\67\7\26\2\2"+
		"\678\5\6\4\289\7\27\2\29\5\3\2\2\2:?\5\24\13\2;<\7\60\2\2<>\5\24\13\2"+
		"=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BK\5\n\6"+
		"\2CE\7\60\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\5\n"+
		"\6\2ID\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NO\5"+
		"\f\7\2OP\5\16\b\2PQ\7\22\2\2QR\5\20\t\2RS\7\23\2\2ST\5\4\3\2T\13\3\2\2"+
		"\2U\\\7*\2\2VY\5.\30\2WX\7\24\2\2XZ\7\25\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3"+
		"\2\2\2[U\3\2\2\2[V\3\2\2\2\\\r\3\2\2\2]^\7\63\2\2^\17\3\2\2\2_`\5.\30"+
		"\2`a\5\60\31\2ai\5\22\n\2bc\7\30\2\2cd\5.\30\2de\5\60\31\2ef\5\22\n\2"+
		"fh\3\2\2\2gb\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"l_\3\2\2\2lm\3\2\2\2m\21\3\2\2\2no\7\24\2\2or\7\25\2\2pr\3\2\2\2qn\3\2"+
		"\2\2qp\3\2\2\2r\23\3\2\2\2s\u0080\5\26\f\2t\u0080\5\30\r\2u\u0080\5\32"+
		"\16\2v\u0080\5*\26\2w\u0080\5\36\20\2x\u0080\5\4\3\2y\u0080\5 \21\2z\u0080"+
		"\5$\23\2{\u0080\5&\24\2|\u0080\7\20\2\2}\u0080\7\21\2\2~\u0080\3\2\2\2"+
		"\177s\3\2\2\2\177t\3\2\2\2\177u\3\2\2\2\177v\3\2\2\2\177w\3\2\2\2\177"+
		"x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2"+
		"\2\2\177~\3\2\2\2\u0080\25\3\2\2\2\u0081\u0082\5\60\31\2\u0082\u0083\7"+
		"\24\2\2\u0083\u0088\5*\26\2\u0084\u0085\7\30\2\2\u0085\u0087\5*\26\2\u0086"+
		"\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\25\2\2\u008c"+
		"\u008d\7\32\2\2\u008d\u008e\5*\26\2\u008e\u0094\3\2\2\2\u008f\u0090\5"+
		"\60\31\2\u0090\u0091\7\32\2\2\u0091\u0092\5*\26\2\u0092\u0094\3\2\2\2"+
		"\u0093\u0081\3\2\2\2\u0093\u008f\3\2\2\2\u0094\27\3\2\2\2\u0095\u0096"+
		"\5\60\31\2\u0096\u0097\7\24\2\2\u0097\u0098\5*\26\2\u0098\u0099\7\25\2"+
		"\2\u0099\31\3\2\2\2\u009a\u009d\5\34\17\2\u009b\u009c\7\32\2\2\u009c\u009e"+
		"\5*\26\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\33\3\2\2\2\u009f"+
		"\u00a0\b\17\1\2\u00a0\u00a1\5.\30\2\u00a1\u00a2\5\60\31\2\u00a2\u00ab"+
		"\3\2\2\2\u00a3\u00a4\f\4\2\2\u00a4\u00a6\7\24\2\2\u00a5\u00a7\5*\26\2"+
		"\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa"+
		"\7\25\2\2\u00a9\u00a3\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\35\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0"+
		"\7\17\2\2\u00af\u00b1\5*\26\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\37\3\2\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5*\26\2\u00b4\u00bb"+
		"\5\"\22\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\5*\26\2\u00b7\u00b8\5\"\22\2"+
		"\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7\n\2\2\u00bf\u00c1\5\"\22\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1!\3\2\2\2\u00c2\u00c4\7\31\2\2\u00c3\u00c5\7\60\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\5\24"+
		"\13\2\u00c7\u00c9\5\4\3\2\u00c8\u00c2\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"#\3\2\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc\5\60\31\2\u00cc\u00cd\7\f\2"+
		"\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\30\2\2\u00d0"+
		"\u00d1\5*\26\2\u00d1\u00d4\7\23\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d5\5"+
		"*\26\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\5\4\3\2\u00d7%\3\2\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\5*\26\2"+
		"\u00da\u00db\5\4\3\2\u00db\u00e2\3\2\2\2\u00dc\u00dd\7\r\2\2\u00dd\u00de"+
		"\5\4\3\2\u00de\u00df\7\16\2\2\u00df\u00e0\5*\26\2\u00e0\u00e2\3\2\2\2"+
		"\u00e1\u00d8\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2\'\3\2\2\2\u00e3\u00e4\5"+
		"\60\31\2\u00e4\u00e5\7\24\2\2\u00e5\u00ea\5*\26\2\u00e6\u00e7\7\30\2\2"+
		"\u00e7\u00e9\5*\26\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7\25\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1\5\60\31\2\u00f0\u00e3"+
		"\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1)\3\2\2\2\u00f2\u00f3\b\26\1\2\u00f3"+
		"\u00f4\t\2\2\2\u00f4\u0103\5*\26\22\u00f5\u00f6\7#\2\2\u00f6\u0103\5*"+
		"\26\r\u00f7\u00f8\7\22\2\2\u00f8\u00f9\5*\26\2\u00f9\u00fa\7\23\2\2\u00fa"+
		"\u0103\3\2\2\2\u00fb\u0103\5,\27\2\u00fc\u0103\7+\2\2\u00fd\u0103\7,\2"+
		"\2\u00fe\u0103\7-\2\2\u00ff\u0103\7/\2\2\u0100\u0103\7.\2\2\u0101\u0103"+
		"\5(\25\2\u0102\u00f2\3\2\2\2\u0102\u00f5\3\2\2\2\u0102\u00f7\3\2\2\2\u0102"+
		"\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2"+
		"\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0118\3\2\2\2\u0104\u0105\f\20\2\2\u0105\u0106\7 \2\2\u0106\u0117\5*"+
		"\26\21\u0107\u0108\f\17\2\2\u0108\u0109\t\3\2\2\u0109\u0117\5*\26\20\u010a"+
		"\u010b\f\16\2\2\u010b\u010c\t\2\2\2\u010c\u0117\5*\26\17\u010d\u010e\f"+
		"\f\2\2\u010e\u010f\7!\2\2\u010f\u0117\5*\26\r\u0110\u0111\f\13\2\2\u0111"+
		"\u0112\7\"\2\2\u0112\u0117\5*\26\f\u0113\u0114\f\n\2\2\u0114\u0115\t\4"+
		"\2\2\u0115\u0117\5*\26\13\u0116\u0104\3\2\2\2\u0116\u0107\3\2\2\2\u0116"+
		"\u010a\3\2\2\2\u0116\u010d\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"+\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\5\16\b\2\u011c\u0125\7\22\2"+
		"\2\u011d\u0122\5*\26\2\u011e\u011f\7\30\2\2\u011f\u0121\5*\26\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u011d\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\23\2\2\u0128-\3\2\2\2"+
		"\u0129\u012a\t\5\2\2\u012a/\3\2\2\2\u012b\u012c\7\63\2\2\u012c\61\3\2"+
		"\2\2\37\64?FKY[ilq\177\u0088\u0093\u009d\u00a6\u00ab\u00b0\u00bb\u00c0"+
		"\u00c4\u00c8\u00d4\u00e1\u00ea\u00f0\u0102\u0116\u0118\u0122\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}