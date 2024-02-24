#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
main()
{
   int emp_id [6]; 
   int sales_count[6];
   int i, j; 
  for (i=0; i < 6; i++)
  { 
    printf("Please enter employee id: ");
    scanf("%d", &emp_id[i]);
    printf("Please enter sales count: ");
    scanf("%d", &sales_count[i]);
  }

  for (i=0; i <6; i++)
   { 
     printf("%d", emp_id[i]);
     for (j = 0; j < sales_count[i]; j++)
     {
        printf("*"); 
      }
   printf("\n");
  }
}//end main

