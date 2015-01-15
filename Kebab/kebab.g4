grammar kebab;

COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;


init: 'class' lvalue '{' statements '}';

statements: statement ( (NEWLINE|SEMICOLON)+ statement)*;

param_call:
	expression (',' expression)*
	|
	;

primitive_typesaaa:
	TYPE_BOOLEAN
	| TYPE_BYTE
	| TYPE_SHORT
	| TYPE_INT
	| TYPE_LONG
	| TYPE_FLOAT
	| TYPE_DOUBLE
	| TYPE_CHAR
	;

primitive_types:
	type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char')
	;

func_call:
	lvalue '(' param_call ')';

param_decl:
	primitive_types  lvalue (',' primitive_types  lvalue)*
	|
	;

func_decl:
	type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char') FUNCTION lvalue '(' param_decl ')' BLOCK_START statements BLOCK_END;

hash_map_declare:
	HASHMAP '<' type_key=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char') ',' type_value=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char')   '>' lvalue  ;

set_declare:
	SET '<' type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char')  '>' lvalue  ;

string_declare:
	'string' lvalue  ;

array_declare:
	type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char') '[' expression ']' lvalue;

primitive_declare:
	type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char') lvalue ;

string_assign:
	lvalue ASSIGN '"' STRING '"'; 

set_remove:
	lvalue DOT REMOVE '(' expression ')'  ; 

set_assign:
	lvalue DOT INSERT '(' expression ')'  ; 

hash_map_assign:
	lvalue DOT INSERT '(' expression ',' expression ')'  ; 

set_assign_unique:
	lvalue DOT INSERT_UNIQUE '(' expression ')'  ; 

array_assign:
	lvalue '[' expression ']' ASSIGN expression;

primitive_assign:
	lvalue ASSIGN expression  ;

primitive_declare_and_assign:
	type=('boolean' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char') lvalue ASSIGN expression  ;

string_declare_and_assign:
	'string' lvalue ASSIGN '"' STRING '"'; 

statement:
     (set_remove)              # Remove 
     | (set_assign_unique | set_assign | string_assign | array_assign | primitive_assign )    # Assign
     | (hash_map_declare | set_declare | string_declare | array_declare | primitive_declare)  # Declare
     | (primitive_declare_and_assign | string_declare_and_assign)  # DeclareAndAssign
     | 'print' '(' expression ')'                    # Print
     | expression                                       # NoPrint
     | BLOCK_START statements BLOCK_END                 # Block
     | IF '(' expression ')' statement ( (ELSE IF | ELSEIF) '(' expression ')' statement )* (ELSE statement)? # If
     | SWITCH '(' expression ')' '{'  ( NEWLINE+ CASE expression ':' statement)+  NEWLINE+ DEFAULT ':' statement   NEWLINE+ '}'     #Switch 
     | WHILE '(' expression ')' DO  statement                  # WhileDo
     | DO statement WHILE '(' expression ')'                   # DoWhile
     | FOR '(' primitive_assign SEMICOLON expression SEMICOLON primitive_assign ')'  statement                      # ForCyclus
     | FOREACH '(' lvalue AS lvalue ')'  statement                      # Foreach
     | func_decl 					# FuncDecl
     | 'return' expression 				# Ret
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
     | expression op=(GR|GRT|LR|LRT|EQ|NEQ) expression   # Cmp
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | '(' expression ',' expression ')' 		 # Pair
     | func_call 					 # FuncCall
     | 'FloatToInt' '(' expression ')'                   # FloatToInt
     | 'IntToFloat' '(' expression ')'                   # IntToFloat
     | 'readInt' '(' ')'                                 # ReadInt
     | 'readChar' '(' ')'                                # ReadChar
     | 'readString' '(' ')'                                # ReadString	
     | STRING ('[' expression ']')?                      # Var
     | bool=('true'|'false')                             # Bool
     | LONG                                               # Long
     | DOUBLE                                             # Double
     | STRING                                             # String
     | CHAR                                               # Char
     | lvalue DOT CONTAINS '(' expression ')'             # SetContains
     | lvalue DOT SIZE '(' ')'             		  # SetSize
     ;
ELSEIF : 'elseif';
SEMICOLON: ';';
HASHMAP: 'hashmap';
SIZE: 'size';
CONTAINS: 'contains';
FOREACH: 'foreach';
AS: 'as';
REMOVE: 'remove';
DOT: '.';
SET: 'set';
INSERT: 'insert';
INSERT_UNIQUE: 'insertUnique';
FUNCTION: 'function';
DO: 'do';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
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
TYPE_HASHMAP: 'hashmap';
LONG: DIGIT+;
DOUBLE: DIGIT+ '.' DIGIT*;
MOD: '%';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EXP: '^';
WHITESPACE: [ \t] -> skip;
NEWLINE: '\n' ;
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
