grammar test;

r : ID | WS | r r;
ID : [A-Za-z ]+ {System.out.println("found something");};
KEYWORD : 'PROGRAM' | 'STRING' | 'BEGIN' | 'END' | 'INT' | 'FUNCTION' | 'VOID' | 'WHILE' | 'WRITE' | 'FLOAT' | 'READ' | 'ENDWHILE' | 'ENDIF' | 'IF' | 'RETURN' | 'ELSE' ;
OPERATOR: ';' | '+' | '=' | ':=' | '<' | '>' | '-' | '>=' | '<=' | '!=' | '==' | ',' | '(' | ')' | '|' | '&&' | '*' | '/' ;
/*STATEMENT : KEYWORD WS IDENTIFIER WS ASSIGNMENT WS LITERAL | KEYWORD WS IDENTIFIER;*/
//IDENTIFIER : ;
STRINGLITERAL : ('"'.*?'"');
FLOATLITERAL :  [0-9]+[.][0-9]+;
INTLITERAL  : [0-9]+ ;
WS : [ \t\n\r]+ ;
FILEEND : EOF ;
