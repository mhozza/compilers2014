grammar kebab;

COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;


init: 'class' lvalue '{' statements '}';

statements: statement ( (NEWLINE|';') statement)*;

param_call:
	expression (',' expression)*
	|
	;

func_call:
	lvalue '(' param_call ')';

param_decl:
	lvalue (',' lvalue)*
	|
	;

func_decl:
	lvalue '(' param_decl ')' BLOCK_START statements BLOCK_END;

hash_map_declare:
	'HashMap' '<' type1=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char') ',' type2=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char')   '>' lvalue ';' ;

set_declare:
	'Set' '<' type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char')  '>' lvalue ';' ;

string_declare:
	'string' lvalue ';' ;

array_declare:
	type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char') '[' expression ']' lvalue;

primitive_declare:
	type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char') lvalue ';';

string_assign:
	lvalue ASSIGN '"' STRING '"'; 

array_assign:
	lvalue '[' expression ']' ASSIGN expression;

primitive_assign:
	lvalue ASSIGN expression ';' ;



statement:
     (string_assign | array_assign | primitive_assign )    # Assign
     | (hash_map_declare | set_declare | string_declare | array_declare | primitive_declare)  # Declare
     | 'print' '(' expression ')'  ';'                  # Print
     | expression                                       # NoPrint
     | BLOCK_START statements BLOCK_END                 # Block
     | IF '(' expression ')' tr=statement (ELSE fa=statement)? # If
     | WHILE '(' expression ')'  statement                  # While
     | FOR '(' expression ')'  statement                      # ForCyclus
     | func_decl 					# FuncDecl
     | 'return' expression ';'				# Ret
     |                                                  # Emp
     ;

lvalue: STRING;
expression:
     op=('-'|'+') expression                             # Una
     | expression op=EXP<assoc=right> expression         # Exp
     | expression op=(DIV|MUL) expression                # Mul
     | expression op=(ADD|SUB) expression                # Add
     | op=NOT expression                                 # Not
     | expression op=MOD expression                      # Mod
     | expression op=AND expression                      # And
     | expression op=OR expression                       # Or
     | expression op=(GR|GRT|LR|LRT|EQ|NEQ) expression          # Cmp
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | '(' expression ',' expression ')' 		 # Pair
     | func_call 					 # FuncCall
     | 'FloatToInt' '(' expression ')'                   # FloatToInt
     | 'IntToFloat' '(' expression ')'                   # IntToFloat
     | 'readInt' '(' ')'                   # ReadInt
     | STRING ('[' expression ']')?                             # Var
     | bool=('true'|'false')                                               # Bool
     | LONG                                               # Long
     | DOUBLE                                             # Double
     | STRING                                             # String
     | CHAR                                               # Char
     ;

FOR: 'for';
TRUE: 'true';
FALSE: 'false';
GR: '>';
GRT: '>=';
LR: '<';
LRT: '<=';
EQ: '==';
NEQ: '!=';
TYPE_BOOLEAN: 'boolean';
TYPE_BYTE: 'byte';
TYPE_SHORT: 'short';
TYPE_INT: 'int';
TYPE_LONG: 'long';
TYPE_FLOAT: 'float';
TYPE_DOUBLE: 'double';
TYPE_CHAR: 'char';
TYPE_ARRAY: 'array';
TYPE_STRING: 'string';
TYPE_SET: 'set';
LONG: DIGIT+;
DOUBLE: DIGIT+ '.' DIGIT*;
MOD: '%';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EXP: '^';
WHITESPACE: [ \t] -> skip;
NEWLINE: '\n';
ASSIGN: '=';
BLOCK_START: '{';
BLOCK_END: '}';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
AND: 'and';
OR: 'or';
NOT: 'not';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
STRING: [a-zA-Z][a-zA-Z0-9]*;
CHAR: '\'' . '\'';

fragment DIGIT: [0-9];
