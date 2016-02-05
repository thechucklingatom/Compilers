grammar test;

r : ID;
ID : [a-z]+ {System.out.println("found something");};
WS : [ \t\n]+ {};