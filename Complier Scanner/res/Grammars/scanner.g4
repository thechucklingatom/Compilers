grammar scanner;

start : start start | .+?;
WS : [ \t\r\n]+ -> skip;
KEYWORD : 'PROGRAM' | 'BEGIN' | 'STRING' | 'WHILE';
OPERATOR : ':=' | ';' | '(' | ')' | '!=' |'-' | '+' | '=' |',';
STRINGLITERAL : '"' ~'"'* '"';
INTLITERAL : [0-9]+;
IDENTIFIER : [A-Za-z][A-Za-z0-9]*;