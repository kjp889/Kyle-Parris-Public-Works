//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 2 Question 5

#include <stdio.h>

int main()
{ //Identifies the start of the function

	float price, paid, discount, balance; // Defines the variables num as FLOAT
	
	//Output Statement
	printf ("The price of the goods are: "); 
	//Input Statement
	scanf ("%f",&price); 
	
	//Output Statement
	printf ("Enter the Amount Paid: ");
	//Input Statement
	scanf ("%f",&paid);
	
	//Calculations
	balance = price - paid;
	
	//Selection Statements
	if (balance < 10000)
		{
			discount = balance * 1/100;
			balance = balance - discount;
			printf ("Your discount is $%f", discount);
			printf (" and your balance is $%f", balance);
		}
	else
		{
			printf ("No discount given, remaining balance is $%f", balance);
		}
		
	return 0;
} //Ends the function
