//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 08/10/2021
//DESCRIPTION: 5.19

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

void charges(int side);

int main()
{
	int side;
	printf("Enter the length of the square: ");
	scanf("%d",&side);
	
	charges(side);
	
	return 0;
}

void charges(int side)
{
	int i,k;
	for(i=0;i<side;i++)
	{
		for(k=0;k<side;k++)
		{
			printf("*");
		}
		printf("\n");
	}
	
}
