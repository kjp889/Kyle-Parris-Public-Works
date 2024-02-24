//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 12/09/2021
//DESCRIPTION: Question 4.17

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num=1,acc;
	float bal,credLimit,newCredLimit;
	while (num<=3)
	{
		printf("Enter custmer accounr number: ");
		scanf("%d",&acc);
		printf("Enter customer credit limit before the recession: ");
		scanf("%f",&credLimit);
		printf("Enter current balance: ");
		scanf("%f",&bal);
		
		newCredLimit = credLimit/2;
		
		printf("New Credit Limit is: %.2f\n",newCredLimit);
		
		if (newCredLimit<bal)
		{
			printf("Exceeds new limit\n");
		}
		printf("___________________________________\n");
		num++;	
	}
	return 0;		
}
