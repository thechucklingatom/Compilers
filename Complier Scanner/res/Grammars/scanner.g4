grammar scanner;

start : WS | start start;
WS : [ \t\r\n]+ ;
KEYWORD : 'PROGRAM' | 'BEGIN' | 'STRING' | 'WHILE';
OPERATOR : ':=' | ';' | '(' | ')' | '!=';
STRINGLITERAL : '"' ~'"'* '"';
INTLITERAL : [0-9]+;
IDENTIFIER : [A-Za-z][A-Za-z0-9]*;