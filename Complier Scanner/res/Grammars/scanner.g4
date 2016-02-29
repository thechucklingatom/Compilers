grammar scanner;
pre : start EOF ;
start : start start 
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