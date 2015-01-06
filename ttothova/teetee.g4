grammar teetee;

init
	: functions				# initFunctions
	| statements 			# initStatements
	;

block: LBRACE statements RBRACE;

statements: statement (NEWLINE statement)*;

functions: function (NEWLINE+ function)* ;

function: ftype fname OPEN_PAR fparameters CLOSE_PAR block;

ftype
	: VOID 												
	| type LBRACK RBRACK 										
	;

fname: ID;

fparameters: ( type id aarray ( COMMA type id aarray )* )? ;

aarray
	: LBRACK RBRACK										# Array
	|   												# NotArray
	;

statement
	: assignment 										# Assign
	| array_resize										# Resize
	| declaration 										# Declare
	| expression										# Print
	| return_statement 									# Ret
	| block 											# Block_stmt
	| if_statement 										# If
	| for_statement 									# For
	| while_statement 									# While_stmt
	| BREAK 											# Break
	| CONTINUE 				 							# Continue
	| 													# Empty
	;

assignment
	: id LBRACK expression (COMMA expression)* RBRACK ASSIGN expression 	# AssignArray
	| id ASSIGN expression 								# AssignVar
	;

array_resize: id LBRACK expression RBRACK ;

declaration: decl_var ( ASSIGN expression )? ;

decl_var
	: decl_var LBRACK expression? RBRACK			# ArrayDecl
	| type id 										# VarDecl
	;

return_statement: RETURN expression?;

if_statement : IF expression if_form ( ELIF expression if_form )* (ELSE if_form )? ;

if_form
	: SEMICOLON NEWLINE? statement						# ShortIf
	| block 											# LongIf
	;

for_statement: FOR id IN OPEN_PAR expression COMMA expression CLOSE_PAR (DO expression)? block;

while_statement
	: WHILE expression block 		 					# While
	| DO block WHILE expression							# DoWhile
	;

var
	: id LBRACK expression (COMMA expression)* RBRACK	# ArrayVar
	| id 												# SimpleVar
	;

expression
    : op=('-'|'+') expression                           # Una
    | OPEN_PAR expression CLOSE_PAR						# Par
    | expression op=EXP<assoc=right> expression         # Exp
    | expression op=(DIV|MUL|MOD) expression            # Mul
    | expression op=(ADD|SUB) expression                # Add
    | op=NOT expression                                 # Not
    | expression op=AND expression                      # And
    | expression op=OR expression                       # Or
    | expression op=(EQ|NE|LT|LE|GT|GE) expression		# Com
	| callfunction										# FunctionCall
	| INT 												# Int
	| FLOAT 											# Float
	| BOOL 												# Bool
	| CHAR 	 											# Char
	| STRING 											# String
	| var												# Variable
	;

callfunction: fname OPEN_PAR ( expression (COMMA expression)* )? CLOSE_PAR;

type: ( 'int' | 'float' | 'bool' | 'string' | 'char') ;

id: ID;

IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
IN: 'in';
DO: 'do';
WHILE: 'while';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';

OPEN_PAR: '(';
CLOSE_PAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
SEMICOLON: ';';

ASSIGN: '=';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
EXP: '^';
AND: 'and' | '&&';
OR: 'or' | '||';
NOT: 'not' | '!';
EQ: '==';
NE: '!=';
LT: '<';
LE: '<=' | '=<';
GT: '>';
GE: '>=' | '<=';

VOID: 'void';
INT: NUMBER;
FLOAT: NUMBER '.' DIGIT+;
BOOL: 'true' | 'false';
STRING: '"' (~'"' | NEWLINE)* '"';
CHAR: '\'' (~'\'') '\'';

NEWLINE: '\r'? '\n' | '\r';
WHITESPACE: [ \t] -> skip;

COMMENT: '#' ~[\r\n]* -> skip;

ID: [a-zA-Z] [a-zA-Z0-9]*;

fragment
NUMBER: '0' | [1-9]DIGIT*;
DIGIT: [0-9];
