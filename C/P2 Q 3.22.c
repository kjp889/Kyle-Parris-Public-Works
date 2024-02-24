//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 05/09/2021
//DESCRIPTION: Question 3.22

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int x=50, y=50, count=1;
	printf ("x is being Predecremented and y is being Postdecrementied starting at 50 each");
	while (x>=0&&y>=0)
	{
		printf ("\niteration %d\n",count);
		printf ("X = %d\n",--x);
		printf ("Y = %d",y--);
		count++;
	}
	return 0;
}
