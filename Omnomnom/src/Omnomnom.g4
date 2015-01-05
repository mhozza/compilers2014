grammar Omnomnom;

init: 
  (extern END_LINE)*
  (function)*
  block
  ;

block: (statement)+ END_BLOCK;

var: type '_' id;
id: NAME;

paramlist: expression (',' expression)*;
arglist: var (',' var)*;
typelist: type (',' type)*;

extern: '~' var PAREN_OPEN typelist? PAREN_CLOSE;
function: var PAREN_OPEN arglist? PAREN_CLOSE fblock;
fblock: block;

type: 
    '{' type '}' 						# TypeArray
    | '[' type ',' type']' 					# TypeTuple
    | ('i' | 'f' | 'b' | 's')					# TypeBasic
    ;

val:
    id                                                          # ValId
    | INT 							# ValInt
    | FLOAT 							# ValFloat
    | STRING 							# ValString
    | BOOL 							# ValBool
    | '{' (expression (',' expression)*)? '}'                   # ValArray
    | '[' expression ',' expression ']'                         # ValTuple
    ;
  
statement: 
    inline_statement END_LINE 
    | block_statement
    ;

block_statement: 
    IF expression block 
      (ELIF expression block)* 
      (ELSE block)? 						# If
    | WHILE PAREN_OPEN expression PAREN_CLOSE block 		# While
    | FOR PAREN_OPEN  initialization ',' 
		      expression ',' 
		      assignment 
	  PAREN_CLOSE block 					# For
    ;  

inline_statement: 
    READ id                                                     # Read
    | WRITE expression                                          # Write
    | definition                                                # Def
    | assignment                                                # Assign
    | expression                                                # Exp
    | RET expression?                                           # Ret    
    
    | id ATTR 'r' PAREN_OPEN expression PAREN_CLOSE             # Remove
    | id ATTR 'a' PAREN_OPEN expression PAREN_CLOSE             # Append
    | id ATTR 'd' PAREN_OPEN PAREN_CLOSE                        # Delete  
    | id ATTR 's' PAREN_OPEN 
      expression ',' expression PAREN_CLOSE 			# Set
    |								# Emp
    ;

initialization:
    definition
    | assignment
    ;
   
definition:
    var (ASSIGN expression)?                                    # VarDef
    ;                                 
    
assignment:
      id ASSIGN expression                         		# SimpleAssign
    | id op=(INC|DEC)						# Inc
    ;

expression:
      PAREN_OPEN expression PAREN_CLOSE                 	# Par
     | id PAREN_OPEN paramlist? PAREN_CLOSE 			# FCall
     
     | id ATTR 'g' PAREN_OPEN expression PAREN_CLOSE            # Get
     | id ATTR 'l' PAREN_OPEN PAREN_CLOSE                       # Length
     | id ATTR op=('f' | 's')PAREN_OPEN PAREN_CLOSE             # GetTuple
     
     | expression 
     	op=(ADD | SUB | DIV | MUL | REM | AND | OR | EQ | NE | LE | GE | GT | LT) 
       expression   						# Bin  
     | expression op=EXP<assoc=right> expression                # Expon
     | op=(ADD | SUB | NOT) expression                          # Una
     | val                                               	# Value
     ;
     
WHILE: '@';
FOR: '#';
IF: '?';
ELIF: '!?';
ELSE: '!';
WRITE: '<<';
READ: '>>';

RET: 'ggwp';

EQ: '==';
NE: '/=';
LE: '<=';
GE: '=>';
GT: '>';
LT: '<';

ASSIGN: '=';
INC: '++';
DEC: '--';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EXP: '^';
REM: '%';
ATTR: '->';

AND: '&';
OR: '|';
NOT: '~';

PAREN_OPEN: '(';
PAREN_CLOSE: ')';
END_LINE: ';';
END_BLOCK: '.';

BOOL: 'false' | 'true';
INT: DIGIT+;
FLOAT: NUMBER '.' DIGIT*;
NAME: [a-zA-Z]+;
STRING: '"'.*?'"';

WHITESPACE: ('\t' | '\n' | '\r' | ' ') -> skip;

fragment 
NUMBER : '0' | [1-9]DIGIT*;
DIGIT : [0-9];
