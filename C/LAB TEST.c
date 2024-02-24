//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/11/2020
//DESCRIPTION: Progrmming 1 Lab Test

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{

	int num1, num3,num4, choice;
	float num2;

	printf ("__________ WELCOME TO ABC CAR MART_____________\n");
	printf ("_____________1. To buy car_____________________\n");
	printf ("_____________2. To rent car____________________\n");
	printf ("_____________3. To lease car___________________\n");
	printf ("_____________4. To exit________________________\n");
	printf ("_______________________________________________\n");
	
	printf ("Make Selection: ");
	scanf ("%d", & choice);
	while (choice != 4)
	{
		switch (choice)
		{
			case 1:
				printf ("1. To buy car cash\n");
       			printf ("2. To buy car via loan\n");
      			printf ("3. To exit\n");
       			printf ("Make choice: ");
       			scanf ("%d", & num1);
       			switch (num1)
       			{
       				case 1:
       					printf ("Enter the cost of the Car: $");
      					scanf ("%f", & num2);
       					num2 = num2 * 0.95;
       					printf ("Cost of car is $%.2f",num2);
			      	break;
       				case 2:
						printf ("Enter the cost of the Car: $");
      					scanf ("%f", & num2);
       					num2 = num2 * 1.25;
       					printf ("Cost of car is $%.2f",num2);
       				break;
       				default:
       				break;
       			}
       		break;
       		case 2:
  				printf ("A security deposit of 25%% is required for rental\n");
   				printf ("Please enter number of days you wish to rent car: ");
        		scanf ("%d", & num3);
    			printf ("Your rental total is: $%.2f", (1.25 * (num3 * 5000)));
    		break;
    		case 3:
             	printf ("1.to lease car\n");
             	printf ("2. To return lease\n");
             	printf ("3. To exit\n");
				printf ("Please enter choice: ");
		    	scanf ("%d", & num4);
				switch (num4)
				{
					case 1:
						printf ("Your lease cost is $25,000.00");
			 	break;
					case 2:
						printf ("Thanks for return the car in good condition. \nYour reward is $2000");
					break;
				}
			break;
			default:
				printf ("Invalid Selection\n");
			break; 
       	}
       	printf ("\nMake Selection: ");
		scanf ("%d", & choice);
	}
	return 0;
}
