//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 13/09/2021
//DESCRIPTION: Question 4.25

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num,decn,dec,bin[10];
	
	printf("Decimal\tBinary\n");
	
	for (dec=1;dec<=256;dec++)
	{
		decn=dec;
		for (num=0;decn>0;num++)
		{
			bin[num]=decn%2;
			decn=decn/2;
		}
		printf("%d\t",dec);
		for(num=num-1;num>=0;num--)
		{
			printf("%d",bin[num]); 
		}
		printf("\n");
	}
}
