grammar scapy;

init: (import_function NEWLINE*)* statements;

import_function: IMPORT id OPENPARENT arglist CLOSEPARENT COLON type;

statements: statement (NEWLINE statement)*;

statement:
     base_statement                                             # Base
     | func_def                                                 # FuncDef
     | proc_def                                                 # ProcDef
     ;

assignment:
    id (array_list)? ASSIGN expression                                                                        # Simple_assignment
    | id (array_list)? ASSIGN TYPE_ARRAY OPENBRACKET type CLOSEBRACKET OPENPARENT expression CLOSEPARENT      # Create_array_assignment
    | id (array_list)? op=(ADD_ASS | SUB_ASS | MUL_ASS | DIV_ASS | MOD_ASS) expression                        # Super_assignment
;

array_list:
    (OPENBRACKET expression CLOSEBRACKET)+    #Arraylist
    ;

declare_const:
    VAL id (COLON type)? ASSIGN expression                                                                                                          # Declare_simple_const
    ;

declare_variable:
    VAR id (COLON type)? ASSIGN expression                                                                                                          # Declare_simple_var
    | VAL id (COLON TYPE_ARRAY OPENBRACKET type CLOSEBRACKET)? ASSIGN TYPE_ARRAY OPENBRACKET type CLOSEBRACKET OPENPARENT expression CLOSEPARENT    # Declare_array_var
    ;

base_statement:
    declare_const                                                                                # Declare_con
     | declare_variable                                                                          # Declare_var
     | assignment                                                                                # Assign
     | func_call                                                                                 # BCall
     | RET expression                                                                            # BReturn
     | OPENBLOCK statements CLOSEBLOCK                                                           # Block
     | IF OPENPARENT expression CLOSEPARENT NEWLINE* tr=statement (NEWLINE* ELSE fa=statement)?  # If
     | WHILE OPENPARENT expression CLOSEPARENT statement                                         # While
     | FOR OPENPARENT id ARROW expression UNTIL expression CLOSEPARENT statement                 # For
     |                                                                                           # Emp
     ;

func_statements: func_statement (NEWLINE func_statement)*;

proc_statements: base_statement (NEWLINE base_statement)*;

func_statement:
     base_statement                                             # F_Base
     | RET expression                                           # F_Return
     ;

arglist: (id COLON type (COMMA id COLON type)*)?;

func_def: DEF id OPENPARENT arglist CLOSEPARENT COLON type ASSIGN OPENBLOCK func_statements CLOSEBLOCK;

proc_def: DEF id OPENPARENT arglist CLOSEPARENT OPENBLOCK proc_statements CLOSEBLOCK;

paramlist: (expression (COMMA expression)*)?;

func_call: id OPENPARENT paramlist CLOSEPARENT;

id: ID;

type: (TYPE_INT | TYPE_CHAR | TYPE_FLOAT | TYPE_STRING | TYPE_BOOLEAN)  # BasicType
    | TYPE_ARRAY OPENBRACKET type CLOSEBRACKET                          # ArrayType
    ;

var:
    id              # VarVar
    | INT           # VarInt
    | FLOAT         # VarFloat
    | BOOL          # VarBool
    | CHAR          # VarChar
    | STRING        # VarString
    | id array_list # VarArray
    ;

expression:
     op=(ADD| SUB) expression                                   # Una
     | <assoc=right> expression op=EXP expression               # Exp
     | expression op=(DIV|MUL|MOD) expression                   # Mul
     | expression op=(ADD|SUB) expression                       # Add
     | expression op=(EQ | NE | LE | GE | GT | LT) expression   # Compare
     | op=NOT expression                                        # Not
     | expression op=AND expression                             # And
     | expression op=OR expression                              # Or
     | OPENPARENT expression CLOSEPARENT                        # Par
     | func_call                                                # Call
     | var                                                      # Variable
     ;

INT: DIGIT+;
FLOAT: DIGIT+ '.' DIGIT*;
BOOL : 'false' | 'true';
STRING : '"' (~'"' | NEWLINE)* '"';
CHAR : '\'' (~'\'') '\'';

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
MOD: '%';
EXP: '^';
EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
GT: '>';
LT: '<';

ADD_ASS: '+=';
SUB_ASS: '-=';
MUL_ASS: '*=';
DIV_ASS: '/=';
MOD_ASS: '%=';

TYPE_INT: 'Int';
TYPE_CHAR: 'Char';
TYPE_STRING: 'String';
TYPE_BOOLEAN: 'Boolean';
TYPE_FLOAT: 'Float';
TYPE_ARRAY: 'Array';

ASSIGN: '=';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
AND: 'and';
OR: 'or';
NOT: 'not';

VAR: 'var';
VAL: 'val';
DEF: 'def';
RET: 'return';
IMPORT: 'import';
FOR: 'for';
ARROW: '<-';
UNTIL: 'until';

OPENBLOCK: '{';
CLOSEBLOCK: '}';
OPENPARENT: '(';
CLOSEPARENT: ')';
OPENBRACKET: '[';
CLOSEBRACKET: ']';
COMMA: ',';
COLON: ':';
NEWLINE: '\n';

ID: [a-zA-Z][a-zA-Z0-9]*;

COMMENT: '#' ~[\r\n]* -> skip;
WHITESPACE: [ \t] -> skip;

fragment DIGIT: [0-9];
