//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 11 Question 4

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int ids[50], count = 1, count1,board = 0, travel = 0;
	float tuitions[50], total = 0;
	char stats, status[50][50];
	
	printf ("%d Enter the student's ID number: ",count);
	scanf ("%d", &ids[count]);
	while ((count <= 50) && (ids[count] != 0))
	{
		printf ("Enter tuition: $");
		scanf ("%f", &tuitions[count]);
		printf ("Enter boarding status (B)Boarding or (T)Traveling: ");
		scanf ("%c", &stats);
		scanf ("%c", &stats);
		if ((stats == 'B') || (stats == 'b'))
		{
			board ++;
			strcpy (status[count],"Boarding");
		}
		else
		{
			travel ++;
			strcpy (status[count],"Traveling");
		}
		total = total + tuitions[count];
		count ++;
		printf ("%d Enter the student's ID number: ", count);
		scanf ("%d", &ids[count]);
		tuitions[count] = 0;
	}
	printf ("ID#\t Status \tTuition\n");
	printf ("-----------------------------------\n");
	for (count1 = 1; count1 <= count; count1 ++)
	{
		printf ("%d\t %s\t $%.2f\n",ids[count1],status[count1],tuitions[count1]);
	}
	printf ("-----------------------------------\n");
	printf ("# of Boarders: %d \n# of Travelers: %d \nTotal tuition: $%.2f", board, travel, total);
	
	return 0;
}
