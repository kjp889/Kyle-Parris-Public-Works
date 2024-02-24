//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 12/09/2021
//DESCRIPTION: Question 4.16A

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num,num1,num2,num3,num4,count1=1,count2=0,count3=0,count4=1,spc1=0,spc2=9;
		
	printf("1 for\t2 for\t3 for\t4 for\n");
	printf("*\t***\t***\t  *\n");
	printf("**\t**\t **\t **\n");
	printf("***\t*\t  *\t***\n");
	printf("___________________________________\n");
	
	do
	{
		printf("\nSelect a number: ");
		scanf("%d",&num);
	
		switch (num)
		{
			case 1:
				for(num1=1;num1<=10;num1++)
				{
					printf("*");
					if (count1==num1)
					{
						printf("\n");
						num1=0;
						count1++;
					}	
				}
			break;
		
			case 2:
				for(num2=10;num2>=1;num2--)
				{
					printf("*");
					if (1==num2)
					{
						printf("\n");
						num2=10-count2;
						count2++;
					}
				}
			break;
		
			case 3:
				for(num3=10;num3>=1;num3--)
				{
					printf("*");
					if (1==num3)
					{
						printf("\n");
						while (spc1<=count3)
						{
							printf(" ");
							spc1++;
						}
						num3=10-count3;
						count3++;
						spc1=0;
					}	
				}
			break;	
		
			case 4:
				for(num4=1;num4<=10;num4++)
				{
					while (spc2>=1)
					{
						printf(" ");
						spc2--;
					}
					printf("*");
					if (count4==num4)
					{
						printf("\n");
						num4=0;
						spc2=9-count4;
						count4++;
					}	
				}
			break;
			default:
				printf("\nNot applicable");
			break;	
		}
	}
	while (num < 5 && num >0);
	return 0;
}
