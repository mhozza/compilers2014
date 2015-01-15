grammar Pascript;

@header
{
package pascript.grammar;
}

module
    : externalSection?
      variableSection?    
      functionSection?
      mainSection
    ;

externalSection
    : EXTERNAL_SECTION (externalFunctionDeclaration END_STATEMENT)*
    ;

externalFunctionDeclaration
    : returnDataType functionName=IDENTIFIER PAREN_OPEN parameterList? PAREN_CLOSE
    ;

parameterList
    : dataType ( COMMA dataType )*
    ;

variableSection
    : VARIABLE_SECTION (globalVariableDeclaration END_STATEMENT)*
    ;

globalVariableDeclaration
    : dataType IDENTIFIER
    ;

functionSection
    : FUNCTION_SECTION (functionDeclaration functionDefinition)*
    ;

functionDefinition
    : blockStatement
    ;

functionDeclaration
    : returnDataType functionName=IDENTIFIER PAREN_OPEN namedParameterList? PAREN_CLOSE
    ;

namedParameterList
    : dataType IDENTIFIER ( COMMA dataType IDENTIFIER )*
    ;

returnDataType
    : dataType                                                       # ReturnValueDataType
    | VOID_DATATYPE                                                  # ReturnVoidDataType
    ;

mainSection
    : MAIN_SECTION statement*
    ;

statement
    : blockStatement                                                 # CompositeStatement
    | IF PAREN_OPEN condition=expression PAREN_CLOSE
      trueStatement=statement (ELSE falseStatement=statement)?       # IfStatement
    | WHILE PAREN_OPEN condition=expression PAREN_CLOSE statement    # WhileLoop
    | DO statement WHILE
      PAREN_OPEN condition=expression PAREN_CLOSE END_STATEMENT      # DoWhileLoop
    | FOR PAREN_OPEN
      initializer=variableDeclaration END_STATEMENT
      condition=expression END_STATEMENT
      step=expression
      PAREN_CLOSE statement                                          # ForLoop
    | basicStatement END_STATEMENT                                   # SimpleStatement
    ;

blockStatement
    : CURLY_OPEN statement* CURLY_CLOSE
    ;

basicStatement
    : variableDeclaration                                            # DeclarationStatement
    
    | PRINT expression                                               # PrintStatement
    | READ IDENTIFIER                                                # ReadStatement
    
    | RETURN                                                         # ReturnVoidStatement
    | RETURN expression                                              # ReturnValueStatement
      
    | expression                                                     # ExpressionStatement
    ;

variableDeclaration
    : dataType IDENTIFIER                                            # SimpleDeclaration
    | dataType IDENTIFIER ASSIGN expression                          # AssignDeclaration
    ;

expression
    : operator=(SUBTRACT | NOT) expression                           # UnaryOperation
    | expression
      operator=
      ( MULTIPLY | DIVIDE | MODULO
      | ADD | SUBTRACT
      | AND | OR | XOR
      | LESS | GREATER
      | LESS_OR_EQUAL | GREATER_OR_EQUAL
      | EQUAL | NOT_EQUAL
      )
      expression                                                     # BinaryOperation
    | PAREN_OPEN expression PAREN_CLOSE                              # Parenthesis

    | functionName=IDENTIFIER
      PAREN_OPEN argumentList? PAREN_CLOSE                           # FunctionCall
    | variableValue DOT methodName=IDENTIFIER
      PAREN_OPEN argumentList? PAREN_CLOSE                           # MethodCall
    
    | IDENTIFIER ASSIGN expression                                   # Assignment
    | IDENTIFIER operator=(INCREMENT | DECREMENT)                    # ReAssignment
    | variableValue                                                  # LoadedValue

    | literal                                                        # ConstantValue
    ;

variableValue
    : IDENTIFIER
    ;             

argumentList
    : expression ( COMMA expression )*
    ;

dataType
    : primitiveDataType
    | arrayDataType
    ;
                     
primitiveDataType
    : BOOLEAN_DATATYPE                                               # BooleanDataType
    | INTEGER_DATATYPE                                               # IntegerDataType
    | FLOAT_DATATYPE                                                 # FloatDataType
    | STRING_DATATYPE                                                # StringDataType
    ;

arrayDataType
    : primitiveDataType (SQUARE_OPEN SQUARE_CLOSE)+
    ;

literal
    : value=(TRUE | FALSE)                                           # BooleanLiteral
    | value=INTEGER                                                  # IntegerLiteral
    | value=FLOAT                                                    # FloatLiteral
    | value=STRING                                                   # StringLiteral
    ;    

LINE_COMMENT: '//' .*? (NEWLINE | EOF) -> skip;
BLOCK_COMMENT: '/*' .*? ('*/' | EOF) -> skip;

NEWLINE: [\n\r] -> skip;
WHITESPACE: [\t ] -> skip;

EXTERNAL_SECTION: 'external:';
VARIABLE_SECTION: 'variable:';
FUNCTION_SECTION: 'function:';
MAIN_SECTION: 'main:';

COMMA: ',';
DOT: '.';
END_STATEMENT: ';';

PAREN_OPEN: '(';
PAREN_CLOSE: ')';

SQUARE_OPEN: '[';
SQUARE_CLOSE: ']';

CURLY_OPEN: '{';
CURLY_CLOSE: '}';

PRINT: '<-';
READ: '->';
RETURN: 'return';

IF: 'if';
ELSE: 'else';

WHILE: 'while';
DO: 'do';
FOR: 'for';

MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';

INCREMENT: '++';
DECREMENT: '--';

ADD: '+';
SUBTRACT: '-';

NOT: '!';
AND: '&';
OR: '|';
XOR: '^';

LESS_OR_EQUAL: '<=';
GREATER_OR_EQUAL: '>=';

LESS: '<';
GREATER: '>';

EQUAL: '==';
NOT_EQUAL: '!=';

ASSIGN: '=';

VOID_DATATYPE: 'void';
BOOLEAN_DATATYPE: 'bool';
INTEGER_DATATYPE: 'int';
FLOAT_DATATYPE: 'float';
STRING_DATATYPE: 'string';

STRING: '"' (~[\n\r])*? '"';
FLOAT: ('0' | [1-9][0-9]*)'.'[0-9]*;
INTEGER: '0' | [1-9][0-9]*;
TRUE: 'true';
FALSE: 'false';

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;