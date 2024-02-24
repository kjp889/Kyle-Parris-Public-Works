//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 8 Question 4

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int num1, num2;
	
	for (num1 = 1; num1 <= 12; num1 ++)
	{
		for (num2 = 6; num2 <= 12; num2 ++)
		{
			
    		printf ("%d x %d = %d\t",num2,num1,num1 * num2);
		}
		printf ("\n");
	}
	
	return 0;
}
