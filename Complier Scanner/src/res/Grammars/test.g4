grammar test;

r : ID | WS | r r;
ID : [0-9~!#$%^&*_+{}|:<>?`\-=\[\];,./A-Za-z ]+ {System.out.println("found something");};
WS : [ \t\n\r]+ ;