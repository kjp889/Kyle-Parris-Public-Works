//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 1/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 6 Question 1

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
int main()
{
	int num = 0;
	
	do
	{
		printf ("Enter a positive integer: ");
		scanf ("%d", &num);
	}
	while (num < 0);
	printf ("%d", num);
	
	return 0;
}
