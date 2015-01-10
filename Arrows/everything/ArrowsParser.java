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
		COMMENT=1, DEF=2, INDENT=3, DEDENT=4, COLON=5, SEMICOLON=6, LA=7, RA=8, 
		LPA=9, LSA=10, LDA=11, LMA=12, RPA=13, RSA=14, RDA=15, RMA=16, IS=17, 
		OS=18, RET=19, INT=20, NEQ=21, GEQ=22, SEQ=23, MUL=24, DIV=25, ADD=26, 
		SUB=27, LR=28, RR=29, DOTS=30, WHITESPACE=31, EQ=32, GT=33, ST=34, IF=35, 
		ELSE=36, WHILE=37, FOR=38, AND=39, OR=40, NOT=41, PAREN_OPEN=42, PAREN_CLOSE=43, 
		COMMA=44, QUOT=45, STRING=46, NEWLINE=47, ANYSTRING=48, SPACES=49;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "'def'", "'{'", "'}'", "':'", "';'", "'>>'", "'<<'", 
		"'+>'", "'->'", "'/>'", "'*>'", "'<+'", "'<-'", "'</'", "'<*'", "'@>'", 
		"'<@'", "'ret'", "INT", "'!='", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'", 
		"'['", "']'", "'..'", "WHITESPACE", "'='", "'>'", "'<'", "'if'", "'!^'", 
		"'while'", "'for'", "'&'", "'|'", "'!'", "'('", "')'", "','", "'\"'", 
		"STRING", "'\n'", "ANYSTRING", "SPACES"
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
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
			while (_la==NEWLINE) {
				{
				{
				setState(40); match(NEWLINE);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(46); fun();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(47); match(NEWLINE);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); statements();
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ArrowsParser.PAREN_CLOSE, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(DEF);
			setState(61); lvalue();
			setState(62); match(PAREN_OPEN);
			setState(63); args();
			setState(64); match(PAREN_CLOSE);
			setState(65); match(COLON);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(66); match(NEWLINE);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); statement();
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74); statement();
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(75); match(NEWLINE);
						}
						}
						setState(78); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(80); statement();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(86); match(INDENT);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(87); match(NEWLINE);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); statements();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94); match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); match(DEDENT);
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
	public static class EeContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterEe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitEe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitEe(this);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ArrowsParser.WHILE, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
		public TerminalNode ELSE() { return getToken(ArrowsParser.ELSE, 0); }
		public TerminalNode COLON(int i) {
			return getToken(ArrowsParser.COLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(ArrowsParser.COLON); }
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
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(102); singleInput();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(105); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(107); singleOutput();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(110); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				_localctx = new ArwContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112); expression(0);
				setState(113); arrow();
				setState(114); expression(0);
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(115); arrow();
						setState(116); expression(0);
						}
						} 
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;

			case 4:
				_localctx = new BlckContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123); block();
				}
				break;

			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124); expression(0);
				setState(125); match(COLON);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(126); match(NEWLINE);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132); ((IfContext)_localctx).tr = statement();
				setState(148);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					{
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(133); match(NEWLINE);
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(139); match(ELSE);
					setState(140); match(COLON);
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(141); match(NEWLINE);
						}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(147); ((IfContext)_localctx).fa = statement();
					}
					break;
				}
				}
				break;

			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(150); match(WHILE);
				setState(151); expression(0);
				setState(152); match(COLON);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(153); match(NEWLINE);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159); statement();
				}
				break;

			case 7:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(161); match(FOR);
				setState(162); expression(0);
				setState(163);
				((ForContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LA || _la==RA) ) {
					((ForContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(164); range();
				setState(165); match(COLON);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(166); match(NEWLINE);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172); statement();
				}
				break;

			case 8:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(174); match(RET);
				setState(175); expression(0);
				}
				break;

			case 9:
				_localctx = new EeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(176); expression(0);
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
			setState(179); inputArrow();
			setState(180); variable();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(181); match(COMMA);
				setState(182); variable();
				}
				}
				setState(187);
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
			setState(188); outputArrow();
			setState(189); expression(0);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190); match(COMMA);
				setState(191); expression(0);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(197); match(COLON);
				setState(198); quotedString();
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
			setState(204);
			switch (_input.LA(1)) {
			case LA:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); inputArrow();
				}
				break;
			case RA:
			case OS:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); outputArrow();
				}
				break;
			case LPA:
			case LSA:
			case LDA:
			case LMA:
			case RPA:
			case RSA:
			case RDA:
			case RMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(203); otherArrow();
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
			setState(206);
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
			setState(208);
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
		public TerminalNode RSA() { return getToken(ArrowsParser.RSA, 0); }
		public TerminalNode LMA() { return getToken(ArrowsParser.LMA, 0); }
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
			setState(210);
			((OtherArrowContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPA) | (1L << LSA) | (1L << LDA) | (1L << LMA) | (1L << RPA) | (1L << RSA) | (1L << RDA) | (1L << RMA))) != 0)) ) {
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
		public TerminalNode GEQ() { return getToken(ArrowsParser.GEQ, 0); }
		public TerminalNode NEQ() { return getToken(ArrowsParser.NEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ST() { return getToken(ArrowsParser.ST, 0); }
		public TerminalNode SEQ() { return getToken(ArrowsParser.SEQ, 0); }
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
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(214); expression(12);
				}
				break;

			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215); ((NotContext)_localctx).op = match(NOT);
				setState(216); expression(10);
				}
				break;

			case 3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217); match(PAREN_OPEN);
				setState(218); expression(0);
				setState(219); match(PAREN_CLOSE);
				}
				break;

			case 4:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221); lvalue();
				setState(222); match(PAREN_OPEN);
				setState(223); params();
				setState(224); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226); variable();
				}
				break;

			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227); match(INT);
				}
				break;

			case 7:
				{
				_localctx = new QstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228); quotedString();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(232); ((AndContext)_localctx).op = match(AND);
						setState(233); expression(10);
						}
						break;

					case 2:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(235); ((OrContext)_localctx).op = match(OR);
						setState(236); expression(9);
						}
						break;

					case 3:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(238);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(239); expression(8);
						}
						break;

					case 4:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(241);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(242); expression(7);
						}
						break;

					case 5:
						{
						_localctx = new EqContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(244);
						((EqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << GEQ) | (1L << SEQ) | (1L << EQ) | (1L << GT) | (1L << ST))) != 0)) ) {
							((EqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(245); expression(6);
						}
						break;
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			setState(251); lvalue();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(252); range();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(258); match(QUOT);
			setState(260);
			_la = _input.LA(1);
			if (_la==STRING || _la==ANYSTRING) {
				{
				setState(259);
				((QuotedStringContext)_localctx).content = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ANYSTRING) ) {
					((QuotedStringContext)_localctx).content = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(262); match(QUOT);
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
			setState(264); match(STRING);
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
			setState(274);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(266); variable();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(267); match(COMMA);
					setState(268); variable();
					}
					}
					setState(273);
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
			setState(284);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << QUOT) | (1L << STRING))) != 0)) {
				{
				setState(276); expression(0);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(277); match(COMMA);
					setState(278); expression(0);
					}
					}
					setState(283);
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
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286); singleRange();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); boundedRange();
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
			setState(290); match(LR);
			setState(291); expression(0);
			setState(292); match(RR);
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
			setState(294); match(LR);
			setState(295); expression(0);
			setState(296); match(DOTS);
			setState(297); expression(0);
			setState(298); match(RR);
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
		case 0: return 9 >= _localctx._p;

		case 1: return 8 >= _localctx._p;

		case 2: return 7 >= _localctx._p;

		case 3: return 6 >= _localctx._p;

		case 4: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\63\u012f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\4\3\4\6\4O\n\4\r\4\16"+
		"\4P\3\4\7\4T\n\4\f\4\16\4W\13\4\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3"+
		"\5\7\5b\n\5\f\5\16\5e\13\5\3\5\3\5\3\6\6\6j\n\6\r\6\16\6k\3\6\6\6o\n\6"+
		"\r\6\16\6p\3\6\3\6\3\6\3\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\6"+
		"\3\6\7\6\u0082\n\6\f\6\16\6\u0085\13\6\3\6\3\6\7\6\u0089\n\6\f\6\16\6"+
		"\u008c\13\6\3\6\3\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\5\6\u0097"+
		"\n\6\3\6\3\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0\13\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u00aa\n\6\f\6\16\6\u00ad\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00b4\n\6\3\7\3\7\3\7\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\b\3"+
		"\b\3\b\3\b\7\b\u00c3\n\b\f\b\16\b\u00c6\13\b\3\b\3\b\5\b\u00ca\n\b\3\t"+
		"\3\t\3\t\5\t\u00cf\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e8\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f9\n\r\f\r\16"+
		"\r\u00fc\13\r\3\16\3\16\7\16\u0100\n\16\f\16\16\16\u0103\13\16\3\17\3"+
		"\17\5\17\u0107\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u0110\n\21"+
		"\f\21\16\21\u0113\13\21\5\21\u0115\n\21\3\22\3\22\3\22\7\22\u011a\n\22"+
		"\f\22\16\22\u011d\13\22\5\22\u011f\n\22\3\23\3\23\5\23\u0123\n\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\2\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\n\3\2\t\n\4\2\t\t\23\23\4\2\n\n\24\24"+
		"\3\2\13\22\3\2\34\35\3\2\32\33\4\2\27\31\"$\4\2\60\60\62\62\u014a\2-\3"+
		"\2\2\2\4>\3\2\2\2\6L\3\2\2\2\bX\3\2\2\2\n\u00b3\3\2\2\2\f\u00b5\3\2\2"+
		"\2\16\u00be\3\2\2\2\20\u00ce\3\2\2\2\22\u00d0\3\2\2\2\24\u00d2\3\2\2\2"+
		"\26\u00d4\3\2\2\2\30\u00e7\3\2\2\2\32\u00fd\3\2\2\2\34\u0104\3\2\2\2\36"+
		"\u010a\3\2\2\2 \u0114\3\2\2\2\"\u011e\3\2\2\2$\u0122\3\2\2\2&\u0124\3"+
		"\2\2\2(\u0128\3\2\2\2*,\7\61\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2"+
		"\2.9\3\2\2\2/-\3\2\2\2\60\64\5\4\3\2\61\63\7\61\2\2\62\61\3\2\2\2\63\66"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\67\60\3"+
		"\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5\6\4\2="+
		"\3\3\2\2\2>?\7\4\2\2?@\5\36\20\2@A\7,\2\2AB\5 \21\2BC\7-\2\2CG\7\7\2\2"+
		"DF\7\61\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2"+
		"\2JK\5\n\6\2K\5\3\2\2\2LU\5\n\6\2MO\7\61\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QR\3\2\2\2RT\5\n\6\2SN\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V\7\3\2\2\2WU\3\2\2\2X\\\7\5\2\2Y[\7\61\2\2ZY\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_c\5\6\4\2`b\7\61\2\2a`\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\6\2\2g\t\3\2"+
		"\2\2hj\5\f\7\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\u00b4\3\2\2\2"+
		"mo\5\16\b\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\u00b4\3\2\2\2rs\5"+
		"\30\r\2st\5\20\t\2tz\5\30\r\2uv\5\20\t\2vw\5\30\r\2wy\3\2\2\2xu\3\2\2"+
		"\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u00b4\3\2\2\2|z\3\2\2\2}\u00b4\5\b\5"+
		"\2~\177\5\30\r\2\177\u0083\7\7\2\2\u0080\u0082\7\61\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0096\5\n\6\2\u0087\u0089\7\61"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7&"+
		"\2\2\u008e\u0092\7\7\2\2\u008f\u0091\7\61\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0097\5\n\6\2\u0096\u008a\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u00b4\3\2\2\2\u0098\u0099\7\'\2\2\u0099\u009a\5\30"+
		"\r\2\u009a\u009e\7\7\2\2\u009b\u009d\7\61\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00b4\3\2\2\2\u00a3"+
		"\u00a4\7(\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\t\2\2\2\u00a6\u00a7\5$"+
		"\23\2\u00a7\u00ab\7\7\2\2\u00a8\u00aa\7\61\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5\n\6\2\u00af\u00b4\3\2\2\2\u00b0"+
		"\u00b1\7\25\2\2\u00b1\u00b4\5\30\r\2\u00b2\u00b4\5\30\r\2\u00b3i\3\2\2"+
		"\2\u00b3n\3\2\2\2\u00b3r\3\2\2\2\u00b3}\3\2\2\2\u00b3~\3\2\2\2\u00b3\u0098"+
		"\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\13\3\2\2\2\u00b5\u00b6\5\22\n\2\u00b6\u00bb\5\32\16\2\u00b7\u00b8\7."+
		"\2\2\u00b8\u00ba\5\32\16\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00bb\3\2\2\2"+
		"\u00be\u00bf\5\24\13\2\u00bf\u00c4\5\30\r\2\u00c0\u00c1\7.\2\2\u00c1\u00c3"+
		"\5\30\r\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\7\7\2\2\u00c8\u00ca\5\34\17\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\17\3\2\2\2\u00cb\u00cf\5\22\n\2\u00cc\u00cf\5\24\13\2\u00cd\u00cf"+
		"\5\26\f\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\21\3\2\2\2\u00d0\u00d1\t\3\2\2\u00d1\23\3\2\2\2\u00d2\u00d3\t\4"+
		"\2\2\u00d3\25\3\2\2\2\u00d4\u00d5\t\5\2\2\u00d5\27\3\2\2\2\u00d6\u00d7"+
		"\b\r\1\2\u00d7\u00d8\t\6\2\2\u00d8\u00e8\5\30\r\2\u00d9\u00da\7+\2\2\u00da"+
		"\u00e8\5\30\r\2\u00db\u00dc\7,\2\2\u00dc\u00dd\5\30\r\2\u00dd\u00de\7"+
		"-\2\2\u00de\u00e8\3\2\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\7,\2\2\u00e1"+
		"\u00e2\5\"\22\2\u00e2\u00e3\7-\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e8\5\32"+
		"\16\2\u00e5\u00e8\7\26\2\2\u00e6\u00e8\5\34\17\2\u00e7\u00d6\3\2\2\2\u00e7"+
		"\u00d9\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e4\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00fa\3\2\2\2\u00e9"+
		"\u00ea\6\r\2\3\u00ea\u00eb\7)\2\2\u00eb\u00f9\5\30\r\2\u00ec\u00ed\6\r"+
		"\3\3\u00ed\u00ee\7*\2\2\u00ee\u00f9\5\30\r\2\u00ef\u00f0\6\r\4\3\u00f0"+
		"\u00f1\t\7\2\2\u00f1\u00f9\5\30\r\2\u00f2\u00f3\6\r\5\3\u00f3\u00f4\t"+
		"\6\2\2\u00f4\u00f9\5\30\r\2\u00f5\u00f6\6\r\6\3\u00f6\u00f7\t\b\2\2\u00f7"+
		"\u00f9\5\30\r\2\u00f8\u00e9\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00ef\3"+
		"\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u00fa\3\2\2"+
		"\2\u00fd\u0101\5\36\20\2\u00fe\u0100\5$\23\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\33\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0104\u0106\7/\2\2\u0105\u0107\t\t\2\2\u0106\u0105"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7/\2\2\u0109"+
		"\35\3\2\2\2\u010a\u010b\7\60\2\2\u010b\37\3\2\2\2\u010c\u0111\5\32\16"+
		"\2\u010d\u010e\7.\2\2\u010e\u0110\5\32\16\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"!\3\2\2\2\u0116\u011b\5\30\r\2\u0117\u0118\7.\2\2\u0118\u011a\5\30\r\2"+
		"\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0116\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f#\3\2\2\2\u0120\u0123\5&\24\2\u0121\u0123\5(\25\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123%\3\2\2\2\u0124\u0125\7"+
		"\36\2\2\u0125\u0126\5\30\r\2\u0126\u0127\7\37\2\2\u0127\'\3\2\2\2\u0128"+
		"\u0129\7\36\2\2\u0129\u012a\5\30\r\2\u012a\u012b\7 \2\2\u012b\u012c\5"+
		"\30\r\2\u012c\u012d\7\37\2\2\u012d)\3\2\2\2\"-\649GPU\\ckpz\u0083\u008a"+
		"\u0092\u0096\u009e\u00ab\u00b3\u00bb\u00c4\u00c9\u00ce\u00e7\u00f8\u00fa"+
		"\u0101\u0106\u0111\u0114\u011b\u011e\u0122";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}