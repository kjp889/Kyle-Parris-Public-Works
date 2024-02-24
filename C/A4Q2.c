//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 4 Question 2

#include <stdio.h>
int main()
{ //Identifies the start of the function

	char road_con, weather; // Defines the variables
	
	//Output Statement
	printf ("Enter weather conditions: (R) for Rainy or (D) for Dry; "); 
	//Input Statement
	scanf ("%c" ,&weather);
	//Input Statement
	scanf ("%c", &road_con);
		
	//Processing Statements
	if (weather == 'D')
	{ printf ("Safe journey...drive with care"); }
	else
 		//Output Statement
		printf ("Enter road conditions: (F) for Flooded or (W) for Wet; "); 
		//Input Statement
		scanf ("%c", &road_con);
		if (road_con == 'F')
 			{ printf ("Road flooded...please detour"); }
		else
			{ printf ("Road wet...drive with caution"); }
		
		
	return 0;
} //Ends the function
