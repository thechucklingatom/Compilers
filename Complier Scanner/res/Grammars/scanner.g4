grammar scanner;

@header{

import java.util.HashMap;
import java.util.Stack;
import java.util.ArrayList;


}

@parser::members{

    
    int numBlock = 0;

    ArrayList<String> textArray = new ArrayList<>();
    public HashMap<String, STC> ST = new HashMap();
    static Stack<String> myStack = new Stack();
    static Stack<String> tempStack = new Stack();

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

pre : start EOF {


//Pop global String stack here

for (String s : textArray)
{
System.out.println(s);



}







};
start : start start 
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'PROGRAM' WS IDENTIFIER WS                                                                                                            
        //PROGRAM TEST
        {

        myStack.push("GLOBAL");
        textArray.add("Symbol table GLOBAL");

        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'PROGRAM' WS IDENTIFIER WS KEYWORD WS                                                                                                     
        //PROGRAM TEST BEGIN
        {

        myStack.push("GLOBAL");
        textArray.add("Symbol table GLOBAL");
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
        //INT a;
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC($INTTYPE.text, "noValue", (String) myStack.peek())));

            //textArray.add("name " + $IDENTIFIER.text + " type INT");
            String text = ("name " + $IDENTIFIER.text + " type INT");
            tempStack.push(text);

            //POP Stack here
            ////////
            while (!tempStack.empty())
            {
            textArray.add(tempStack.pop());
            }
            }
         //Scope is different between two variables of the same name. Ex Int a (Scope Global), Int a (Scope FunctionName)
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("INT", $INTLITERAL.text, (String) myStack.peek())));
         

        //textArray.add("name " + $IDENTIFIER.text + " type INT");
        String text = ("name " + $IDENTIFIER.text + " type INT");
        tempStack.push(text);

        //POP Stack here
        while (!tempStack.empty())
        {
        textArray.add(tempStack.pop());
        }
         }
        else
            {
            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
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
            //textArray.add("name " + $IDENTIFIER.text + " type FLOAT");
            String text = "name " + $IDENTIFIER.text + " type FLOAT";
            tempStack.push(text);


            //POP stack here
            while (!tempStack.empty())
        {
        textArray.add(tempStack.pop());
        }

            
            }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("FLOAT", $FLOATLITERAL.text, (String) myStack.peek())));
         //textArray.add("name " + $IDENTIFIER.text + " type FLOAT");
         String text = "name " + $IDENTIFIER.text + " type FLOAT";
         tempStack.push(text);

         //POP Stack here
         while (!tempStack.empty())
        {
        textArray.add(tempStack.pop());
        }
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
            ST.put($IDENTIFIER.text, (new STC("STRING", ($STRINGLITERAL.text).substring(1, ($STRINGLITERAL.text).length()-1), (String) myStack.peek())));
            textArray.add("name " + $IDENTIFIER.text + " type STRING value " + $STRINGLITERAL.text);
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
            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
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
            textArray.add("name " + $IDENTIFIER.text + " type INT");
            }
         //Modifying the value of the given variable
         else if (ST.containsKey($IDENTIFIER.text) && $INTTYPE == null)
         {
         ST.put($IDENTIFIER.text, (new STC("INT", $INTLITERAL.text, ST.get($IDENTIFIER.text).scope)));
         }
         //Creating a new variable with the same name, but in a different scope
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("INT", $INTLITERAL.text,(String) myStack.peek())));
         textArray.add("name " + $IDENTIFIER.text + " type INT");
         }
        else
         {
            textArray.add(ST.get($IDENTIFIER.text).scope);
            textArray.add((String) myStack.peek());

            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
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
            textArray.add("name " + $IDENTIFIER.text + " type FLOAT");
            }
         //Modifying the given variable
         else if (ST.containsKey($IDENTIFIER.text) && $FLOATTYPE == null)
         {
         ST.put($IDENTIFIER.text, (new STC("FLOAT", $FLOATLITERAL.text, ST.get($IDENTIFIER.text).scope)));
         }
         //Creating a new variable with the same name, but in a different scope
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("FLOAT", $FLOATLITERAL.text, (String) myStack.peek())));
         textArray.add("name " + $IDENTIFIER.text + " type FLOAT");
         }
        else
            {
            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
            System.exit(0);
            }
        

            
        }
        

        
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'FUNCTION' WS (INTTYPE | FLOATTYPE | 'VOID') WS IDENTIFIER WS* '(' functionargs ')' WS                                                                
        //FUNCTION VOID printout (INT a,INT b,INT c)
        {

        myStack.push($IDENTIFIER.text);
        //textArray.add();
        //textArray.add("Symbol table " + $IDENTIFIER.text);

         String text = (System.lineSeparator() + "Symbol table " + $IDENTIFIER.text);
         tempStack.push(text);
        //POP Stack here
         while (!tempStack.empty())
        {
        textArray.add(tempStack.pop());
        }


        
        }
