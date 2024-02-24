#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

void changeToUppercase (char *str);

main( )
{
    char string[] = "Programming is still fun";
    printf("%s", string); 
    changeToUppercase(string); 
    printf("\n%s", string); 
}

void changeToUppercase (char *str) 
{
    while (*str != '\0') 
	{      
        if (*str>=97 && *str<=122)
		{
			*str -= 32;
		}
	str++;
    }
}

