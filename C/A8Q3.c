//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 8 Question 3

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int cnt, bYear, age, currYear = 2017;
	char name[50];
   
    
	for (cnt = 1; cnt <= 5; cnt ++)
	{
		printf ("Enter a Name: ");
		scanf ("%s", name);
    	printf ("Enter Your Birth Year: ");
    	scanf ("%d", bYear);
		scanf ("%d", bYear);
    	age = currYear - bYear;
    	printf ("Hello", name, "You are", age, "years old\n");
    	printf ("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");
	}
	
	return 0;
}
