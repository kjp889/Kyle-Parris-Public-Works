//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 20/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 7 Question 4

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	char item_name[50];
	int rating, c_quant, o_quant;
	float unit_cost, o_cost, tot_o_cost = 0;
	
	printf ("Enter Item Name: ");
	scanf ("%s", item_name);

	while ((strcmp(item_name, "END") != 0) && (strcmp(item_name, "end") != 0))
	{
		printf ("Enter Current Quantity: ");
		scanf ("%d", & c_quant);
		printf ("Enter Unit Cost: $");
		scanf ("%f", &unit_cost);
		printf ("Enter Rating: ");
		scanf ("%d", & rating);
		if ((rating == 1) && (c_quant <= 20))
		{
			o_quant = c_quant * 3;
        	o_cost = unit_cost * o_quant;
        	printf ("---------------------------------------------\n");
        	printf ("Item Name: %s \nUnit Cost: $%0.2f \nOrder Quantity: %d \nOrder Cost: $%0.2f",item_name,unit_cost,o_quant,o_cost);
        	tot_o_cost = tot_o_cost + o_cost;
		}
		else
			if ((rating == 2) && (c_quant <= 15))
			{
				o_quant = c_quant * 3;
        		o_cost = unit_cost * o_quant;
        		printf ("---------------------------------------------\n");
        		printf ("Item Name: %s \nUnit Cost: $%0.2f \nOrder Quantity: %d \nOrder Cost: $%0.2f",item_name,unit_cost,o_quant,o_cost);
        		tot_o_cost = tot_o_cost + o_cost;
			}
			else
				if ((rating == 3) && (c_quant <= 10))
				{
					o_quant = c_quant * 2;
	        		o_cost = unit_cost * o_quant;
    		    	printf ("---------------------------------------------\n");
        			printf ("Item Name: %s \nUnit Cost: $%0.2f \nOrder Quantity: %d \nOrder Cost: $%0.2f",item_name,unit_cost,o_quant,o_cost);
        			tot_o_cost = tot_o_cost + o_cost;
				}
				else
					if ((rating == 4) && (c_quant <= 5))
					{
						o_quant = c_quant * 2;
			        	o_cost = unit_cost * o_quant;
        				printf ("---------------------------------------------\n");
			        	printf ("Item Name: %s \nUnit Cost: $%0.2f \nOrder Quantity: %d \nOrder Cost: $%0.2f",item_name,unit_cost,o_quant,o_cost);
        				tot_o_cost = tot_o_cost + o_cost;
					}
					else
					{
						printf ("---------------------------------------------\n");
        				printf ("Order Can Wait\n");
					}
		printf ("\n________________________________________\n");
		printf ("Enter Item Name: ");
		scanf ("%s", item_name);
	}
	printf ("Total Bill: $%0.2f",tot_o_cost);
	return 0;
} 
