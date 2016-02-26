grammar scanner;
pre : start EOF ;
start : start start | KEYWORD;
WS : [ \t\r\n]+ -> skip;
KEYWORD : 'PROGRAM' 
            | 'BEGIN' 
            | 'STRING' 
            | 'WHILE' 
            | 'INT' 
            | 'WRITE' 
            | 'READ' 
            | 'IF' 
            | 'ELSE' 
            |'ENDIF' 
            | 'ENDWHILE' 
            | 'END' 
            | 'VOID' 
            | 'FUNCTION' 
            | 'RETURN' 
            | 'FLOAT';
COMMENT : '--' ~( '\r' | '\n')* -> skip;
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
