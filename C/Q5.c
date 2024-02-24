//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 20/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 1 Question 5

#include <stdio.h>

int main()
{//Identifies the start of the function

	float weight, size, inch, feet, height;// Defines the variables weight, height and size as FLOAT
	
	//Output Statement
	printf ("Enter your weight in kg: ");//Prompts the user to enter their weight
	//Input Statement
	scanf ("%f",&weight);//Reads the weight entered by the user
	
	//Output Statement
	printf ("Enter your height:\n");//Prompts the user to enter their height
	printf ("Feet: ");
	//Input Statement
	scanf ("%f",&feet);//Reads the feet entered by the user
	//Output Statement
	printf ("inch: ");
	//Input Statement
	scanf ("%f",&inch);//Reads the inch entered by the user
	
	//Calculations
	height= feet+ (inch/12);//Converts the inches to feets and the add it to the feet
	
	//Output Statement
	printf ("Enter your shoe size: ");//Prompts the user to enter their shoe size
	//Input Statement
	scanf ("%f",&size);//Reads the shoe size entered by the user
	
	//Output Statements
	printf ("Your measurements are %f kg,", weight); //Displays the user's weight
	printf ("%f ft.,", height); //Displays the user's height in feets
	printf ("%f", size); //Displays the user's shoe size
	
	return 0;
}//Ends the function
