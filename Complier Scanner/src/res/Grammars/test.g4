grammar test;

r : ID | WS | r r;
ID : [A-Za-z ]+ {System.out.println("found something");};
WS : [ \t\n\r]+ ;