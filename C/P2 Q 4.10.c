//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 10/09/2021
//DESCRIPTION: Question 4.10

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int num,count=0,sum=0;
	printf ("enter a number(9999 to exit): ");
	scanf ("%d",&num);
	while (num != 9999)
	{
		sum += num;
		count++;
		printf ("enter a number(9999 to exit): ");
		scanf ("%d",&num);
	}
	printf("Average = %d",sum/count);
	return 0;
}
