grammar scanner;
pre : start EOF ;
start : start start 
<<<<<<< HEAD
        | 'PROGRAM' WS IDENTIFIER WS                                                                        //PROGRAM TEST
        | 'PROGRAM' WS IDENTIFIER WS KEYWORD WS                                                             //PROGRAM TEST BEGIN
        | KEYWORD WS                                                                                        //END
        | TYPE WS IDENTIFIER variabledeclaration                                                            //INT a, b;
        | (TYPE WS)? IDENTIFIER WS* ':=' WS* STRINGLITERAL ';' WS                                           //STRING str := "test";
        | (TYPE WS)? IDENTIFIER ':=' INTLITERAL ';' WS                                                      //INT num := 12;
        | (TYPE WS)? IDENTIFIER ':=' FLOATLITERAL ';' WS                                                    //FLOAT fraction := 1.5;
        | 'FUNCTION' WS (TYPE | 'VOID') WS IDENTIFIER WS* '(' functionargs ')' WS              //FUNCTION VOID printout (INT a,INT b,INT c)
        | IDENTIFIER WS* ':=' WS* '('* variable ')'* mathoperation              //c:=(a*3+i)+p*p+5+j+k+3+y*u/r;
        | 'RETURN' WS variable mathoperation                                                              // RETURN F(n-1, n-2)+F(n-2);
        | SYSTEMFUNCTION WS* '(' inputargs ')' ';' WS                                                       //WRITE (a+2, b+b, c);
        | CONDITIONAL WS* '(' variable conditionalargs ')' WS                  //WHILE (x1-x2 > error+x3)
        | COMMENT;





variabledeclaration : ',' WS* IDENTIFIER variabledeclaration | ';' WS;
mathoperation : ';' WS | WS* MATHOPERATOR WS* '('* variable ')'* mathoperation;
functionargs : TYPE WS IDENTIFIER functionargs2 | ;                                                         //FUNCTION INT main(int a, int b)
functionargs2 : ',' WS* TYPE WS IDENTIFIER functionargs2 | ;
inputargs : variable inputargs2 | ;                                                                       //WRITE(a, b)
inputargs2 : ',' WS* IDENTIFIER inputargs2 | WS* MATHOPERATOR WS* '('* variable ')'* inputargs2 | ;
conditionalargs : WS* MATHOPERATOR WS* variable conditionalargs | WS* COMPARISONOPERATOR WS* '('* variable ')'* conditionalargs2; 
conditionalargs2 : WS* MATHOPERATOR WS* variable '('* conditionalargs2 ')'* | ;



variable : IDENTIFIER|INTLITERAL|FLOATLITERAL | functionvariable;
functionvariable : IDENTIFIER '(' inputargs ')';


WS : ([ \t\r\n]+ COMMENT? [ \t\r\n]*)+;

SYSTEMFUNCTION : 'READ'
                | 'WRITE';

CONDITIONAL : 'IF'
            | 'WHILE';



KEYWORD : 'BEGIN' 
            | 'END'
            | 'ENDIF' 
            | 'ELSE'
            | 'ENDWHILE'; 


TYPE : 'INT'
            | 'FLOAT'
            | 'STRING';

COMMENT : '--' ~( '\r' | '\n')* -> skip;
OPERATOR:   ',' 
=======
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
>>>>>>> origin/master
            | '(' 
            | ')' 
            | ':=';


MATHOPERATOR: '+'
            | '-'
            | '/'
            | '*'
            | '&&'
            | '|';

COMPARISONOPERATOR: '<' 
                    | '>'
                    | '>=' 
                    | '<=' 
                    | '!=' 
                    | '=='
                    | '=';  

STRINGLITERAL : '"' ~'"'* '"';
INTLITERAL : [0-9]+;
FLOATLITERAL :  [0-9]+[.][0-9]+;
IDENTIFIER : [A-Za-z][A-Za-z0-9]*;
