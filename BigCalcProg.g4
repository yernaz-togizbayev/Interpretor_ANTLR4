grammar BigCalcProg;

prog
		: statement + EOF
		;

statement
        : expression ';' # expressionStatement
        | assignment ';' # assignmentStatement
        ;

assignment
		: Var '=' expression
		;

expression  
        : expression op=('*' | '/') expression  	# mulDiv
        | expression op=('+' | '-') expression  	# addSub
        | expression '?' expression ':' expression 	# conditional
        | expression '^' expression					# pow
        | Number                                	# num
        | '(' expression ')'                    	# parentheses
        | Var										# var
        ;

Var
        : [a-zA-Z] Digit*
        ;
        
Number  
        : Digit* '.' Digit+
        | Digit* '.' Digit+ [e|E] [-|+]? Digit
        | Digit+
        ;
		
Digit   
        : [0-9]
        ;
        
WS      : [ \t\r\n\u000C]+ -> skip  
        ;

COMMENT
        :   '/*' .*? '*/' -> skip
        ;

LINE_COMMENT
        : '//' ~[\r\n]* -> skip 
        ;


