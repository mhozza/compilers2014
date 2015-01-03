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
		T__2=1, T__1=2, T__0=3, COMMENT=4, SPACES=5, NEWLINE=6, LA=7, LPA=8, LSA=9, 
		LDA=10, LMA=11, LRA=12, RA=13, RPA=14, RSA=15, RDA=16, RMA=17, RRA=18, 
		SWAP=19, IS=20, ISL=21, OS=22, OL=23, OSL=24, RET=25, INT=26, MUL=27, 
		DIV=28, ADD=29, SUB=30, LR=31, RR=32, DOTS=33, WHITESPACE=34, EQ=35, PEQ=36, 
		IF=37, ELSE=38, WHILE=39, FOR=40, PASS=41, AND=42, OR=43, NOT=44, PAREN_OPEN=45, 
		PAREN_CLOSE=46, STRING=47, ANYSTRING=48, COMMA=49, QUOT=50, QO=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"':'", "'--'", "'++'", "COMMENT", "SPACES", "NEWLINE", "'>>'", "'+>'", 
		"'->'", "'/>'", "'*>'", "'&>'", "'<<'", "'<+'", "'<-'", "'</'", "'<*'", 
		"'<&'", "'<->'", "'@>'", "'$>'", "'<@'", "'<!'", "'<$'", "'ret'", "INT", 
		"'*'", "'/'", "'+'", "'-'", "'['", "']'", "'..'", "WHITESPACE", "'='", 
		"'=='", "'if'", "'else'", "'while'", "'for'", "'pass'", "'&'", "'|'", 
		"'!'", "'('", "')'", "STRING", "ANYSTRING", "','", "'\"'", "'?'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "COMMENT", "SPACES", "NEWLINE", "LA", "LPA", "LSA", 
		"LDA", "LMA", "LRA", "RA", "RPA", "RSA", "RDA", "RMA", "RRA", "SWAP", 
		"IS", "ISL", "OS", "OL", "OSL", "RET", "INT", "MUL", "DIV", "ADD", "SUB", 
		"LR", "RR", "DOTS", "WHITESPACE", "EQ", "PEQ", "IF", "ELSE", "WHILE", 
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
		case 3: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 4: SPACES_action((RuleContext)_localctx, actionIndex); break;

		case 5: NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 33: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\65\u011c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\7\5v\n\5\f\5\16"+
		"\5y\13\5\3\5\3\5\3\6\6\6~\n\6\r\6\16\6\177\3\6\3\6\3\7\5\7\u0085\n\7\3"+
		"\7\3\7\5\7\u0089\n\7\3\7\5\7\u008c\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\6\33\u00cc\n\33\r\33"+
		"\16\33\u00cd\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\7\60\u010b\n\60\f\60\16\60\u010e\13\60\3\61\6\61\u0111\n\61\r"+
		"\61\16\61\u0112\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\2\66\3\3\1\5\4"+
		"\1\7\5\1\t\6\3\13\7\4\r\b\2\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\5G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63"+
		"\1e\64\1g\65\1i\2\1\3\2\b\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\5\2\62"+
		";C\\c|\5\2\f\f\17\17$$\3\2\62;\u0122\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\3k\3\2\2\2\5m\3\2\2\2\7p\3\2\2\2\ts\3\2\2\2\13}\3\2\2\2\r\u0088\3"+
		"\2\2\2\17\u008f\3\2\2\2\21\u0092\3\2\2\2\23\u0095\3\2\2\2\25\u0098\3\2"+
		"\2\2\27\u009b\3\2\2\2\31\u009e\3\2\2\2\33\u00a1\3\2\2\2\35\u00a4\3\2\2"+
		"\2\37\u00a7\3\2\2\2!\u00aa\3\2\2\2#\u00ad\3\2\2\2%\u00b0\3\2\2\2\'\u00b3"+
		"\3\2\2\2)\u00b7\3\2\2\2+\u00ba\3\2\2\2-\u00bd\3\2\2\2/\u00c0\3\2\2\2\61"+
		"\u00c3\3\2\2\2\63\u00c6\3\2\2\2\65\u00cb\3\2\2\2\67\u00cf\3\2\2\29\u00d1"+
		"\3\2\2\2;\u00d3\3\2\2\2=\u00d5\3\2\2\2?\u00d7\3\2\2\2A\u00d9\3\2\2\2C"+
		"\u00db\3\2\2\2E\u00de\3\2\2\2G\u00e2\3\2\2\2I\u00e4\3\2\2\2K\u00e7\3\2"+
		"\2\2M\u00ea\3\2\2\2O\u00ef\3\2\2\2Q\u00f5\3\2\2\2S\u00f9\3\2\2\2U\u00fe"+
		"\3\2\2\2W\u0100\3\2\2\2Y\u0102\3\2\2\2[\u0104\3\2\2\2]\u0106\3\2\2\2_"+
		"\u0108\3\2\2\2a\u0110\3\2\2\2c\u0114\3\2\2\2e\u0116\3\2\2\2g\u0118\3\2"+
		"\2\2i\u011a\3\2\2\2kl\7<\2\2l\4\3\2\2\2mn\7/\2\2no\7/\2\2o\6\3\2\2\2p"+
		"q\7-\2\2qr\7-\2\2r\b\3\2\2\2sw\7%\2\2tv\n\2\2\2ut\3\2\2\2vy\3\2\2\2wu"+
		"\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\b\5\3\2{\n\3\2\2\2|~\t\3\2\2"+
		"}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0082\b\6\4\2\u0082\f\3\2\2\2\u0083\u0085\7\17\2\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\7\f\2\2\u0087"+
		"\u0089\7\17\2\2\u0088\u0084\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008b\3"+
		"\2\2\2\u008a\u008c\5\13\6\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\b\7\2\2\u008e\16\3\2\2\2\u008f\u0090\7@\2\2"+
		"\u0090\u0091\7@\2\2\u0091\20\3\2\2\2\u0092\u0093\7-\2\2\u0093\u0094\7"+
		"@\2\2\u0094\22\3\2\2\2\u0095\u0096\7/\2\2\u0096\u0097\7@\2\2\u0097\24"+
		"\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a\7@\2\2\u009a\26\3\2\2\2\u009b"+
		"\u009c\7,\2\2\u009c\u009d\7@\2\2\u009d\30\3\2\2\2\u009e\u009f\7(\2\2\u009f"+
		"\u00a0\7@\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7>\2\2\u00a3"+
		"\34\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5\u00a6\7-\2\2\u00a6\36\3\2\2\2\u00a7"+
		"\u00a8\7>\2\2\u00a8\u00a9\7/\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7>\2\2\u00ab"+
		"\u00ac\7\61\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7,\2\2"+
		"\u00af$\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b2\7(\2\2\u00b2&\3\2\2\2\u00b3"+
		"\u00b4\7>\2\2\u00b4\u00b5\7/\2\2\u00b5\u00b6\7@\2\2\u00b6(\3\2\2\2\u00b7"+
		"\u00b8\7B\2\2\u00b8\u00b9\7@\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7&\2\2\u00bb"+
		"\u00bc\7@\2\2\u00bc,\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7B\2\2\u00bf"+
		".\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\7#\2\2\u00c2\60\3\2\2\2\u00c3"+
		"\u00c4\7>\2\2\u00c4\u00c5\7&\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\64\3\2\2\2\u00ca\u00cc\5i\65\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\66\3\2\2\2\u00cf\u00d0\7,\2\2\u00d08\3\2\2\2\u00d1\u00d2"+
		"\7\61\2\2\u00d2:\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4<\3\2\2\2\u00d5\u00d6"+
		"\7/\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7]\2\2\u00d8@\3\2\2\2\u00d9\u00da\7"+
		"_\2\2\u00daB\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\7\60\2\2\u00ddD"+
		"\3\2\2\2\u00de\u00df\t\3\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b#\5\2\u00e1"+
		"F\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3H\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5\u00e6"+
		"\7?\2\2\u00e6J\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7h\2\2\u00e9L\3"+
		"\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed"+
		"\u00ee\7g\2\2\u00eeN\3\2\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7j\2\2\u00f1"+
		"\u00f2\7k\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7g\2\2\u00f4P\3\2\2\2\u00f5"+
		"\u00f6\7h\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7t\2\2\u00f8R\3\2\2\2\u00f9"+
		"\u00fa\7r\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7u\2\2"+
		"\u00fdT\3\2\2\2\u00fe\u00ff\7(\2\2\u00ffV\3\2\2\2\u0100\u0101\7~\2\2\u0101"+
		"X\3\2\2\2\u0102\u0103\7#\2\2\u0103Z\3\2\2\2\u0104\u0105\7*\2\2\u0105\\"+
		"\3\2\2\2\u0106\u0107\7+\2\2\u0107^\3\2\2\2\u0108\u010c\t\4\2\2\u0109\u010b"+
		"\t\5\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d`\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\n\6\2\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113b\3\2\2\2\u0114\u0115\7.\2\2\u0115d\3\2\2\2\u0116\u0117"+
		"\7$\2\2\u0117f\3\2\2\2\u0118\u0119\7A\2\2\u0119h\3\2\2\2\u011a\u011b\t"+
		"\7\2\2\u011bj\3\2\2\2\13\2w\177\u0084\u0088\u008b\u00cd\u010c\u0112";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}