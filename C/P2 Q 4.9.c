//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 10/09/2021
//DESCRIPTION: Question 4.9

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int x, sum=0, y, z;
	printf("enter number of values to be entered: ");
	scanf("%d",&x);
	for (y=1;y<=x;y++)
	{
		printf("enter value: ");
		scanf("%d",&z);
		sum += z;
	}
	printf("Sum = %d",sum);
	return 0;
}

