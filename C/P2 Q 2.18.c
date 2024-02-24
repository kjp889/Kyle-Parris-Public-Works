//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/09/2021
//DESCRIPTION: Question 2.18

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int num1, num2;//variables descriptions
	
	printf ("Enter two numbers:");// promts user
	scanf ("%d%d",&num1,&num2);//stores user data
	
	if (num1 > num2)
	{
		printf ("%d is larger", num1);
	}
	if (num2 > num1)
	{
		printf ("%d is larger", num2);
	}
	if (num1 == num2)
	{
		printf ("These numbers are equal");
	}
}
