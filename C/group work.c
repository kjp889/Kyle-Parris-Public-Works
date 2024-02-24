//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 21/11/2020
//DESCRIPTION: GROUP WORK QUESTION

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

int main()
{ 
	int count = 1, tennis = 0, badmin = 0, swim = 0, num, fee[99]; 
	float paid[99], balance[99];
	char code[99], name[99][50];
	
	printf ("Enter the number of record you want to enter: ");
	scanf ("%d", & num);

	while (count <= num)
	{
		printf ("%d).Enter the customer's name: ",count);
		scanf ("%s", name[count]);
		printf ("Enter the customer's event code: ");
		scanf ("%c", & code[count]);
		scanf ("%c", & code[count]);
		printf ("Enter the amount paid by customer: $");
		scanf ("%f", &paid[count]);
		switch (code[count])
		{			
			case 'T':
			case 't':
				fee[count] = 18000;
				balance[count] = fee[count] - paid[count];
				tennis ++;
				count ++;
			break;
			case 'B':
			case 'b':
				fee[count] = 14000;
				balance[count] = fee[count] - paid[count];
				badmin ++;
				count ++;
			break;
			case 'S':
			case 's':
				fee[count] = 16000;
				balance[count] = fee[count] - paid[count];
				swim ++;
				count ++;
			break;
			default:
				printf ("\nINVALID CODE!!\n");
		}
		printf ("\n");
	}
	
	printf ("Tennis: %d \nBadminton: %d \nSwimming: %d \n",tennis,badmin,swim);
	printf ("Names \t Events \t Fees \t\t Paid \t Balances\n");
	printf ("------------------------------------------------------------------------------------------------------------------------\n");
	
	for (count = 1; count <= num; count++)
	{
		switch (code[count])
		{
			case 'T':
			case 't':
				printf ("%s \t %c Tennis \t $%d \t $%.2f \t $%.2f\n",name[count],code[count],fee[count],paid[count],balance[count]);
			break;
			case 'S':
			case 's':
				printf ("%s \t %c Swimming \t $%d \t $%.2f \t $%.2f\n",name[count],code[count],fee[count],paid[count],balance[count]);
			break;
			case 'B':
			case 'b':
				printf ("%s \t %c Badminton \t $%d \t $%.2f \t $%.2f\n",name[count],code[count],fee[count],paid[count],balance[count]);
			break;		
		}
				
	}
	return 0;
}

