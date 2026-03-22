%{
#include <stdio.h>
%}

%%
[0123456789]+           printf("Number ");
[a-zA-Z][a-zA-Z0-9]*    printf("Word ");
[a-zA-Z0-9\/.-]*        printf("FileName ");
\"                      printf("Quote "); 
\{                      printf("Obrace ");
\}                      printf("Cbrace ");
;                       printf("Semicolon ");
\n                      printf("\n");
[ \t]+                  /* ignore whitespace */;
\"[a-zA-Z0-9 \t]*\"        printf("String ");
%%