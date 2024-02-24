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
	int num,rem,decn,dec;
	char hex[4];
	
	printf("Decimal\tHex\n");
	
	for (dec=1;dec<=256;dec++)
	{
		decn=dec;
		for (num=0;decn>0;num++)
		{
			rem=decn%16;
			decn=decn/16;
			switch (rem)
			{
				case 10:
					hex[num]='A';
				break;
				case 11:
					hex[num]='B';
				break;
				case 12:
					hex[num]='C';
				break;
				case 13:
					hex[num]='D';
				break;
				case 14:
					hex[num]='E';
				break;
				case 15:
					hex[num]='F';
				break;
				default:
					hex[num]=48+rem;
			}
		}
		printf("%d\t",dec);
		for(num=num-1;num>=0;num--)
		{
			printf("%c",hex[num]); 
		}
		printf("\n");
	}
}
