//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 1/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 5 Question 6

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
int main()
{ //Identifies the start of the function
	int count, id;
	char package;
	char name[50];
	float cost, bcost, avg, total; 
	
	
	count = 1;
	bcost = 1000;
	total = 0;
	
	printf ("%d: Enter Customer's Name: \n", count);
	scanf ("%s", name);
	while (count <= 15)
	{	
		printf ("Enter customer's ID: \n");
		scanf ("%d", &id);
		
		printf ("Enter package type; (S) Scenic Tour, (R) Relaxation Tour, (J) Joyous Fun Tour: \n");
		scanf ("%c", &package);
		scanf ("%c", &package);		
		switch (package)
		{
			case 'S':
			case 's':
				cost = bcost + 119;
				count = count + 1;
				total = total + cost;
			break;
			case 'J':
			case 'j':
				cost = bcost + 149;
				count = count + 1;
				total = total + cost;
			break;
			case 'R':
			case 'r':
				cost = bcost + 139;
				count = count + 1;
				total = total + cost;
			break;
			default:
				 printf("\nINVALID PACKAGE\n\n");
		}
		
		printf ("\n%d: Enter Customer's Name: \n", count);
		scanf ("%s", name);
		
	}
	
	avg = total / 15;
	printf ("The total is $%.2f, The average is $%.2f", total, avg);
	
	return 0;
} //Ends the function
