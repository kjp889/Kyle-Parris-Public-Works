//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 4 Question 5

#include <stdio.h>
int main()
{ //Identifies the start of the function

	float amount, balance = 30000; // Defines the variables
	int transaction; // Defines the variables
	
	//Output Statement
	printf ("\n-------------MENU---------------"); 
	printf ("\n-----1. For Balance Inquiry-----");
	printf ("\n-----2. For Deposit-------------");
	printf ("\n-----3. For Withdrawal----------");
	printf ("\n--------------------------------");
	printf ("\nPlease Select Transaction Type: ");
	//Input Statement
	scanf ("%d" ,&transaction);

	//Processing Statements
    switch(transaction)
    {
    	case 1:
	    	printf ("Your Balance is $%.2f", balance);
		break; 			
		case 2:
			printf ("Enter Amount: ");
			scanf ("%f", &amount);
			if (amount <= 100000)
				{ 
				balance = balance + amount;
				printf ("$%.2f Remaining", balance); 
				}
			else
				{
				printf ("Amount Exceeds Transaction Limit");
				}
	    break; 		
		case 3:
			printf ("Enter Amount: ");
			scanf ("%f", &amount);
			if (amount <= 17000)
				{ 
				balance = balance - amount;
				printf ("$%.2f Remaining", balance); 
				}
			else
				{
				printf ("Amount Exceeds Transaction Limit");
				}
	    break;              
 		default:
            printf("Invalid Transaction Type");
    } 
			
	return 0;
} //Ends the function
