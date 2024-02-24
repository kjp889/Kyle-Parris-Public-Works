//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 17/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 7 Question 2

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
int main()
{ 
	int count = 1, tennis = 0, swim = 0, badmin = 0, num, fee; 
	float paid, balance;
	char code, name[50], event[20];
	
	printf ("Enter the number of record you want to enter: ");
	scanf ("%d", & num);

	while (count <= num)
	{
		printf ("%d).Enter the customer's name: ",count);
		scanf ("%s", name);
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
				count ++;
				printf ("Name: %s \nEvent: %c-Tennis \nFee: $%d \nPaid: $%.2f \nBalance: $%.2f\n\n",name,code,fee,paid,balance);
			break;
			case 'B':
			case 'b':
				fee = 14000;
				balance = fee - paid;
				badmin ++;
				count ++;
				printf ("Name: %s \nEvent: %c-Badminton \nFee: $%d \nPaid: $%.2f \nBalance: $%.2f\n\n",name,code,fee,paid,balance);
			break;
			case 'S':
			case 's':
				fee = 16000;
				balance = fee - paid;
				swim ++;
				count ++;
				printf ("Name: %s \nEvent: %c-Swimming \nFee: $%d \nPaid: $%.2f \nBalance: $%.2f\n\n",name,code,fee,paid,balance);
			break;
			default:
				printf ("INVALID CODE!!\n\n");
		}
	}
	
	printf ("# Swimming is: %d \n# Badminton is: %d \n# Tennis is: %d",swim, badmin, tennis);		
	
	return 0;
}

