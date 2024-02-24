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
	int numb,numo,numh,decn,dec,rem,oct[4],bin[10];
	char hex[4];
	printf("Decimal\tBinary\tOctal\tHexadecimal\n");
	
	for (dec=1;dec<=256;dec++)
	{
		//Binary Convertion
		decn=dec;
		for (numb=0;decn>0;numb++)
		{
			bin[numb]=decn%2;
			decn=decn/2;
		}
		
		//Octal Convertion
		decn=dec;
		for (numo=0;decn>0;numo++)
		{
			oct[numo]=decn%8;
			decn=decn/8;
		}
		
		//Hexadecimal Convertion
		decn=dec;
		for (numh=0;decn>0;numh++)
		{
			rem=decn%16;
			decn=decn/16;
			switch (rem)
			{
				case 10:
					hex[numh]='A';
				break;
				case 11:
					hex[numh]='B';
				break;
				case 12:
					hex[numh]='C';
				break;
				case 13:
					hex[numh]='D';
				break;
				case 14:
					hex[numh]='E';
				break;
				case 15:
					hex[numh]='F';
				break;
				default:
					hex[numh]=48+rem;
			}
		}
		
		printf("%d\t",dec);
		for(numb=numb-1;numb>=0;numb--)
		{
			printf("%d",bin[numb]); 
		}
		printf("\t");
		for(numo=numo-1;numo>=0;numo--)
		{
			printf("%d",oct[numo]); 
		}
		printf("\t");
		for(numh=numh-1;numh>=0;numh--)
		{
			printf("%c",hex[numh]); 
		}
		printf("\n");		
	}
}
