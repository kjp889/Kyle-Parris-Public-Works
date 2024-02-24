//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 17/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 7 Question 3

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{ 
	int tennis = 0, swim = 0, badmin = 0, num, fee; 
	float paid, balance;
	char code, name[50];
	
	printf ("Enter the customer's name: ");
	scanf ("%s", name);

	while ((strcmp(name, "XXX") != 0) && (strcmp(name, "xxx") != 0))
	{
		printf ("Enter the customer's event code: ");
		scanf ("%c", & code);
		scanf ("%c", & code);
		printf ("Enter the amount paid by customer: $");
		scanf ("%f", &paid);
		switch (code)
		{			
			case 'T':
			case 't':
				fee = 18000;
				balance = fee - paid;
				tennis ++;
				printf ("Name: %s \nEvent: %c-Tennis \nFee: $%d \nPaid: $%.2f \nBalance: $%.2f\n\n",name,code,fee,paid,balance);
			break;
			case 'B':
			case 'b':
				fee = 14000;
				balance = fee - paid;
				badmin ++;
				printf ("Name: %s \nEvent: %c-Badminton \nFee: $%d \nPaid: $%.2f \nBalance: $%.2f\n\n",name,code,fee,paid,balance);
			break;
			case 'S':
			case 's':
				fee = 16000;
				balance = fee - paid;
				swim ++;
				printf ("Name: %s \nEvent: %c-Swimming \nFee: $%d \nPaid: $%.2f \nBalance: $%.2f\n\n",name,code,fee,paid,balance);
			break;
			default:
				printf ("INVALID CODE!!\n\n");
		}
		printf ("Enter the customer's name: ");
		scanf ("%s", name);
	}
	
	printf ("# Swimming is: %d \n# Badminton is: %d \n# Tennis is: %d",swim, badmin, tennis);		
	
	return 0;
}

