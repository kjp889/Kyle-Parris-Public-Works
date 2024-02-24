//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 8 Question 2

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int num, square, cube;
	
	printf ("NUMBER\tSQUARE\tCUBE\n");
	printf ("______________________________\n");
	for (num = 50; num <= 100; num ++)
	{
		square = num * num;
    	cube = square * num;
    	printf ("%d\t%d\t%d\n",num,square,cube);
	}
	
	return 0;
}
