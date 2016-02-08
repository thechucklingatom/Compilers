grammar scanner;

START : WS | START+
WS : [ \t\r\n]+ ;
KEYWORD : 'PROGRAM' | 'BEGIN' | 'STRING';
OPERATOR : ':=' | ';';
STRINGLITERAL : '"'.*?'"';
INTLITERAL : [0-9]+;
IDENTIFIER : [A-Za-z][A-Za-z0-9]*;