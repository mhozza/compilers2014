// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArrowsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, INDENT=2, DEDENT=3, COLON=4, SEMICOLON=5, LA=6, RA=7, LPA=8, LSA=9, 
		LDA=10, LMA=11, LRA=12, RPA=13, RSA=14, RDA=15, RMA=16, RRA=17, SWAP=18, 
		IS=19, ISL=20, OS=21, OL=22, OSL=23, RET=24, INT=25, MUL=26, DIV=27, ADD=28, 
		SUB=29, LR=30, RR=31, DOTS=32, WHITESPACE=33, EQ=34, NEQ=35, GEQ=36, SEQ=37, 
		GT=38, ST=39, IF=40, ELSE=41, WHILE=42, FOR=43, PASS=44, AND=45, OR=46, 
		NOT=47, PAREN_OPEN=48, PAREN_CLOSE=49, COMMA=50, QUOT=51, QO=52, STRING=53, 
		NEWLINE=54, ANYSTRING=55, COMMENT=56, SPACES=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'def'", "'{'", "'}'", "':'", "';'", "'>>'", "'<<'", "'+>'", 
		"'->'", "'/>'", "'*>'", "'&>'", "'<+'", "'<-'", "'</'", "'<*'", "'<&'", 
		"'<->'", "'@>'", "'$>'", "'<@'", "'<!'", "'<$'", "'ret'", "INT", "'*'", 
		"'/'", "'+'", "'-'", "'['", "']'", "'..'", "WHITESPACE", "'='", "'!='", 
		"'>='", "'<='", "'>'", "'<'", "'if'", "'else'", "'while'", "'for'", "'pass'", 
		"'&'", "'|'", "'!'", "'('", "')'", "','", "'\"'", "'?'", "STRING", "'\n'", 
		"ANYSTRING", "COMMENT", "SPACES"
	};
	public static final int
		RULE_init = 0, RULE_fun = 1, RULE_statements = 2, RULE_block = 3, RULE_statement = 4, 
		RULE_singleInput = 5, RULE_singleOutput = 6, RULE_arrow = 7, RULE_inputArrow = 8, 
		RULE_outputArrow = 9, RULE_otherArrow = 10, RULE_expression = 11, RULE_variable = 12, 
		RULE_quotedString = 13, RULE_lvalue = 14, RULE_args = 15, RULE_params = 16, 
		RULE_range = 17, RULE_singleRange = 18, RULE_boundedRange = 19;
	public static final String[] ruleNames = {
		"init", "fun", "statements", "block", "statement", "singleInput", "singleOutput", 
		"arrow", "inputArrow", "outputArrow", "otherArrow", "expression", "variable", 
		"quotedString", "lvalue", "args", "params", "range", "singleRange", "boundedRange"
	};

	@Override
	public String getGrammarFileName() { return "Arrows.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArrowsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitInit(this);
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(40); fun();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); statements();
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

	public static class FunContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ArrowsParser.PAREN_CLOSE, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DEF() { return getToken(ArrowsParser.DEF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ArrowsParser.PAREN_OPEN, 0); }
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(DEF);
			setState(49); lvalue();
			setState(50); match(PAREN_OPEN);
			setState(51); args();
			setState(52); match(PAREN_CLOSE);
			setState(53); match(COLON);
			setState(54); statement();
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
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
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); statement();
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(57); match(NEWLINE);
					setState(58); statement();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public TerminalNode INDENT() { return getToken(ArrowsParser.INDENT, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(ArrowsParser.DEDENT, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(INDENT);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(65); match(NEWLINE);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); statements();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(72); match(NEWLINE);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78); match(DEDENT);
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
	public static class InputContext extends StatementContext {
		public SingleInputContext singleInput(int i) {
			return getRuleContext(SingleInputContext.class,i);
		}
		public List<SingleInputContext> singleInput() {
			return getRuleContexts(SingleInputContext.class);
		}
		public InputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlckContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlckContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterBlck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitBlck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitBlck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ArrowsParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArwContext extends StatementContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrowContext arrow(int i) {
			return getRuleContext(ArrowContext.class,i);
		}
		public List<ArrowContext> arrow() {
			return getRuleContexts(ArrowContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArwContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterArw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitArw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitArw(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public TerminalNode RET() { return getToken(ArrowsParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputContext extends StatementContext {
		public List<SingleOutputContext> singleOutput() {
			return getRuleContexts(SingleOutputContext.class);
		}
		public SingleOutputContext singleOutput(int i) {
			return getRuleContext(SingleOutputContext.class,i);
		}
		public OutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public Token op;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RA() { return getToken(ArrowsParser.RA, 0); }
		public TerminalNode FOR() { return getToken(ArrowsParser.FOR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public TerminalNode LA() { return getToken(ArrowsParser.LA, 0); }
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public StatementContext tr;
		public StatementContext fa;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode ELSE() { return getToken(ArrowsParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(80); singleInput();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(85); singleOutput();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(88); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				_localctx = new ArwContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90); expression(0);
				setState(91); arrow();
				setState(92); expression(0);
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(93); arrow();
						setState(94); expression(0);
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;

			case 4:
				_localctx = new BlckContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101); block();
				}
				break;

			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102); expression(0);
				setState(103); match(COLON);
				setState(104); ((IfContext)_localctx).tr = statement();
				setState(107);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(105); match(ELSE);
					setState(106); ((IfContext)_localctx).fa = statement();
					}
					break;
				}
				}
				break;

			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(109); match(WHILE);
				setState(110); expression(0);
				setState(111); match(COLON);
				setState(112); statement();
				}
				break;

			case 7:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(114); match(FOR);
				setState(115); expression(0);
				setState(116);
				((ForContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LA || _la==RA) ) {
					((ForContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(117); range();
				setState(118); match(COLON);
				setState(119); statement();
				}
				break;

			case 8:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(121); match(RET);
				setState(122); expression(0);
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

	public static class SingleInputContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(ArrowsParser.COMMA); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public InputArrowContext inputArrow() {
			return getRuleContext(InputArrowContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ArrowsParser.COMMA, i);
		}
		public SingleInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterSingleInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitSingleInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitSingleInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleInputContext singleInput() throws RecognitionException {
		SingleInputContext _localctx = new SingleInputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); inputArrow();
			setState(126); variable();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127); match(COMMA);
				setState(128); variable();
				}
				}
				setState(133);
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

	public static class SingleOutputContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArrowsParser.COMMA); }
		public OutputArrowContext outputArrow() {
			return getRuleContext(OutputArrowContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrowsParser.COMMA, i);
		}
		public SingleOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterSingleOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitSingleOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitSingleOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleOutputContext singleOutput() throws RecognitionException {
		SingleOutputContext _localctx = new SingleOutputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); outputArrow();
			setState(135); expression(0);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136); match(COMMA);
				setState(137); expression(0);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(143); match(COLON);
				setState(144); quotedString();
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

	public static class ArrowContext extends ParserRuleContext {
		public OtherArrowContext otherArrow() {
			return getRuleContext(OtherArrowContext.class,0);
		}
		public OutputArrowContext outputArrow() {
			return getRuleContext(OutputArrowContext.class,0);
		}
		public InputArrowContext inputArrow() {
			return getRuleContext(InputArrowContext.class,0);
		}
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrow);
		try {
			setState(150);
			switch (_input.LA(1)) {
			case LA:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); inputArrow();
				}
				break;
			case RA:
			case OS:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); outputArrow();
				}
				break;
			case LPA:
			case LSA:
			case LDA:
			case LMA:
			case LRA:
			case RPA:
			case RSA:
			case RDA:
			case RMA:
			case RRA:
			case SWAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); otherArrow();
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

	public static class InputArrowContext extends ParserRuleContext {
		public Token op;
		public TerminalNode IS() { return getToken(ArrowsParser.IS, 0); }
		public TerminalNode LA() { return getToken(ArrowsParser.LA, 0); }
		public InputArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterInputArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitInputArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitInputArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArrowContext inputArrow() throws RecognitionException {
		InputArrowContext _localctx = new InputArrowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inputArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((InputArrowContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==LA || _la==IS) ) {
				((InputArrowContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	public static class OutputArrowContext extends ParserRuleContext {
		public Token op;
		public TerminalNode RA() { return getToken(ArrowsParser.RA, 0); }
		public TerminalNode OS() { return getToken(ArrowsParser.OS, 0); }
		public OutputArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterOutputArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitOutputArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitOutputArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputArrowContext outputArrow() throws RecognitionException {
		OutputArrowContext _localctx = new OutputArrowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_outputArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((OutputArrowContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==RA || _la==OS) ) {
				((OutputArrowContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	public static class OtherArrowContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LRA() { return getToken(ArrowsParser.LRA, 0); }
		public TerminalNode RSA() { return getToken(ArrowsParser.RSA, 0); }
		public TerminalNode SWAP() { return getToken(ArrowsParser.SWAP, 0); }
		public TerminalNode LMA() { return getToken(ArrowsParser.LMA, 0); }
		public TerminalNode RRA() { return getToken(ArrowsParser.RRA, 0); }
		public TerminalNode LPA() { return getToken(ArrowsParser.LPA, 0); }
		public TerminalNode LDA() { return getToken(ArrowsParser.LDA, 0); }
		public TerminalNode LSA() { return getToken(ArrowsParser.LSA, 0); }
		public TerminalNode RMA() { return getToken(ArrowsParser.RMA, 0); }
		public TerminalNode RDA() { return getToken(ArrowsParser.RDA, 0); }
		public TerminalNode RPA() { return getToken(ArrowsParser.RPA, 0); }
		public OtherArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterOtherArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitOtherArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitOtherArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherArrowContext otherArrow() throws RecognitionException {
		OtherArrowContext _localctx = new OtherArrowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_otherArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((OtherArrowContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPA) | (1L << LSA) | (1L << LDA) | (1L << LMA) | (1L << LRA) | (1L << RPA) | (1L << RSA) | (1L << RDA) | (1L << RMA) | (1L << RRA) | (1L << SWAP))) != 0)) ) {
				((OtherArrowContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class EqContext extends ExpressionContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(ArrowsParser.NEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ST() { return getToken(ArrowsParser.ST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(ArrowsParser.GT, 0); }
		public TerminalNode EQ() { return getToken(ArrowsParser.EQ, 0); }
		public EqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ArrowsParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArrowsParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends ExpressionContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public CallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ArrowsParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitOr(this);
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
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitUna(this);
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
		public TerminalNode SUB() { return getToken(ArrowsParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(ArrowsParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(ArrowsParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ArrowsParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ArrowsParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QstrContext extends ExpressionContext {
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public QstrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterQstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitQstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitQstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ArrowsParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(ArrowsParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(160); expression(12);
				}
				break;

			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); ((NotContext)_localctx).op = match(NOT);
				setState(162); expression(9);
				}
				break;

			case 3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); match(PAREN_OPEN);
				setState(164); expression(0);
				setState(165); match(PAREN_CLOSE);
				}
				break;

			case 4:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167); lvalue();
				setState(168); match(PAREN_OPEN);
				setState(169); params();
				setState(170); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172); variable();
				}
				break;

			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173); match(INT);
				}
				break;

			case 7:
				{
				_localctx = new QstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174); quotedString();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(178);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(179); expression(12);
						}
						break;

					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(181);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(182); expression(11);
						}
						break;

					case 3:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(184); ((AndContext)_localctx).op = match(AND);
						setState(185); expression(9);
						}
						break;

					case 4:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(187); ((OrContext)_localctx).op = match(OR);
						setState(188); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new EqContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(190);
						((EqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << ST))) != 0)) ) {
							((EqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(191); expression(7);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197); lvalue();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(198); range();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class QuotedStringContext extends ParserRuleContext {
		public Token content;
		public TerminalNode ANYSTRING() { return getToken(ArrowsParser.ANYSTRING, 0); }
		public TerminalNode QUOT(int i) {
			return getToken(ArrowsParser.QUOT, i);
		}
		public List<TerminalNode> QUOT() { return getTokens(ArrowsParser.QUOT); }
		public TerminalNode STRING() { return getToken(ArrowsParser.STRING, 0); }
		public QuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterQuotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitQuotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitQuotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedStringContext quotedString() throws RecognitionException {
		QuotedStringContext _localctx = new QuotedStringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_quotedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(QUOT);
			setState(206);
			_la = _input.LA(1);
			if (_la==STRING || _la==ANYSTRING) {
				{
				setState(205);
				((QuotedStringContext)_localctx).content = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ANYSTRING) ) {
					((QuotedStringContext)_localctx).content = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(208); match(QUOT);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ArrowsParser.STRING, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(STRING);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(ArrowsParser.COMMA); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ArrowsParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(212); variable();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(213); match(COMMA);
					setState(214); variable();
					}
					}
					setState(219);
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

	public static class ParamsContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArrowsParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ArrowsParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << QUOT) | (1L << STRING))) != 0)) {
				{
				setState(222); expression(0);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(223); match(COMMA);
					setState(224); expression(0);
					}
					}
					setState(229);
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

	public static class RangeContext extends ParserRuleContext {
		public BoundedRangeContext boundedRange() {
			return getRuleContext(BoundedRangeContext.class,0);
		}
		public SingleRangeContext singleRange() {
			return getRuleContext(SingleRangeContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		try {
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); singleRange();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); boundedRange();
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

	public static class SingleRangeContext extends ParserRuleContext {
		public TerminalNode LR() { return getToken(ArrowsParser.LR, 0); }
		public TerminalNode RR() { return getToken(ArrowsParser.RR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterSingleRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitSingleRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitSingleRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleRangeContext singleRange() throws RecognitionException {
		SingleRangeContext _localctx = new SingleRangeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singleRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(LR);
			setState(237); expression(0);
			setState(238); match(RR);
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

	public static class BoundedRangeContext extends ParserRuleContext {
		public TerminalNode LR() { return getToken(ArrowsParser.LR, 0); }
		public TerminalNode DOTS() { return getToken(ArrowsParser.DOTS, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR() { return getToken(ArrowsParser.RR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoundedRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundedRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterBoundedRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitBoundedRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitBoundedRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundedRangeContext boundedRange() throws RecognitionException {
		BoundedRangeContext _localctx = new BoundedRangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boundedRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(LR);
			setState(241); expression(0);
			setState(242); match(DOTS);
			setState(243); expression(0);
			setState(244); match(RR);
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
		case 11: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 11 >= _localctx._p;

		case 1: return 10 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u00f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3"+
		"\5\7\5E\n\5\f\5\16\5H\13\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5\3\6"+
		"\6\6T\n\6\r\6\16\6U\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"c\n\6\f\6\16\6f\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\7\7"+
		"\u0084\n\7\f\7\16\7\u0087\13\7\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b"+
		"\u0090\13\b\3\b\3\b\5\b\u0094\n\b\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6\13\r\3\16\3\16\7\16\u00ca"+
		"\n\16\f\16\16\16\u00cd\13\16\3\17\3\17\5\17\u00d1\n\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u00da\n\21\f\21\16\21\u00dd\13\21\5\21\u00df"+
		"\n\21\3\22\3\22\3\22\7\22\u00e4\n\22\f\22\16\22\u00e7\13\22\5\22\u00e9"+
		"\n\22\3\23\3\23\5\23\u00ed\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\n"+
		"\3\2\b\t\4\2\b\b\25\25\4\2\t\t\27\27\3\2\n\24\3\2\36\37\3\2\34\35\4\2"+
		"$%()\4\2\67\6799\u010a\2-\3\2\2\2\4\62\3\2\2\2\6:\3\2\2\2\bB\3\2\2\2\n"+
		"}\3\2\2\2\f\177\3\2\2\2\16\u0088\3\2\2\2\20\u0098\3\2\2\2\22\u009a\3\2"+
		"\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2\2\30\u00b1\3\2\2\2\32\u00c7\3\2\2"+
		"\2\34\u00ce\3\2\2\2\36\u00d4\3\2\2\2 \u00de\3\2\2\2\"\u00e8\3\2\2\2$\u00ec"+
		"\3\2\2\2&\u00ee\3\2\2\2(\u00f2\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\5\6\4\2\61\3\3\2\2\2\62"+
		"\63\7\3\2\2\63\64\5\36\20\2\64\65\7\62\2\2\65\66\5 \21\2\66\67\7\63\2"+
		"\2\678\7\6\2\289\5\n\6\29\5\3\2\2\2:?\5\n\6\2;<\78\2\2<>\5\n\6\2=;\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BF\7\4\2\2CE\7"+
		"8\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IM\5"+
		"\6\4\2JL\78\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3"+
		"\2\2\2PQ\7\5\2\2Q\t\3\2\2\2RT\5\f\7\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV"+
		"\3\2\2\2V~\3\2\2\2WY\5\16\b\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[~\3\2\2\2\\]\5\30\r\2]^\5\20\t\2^d\5\30\r\2_`\5\20\t\2`a\5\30\r\2ac\3"+
		"\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e~\3\2\2\2fd\3\2\2\2g~\5"+
		"\b\5\2hi\5\30\r\2ij\7\6\2\2jm\5\n\6\2kl\7+\2\2ln\5\n\6\2mk\3\2\2\2mn\3"+
		"\2\2\2n~\3\2\2\2op\7,\2\2pq\5\30\r\2qr\7\6\2\2rs\5\n\6\2s~\3\2\2\2tu\7"+
		"-\2\2uv\5\30\r\2vw\t\2\2\2wx\5$\23\2xy\7\6\2\2yz\5\n\6\2z~\3\2\2\2{|\7"+
		"\32\2\2|~\5\30\r\2}S\3\2\2\2}X\3\2\2\2}\\\3\2\2\2}g\3\2\2\2}h\3\2\2\2"+
		"}o\3\2\2\2}t\3\2\2\2}{\3\2\2\2~\13\3\2\2\2\177\u0080\5\22\n\2\u0080\u0085"+
		"\5\32\16\2\u0081\u0082\7\64\2\2\u0082\u0084\5\32\16\2\u0083\u0081\3\2"+
		"\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\r\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\24\13\2\u0089\u008e\5\30"+
		"\r\2\u008a\u008b\7\64\2\2\u008b\u008d\5\30\r\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\6\2\2\u0092\u0094\5\34\17\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\17\3\2\2\2\u0095\u0099\5\22\n"+
		"\2\u0096\u0099\5\24\13\2\u0097\u0099\5\26\f\2\u0098\u0095\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\21\3\2\2\2\u009a\u009b\t\3\2"+
		"\2\u009b\23\3\2\2\2\u009c\u009d\t\4\2\2\u009d\25\3\2\2\2\u009e\u009f\t"+
		"\5\2\2\u009f\27\3\2\2\2\u00a0\u00a1\b\r\1\2\u00a1\u00a2\t\6\2\2\u00a2"+
		"\u00b2\5\30\r\2\u00a3\u00a4\7\61\2\2\u00a4\u00b2\5\30\r\2\u00a5\u00a6"+
		"\7\62\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7\63\2\2\u00a8\u00b2\3\2\2"+
		"\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7\62\2\2\u00ab\u00ac\5\"\22\2\u00ac"+
		"\u00ad\7\63\2\2\u00ad\u00b2\3\2\2\2\u00ae\u00b2\5\32\16\2\u00af\u00b2"+
		"\7\33\2\2\u00b0\u00b2\5\34\17\2\u00b1\u00a0\3\2\2\2\u00b1\u00a3\3\2\2"+
		"\2\u00b1\u00a5\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00c4\3\2\2\2\u00b3\u00b4\6\r\2\3\u00b4"+
		"\u00b5\t\7\2\2\u00b5\u00c3\5\30\r\2\u00b6\u00b7\6\r\3\3\u00b7\u00b8\t"+
		"\6\2\2\u00b8\u00c3\5\30\r\2\u00b9\u00ba\6\r\4\3\u00ba\u00bb\7/\2\2\u00bb"+
		"\u00c3\5\30\r\2\u00bc\u00bd\6\r\5\3\u00bd\u00be\7\60\2\2\u00be\u00c3\5"+
		"\30\r\2\u00bf\u00c0\6\r\6\3\u00c0\u00c1\t\b\2\2\u00c1\u00c3\5\30\r\2\u00c2"+
		"\u00b3\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bc\3\2"+
		"\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cb\5\36\20"+
		"\2\u00c8\u00ca\5$\23\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\33\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d0\7\65\2\2\u00cf\u00d1\t\t\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\65\2\2\u00d3\35\3\2\2\2\u00d4"+
		"\u00d5\7\67\2\2\u00d5\37\3\2\2\2\u00d6\u00db\5\32\16\2\u00d7\u00d8\7\64"+
		"\2\2\u00d8\u00da\5\32\16\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00d6\3\2\2\2\u00de\u00df\3\2\2\2\u00df!\3\2\2\2\u00e0\u00e5"+
		"\5\30\r\2\u00e1\u00e2\7\64\2\2\u00e2\u00e4\5\30\r\2\u00e3\u00e1\3\2\2"+
		"\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"#\3\2\2\2\u00ea\u00ed\5&\24\2\u00eb\u00ed\5(\25\2\u00ec\u00ea\3\2\2\2"+
		"\u00ec\u00eb\3\2\2\2\u00ed%\3\2\2\2\u00ee\u00ef\7 \2\2\u00ef\u00f0\5\30"+
		"\r\2\u00f0\u00f1\7!\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\7 \2\2\u00f3\u00f4"+
		"\5\30\r\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\7!\2\2"+
		"\u00f7)\3\2\2\2\31-?FMUZdm}\u0085\u008e\u0093\u0098\u00b1\u00c2\u00c4"+
		"\u00cb\u00d0\u00db\u00de\u00e5\u00e8\u00ec";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}