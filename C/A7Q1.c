//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 17/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 7 Question 1

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
int main()
{ 
	int count = 1, num; 
	
	printf ("Enter a number between 1 and 12: ");
	scanf ("%d", & num);

	while ((num < 1) || (num > 12))
	{
		printf ("ERROR!\nPlease enter another number between 1 and 12: ");
		scanf ("%d", & num);
	}
	
	while (count <= 12)
	{
		printf ("%d * %d = %d\n", num, count, num*count);
		count++;
	}

	return 0;
}

