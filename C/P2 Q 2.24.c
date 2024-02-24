//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/09/2021
//DESCRIPTION: Question 2.24

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int num;
	
	printf ("Enter a NUMBER: ");
	scanf ("%d",&num);
	
	if (num%2==0)
	{
		printf ("EVEN");
	}
	if (num%2!=0)
	{
		printf ("ODD");
	}
}
