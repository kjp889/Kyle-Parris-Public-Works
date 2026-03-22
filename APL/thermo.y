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

main(){
    yyparse();
}

%}

%token NUMBER TOKHEAT TOKTARGET TOKTEMP STATE

%%

commands: /*empty */
        | commands command
        ;

command:
        heat_switch
        |
        target_set
        ;


heat_switch:
        TOKHEAT STATE
        {
            printf("\theat turned on or off\n");
        }
        ;

target_set:
        TOKTARGET TOKTEMP NUMBER
        {
            printf("\ttarget temperature set \n");
        }
        ;
%%