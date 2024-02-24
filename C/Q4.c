//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 20/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 1 Question 4

#include <stdio.h>

int main()
{//Identifies the start of the function

	float length, width, area, pmeter;// Defines the variables length, width, area and pmeter as FLOAT
	
	//Output Statement
	printf ("Enter the length of the rectangle: ");//Prompts the user to enter a length
	//Input Statement
	scanf ("%f",&length);//Reads the length entered by the user
	
	//Output Statement
	printf ("Enter the width of the rectangle: ");//Prompts the user to enter a width
	//Input Statement
	scanf ("%f",&width);//Reads the width entered by the user
	
	//Calculations
	area=length*width;//Multiplies the lenght by the width
	pmeter=length+length+width+width;//Adds the length to itself and then adds the width twice
	
	//Output Statements
	printf ("The area is %f \n", area);//Displays the area of the square
	printf ("The perimeter is %f", pmeter);// displays the perimeter of the square
	
	return 0;
}//Ends the function
