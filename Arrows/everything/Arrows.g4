grammar Arrows;

init: (NEWLINE)* (fun (NEWLINE)*)* statements;

COMMENT: '#' (WHITESPACE* ~[\r\n]+?)+ -> skip;

fun: DEF lvalue PAREN_OPEN args PAREN_CLOSE COLON (NEWLINE)* statement;

statements: statement (NEWLINE+ statement)*;

block: INDENT (NEWLINE)* statements (NEWLINE)* DEDENT;

statement:
      singleInput+                                                                                       # Input
     | singleOutput+                                                                                     # Output
     | expression arrow expression (arrow expression)*                                                   # Arw
     | block                                                                                             # Blck
     | expression COLON (NEWLINE)* tr=statement ((NEWLINE*) ELSE COLON (NEWLINE)* fa=statement)?         # If
     | WHILE expression COLON (NEWLINE)* statement                                                       # While
     | FOR expression op=(LA|RA) range COLON (NEWLINE)* statement                                        # For
     | RET expression                                                                                    # Return
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
     | RPA
     | RSA
     | RDA
     | RMA
     );

expression:
     op=('-'|'+') expression                             # Una
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | op=NOT expression                                 # Not
     | expression op=AND expression                      # And
     | expression op=OR expression                       # Or
     | expression op=(MUL|DIV) expression                # Mul
     | expression op=(ADD|SUB) expression                # Add
     | expression op=(EQ|NEQ|GT|ST) expression           # Eq
     | lvalue '('params')'                               # Call
     | variable                                          # Var
     | INT                                               # Int
     | quotedString                                      # Qstr                                     
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
RPA: '<+';
RSA: '<-';
RDA: '</';
RMA: '<*';
IS: '@>';
OS: '<@';
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
ELSE: '!^';
WHILE: 'while';
FOR: 'for';
AND: '&';
OR: '|';
NOT: '!';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
COMMA: ',';
QUOT: '"';
STRING: [a-zA-Z][a-zA-Z0-9]*;
NEWLINE: '\n';
ANYSTRING: ~[\r\n"]+?;

SPACES: [ \t]+ -> skip;

fragment DIGIT: [0-9];