grammar scanner;

@header{

import java.util.HashMap;
import java.util.Stack;


}

@parser::members{

    
    int numBlock = 0;

    public HashMap<String, STC> ST = new HashMap();
    static Stack myStack = new Stack();

    public String returnNonNull(String string1, String string2)
    {
    if (string1 != null && string2 != null)
    {
    return null;
    }
    else if (string1 == null && string2 == null)
    {
    return null;
    }
    else if (string1 == null)
    {
    return string2;
    }
    else
    {
    return string1;
    }

    }


}

pre : start EOF {};
start : start start 
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'PROGRAM' WS IDENTIFIER WS                                                                                                            
        //PROGRAM TEST
        {myStack.push("GLOBAL");}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'PROGRAM' WS IDENTIFIER WS KEYWORD WS                                                                                                     
        //PROGRAM TEST BEGIN
        {myStack.push("GLOBAL");}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | KEYWORD WS                                                                                                                                    
        //BEGIN

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | SCOPEEND WS
        //ENDWHILE
        {myStack.pop();}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | (INTTYPE | FLOATTYPE) WS IDENTIFIER variabledeclaration                                                                                                     
        //INT a, b;
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC(returnNonNull($INTTYPE.text, $FLOATTYPE.text), "noValue", (String) myStack.peek())));
            }
        else
            {
            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }
        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | (STRINGTYPE WS)? IDENTIFIER WS* ':=' WS* STRINGLITERAL ';' WS
        //STRING str := "test";
        {
        if (!ST.containsKey($IDENTIFIER.text) || (ST.containsKey($IDENTIFIER.text) && $STRINGTYPE == null))
            {
            ST.put($IDENTIFIER.text, (new STC("String", ($STRINGLITERAL.text).substring(1, ($STRINGLITERAL.text).length()-1), (String) myStack.peek())));
            }
        else
            {
            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }


        }
        
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////       
        | (INTTYPE WS)? IDENTIFIER ':=' INTLITERAL ';' WS                                                                                          
         //INT num := 12;
        {
        if (!ST.containsKey($IDENTIFIER.text) || (ST.containsKey($IDENTIFIER.text) && $INTTYPE == null))
            {
            ST.put($IDENTIFIER.text, (new STC("String", ($STRINGLITERAL.text).substring(1, ($STRINGLITERAL.text).length()-1), (String) myStack.peek())));
            }
        else
            {
            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }
        


        }
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        | (FLOATTYPE WS)? IDENTIFIER ':=' FLOATLITERAL ';' WS                                                                                        
        //FLOAT fraction := 1.5;
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'FUNCTION' WS (INTTYPE | FLOATTYPE | 'VOID') WS IDENTIFIER WS* '(' functionargs ')' WS                                                                
        //FUNCTION VOID printout (INT a,INT b,INT c)
        {
        myStack.push($IDENTIFIER.text);


        }
////////////////////////////////////////////////////////////////////////////////////////////////

        

        | IDENTIFIER WS* ':=' WS* '('* variable ')'* mathoperation                                                                         
         //c:=(a*3+i)+p*p+5+j+k+3+y*u/r;
//////////////////////////////////////////////////////////////////////////////////////////////////        

        | 'RETURN' WS variable mathoperation
        // RETURN F(n-1, n-2)+F(n-2);

//////////////////////////////////////////////////////////////////////////////////////////////////
        | SYSTEMFUNCTION WS* '(' inputargs ')' ';' WS                                                                                           
        //WRITE (a+2, b+b, c);

/////////////////////////////////////////////////////////////////////////////////////////////////////

        | CONDITIONAL WS* '(' variable conditionalargs ')' WS                                                                                   
        //WHILE (x1-x2 > error+x3)
        {
        numBlock++;
        myStack.push("BLOCK " + numBlock);




        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        | COMMENT;





variabledeclaration : ',' WS* IDENTIFIER variabledeclaration 
{
//System.out.println($IDENTIFIER.text + "Variable");




//TODO ADD the variable to the hashmap



}

                    | ';' WS;
mathoperation : ';' WS | WS* MATHOPERATOR WS* '('* variable ')'* mathoperation;
functionargs : (INTTYPE | FLOATTYPE) WS IDENTIFIER functionargs2 | ;                                                             //FUNCTION INT main(int a, int b)
functionargs2 : ',' WS* (INTTYPE | FLOATTYPE) WS IDENTIFIER functionargs2 | ;
inputargs : variable inputargs2 | ;                                                                            //WRITE(a, b)
inputargs2 : ',' WS* IDENTIFIER inputargs2 | WS* MATHOPERATOR WS* '('* variable ')'* inputargs2 | ;
conditionalargs : WS* MATHOPERATOR WS* variable conditionalargs | WS* COMPARISONOPERATOR WS* '('* variable ')'* conditionalargs2; 
conditionalargs2 : WS* MATHOPERATOR WS* variable '('* conditionalargs2 ')'* | ;



variable : IDENTIFIER|INTLITERAL|FLOATLITERAL | functionvariable;
functionvariable : IDENTIFIER '(' inputargs ')';


WS : ([ \t\r\n]+ COMMENT? [ \t\r\n]*)+;


STRINGTYPE : 'STRING';

SYSTEMFUNCTION : 'READ'
                | 'WRITE';

CONDITIONAL : 'IF'
            | 'WHILE';



KEYWORD : 'BEGIN' 
            | 'ELSE';



SCOPEEND :  'END'         
            | 'ENDIF'        
            | 'ENDWHILE';   


//NUMTYPE : 'INT'
//            | 'FLOAT';

INTTYPE : 'INT';

FLOATTYPE : 'FLOAT';


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