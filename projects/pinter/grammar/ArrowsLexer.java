// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArrowsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SPACES=2, NEWLINE=3, COLON=4, LA=5, LPA=6, LSA=7, LDA=8, LMA=9, 
		LRA=10, RA=11, RPA=12, RSA=13, RDA=14, RMA=15, RRA=16, SWAP=17, IS=18, 
		ISL=19, OS=20, OL=21, OSL=22, RET=23, INT=24, INT32=25, INC=26, DEC=27, 
		MUL=28, DIV=29, ADD=30, SUB=31, LR=32, RR=33, DOTS=34, WHITESPACE=35, 
		EQ=36, PEQ=37, IF=38, ELSE=39, WHILE=40, FOR=41, PASS=42, AND=43, OR=44, 
		NOT=45, PAREN_OPEN=46, PAREN_CLOSE=47, STRING=48, ANYSTRING=49, COMMA=50, 
		QUOT=51, QO=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "SPACES", "NEWLINE", "':'", "'>>'", "'+>'", "'->'", "'/>'", 
		"'*>'", "'&>'", "'<<'", "'<+'", "'<-'", "'</'", "'<*'", "'<&'", "'<->'", 
		"'@>'", "'$>'", "'<@'", "'<!'", "'<$'", "'ret'", "INT", "INT32", "'++'", 
		"'--'", "'*'", "'/'", "'+'", "'-'", "'['", "']'", "'..'", "WHITESPACE", 
		"'='", "'=='", "'if'", "'else'", "'while'", "'for'", "'pass'", "'&'", 
		"'|'", "'!'", "'('", "')'", "STRING", "ANYSTRING", "','", "'\"'", "'?'"
	};
	public static final String[] ruleNames = {
		"COMMENT", "SPACES", "NEWLINE", "COLON", "LA", "LPA", "LSA", "LDA", "LMA", 
		"LRA", "RA", "RPA", "RSA", "RDA", "RMA", "RRA", "SWAP", "IS", "ISL", "OS", 
		"OL", "OSL", "RET", "INT", "INT32", "INC", "DEC", "MUL", "DIV", "ADD", 
		"SUB", "LR", "RR", "DOTS", "WHITESPACE", "EQ", "PEQ", "IF", "ELSE", "WHILE", 
		"FOR", "PASS", "AND", "OR", "NOT", "PAREN_OPEN", "PAREN_CLOSE", "STRING", 
		"ANYSTRING", "COMMA", "QUOT", "QO", "DIGIT"
	};


	     
	     // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	     private java.util.Queue<Token> tokens = new java.util.LinkedList<>();
	     
	     // The stack that keeps track of the indentation level.
	     private java.util.Stack<Integer> indents = new java.util.Stack<>();
	     
	     // The amount of opened braces, brackets and parenthesis.
	     private int opened = 0;
	     
	     // The most recently produced token.
	     private Token lastToken = null;
	     
	     @Override
	     public void emit(Token t) {
	          super.setToken(t);
	          tokens.offer(t);
	     }
	     
	     @Override
	     public Token nextToken() {
	          
	          // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	          if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	          
	               // Poll the EOF from the token stream so that a linebreak can be placed upon it.
	               tokens.poll();
	               
	               // First emit an extra line break that serves as the end of the statement.
	               this.emit(commonToken(ArrowsParser.NEWLINE, "\n"));
	               
	               // Now emit as much DEDENT tokens as needed.
	               while (!indents.isEmpty()) {
	                    this.emit(createDedent());
	                    indents.pop();
	               }
	               
	               // Put the EOF back on the token stream.
	               this.emit(commonToken(ArrowsParser.EOF, "<EOF>"));
	          
	          }
	          
	          Token next = super.nextToken();
	          if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	           
	               // Keep track of the last token on the default channel.
	               this.lastToken = next;
	          
	          }
	          return tokens.isEmpty() ? next : tokens.poll();
	     }

	     private Token createDedent() {
	          CommonToken dedent = commonToken(ArrowsParser.DEDENT, "");
	          dedent.setLine(this.lastToken.getLine());
	          return dedent;
	     }

	     private CommonToken commonToken(int type, String text) {
	          int start = this.getCharIndex();
	          int stop = start + text.length();
	          return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	     }

	     // Calculates the indentation of the provided spaces and tabs
	     static int getIndentationCount(String spaces) {
	          int count = 0;
	          for (char ch : spaces.toCharArray()) {
	               switch (ch) {
	                    case '\t':
	                         count += 4;
	                         break;
	                    default:
	                         // A normal space char.
	                         count++;
	               }
	          }
	          return count;
	     }

	     //some grammar code,from a more .. civilized age
	     //range: LR expression ((ADD | SUB) | (DOTS expression))? RR;
	     //| INT32                                             # Int32


	public ArrowsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arrows.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 1: SPACES_action((RuleContext)_localctx, actionIndex); break;

		case 2: NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 34: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: 
		     String newLine = getText().replaceAll("[^\r\n]+", "");
		     String spaces = getText().replaceAll("[\r\n]+", "");
		     int next = _input.LA(1);
		     if (opened > 0 || next == '\r' || next == '\n' || next == '#') {
		          // If we're inside a list or on a blank line, ignore all indents,
		          // dedents and line breaks.
		          skip();
		     } else {
		          emit(commonToken(NEWLINE, newLine));
		          int indent = getIndentationCount(spaces);
		          int previous = indents.isEmpty() ? 0 : indents.peek();
		          if (indent == previous) {
		               // skip indents of the same size as the present indent-size
		               skip();
		          } else if (indent > previous) {
		               indents.push(indent);
		               emit(commonToken(ArrowsParser.INDENT, spaces));
		          } else {
		               // Possibly emit more than 1 DEDENT token.
		               while(!indents.isEmpty() && indents.peek() > indent) {
		                    this.emit(createDedent());
		                    indents.pop();
		               }
		          }
		     }
		 break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void SPACES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\66\u0127\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\3\2\3\3"+
		"\6\3x\n\3\r\3\16\3y\3\3\3\3\3\4\5\4\177\n\4\3\4\3\4\5\4\u0083\n\4\3\4"+
		"\5\4\u0086\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\6\31\u00c8\n\31\r\31\16\31\u00c9\3\32\6"+
		"\32\u00cd\n\32\r\32\16\32\u00ce\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#"+
		"\3$\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\7\61\u0116\n\61\f\61\16\61\u0119\13\61\3\62\6\62\u011c\n\62\r\62"+
		"\16\62\u011d\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\2\67\3\3\3\5\4\4"+
		"\7\5\2\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%"+
		"\5I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64"+
		"\1g\65\1i\66\1k\2\1\3\2\b\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\5\2\62"+
		";C\\c|\5\2\f\f\17\17$$\3\2\62;\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\3m\3\2\2\2\5w\3\2\2\2\7\u0082\3\2\2\2\t\u0089\3\2\2\2"+
		"\13\u008b\3\2\2\2\r\u008e\3\2\2\2\17\u0091\3\2\2\2\21\u0094\3\2\2\2\23"+
		"\u0097\3\2\2\2\25\u009a\3\2\2\2\27\u009d\3\2\2\2\31\u00a0\3\2\2\2\33\u00a3"+
		"\3\2\2\2\35\u00a6\3\2\2\2\37\u00a9\3\2\2\2!\u00ac\3\2\2\2#\u00af\3\2\2"+
		"\2%\u00b3\3\2\2\2\'\u00b6\3\2\2\2)\u00b9\3\2\2\2+\u00bc\3\2\2\2-\u00bf"+
		"\3\2\2\2/\u00c2\3\2\2\2\61\u00c7\3\2\2\2\63\u00cc\3\2\2\2\65\u00d4\3\2"+
		"\2\2\67\u00d7\3\2\2\29\u00da\3\2\2\2;\u00dc\3\2\2\2=\u00de\3\2\2\2?\u00e0"+
		"\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E\u00e6\3\2\2\2G\u00e9\3\2\2\2I"+
		"\u00ed\3\2\2\2K\u00ef\3\2\2\2M\u00f2\3\2\2\2O\u00f5\3\2\2\2Q\u00fa\3\2"+
		"\2\2S\u0100\3\2\2\2U\u0104\3\2\2\2W\u0109\3\2\2\2Y\u010b\3\2\2\2[\u010d"+
		"\3\2\2\2]\u010f\3\2\2\2_\u0111\3\2\2\2a\u0113\3\2\2\2c\u011b\3\2\2\2e"+
		"\u011f\3\2\2\2g\u0121\3\2\2\2i\u0123\3\2\2\2k\u0125\3\2\2\2mq\7%\2\2n"+
		"p\n\2\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2"+
		"tu\b\2\3\2u\4\3\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z{\3\2\2\2{|\b\3\4\2|\6\3\2\2\2}\177\7\17\2\2~}\3\2\2\2~\177\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0083\7\f\2\2\u0081\u0083\7\17\2\2\u0082~\3\2"+
		"\2\2\u0082\u0081\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\5\3\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\4"+
		"\2\2\u0088\b\3\2\2\2\u0089\u008a\7<\2\2\u008a\n\3\2\2\2\u008b\u008c\7"+
		"@\2\2\u008c\u008d\7@\2\2\u008d\f\3\2\2\2\u008e\u008f\7-\2\2\u008f\u0090"+
		"\7@\2\2\u0090\16\3\2\2\2\u0091\u0092\7/\2\2\u0092\u0093\7@\2\2\u0093\20"+
		"\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7@\2\2\u0096\22\3\2\2\2\u0097"+
		"\u0098\7,\2\2\u0098\u0099\7@\2\2\u0099\24\3\2\2\2\u009a\u009b\7(\2\2\u009b"+
		"\u009c\7@\2\2\u009c\26\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7>\2\2\u009f"+
		"\30\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7-\2\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\7>\2\2\u00a4\u00a5\7/\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7"+
		"\u00a8\7\61\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7,\2\2"+
		"\u00ab \3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7(\2\2\u00ae\"\3\2\2\2"+
		"\u00af\u00b0\7>\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\7@\2\2\u00b2$\3\2\2"+
		"\2\u00b3\u00b4\7B\2\2\u00b4\u00b5\7@\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7"+
		"&\2\2\u00b7\u00b8\7@\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7>\2\2\u00ba\u00bb"+
		"\7B\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd\u00be\7#\2\2\u00be,\3"+
		"\2\2\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\7&\2\2\u00c1.\3\2\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\60\3\2\2\2\u00c6\u00c8"+
		"\5k\66\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\62\3\2\2\2\u00cb\u00cd\5k\66\2\u00cc\u00cb\3\2\2"+
		"\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7\65\2\2\u00d2\u00d3\7\64\2\2"+
		"\u00d3\64\3\2\2\2\u00d4\u00d5\7-\2\2\u00d5\u00d6\7-\2\2\u00d6\66\3\2\2"+
		"\2\u00d7\u00d8\7/\2\2\u00d8\u00d9\7/\2\2\u00d98\3\2\2\2\u00da\u00db\7"+
		",\2\2\u00db:\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd<\3\2\2\2\u00de\u00df\7"+
		"-\2\2\u00df>\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7]"+
		"\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7_\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7\60"+
		"\2\2\u00e7\u00e8\7\60\2\2\u00e8F\3\2\2\2\u00e9\u00ea\t\3\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\b$\5\2\u00ecH\3\2\2\2\u00ed\u00ee\7?\2\2\u00eeJ\3"+
		"\2\2\2\u00ef\u00f0\7?\2\2\u00f0\u00f1\7?\2\2\u00f1L\3\2\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7h\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9P\3\2\2\2\u00fa\u00fb"+
		"\7y\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7n\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ffR\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7q\2\2\u0102"+
		"\u0103\7t\2\2\u0103T\3\2\2\2\u0104\u0105\7r\2\2\u0105\u0106\7c\2\2\u0106"+
		"\u0107\7u\2\2\u0107\u0108\7u\2\2\u0108V\3\2\2\2\u0109\u010a\7(\2\2\u010a"+
		"X\3\2\2\2\u010b\u010c\7~\2\2\u010cZ\3\2\2\2\u010d\u010e\7#\2\2\u010e\\"+
		"\3\2\2\2\u010f\u0110\7*\2\2\u0110^\3\2\2\2\u0111\u0112\7+\2\2\u0112`\3"+
		"\2\2\2\u0113\u0117\t\4\2\2\u0114\u0116\t\5\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118b\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u011a\u011c\n\6\2\2\u011b\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011ed\3\2\2\2\u011f"+
		"\u0120\7.\2\2\u0120f\3\2\2\2\u0121\u0122\7$\2\2\u0122h\3\2\2\2\u0123\u0124"+
		"\7A\2\2\u0124j\3\2\2\2\u0125\u0126\t\7\2\2\u0126l\3\2\2\2\f\2qy~\u0082"+
		"\u0085\u00c9\u00ce\u0117\u011d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}