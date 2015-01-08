grammar Arrows;

init: (fun)* (NEWLINE)* statements;

fun: DEF lvalue PAREN_OPEN args PAREN_CLOSE COLON statement;

statements: statement (NEWLINE statement)*;

block: INDENT (NEWLINE)* statements (NEWLINE)* DEDENT;

//simple_statement: statement SEMICOLON;

statement:
      (singleInput)+       # Input
     | (singleOutput)+  #Output
     | expression arrow expression (arrow expression)*    # Arw
     | block                 							# Blck
     | expression COLON tr=statement (ELSE fa=statement)?		# If
     | WHILE expression COLON statement                       # While
     | FOR expression op=(LA|RA) range COLON statement			    # For
     | RET expression                                   # Return
     | expression #ee
     ;


singleInput: inputArrow variable (COMMA variable)* ;
singleOutput: outputArrow expression (COMMA expression)*  (COLON quotedString)?;

arrow: inputArrow | outputArrow | otherArrow;

inputArrow: op=(LA|IS);

outputArrow: op=(RA|OS);

otherArrow: op=(
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
     );

expression:
     op=('-'|'+') expression                           # Una
     | expression op=(MUL|DIV) expression                # Mul
     | expression op=(ADD|SUB) expression                # Add
     | op=NOT expression                                 # Not
     | expression op=AND expression                      # And
     | expression op=OR expression                       # Or
     | expression op=(EQ|NEQ|GT|ST) expression           # Eq
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | lvalue '('params')'                               # Call
     | variable                                           # Var
     | INT                                                # Int
     | quotedString                                       # Qstr                                     
     ;

variable: lvalue(range)*;

quotedString: QUOT (content=(STRING|ANYSTRING))? QUOT;
lvalue: STRING;
args: (variable (COMMA variable)*)?;
params: (expression (COMMA expression)*)?;

range: singleRange | boundedRange;
singleRange: LR expression RR;
boundedRange: LR expression DOTS expression RR; 

DEF: 'def';
INDENT: '{';
DEDENT: '}';
COLON: ':';
SEMICOLON: ';';
LA: '>>';
RA: '<<';
LPA: '+>';
LSA: '->';
LDA: '/>';
LMA: '*>';
LRA: '&>';
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
GEQ: '>=';
SEQ: '<=';
GT: '>';
ST: '<';
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
COMMA: ',';
QUOT: '"';
QO: '?';
STRING: [a-zA-Z][a-zA-Z0-9]*;
NEWLINE: '\n';
ANYSTRING: ~[\r\n"]+?;

COMMENT: '#' ~[\r\n]* -> skip;
SPACES: [ \t]+ -> skip;

fragment DIGIT: [0-9];