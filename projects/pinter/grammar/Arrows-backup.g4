grammar Arrows;

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
     | WHILE expression COLON NEWLINE statement                       # While
     | FOR expression op=(LA|RA) range COLON NEWLINE statement			    # For
     | RET expression                                   # Return
     | PASS                                             # Pass
     ;

expression:
	op=('-'|'+') expression                           # Una
     | expression op=(MUL|DIV) expression                # Mul
     | expression op=(ADD|SUB) expression                # Add
     | op=NOT expression                                 # Not
     | expression op=AND expression                      # And
     | expression op=OR expression                       # Or
     | expression op=(EQ|NEQ|GT|ST) expression						 # Eq
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | lvalue '('params')'                               # Call
     | variable                                           # Var
     | INT 									   # Int
     | quotedString			                            # Qstr								 
     ;

variable: lvalue(range)*;

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
singleRange: LR expression RR;
boundedRange: LR expression DOTS expression RR; 

COMMENT: '#' ~[\r\n]* -> skip;
SPACES: [ \t]+ -> skip;

NEWLINE: ( '\r'? '\n' | '\r' ) SPACES?;

INDENT: '{';
DEDENT: '}';
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
NEQ: '!=';
GT: '>';
ST: '<';
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