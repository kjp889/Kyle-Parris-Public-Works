//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 12/09/2021
//DESCRIPTION: Question 4.18

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int ast,num[5],count;
	
	for(count=1;count<=5;count++)
	{
		printf("Enter a number: ");
		scanf("%d",&num[count]);
	}
	printf("______________________________________________________________\n");
	for(count=1;count<=5;count++)
	{
		if (num[count]>=1 && num[count]<=30)
		{
			printf("%d\t",num[count]);
			for(ast=1;ast<=num[count];ast++)
			{
				printf("*");
			}
			printf("\n");
		}
		else
		{
			printf("%d\tis too large a number\n",num[count]);
		}
	}
	return 0;
}
