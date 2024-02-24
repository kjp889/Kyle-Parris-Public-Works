//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 15/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 3 Question 1

#include <stdio.h>
int main()
{ //Identifies the start of the function

	char vacType; // Defines the variable vacType as CHARACTER
	
	//Output Statement
	printf ("Enter vacType: "); 
	//Input Statement
	scanf ("%c" ,&vacType);

	//Selection Statements
	if (vacType == 'C'|| vacType =='c')
		{ printf ("Cruise"); }
	else
		if (vacType == 'H'|| vacType =='h')
			{ printf ("Hotel"); }
		else	
			if (vacType == 'F'|| vacType =='f')
				{ printf ("Flight"); }
			else	
				{ printf ("Invalid"); }
	
	return 0;
} //Ends the function
