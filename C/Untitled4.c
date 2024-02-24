//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 12/09/2021
//DESCRIPTION: Question 4.16

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num1,num2,num3,num4,count1=1,count2=0,count3=0,count4=1,spc1=0,spc2=9;
	for(num1=1;num1<=10;num1++)
	{
		while (spc2>=1)
		{
			printf(" ");
			spc2--;
		}
		printf("*");
		if (count4==num1)
		{
			printf("\n");
			num1=0;
			spc2=9-count4;
			count4++;
		}
		printf("*");
		if (count1==num1)
		{
			printf("\n");
			num1=0;
			count1++;
		}	
	}
	
	printf("\n---------------------------------\n");
	
	for(num2=10;num2>=1;num2--)
	{
		printf("*");
		if (1==num2)
		{
			printf("\n");
			while (spc1<=count3)
			{
				printf(" ");
				spc1++;
			}
			num2=10-count3;
			count3++;
			spc1=0;
		}
		printf("*");
		if (1==num2)
		{
			printf("\n");
			num2=10-count2;
			count2++;
		}
	}
	return 0;
}
