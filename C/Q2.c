//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 20/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 1 Question 2

#include <stdio.h>

int main()
{//Identifies the start of the function

	float num, square, cube;// Defines the variables num, square and cube as FLOAT
	
	//Output Statement
	printf ("Enter a NUMBER: ");//Prompts the user to enter a number
	
	//Input Statement
	scanf ("%f",&num);//Reads the number enters by the user
	
	//Calculations
	square=num*num;//Multiplies the number by itself
	cube=square*num;//Multiplies the number by the results stored in square
	
	//Output Statements
	printf ("The square is %f \n", square);//Displays the square of the number
	printf ("The cube is %f", cube);// displays the cube of the number
	
	return 0;
}//Ends the function
