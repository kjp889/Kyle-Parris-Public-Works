//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 2 Question 3

#include <stdio.h>

int main()
{ //Identifies the start of the function

	float fee, paid, balance; // Defines the variables num as FLOAT
	
	//Output Statement
	printf ("Enter the Boarding Fee: $"); //Prompts the user to enter the Boarding Fee
	//Input Statement
	scanf ("%f",&fee); //Reads the amount entered by the user
	
	//Output Statement
	printf ("Enter the Amount Paid: $"); //Prompts the user to enter the Amount Paid
	//Input Statement
	scanf ("%f",&paid); //Reads the amount entered by the user
	
	//Calculations
	balance = fee - paid;
	
	//Selection Statements
	if (balance <= 0)
		{
			printf ("$%f Remainging fee paid in full, incentive GRANTED.", balance);
		}
	else
		{
			printf ("A balance of $%f remaining UNQUALIFIED for incentive", balance);
		}
		
	return 0;
} //Ends the function
