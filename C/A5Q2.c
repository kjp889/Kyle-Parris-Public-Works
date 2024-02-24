//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 1/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 5 Question 2

#include <stdio.h>
int main()
{ //Identifies the start of the function
	int num = 50, square, cube; // Defines the variables
	
	// Processing Statements
	while (num <= 100)
	{
		square = num * num;
    	cube = square * num;
		{printf ("%d,The square is: %d The cube is: %d\n", num,square,cube);}
		num = num + 1;
	}

	return 0;
} //Ends the function
