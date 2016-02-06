grammar test;

r : STATEMENT | r r;
ID : [A-Za-z ]+ {System.out.println("found something");};
KEYWORD : 'PROGRAM' | 'STRING' | 'BEGIN' | 'END' | 'INT' | 'FUNCTION' | 'VOID' | 'WHILE' | 'WRITE' | 'FLOAT' | 'READ' | 'ENDWHILE' | 'ENDIF' | 'IF' | 'RETURN' | 'ELSE' ;
OPERATOR: ';' | '+' | '=' | ASSIGNMENT | '<' | '>' | '-' | '>=' | '<=' | '!=' | '==' | ',' | '(' | ')' | '|' | '&&' | '*' | '/' ;
STATEMENT : KEYWORD WS IDENTIFIER WS ASSIGNMENT WS LITERAL ENDOFLINE | KEYWORD WS IDENTIFIER ENDOFLINE;
IDENTIFIER : [A-Za-z ]+;
LITERAL : STRINGLITERAL | FLOATLITERAL | INTLITERAL ;
ASSIGNMENT : ':=';
STRINGLITERAL : '"'[.:\\ ]*'"';
FLOATLITERAL :  [0-9]+[.][0-9]+;
INTLITERAL  : [0-9]+ ;
ENDOFLINE : [;][\n\r] | [\n\r] ;
WS : [ \t]+ ;
