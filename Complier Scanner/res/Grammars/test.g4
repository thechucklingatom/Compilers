grammar test;

r : STATEMENT+;
KEYWORD : 'PROGRAM' | 'STRING' | 'BEGIN' | 'END' | 'INT' | 'FUNCTION' | 'VOID' | 'WHILE' | 'WRITE' | 'FLOAT' | 'READ' | 'ENDWHILE' | 'ENDIF' | 'IF' | 'RETURN' | 'ELSE' ;
OPERATOR: ';' | '+' | '=' | ASSIGNMENT | '<' | '>' | '-' | '>=' | '<=' | '!=' | '==' | ',' | '(' | ')' | '|' | '&&' | '*' | '/' ;
STATEMENT : KEYWORD WS IDENTIFIER WS ASSIGNMENT WS LITERAL ENDOFLINE 
            | KEYWORD WS IDENTIFIER ENDOFLINE 
            | IDENTIFIER WS ASSIGNMENT WS LITERAL ENDOFLINE 
            | KEYWORD ENDOFLINE 
            | FUNCTION ENDOFLINE 
            | WS STATEMENT;
IDENTIFIER : [A-Za-z]+;
FUNCTION : OPERATOR STATEMENT OPERATOR* ;
LITERAL : STRINGLITERAL 
            | FLOATLITERAL 
            | INTLITERAL ;
ASSIGNMENT : ':=';
STRINGLITERAL : '"'[.:\\ ]*'"';
FLOATLITERAL :  [0-9]+[.][0-9]+;
INTLITERAL  : [0-9]+ ;
ENDOFLINE : ';''\r'? '\n' ;
WS : [ \t\r\n]+ ;
