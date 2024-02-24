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
	int num,decn,dec,oct[4];
	
	printf("Decimal\tOctal\n");
	
	for (dec=1;dec<=256;dec++)
	{
		decn=dec;
		for (num=0;decn>0;num++)
		{
			oct[num]=decn%8;
			decn=decn/8;
		}
		printf("%d\t",dec);
		for(num=num-1;num>=0;num--)
		{
			printf("%d",oct[num]); 
		}
		printf("\n");
	}
}
