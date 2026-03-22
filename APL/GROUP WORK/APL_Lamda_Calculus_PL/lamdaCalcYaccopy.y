/*
Group Members
Kyle Parris - 1804904
Chloe Hibbert - 1902963
Pete Aris - 1704057
*/

%{
#include <stdio.h>
#include <string.h>
#include "y.tab.h"

void yyerror(const char *str)
{
    fprintf(stderr,"%s: The Provide Expression is Not a Valid Lambda Calculus Expression.\n\n",str);
}

int yywrap()
{
    return 1;
}

void main()
{
    printf("Enter a lambda calculus expression Press 'ctrl + z' to exit:\n");

    yyparse();
}

void valid()
{
  printf("Valid lambda calculus expression.\n\n");
}


%}

%token VARTKN LAMBDATKN OBRACETKN CBRACETKN DOTTKN NUMTKN

%%

commands: /*empty */
        | commands command
        ;

command:
        expr    
        ;


/* 
  Expression: the most generic rule for any lambda calculus expression.
  It can be a variable, an application of two expressions, or a lambda abstraction.
*/
expr: 
    lambda    
    { 
      //valid(); 
    }
    | arg 
    { 
      //valid(); 
    }
    | expr expr  
    { 
      //valid();
    }
    | VARTKN 
    { 
      valid();
    }
    | NUMTKN
    { 
      valid();
    }
    ;

/* 
  Lambda abstraction: defines the structure of a lambda expression.
  It starts with the keyword 'lambda', followed by a variable name, 
  a dot ('.') to separate the argument from the body, and finally the body expression.
*/
lambda: 
    LAMBDATKN VARTKN DOTTKN expr 
      { 
        //printf("ABSTRACTION"); 
      } 
      ;

arg:
    OBRACETKN expr CBRACETKN
    { 
      //printf("ARGUMENT"); 
    }
    ;

%%