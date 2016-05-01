grammar scanner;

@header{

import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.ArrayList;
import com.CSCI468.IR2TinyConverter.IR2Tiny;


}

@parser::members{

    
    int numBlock = 0;
    int registerCounter = 1;
    int labelCounter = 1;

    ArrayList<String> textArray = new ArrayList<>();
    ArrayList<String> IRList = new ArrayList<>();
    ArrayList<String> variableList = new ArrayList<>();
    public HashMap<String, STC> ST = new HashMap();
    static Stack<String> myStack = new Stack();
    static Stack<String> tempStack = new Stack();
    PriorityBlockingQueue<String> writeStack = new PriorityBlockingQueue();
    IR2Tiny irConverter = new IR2Tiny();


}

pre : start EOF {


//Pop global String stack here

for (String s : textArray)
{
System.out.println(s);

}
IRList.add(";RET");
IRList.add(";tiny code");
for(String s : IRList){
    System.out.println(s);                         
}

irConverter.startConversion(IRList);





};
start : start start 
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        | 'PROGRAM' WS IDENTIFIER WS                                                                                                            
        //PROGRAM TEST
        {

        myStack.push("GLOBAL");
        textArray.add("Symbol table GLOBAL");
        IRList.add(";IR Code");

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
            String text = ("var" + $IDENTIFIER.text);
            tempStack.push(text);

            //POP Stack here
            ////////
            while (!tempStack.empty())
            {
                variableList.add(tempStack.pop());
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
        
        variableList.add("str " + $IDENTIFIER.text + " " + $STRINGLITERAL.text);

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
        
        IRList.add(";STOREI " + $INTLITERAL.text + " \$T" + registerCounter);
        IRList.add(";STOREI \$T" + registerCounter++ + " " + $IDENTIFIER.text);
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
        
        IRList.add(";STOREF " + $INTLITERAL.text + " \$T" + registerCounter);
        IRList.add(";STOREF \$T" + registerCounter++ + " " + $IDENTIFIER.text);
            
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
         IRList.add(";LABEL " + $IDENTIFIER.text);
         IRList.add(";LINK");
        //POP Stack here
         while (!tempStack.empty())
        {
        textArray.add(tempStack.pop());
        }


        
        }
////////////////////////////////////////////////////////////////////////////////////////////////

        

        | IDENTIFIER WS* ':=' WS* '('* variable ')'* mathoperation  
            {
                //var declaration happening here, instead of the other two places
                //fixing the store.
                PriorityBlockingQueue<String> temp = new PriorityBlockingQueue<>();
                boolean varAssignment = false;
                while(!writeStack.isEmpty()){ 
                    if(writeStack.size() == 1 && ST.containsKey(writeStack.peek())){
                        varAssignment = true;                           
                    }
                    temp.add(writeStack.remove());
                }
                
                if(varAssignment && temp.size() == 2){
                    String literal = temp.remove();
                    String var = temp.remove();
                    if(ST.get(var).getType().matches("INT")){
                        IRList.add(";STOREI " + literal + " \$T" + registerCounter);
                        IRList.add(";STOREI \$T" + registerCounter++ + " " + var);                    
                    }else if(ST.get(var).getType().matches("FLOAT")){
                        IRList.add(";STOREF " + literal + " \$T" + registerCounter);
                        IRList.add(";STOREF \$T" + registerCounter++ + " " + var);      
                    }else if(ST.get(var).getType().matches("STRING")){                     
                    }
                }else if(varAssignment && temp.size() == 2){
                    System.out.println("Large assignment, maybe math");
                }
                
            }                                                                       
         //c:=(a*3+i)+p*p+5+j+k+3+y*u/r;
{



}
//////////////////////////////////////////////////////////////////////////////////////////////////        

        | 'RETURN' WS variable mathoperation
            {
                while(!writeStack.isEmpty()){
                    writeStack.remove();
                }
            } 
        // RETURN F(n-1, n-2)+F(n-2);

//////////////////////////////////////////////////////////////////////////////////////////////////
        | SYSTEMFUNCTION WS* '(' inputargs ')' ';' WS                                                                                           
        //WRITE (a+2, b+b, c);
        {
            if($SYSTEMFUNCTION.text.equals("WRITE")){
                while(!writeStack.isEmpty()){
                    String temp = writeStack.remove();
                    if(ST.containsKey(temp)){
                        if(ST.get(temp).getType().matches("INT")){
                            IRList.add(";WRITEI " + temp);                     
                        }else if(ST.get(temp).getType().matches("FLOAT")){
                            IRList.add(";WRITEF " + temp);                     
                        }else if(ST.get(temp).getType().matches("STRING")){
                            IRList.add(";WRITES " + temp);                     
                        }
                    }else{
                         
                    }
                }
            }else{
                while(!writeStack.isEmpty()){
                    writeStack.remove();
                }
            }
        }

/////////////////////////////////////////////////////////////////////////////////////////////////////

        | CONDITIONAL WS* '(' variable conditionalargs ')' WS                                                                                   
        //WHILE (x1-x2 > error+x3)
        {
        numBlock++;
        myStack.push("BLOCK " + numBlock);

        textArray.add("");
        textArray.add("Symbol table BLOCK " + numBlock);
        
        IRList.add(";LABEL label" + labelCounter++);

        while(!writeStack.isEmpty()){
            writeStack.remove();
        }


        }
//////////////////////////////////////////////////////////////////////////
        | ELSEBLOCK WS
        //ELSE
        {
        numBlock++;
        myStack.push("BLOCK " + numBlock);


        textArray.add("");
        textArray.add("Symbol table BLOCK " + numBlock);
        
        IRList.add(";LABEL label" + labelCounter++);

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
inputargs2 : ',' WS* IDENTIFIER inputargs2 { writeStack.add($IDENTIFIER.text); }| WS* MATHOPERATOR WS* '('* variable ')'* inputargs2 | ;
conditionalargs : WS* MATHOPERATOR WS* variable conditionalargs 
    | WS* COMPARISONOPERATOR WS* '('* variable ')'* conditionalargs2
    {
        if($COMPARISONOPERATOR.text.equals("<=")){
            //add jump instruction here
        }else if($COMPARISONOPERATOR.text.equals("==")){
            //add jump instruction here
        }else if($COMPARISONOPERATOR.text.equals("!=")){
            //add jump instruction here
        }else if($COMPARISONOPERATOR.text.equals(">=")){
            //add jump instruction here
        }else if($COMPARISONOPERATOR.text.equals("<=")){
            //add jump instruction here
        }else if($COMPARISONOPERATOR.text.equals("<")){
            //add jump instruction here
        }else if($COMPARISONOPERATOR.text.equals(">")){
            //add jump instruction here
        }else if($COMPARISONOPERATOR.text.equals("=")){
            //add jump instruction here
        }
    }; 
conditionalargs2 : WS* MATHOPERATOR WS* variable '('* conditionalargs2 ')'* | ;



variable : IDENTIFIER { writeStack.add($IDENTIFIER.text); } 
    |INTLITERAL { writeStack.add($INTLITERAL.text); } 
    |FLOATLITERAL { writeStack.add($FLOATLITERAL.text); } | functionvariable;
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
