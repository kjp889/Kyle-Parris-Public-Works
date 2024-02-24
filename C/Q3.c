//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 20/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 1 Question 3

#include <stdio.h>

int main()
{//Identifies the start of the function

	float num, area, pmeter;// Defines the variables num, area and pmeter as FLOAT
	
	//Output Statement
	printf ("Enter the length of the side of the square: ");//Prompts the user to enter a length
	
	//Input Statement
	scanf ("%f",&num);//Reads the number enters by the user
	
	//Calculations
	area=num*num;//Multiplies the number by itself
	pmeter=num*4;//Multiplies the number by 4
	
	//Output Statements
	printf ("The area is %f \n", area);//Displays the area of the square
	printf ("The perimeter is %f", pmeter);// displays the perimeter of the square
	
	return 0;
}//Ends the function
