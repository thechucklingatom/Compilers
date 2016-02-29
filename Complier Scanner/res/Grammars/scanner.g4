grammar scanner;
pre : start EOF ;
start : start start 
            | KEYWORD WS IDENTIFIER WS OPERATOR WS STRINGLITERAL OPERATOR WS 
            | KEYWORD WS declare+ 
            | KEYWORD WS IDENTIFIER WS 
            | KEYWORD WS 
            | functiondeclaration WS 
            | statement WS 
            | assignment WS 
            | returnstatement WS 
            | functionexecute;
declare : IDENTIFIER OPERATOR WS*;
function : KEYWORD WS KEYWORD WS IDENTIFIER WS OPERATOR (KEYWORD WS declare)+ 
            | KEYWORD WS OPERATOR WS* IDENTIFIER WS* OPERATOR  OPERATOR 
            | KEYWORD WS KEYWORD WS IDENTIFIER WS* OPERATOR OPERATOR;
statement : KEYWORD WS* OPERATOR (IDENTIFIER | INTLITERAL) WS OPERATOR WS (IDENTIFIER | INTLITERAL) OPERATOR 
            | IDENTIFIER OPERATOR (IDENTIFIER | INTLITERAL) WS* OPERATOR WS* (IDENTIFIER | INTLITERAL) OPERATOR 
            | KEYWORD OPERATOR (IDENTIFIER | INTLITERAL) OPERATOR+ 
            | IDENTIFIER OPERATOR (IDENTIFIER | INTLITERAL) OPERATOR+; 
assignment : IDENTIFIER WS* OPERATOR (WS* (IDENTIFIER | INTLITERAL) WS* OPERATOR+)+ 
            | IDENTIFIER WS* OPERATOR WS* statement OPERATOR 
            | IDENTIFIER WS* OPERATOR* WS* statement OPERATOR*;
returnstatement : KEYWORD WS (INTLITERAL | statement (OPERATOR (statement | INTLITERAL))*) OPERATOR;
functiondeclaration : KEYWORD WS KEYWORD WS IDENTIFIER WS OPERATOR (KEYWORD WS IDENTIFIER OPERATOR*)+ OPERATOR 
            | KEYWORD WS KEYWORD WS IDENTIFIER WS* OPERATOR OPERATOR;
functionexecute : KEYWORD WS* OPERATOR (IDENTIFIER OPERATOR)* OPERATOR WS* ;
WS : [ \t\r\n]+;
KEYWORD : 'PROGRAM' 
            | 'BEGIN' 
            | 'STRING' 
            | 'WHILE' 
            | 'INT' 
            | 'WRITE' 
            | 'READ' 
            | 'IF' 
            | 'ELSE' 
            | 'ENDIF' 
            | 'ENDWHILE' 
            | 'END' 
            | 'VOID' 
            | 'FUNCTION' 
            | 'RETURN' 
            | 'FLOAT';
COMMENT : '--' ~( '\r' | '\n')*;
OPERATOR: ';' 
            | '+' 
            | '<' 
            | '>' 
            | '-' 
            | '>=' 
            | '<=' 
            | '!=' 
            | '==' 
            | ',' 
            | '(' 
            | ')' 
            | '|' 
            | '&&' 
            | '*' 
            | '/' 
            | ':=' 
            | '=' ;
STRINGLITERAL : '"' ~'"'* '"';
INTLITERAL : [0-9]+;
FLOATLITERAL :  [0-9]+[.][0-9]+;
IDENTIFIER : [A-Za-z][A-Za-z0-9]*;
