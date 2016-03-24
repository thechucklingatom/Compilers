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
        {

        myStack.push("GLOBAL");
        System.out.println("Symbol table GLOBAL");

        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'PROGRAM' WS IDENTIFIER WS KEYWORD WS                                                                                                     
        //PROGRAM TEST BEGIN
        {

        myStack.push("GLOBAL");
        System.out.println("Symbol table GLOBAL");
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | KEYWORD WS                                                                                                                                    
        //BEGIN

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | SCOPEEND WS
        //ENDWHILE

        {myStack.pop();}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | (INTTYPE) WS IDENTIFIER intvariabledeclaration                                                                                                     
        //INT a, b;
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC($INTTYPE.text, "noValue", (String) myStack.peek())));

            System.out.println("name " + $IDENTIFIER.text + " type INT");

            //POP Stack here
            ////////
            }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("INT", $INTLITERAL.text, (String) myStack.peek())));
         System.out.println("name " + $IDENTIFIER.text + " type INT");
         }
        else
            {
            System.out.println("1DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | (FLOATTYPE) WS IDENTIFIER floatvariabledeclaration                                                                                                     
        //FLOAT a, b;
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC($FLOATTYPE.text, "noValue", (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type FLOAT");            
            }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("FLOAT", $FLOATLITERAL.text, (String) myStack.peek())));
         System.out.println("name " + $IDENTIFIER.text + " type FLOAT");
         }
         

        else
            {
            System.out.println("2DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }
        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | (STRINGTYPE WS)? IDENTIFIER WS* ':=' WS* STRINGLITERAL ';' WS
        //STRING str := "test";
        {
        if (!ST.containsKey($IDENTIFIER.text) || (ST.containsKey($IDENTIFIER.text) && $STRINGTYPE == null))
            {
            ST.put($IDENTIFIER.text, (new STC("STRING", ($STRINGLITERAL.text).substring(1, ($STRINGLITERAL.text).length()-1), (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type STRING value " + $STRINGLITERAL.text);
            }
         else if (ST.containsKey($IDENTIFIER.text) && $STRINGTYPE == null)
         {
         ST.put($IDENTIFIER.text, (new STC("STRING", $STRINGLITERAL.text, ST.get($IDENTIFIER.text).scope)));
         }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("STRING", $STRINGLITERAL.text, (String) myStack.peek())));
         }
         
        else
            {
            System.out.println("3DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }


        }
        
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////       
        | (INTTYPE WS)? IDENTIFIER ':=' INTLITERAL ';' WS                                                                                          
         //INT num := 12;
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC("INT", $INTLITERAL.text, (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type INT");
            }
         else if (ST.containsKey($IDENTIFIER.text) && $INTTYPE == null)
         {
         ST.put($IDENTIFIER.text, (new STC("INT", $INTLITERAL.text, ST.get($IDENTIFIER.text).scope)));
         }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("INT", $INTLITERAL.text,(String) myStack.peek())));
         }
        else
         {
            System.out.println(ST.get($IDENTIFIER.text).scope);
            System.out.println((String) myStack.peek());

            System.out.println("4DECLARATION ERROR " + $IDENTIFIER.text);
            //System.exit(0);
         }
        


        }
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        | (FLOATTYPE WS)? IDENTIFIER ':=' FLOATLITERAL ';' WS                                                                                        
        //FLOAT fraction := 1.5;
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC("FLOAT", $FLOATLITERAL.text, (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type FLOAT");
            }
         else if (ST.containsKey($IDENTIFIER.text) && $FLOATTYPE == null)
         {
         ST.put($IDENTIFIER.text, (new STC("FLOAT", $FLOATLITERAL.text, ST.get($IDENTIFIER.text).scope)));
         }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("FLOAT", $FLOATLITERAL.text, (String) myStack.peek())));
         }
        else
            {
            System.out.println("5DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }
        

            
        }
        

        
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'FUNCTION' WS (INTTYPE | FLOATTYPE | 'VOID') WS IDENTIFIER WS* '(' functionargs ')' WS                                                                
        //FUNCTION VOID printout (INT a,INT b,INT c)
        {

        myStack.push($IDENTIFIER.text);
        System.out.println("Symbol Table " + $IDENTIFIER.text);
        
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
        System.out.println("Symbol Table BLOCK " + numBlock);




        }
//////////////////////////////////////////////////////////////////////////
        | ELSEBLOCK WS
        //ELSE
        {
        numBlock++;
        myStack.push("BLOCK " + numBlock);
        System.out.println("Symbol Table BLOCK " + numBlock);


        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        | COMMENT;





intvariabledeclaration : ',' WS* IDENTIFIER intvariabledeclaration 
{
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC("INT", "noValue", (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type INT");
            }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("INT", "noValue", (String) myStack.peek())));
         System.out.println("name " + $IDENTIFIER.text + " type INT");
         }
        else
            {
            System.out.println("6DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }
        }
}
| ';' WS;



floatvariabledeclaration : ',' WS* IDENTIFIER floatvariabledeclaration 
{
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC("FLOAT", "noValue", (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type FLOAT");
            }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("FLOAT", "noValue", (String) myStack.peek())));
         System.out.println("name " + $IDENTIFIER.text + " type FLOAT");
         }
        else
            {
            System.out.println("7DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }
        }
}
| ';' WS;

mathoperation : ';' WS | WS* MATHOPERATOR WS* '('* variable ')'* mathoperation;
functionargs : (INTTYPE | FLOATTYPE) WS IDENTIFIER functionargs2
{



if ($FLOATTYPE != null)
{

            ST.put($IDENTIFIER.text, (new STC($FLOATTYPE.text, "noValue", (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type FLOAT");            

}
else
{
            ST.put($IDENTIFIER.text, (new STC($INTTYPE.text, "noValue", (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type INT");
}
} | ;                                                             //FUNCTION INT main(int a, int b)
functionargs2 : ',' WS* (INTTYPE | FLOATTYPE) WS IDENTIFIER functionargs2
{
if ($FLOATTYPE != null)
{

            ST.put($IDENTIFIER.text, (new STC($FLOATTYPE.text, "noValue", (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type FLOAT");            

}
else
{
            ST.put($IDENTIFIER.text, (new STC($INTTYPE.text, "noValue", (String) myStack.peek())));
            System.out.println("name " + $IDENTIFIER.text + " type INT");
}

}




 | ;
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



KEYWORD : 'BEGIN';

ELSEBLOCK : 'ELSE';


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
