/*AUTHOR: Kyle Parris
  ID: 1804904
  DATE: 11/11/2020
  DESCRIPTION: Portfolio Continuous
  Assessment 6 Question 3*/

#include <stdio.h>
int main()
{ 
	float amount, balance = 30000; 
	int transaction; 
	
	printf ("\n-------------MENU---------------"); 
	printf ("\n-----1. For Balance Inquiry-----");
	printf ("\n-----2. For Deposit-------------");
	printf ("\n-----3. For Withdrawal----------");
	printf ("\n--------------------------------");
	printf ("\nPlease Select Transaction Type: ");
	scanf ("%d" ,&transaction);

    switch(transaction)
    {
    	case 1:
	    	printf ("Your Balance is $%.2f", balance);
		break; 			
		case 2:
			do
			{
			printf ("Enter Amount: ");
			scanf ("%f", &amount);
			if ((amount < 0) || (amount > 100000))
				{printf ("Invalid Transaction Amount\n");}
			}
			while ((amount < 0) || (amount > 100000));
			balance = balance + amount;
			printf ("$%.2f Remaining\n", balance); 
		break; 		
		case 3:
			do
			{
			printf ("Enter Amount: ");
			scanf ("%f", &amount);
			if ((amount < 0) || (amount > 17000))
				{printf ("Invalid Transaction Amount\n");}
			}
			while ((amount < 0) || (amount > 17000));
			balance = balance - amount;
			printf ("$%.2f Remaining\n", balance); 
	    break;              
 		default:
            printf("Invalid Transaction Type");
    } 
			
	return 0;
} 
