grammar siii;


init: (extern_func_def NL)* statement*;

block
     : BLOCK_START NL statement+ BLOCK_END
     ;
statement
     : simple_statement NL
     | block_statement NL
     ;
simple_statement
     : assignment
     | var_def
     | expression
     | ret
     | print
     | read
     | extern_func_def
     | stat=(BREAK | CONTINUE )
     ;
block_statement
     : if_statement
     | while_statement
     | for_statement
     | func_def
     | block;
var : ID # VarID
    | var LBRACK expression RBRACK #VarList
    ;
print : PRINT expression
     ;
read : READ var
     ;
val  
     : var # ValVar
     | INT # ValInt
     | STRING # ValString
     | CHAR # ValChar
     | BOOL # ValBool
     | NULL # ValNull
     | list # ValList
     | range # ValRange
     ;
simple_assignment
     : var '=' expression
     ;
complex_assignment
     : var op = (
     ADD_ASSIGN
     | SUB_ASSIGN
     | MUL_ASSIGN
     | DIV_ASSIGN
     | MOD_ASSIGN
     | AND_ASSIGN
     | OR_ASSIGN
     ) expression
     ;
assignment 
     : simple_assignment | complex_assignment
     ;
if_statement
     : IF LPAR expression RPAR NL block (ELIF LPAR expression RPAR NL block)* (ELSE NL block)?
     ;
while_statement
     : WHILE LPAR expression RPAR NL block
     ;
for_statement
     : FOR ID 'v' range NL block
     ;
list 
     : LBRACK param_list RBRACK
     ;
range 
     : LBRACK expression':'expression(':'expression)? RBRACK
     ;
param_list
     : (expression (',' expression)*)?
     ;
func_def
     : 'def' ID type LPAR arglist RPAR NL block
     ;
extern_func_def
     : 'zvonku' ID type LPAR typelist RPAR
     ;
arglist
     : (type ID (',' type ID)*)?
     ;
typelist
     : (type (',' type)*)?
     ;
func_call
     : ID LPAR param_list RPAR
     ;
var_def
     : type ID ('=' expression)?
     ;
ret 
     : RET expression?
     ;
type
     : type LBRACK RBRACK # typeList
     | ('nic' | 'int' | 'bool' | 'char' | 'string') # typeBasic
     ;
expression
     : LPAR expression RPAR # Paren
     | func_call # Func
     | expression LKUC expression RKUC # Index
     | op=SUB expression # UnaryMinus
     | expression op=(MUL | DIV | MOD) expression # Mul
     | expression op=(ADD | SUB) expression # Add
     | expression '&' # BitAnd
     | expression '|' # BitOr
     | expression op=(EQ | NE | LE | GE | GT | LT) expression # Compare
     | op=NOT expression # BoolNot
     | expression op=AND expression # BoolAnd
     | expression op=OR expression # BoolOr
     | val # Value
     ;

WHITESPACE: [ \t] -> skip;
WHILE : 'pokial';
FOR : 'pre';
IF : 'ak';
ELIF : 'inakak';
ELSE : 'inak';
BREAK: 'prerus';
CONTINUE: 'pokracuj';
RET: 'vrat';
NULL : 'nic';
PRINT : 'vypis';
READ : 'nacitaj';
LPAR : '(';
RPAR : ')';
LBRACK: '[';
RBRACK: ']';
LKUC: '{';
RKUC: '}';
BLOCK_START: '<';
BLOCK_END: '>';

AND : 'a';
OR : 'alebo';
NOT : '!';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
ADD_ASSIGN:'++';
SUB_ASSIGN:'--';
MUL_ASSIGN:'**';
DIV_ASSIGN:'//';
MOD_ASSIGN:'%%';
AND_ASSIGN:'&&';
OR_ASSIGN:'||';
EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
GT: '>>';
LT: '<<';

BOOL : 'nepravda' | 'pravda';
INT : NUMBER;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING : '"' (~'"' | NL)* '"';
CHAR : '\'' (~'\'') '\'';

COMMENT: '#' ~[\r\n]* NL -> skip;
MULTI_COMMENT: '~#' ~['#\~']* '#~' NL -> skip;

NL: ('\r'? '\n' | '\r')+;

fragment
NUMBER : '0' | [1-9][0-9]*;
