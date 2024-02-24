#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>
#define SUM(num1,num2) (num1+num2)

int lenghtOfString(char *str);
void changeToUppercase(char *str);
int TheyEqual(char *str1, char *str2);
void joinThem(char *str1, char *str2);

main( )
{
    char string[] = "Program",string2[] = "Programming";
    int length,equality,num1=2,num2=3;
    
	length = lenghtOfString(string);
	printf("%d is the length of the string", length);
	 
    printf("\n%s", string);  
    printf("\n%s", string2); 
    equality=TheyEqual(string, string2);
    if(equality==0)
    {
    	printf("\nThey are the same");
	}
	else
	{
		printf("\nThey are different");
	}
	
	printf("\nSum = %d",SUM(num1,num2));
	
	printf("\nString before call: %s", string);
	changeToUppercase(string);
	printf("\nString after call: %s", string);
	
	joinThem(string, string2);
	printf("\nStrings join them after call: %s", string);
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

int lenghtOfString (char *str)
{
	int count;
	
	for(count=0;*str!='\0';str++) 
	{
		count++;
	}
	
	return count;
}

int TheyEqual(char *str1, char *str2)
{
	int i;
	for(i=0;*str1!='\0';str1++) 
	{	
		if(*str1 != *str2)
		{
			return 1;
		}
		str2++;		
	}
	return 0;
}

void joinThem(char *str1, char *str2)
{
	int i;
	while(*str1!='\0'){
		str1++;
	}
	for(i=0;*str2!='\0';str1++)
	{
		*str1=*str2;
		str2++;
	}
	*str1='\0';
}
