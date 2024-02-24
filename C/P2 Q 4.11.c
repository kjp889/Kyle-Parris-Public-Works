//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 10/09/2021
//DESCRIPTION: Question 4.11

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num, small, inc, val;
	printf("enter number of values to be entered: ");
	scanf("%d",&num);
	printf("enter value: ");
	scanf("%d",&val);
	small=val;
	for (inc=1;inc<=num-1;inc++)
	{
		if (small>val)
		{
			small=val;
		}
		printf("enter value: ");
		scanf("%d",&val);
	}
	printf("%d is the smallest of the numbers",small);
	return 0;
}
