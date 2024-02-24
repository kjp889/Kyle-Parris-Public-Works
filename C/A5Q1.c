//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 1/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 5 Question 1

#include <stdio.h>
int main()
{ //Identifies the start of the function
	int num = 1; // Defines the variables
	
	// Processing Statements
	while (num <= 20)
	{
		if (num % 2 == 0)
		{printf (" %d,", num);}
		num = num + 1;
	}

	return 0;
} //Ends the function