////////////////////////////////////////////////////////////////////////////////////////////////

        

        | IDENTIFIER WS* ':=' WS* '('* variable ')'* mathoperation                                                                         
         //c:=(a*3+i)+p*p+5+j+k+3+y*u/r;
{



}
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

        textArray.add("");
        textArray.add("Symbol table BLOCK " + numBlock);




        }
//////////////////////////////////////////////////////////////////////////
        | ELSEBLOCK WS
        //ELSE
        {
        numBlock++;
        myStack.push("BLOCK " + numBlock);


        textArray.add("");
        textArray.add("Symbol table BLOCK " + numBlock);


        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        | COMMENT;





intvariabledeclaration : ',' WS* IDENTIFIER intvariabledeclaration 
{
        {
        if (!ST.containsKey($IDENTIFIER.text))
            {
            ST.put($IDENTIFIER.text, (new STC("INT", "noValue", (String) myStack.peek())));
            //textArray.add("name " + $IDENTIFIER.text + " type INT");
            String text = ("name " + $IDENTIFIER.text + " type INT");
            tempStack.push(text);
            }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("INT", "noValue", (String) myStack.peek())));
         //textArray.add("name " + $IDENTIFIER.text + " type INT");
         String text = ("name " + $IDENTIFIER.text + " type INT");
         tempStack.push(text);
         }
        else
            {
            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
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
            //textArray.add("name " + $IDENTIFIER.text + " type FLOAT");
            String text = "name " + $IDENTIFIER.text + " type FLOAT";
            tempStack.push(text);
            }
         else if (!ST.get($IDENTIFIER.text).scope.equals((String) myStack.peek()))
         {
         ST.put($IDENTIFIER.text, (new STC("FLOAT", "noValue", (String) myStack.peek())));
         textArray.add("name " + $IDENTIFIER.text + " type FLOAT");
         String text = "name " + $IDENTIFIER.text + " type FLOAT";
         tempStack.push(text);
         }
        else
            {
            System.out.println("DECLARATION ERROR " + $IDENTIFIER.text);
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
            //textArray.add("name " + $IDENTIFIER.text + " type FLOAT");
            String text = ("name " + $IDENTIFIER.text + " type FLOAT");
            tempStack.push(text);            

}
else
{
            ST.put($IDENTIFIER.text, (new STC($INTTYPE.text, "noValue", (String) myStack.peek())));
            //textArray.add("name " + $IDENTIFIER.text + " type INT");
            String text = ("name " + $IDENTIFIER.text + " type INT");
            tempStack.push(text);
}
} | ;                                                             //FUNCTION INT main(int a, int b)
functionargs2 : ',' WS* (INTTYPE | FLOATTYPE) WS IDENTIFIER functionargs2
{
if ($FLOATTYPE != null)
{

            ST.put($IDENTIFIER.text, (new STC($FLOATTYPE.text, "noValue", (String) myStack.peek())));
            //textArray.add("name " + $IDENTIFIER.text + " type FLOAT");
            String text = ("name " + $IDENTIFIER.text + " type FLOAT");
            tempStack.push(text);            

}
else
{
            ST.put($IDENTIFIER.text, (new STC($INTTYPE.text, "noValue", (String) myStack.peek())));
            //textArray.add("name " + $IDENTIFIER.text + " type INT");
            String text = ("name " + $IDENTIFIER.text + " type INT");
            tempStack.push(text);
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
