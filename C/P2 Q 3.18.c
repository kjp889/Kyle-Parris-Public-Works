//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 05/09/2021
//DESCRIPTION: Question 3.18

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int acc;
	float bal, charge, credit, credLimit;
	printf ("Enter account number (-1 to end): ");
	scanf ("%d",&acc);
	while (acc != -1)
	{
		printf ("Enter beginning balance: ");
		scanf ("%f", &bal);
		printf ("Enter total charges: ");
		scanf ("%f", &charge);
		printf ("Enter total credits: ");
		scanf ("%f", &credit);
		printf ("Enter credits limit: ");
		scanf ("%f", &credLimit);
		bal = (bal + charge) - credit;
		if (bal>credLimit)
		{
			printf ("Account #: %d \nCredit Limit: %.2f \nBalance: %.2f \nCredit Limit Exceeded\n",acc,credLimit,bal);
		}
		printf ("\nEnter account number (-1 to end): ");
		scanf ("%d",&acc);
	}
	return 0;
}
