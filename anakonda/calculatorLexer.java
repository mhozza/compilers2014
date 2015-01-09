// Generated from calculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, INT=4, FLOAT=5, MUL=6, DIV=7, ADD=8, SUB=9, EXP=10, 
		VARI=11, VARF=12, WHITESPACE=13, NEWLINE=14, ASSIGN=15, BLOCK_START=16, 
		BLOCK_END=17, IF=18, ELSE=19, WHILE=20, AND=21, OR=22, NOT=23, RETURN=24, 
		PAREN_OPEN=25, PAREN_CLOSE=26, STRING=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "':'", "';'", "INT", "FLOAT", "'*'", "'/'", "'+'", "'-'", "'^'", 
		"'var int'", "'var float'", "WHITESPACE", "'\n'", "'='", "'{'", "'}'", 
		"'if'", "'else'", "'while'", "'and'", "'or'", "'not'", "'return'", "'('", 
		"')'", "STRING"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "INT", "FLOAT", "MUL", "DIV", "ADD", "SUB", "EXP", 
		"VARI", "VARF", "WHITESPACE", "NEWLINE", "ASSIGN", "BLOCK_START", "BLOCK_END", 
		"IF", "ELSE", "WHILE", "AND", "OR", "NOT", "RETURN", "PAREN_OPEN", "PAREN_CLOSE", 
		"STRING", "DIGIT"
	};


	public calculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculator.g4"; }

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
		case 12: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\35\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\6\5C\n\5\r\5\16\5D\3\6\6\6H\n\6\r\6\16\6I\3\6\3\6\7\6N\n\6\f\6\16"+
		"\6Q\13\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\7\34\u00a1\n\34\f\34\16\34\u00a4\13\34\3\35\3"+
		"\35\2\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\2\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\2\1\3\2\6\4\2"+
		"\13\13\"\"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\u00a9\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tB\3\2"+
		"\2\2\13G\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3"+
		"\2\2\2\27\\\3\2\2\2\31d\3\2\2\2\33n\3\2\2\2\35r\3\2\2\2\37t\3\2\2\2!v"+
		"\3\2\2\2#x\3\2\2\2%z\3\2\2\2\'}\3\2\2\2)\u0082\3\2\2\2+\u0088\3\2\2\2"+
		"-\u008c\3\2\2\2/\u008f\3\2\2\2\61\u0093\3\2\2\2\63\u009a\3\2\2\2\65\u009c"+
		"\3\2\2\2\67\u009e\3\2\2\29\u00a5\3\2\2\2;<\7.\2\2<\4\3\2\2\2=>\7<\2\2"+
		">\6\3\2\2\2?@\7=\2\2@\b\3\2\2\2AC\59\35\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2E\n\3\2\2\2FH\59\35\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JK\3\2\2\2KO\7\60\2\2LN\59\35\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2P\f\3\2\2\2QO\3\2\2\2RS\7,\2\2S\16\3\2\2\2TU\7\61\2\2U\20\3\2\2"+
		"\2VW\7-\2\2W\22\3\2\2\2XY\7/\2\2Y\24\3\2\2\2Z[\7`\2\2[\26\3\2\2\2\\]\7"+
		"x\2\2]^\7c\2\2^_\7t\2\2_`\7\"\2\2`a\7k\2\2ab\7p\2\2bc\7v\2\2c\30\3\2\2"+
		"\2de\7x\2\2ef\7c\2\2fg\7t\2\2gh\7\"\2\2hi\7h\2\2ij\7n\2\2jk\7q\2\2kl\7"+
		"c\2\2lm\7v\2\2m\32\3\2\2\2no\t\2\2\2op\3\2\2\2pq\b\16\2\2q\34\3\2\2\2"+
		"rs\7\f\2\2s\36\3\2\2\2tu\7?\2\2u \3\2\2\2vw\7}\2\2w\"\3\2\2\2xy\7\177"+
		"\2\2y$\3\2\2\2z{\7k\2\2{|\7h\2\2|&\3\2\2\2}~\7g\2\2~\177\7n\2\2\177\u0080"+
		"\7u\2\2\u0080\u0081\7g\2\2\u0081(\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084"+
		"\7j\2\2\u0084\u0085\7k\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087"+
		"*\3\2\2\2\u0088\u0089\7c\2\2\u0089\u008a\7p\2\2\u008a\u008b\7f\2\2\u008b"+
		",\3\2\2\2\u008c\u008d\7q\2\2\u008d\u008e\7t\2\2\u008e.\3\2\2\2\u008f\u0090"+
		"\7p\2\2\u0090\u0091\7q\2\2\u0091\u0092\7v\2\2\u0092\60\3\2\2\2\u0093\u0094"+
		"\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7v\2\2\u0096\u0097\7w\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7p\2\2\u0099\62\3\2\2\2\u009a\u009b\7*\2\2\u009b"+
		"\64\3\2\2\2\u009c\u009d\7+\2\2\u009d\66\3\2\2\2\u009e\u00a2\t\3\2\2\u009f"+
		"\u00a1\t\4\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a38\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6"+
		"\t\5\2\2\u00a6:\3\2\2\2\7\2DIO\u00a2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}