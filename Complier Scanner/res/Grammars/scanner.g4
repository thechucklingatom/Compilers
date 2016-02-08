grammar scanner;

start : start start | .+?;
WS : [ \t\r\n]+ -> skip;
KEYWORD : 'PROGRAM' | 'BEGIN' | 'STRING' | 'WHILE' | 'INT' | 'WRITE' | 'READ' | 'IF' | 'ELSE' |'ENDIF' | 'ENDWHILE' | 'END' | 'VOID' | 'FUNCTION';
OPERATOR : ':=' | ';' | '(' | ')' | '!=' |'-' | '+' | '=' |',';
STRINGLITERAL : '"' ~'"'* '"';
INTLITERAL : [0-9]+;
IDENTIFIER : [A-Za-z][A-Za-z0-9]*;