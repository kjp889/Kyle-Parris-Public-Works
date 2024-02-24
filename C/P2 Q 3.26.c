//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 06/09/2021
//DESCRIPTION: Question 3.26

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int a=3;
	printf ("A\tA+2\tA+4\tA+6\n\n");
	while (a <= 15)
	{
		printf ("%d\t%d\t%d\t%d\n",a,a+2,a+4,a+6);
		a=a+3;
	}
	return 0;
}
