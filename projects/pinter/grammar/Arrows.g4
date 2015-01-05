grammar Arrows;

tokens {
  INDENT,
  DEDENT
}

//from ANTLR python parser
@lexer::members {
     
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
}

init: statements;

function: lvalue PAREN_OPEN args PAREN_CLOSE COLON NEWLINE block;

statements: (NEWLINE)* (statement (NEWLINE)*)+ EOF;

block: INDENT statements DEDENT;
 
statement:
     expression arrow expression (arrow expression)*    # Arw
     | (singleInput)+       # Input
     | (singleOutput)+   #Output
     | block                 							# Blck
     | expression COLON NEWLINE tr=block (ELSE NEWLINE fa=block)?  		# If
     | WHILE expression COLON NEWLINE block                       # While
     | FOR lvalue op=(LA|RA) range COLON NEWLINE block			    # For
     | RET expression                                   # Return
     | PASS                                             # Pass
     ;

expression:
	 op=(INC|DEC) expression							 # PreInc
	| expression op=(INC|DEC)						 # PostInc
     | op=('-'|'+') expression                           # Una
     | expression op=(DIV|MUL) expression                # Mul
     | expression op=(ADD|SUB) expression                # Add
     | op=NOT expression                                 # Not
     | expression op=AND expression                      # And
     | expression op=OR expression                       # Or
     | expression op=EQ expression						 # Eq
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | lvalue '('params')'                               # Call
     | variable                                           # Var
     | INT 									   # Int
     | quotedString			                            # Qstr								 
     ;

variable: lvalue(range)*

singleInput: inputArrow variable (',' variable)* ;
singleOutput: outputArrow expression (',' expression)* (COLON quotedString) ;

quotedString: QUOT content=(STRING | ANYSTRING)* QUOT;
lvalue: STRING;
args: (lvalue (',' lvalue)*)?;
params: (expression (',' expression)*)?;

arrow: inputArrow | outputArrow | otherArrow;

inputArrow: 
	LA
	| IS
	| ISL
	;

outputArrow:
     RA
     | OS
     | OL
     | OSL
     ;

otherArrow:
     LPA
     | LSA
     | LDA
     | LMA 
     | LRA
     | RPA
     | RSA
     | RDA
     | RMA
     | RRA
     | SWAP
     ;

range: singleRange | boundedRange;
dynamicRange: LR expression RR;
boundedRange: LR expression DOTS expression RR; 

COMMENT: '#' ~[\r\n]* -> skip;
SPACES: [ \t]+ -> skip;

NEWLINE: ( '\r'? '\n' | '\r' ) SPACES?
{
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
}
;

COLON: ':';
LA: '>>';
LPA: '+>';
LSA: '->';
LDA: '/>';
LMA: '*>';
LRA: '&>';
RA: '<<';
RPA: '<+';
RSA: '<-';
RDA: '</';
RMA: '<*';
RRA: '<&';
SWAP: '<->';
IS: '@>';
ISL: '$>';
OS: '<@';
OL: '<!';
OSL: '<$';
RET: 'ret';
INT: DIGIT+;
INT32: DIGIT+'i32';
INC: '++';
DEC: '--';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
LR: '[';
RR: ']';
DOTS: '..';
WHITESPACE: [ \t] -> skip;
EQ: '=';
PEQ: '==';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
PASS: 'pass';
AND: '&';
OR: '|';
NOT: '!';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
STRING: [a-zA-Z][a-zA-Z0-9]*;
ANYSTRING: ~[\r\n"]+;
COMMA: ',';
QUOT: '"';
QO: '?';

fragment DIGIT: [0-9];