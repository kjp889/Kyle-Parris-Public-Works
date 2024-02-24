//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 2 Question 6

#include <stdio.h>

int main()
{ //Identifies the start of the function

	float price, cost; // Defines the variables price, cost as FLOAT
	int num; // Defines the variable num as INTEGER
	char type; // Defines the variable type as CHARACTER
	
	//Output Statement
	printf ("Enter the type of ticket: "); 
	//Input Statement
	scanf ("%c",&type); 
	
	//Output Statement
	printf ("Enter the amount of ticket: ");
	//Input Statement
	scanf ("%d",&num);
	
	//Selection Statements
	if (type == 'R')
		{
			cost = 6500;
			price = cost * num;
			printf ("Ticket Type: %c --- Cost: $%.02f --- Number of Ticket: %d --- Price: $%.02f",
			type,cost,num,price);
			
		}
	else
		{
	
		if (type == 'G')

			{
				cost = 7500;
				price = cost * num;
				printf ("Ticket Type: %c --- Cost: $%.02f --- Number of Ticket: %d --- Price: $%.02f",
				type,cost,num,price);
			}
		}
	return 0;
} //Ends the function
