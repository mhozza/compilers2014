grammar anakonda;
init: (extern_func_def SEMICOLON)* statement*;

block:
      LCURLY statement+ RCURLY
    ;

statement:
      oneline_statement SEMICOLON
    | block_statement
    ;

oneline_statement:
        assign
      | define_var
      | expression
      | ret
      | print
      | read
      | BREAK
      | CONTINUE
      ;

block_statement:
          forcycle
        | whilecycle
        | ifblock
        | define_fun
        | block
        ;

var :
      VARNAME #VarName
    | var LSQUARE expression RSQUARE #VarList
    ;

value:
      var #ValVar
    | VOID #ValVoid
    | BOOL #ValBool
    | CISLO #ValInt
    | CHAR #ValChar
    | STRING #ValString
    | list #ValList
    | range # ValRange
    ;

type:
      type LSQUARE RSQUARE #TypeList
    | ('void' | 'bool' | 'int' | 'char' | 'string') #PrimitiveType
    ;

normal_assign:
    var '=' expression;

combined_assign:
    var op = (
          ADDASS
        | SUBASS
        | MULASS
        | DIVASS
        | MODASS ) expression
        ;

assign:
      normal_assign
    | combined_assign
    ;



increment:
    var INCREASE;

decrement:
    var DECREASE;

define_fun:
    'def' type VARNAME LROUND arguments RROUND block;

extern_func_def:
    type '~' VARNAME LROUND typelist RROUND;

arguments:
    (type VARNAME (',' type VARNAME)*)? #Args;
    
typelist:
    (type (',' type)*)? #Types;

call_fun:
    VARNAME LROUND parameters RROUND;

define_var:
    type VARNAME ('=' expression)?;


ret:
    RET expression?;

forcycle:
     FOR LROUND define_var SEMICOLON expression SEMICOLON assign RROUND block;

whilecycle:
    WHILE expression block;

ifblock:
    IF expression block (ELIF expression block)* (ELSE block)?;

list:
    LSQUARE parameters RSQUARE;

parameters:
    (expression (',' expression)*)? #Params;

range:
    LROUND expression':'expression(':'expression)? RROUND;
print :
    PRINT expression;
read :
    READ LROUND RROUND;
expression:
      LROUND expression RROUND #Precedence
    | increment #Incpression
    | read #Readpression
    | decrement #Decpression
    | call_fun #CallFun
    | expression LSQUARE expression RSQUARE #ListIndex
    | op=(SUBTRACT | ADD) expression #Unary
    | expression op=(MULTIPLY | DIVIDE | MODULO) expression #Multipression
    | expression op=(ADD | SUBTRACT) expression #Addpression
    | expression op=(GREATERTHAN | LESSTHAN | LESSEQUAL | GREATEREQUAL | EQUAL | NOTEEQUAL) expression #Compression
    | op=NOT expression #Notpression
    | expression op=AND expression #Andpression
    | expression op=OR expression #Orpression
    | value #Valpression
    ;

PRINT: 'print';
READ: 'read';
LCURLY: '{';
RCURLY: '}';
LROUND: '(';
RROUND: ')';
LSQUARE: '[';
RSQUARE: ']';
SEMICOLON: ';';
BREAK: 'break';
CONTINUE: 'continue';
RET: 'return';
VOID: 'void';
BOOL: 'false' | 'true';
INCREASE: '++';
DECREASE: '--';
ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
ADDASS: '+=';
SUBASS: '-=';
MULASS: '*=';
DIVASS: '/=';
MODASS: '%=';
GREATERTHAN: '>';
LESSTHAN: '<';
LESSEQUAL: '<=';
GREATEREQUAL: '>=';
EQUAL: '==';
NOTEEQUAL: '!=';
FOR : 'for';
WHILE : 'while';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
AND: 'and' | '&&';
OR: 'or' | '||';
NOT: 'not' | '!';
INT: 'int';
IN: 'in';
CISLO: ('0'..'9') | (('1'..'9')('0'..'9')+);
VARNAME: [a-zA-Z]([a-zA-Z0-9])* ;
CHAR: '\''.'\'';
STRING: '"'.*?'"';
COMMENT: '//' .*? '\n'-> skip;
WHITESPACE: [ \t] -> skip;
NEWLINE: '\n' -> skip;


fragment
NUMBER: ('0'..'9') | (('1'..'9')('0'..'9')+);






