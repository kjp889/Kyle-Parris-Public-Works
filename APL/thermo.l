%{
#include <stdio.h>
#include "y.tab.h"
%}

%%
[0-9]+  return NUMBER;
heat    return TOKHEAT;
on|off  return STATE;
target  return TOKTARGET;
temp    return TOKTEMP;
\n      /* ignore new line */;
[ \t]+  /* ignore space */;
%%
