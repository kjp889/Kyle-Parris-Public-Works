//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 10/09/2021
//DESCRIPTION: Question 4.13

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num, prod=1;
	for (num=1;num<=15;num+=2)
	{
		printf ("%d ",num);
		prod *= num;
	}
	printf ("\n= %d",prod);
	return 0;
}
