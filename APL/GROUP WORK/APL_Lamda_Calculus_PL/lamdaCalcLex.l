/*
Group Members
Kyle Parris - 1804904
Chloe Hibbert - 1902963
Pete Aris - 1704057
*/

%{
#include <stdio.h>
#include "y.tab.h"
%}

%%
[a-z]       return VARTKN;
[0-9]+       return NUMTKN;
#           return LAMBDATKN;
\(          return OBRACETKN;
\)          return CBRACETKN;
\.          return DOTTKN;
[ \t\n]+      /* ignore whitespace */;
%%