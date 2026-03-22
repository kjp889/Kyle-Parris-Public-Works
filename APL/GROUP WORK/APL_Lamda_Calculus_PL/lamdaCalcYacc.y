//<expr>::= <var> | <func> <arg> | #<var>.<expr>
//<func>::= <var> | <func> <arg> | #<var>.<expr>
//<arg>::= <var> | <func> <arg> | #<var>.<expr>
//<var>::= a-z

%{
#include <stdio.h>
#include <string.h>
#include "y.tab.h"

void yyerror(const char *str)
{
    fprintf(stderr,"error: %s\n",str);
}

int yywrap()
{
    return 1;
}

void main(){
  
    yyparse();
}

%}

%token VAR NAME LAMBDATKN OBRACETKN CBRACETKN PLUSTKN MINUSTKN TIMESTKN DIVIDETKN DOTTKN 

%%

commands: /*empty */
        | commands command
        ;

command:
        application
        |
        abstraction
        ;


abstraction:
        LAMBDATKN VAR DOTTKN OBRACETKN NAME CBRACETKN 
        {
            printf("\tTHIS IS AN ABSTRACTION\n");
        }
        ;

application:
        VAR OBRACETKN NAME CBRACETKN 
        {
            printf("\tTHIS IS AN APPLICATION \n");
        }
        ;
        
%%