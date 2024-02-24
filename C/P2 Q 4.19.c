//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 13/09/2021
//DESCRIPTION: Question 4.19

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int prodNums[6],quant[6],i,day;
	float totRetail1[8],totRetail2[8],totRetail3[8],totRetail4[8],totRetail5[8];
	float finalRetail1=0,finalRetail2=0,finalRetail3=0,finalRetail4=0,finalRetail5=0;
		
	for (day=1;day<=7;day++)
	{
		printf("Day %d\n",day);
		
		for (i=1;i<=5;i++)
		{
			printf("Enter product number: ");
			scanf ("%d",&prodNums[i]);
			printf("Enter quantity sold: ");
			scanf ("%d",&quant[i]);
			printf("\n");	
		}
		
		for (i=1;i<=5;i++)
		{
			switch (prodNums[i])
			{
				case 1:
					totRetail1[day]=quant[i]*2.98;
				break;
				case 2:
					totRetail2[day]=quant[i]*4.50;
				break;
				case 3:
					totRetail3[day]=quant[i]*9.98;
				break;
				case 4:
					totRetail4[day]=quant[i]*4.49;
				break;
				case 5:
					totRetail5[day]=quant[i]*6.87;
				break;			
			}
		}
		printf("\n___________________________________________________\nDay %d Total Retal Prices\n",day);
		printf("1 is $%.2f \n2 is $%.2f \n3 is $%.2f \n4 is $%.2f \n5 is $%.2f",totRetail1[day],totRetail2[day],totRetail3[day],totRetail4[day],totRetail5[day]);
		printf("\n___________________________________________________\n");
	}
	for (day=1;day<=7;day++)
	{
		finalRetail1+=totRetail1[day];
		finalRetail2+=totRetail2[day];
		finalRetail3+=totRetail3[day];
		finalRetail4+=totRetail4[day];
		finalRetail5+=totRetail5[day];
	}
	printf("Last Week Total Retal Prices\n");
	printf("1 is $%.2f \n2 is $%.2f \n3 is $%.2f \n4 is $%.2f \n5 is $%.2f",finalRetail1,finalRetail2,finalRetail3,finalRetail4,finalRetail5);
}
