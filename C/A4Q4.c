//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 4 Question 4

#include <stdio.h>
int main()
{ //Identifies the start of the function

	char vacType; // Defines the variables
	
	//Output Statement
	printf ("Enter vacType "); 
	//Input Statement
	scanf ("%c" ,&vacType);

	//Processing Statements
    switch(vacType)
    {
    	case 'C':
		case 'c': 
	    	printf ("Cruise");
		break; 			
		case 'H':
		case 'h': 
	        printf ("Hotel");
	    break; 		
		case 'F':
		case 'f': 
	        printf ("Flight");
	    break;              
 		default:
            printf("Invalid");
    } 
			
	return 0;
} //Ends the function
