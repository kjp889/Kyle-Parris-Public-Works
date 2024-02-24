/*
AUTHOR: Kyle Parris
ID: 1804904
DATE: 1/11/2020
DESCRIPTION: Portfolio Continuous 
Assessment 6 Question 2
*/

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
int main()
{
	float ans = 0, num1, num2;
	int code;
	
	printf ("------------------MENU--------------\n");
	printf ("------------1. for addition---------\n");
	printf ("------------2. for subtraction------\n");
	printf ("------------3. for multiplication---\n");
	printf ("------------4. for division---------\n");
	printf ("------------------------------------\n\n");
	printf ("Please make selection: ");
	scanf ("%d", &code);
	printf ("Enter first number: ");
	scanf ("%f", &num1);
	
	do
	{
		switch (code)
		{
			case 1:
				printf ("Enter the next number: ");
				scanf ("%f", &num2);
				ans = num1 + num2 ;
			break;
			case 2:
				printf ("Enter the next number: ");
				scanf ("%f", &num2);
				ans = num1 - num2 ;
			break;
			case 3:
				printf ("Enter the next number: ");
				scanf ("%f", &num2);
				ans = num1 * num2 ;
			break;
			case 4:
				printf ("Enter the next number: ");
				scanf ("%f", &num2);
				ans = num1 / num2 ;
			break;
			default:
				printf("INVALID\n");
		}
		num1 = ans;
		printf ("%.2f\n", ans);
		printf ("Please make selection: ");
		scanf ("%d", &code);
	}
	while ((code > 0) && (code < 5));
	printf ("GOOD BYE");
	
	return 0;
}
