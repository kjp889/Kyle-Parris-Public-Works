//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 15/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 3 Question 5

#include <stdio.h>
int main()
{ //Identifies the start of the function

	float amount, point, bp, balance; // Defines the variables
	
	//Output Statement
	printf ("Enter the bill amount: "); 
	//Input Statement
	scanf ("%f" ,&amount);
	//Output Statement
	printf ("Enter customer's current points: "); 
	//Input Statement
	scanf ("%f" ,&point);
	
	//Processing Statements
	if (amount <= 5000)
		{ bp = 6; }
	else
		if (amount >15000)
			{ bp = 15; }
		else	
			{ bp = 10; }
	point = point + bp;
	if (point >= 100)
		{ 
		balance = amount - point;
		printf ("Bill amount is $%.2f, Balance after discount is $%.2f, Discount is $%.2f, Loyalty Points are 0", amount, balance, point);
		}
	else
		{ 
		balance = amount;
		printf ("Bill amount is $%.2f, Balance after discount is $%.2f, Discount is $0, Loyalty Points are %.2f", amount, balance, point);
		}

	return 0;
} //Ends the function
