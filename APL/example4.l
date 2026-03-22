%{
#include <stdio.h>
#include "y.tab.h"
%}

%%
[0123456789]+           return NUMBER;
heat                    return HEATTOKEN;
[a-zA-Z0-9\/.-]*        printf("FileName ");
\"                      printf("Quote "); 
\{                      printf("Obrace ");
\}                      printf("Cbrace ");
;                       printf("Semicolon ");
\n                      printf("\n");
[ \t]+                  /* ignore whitespace */;
\"[a-zA-Z0-9 \t]*\"        printf("String ");
%%