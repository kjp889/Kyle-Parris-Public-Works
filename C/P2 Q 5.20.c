//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 11/10/2021
//DESCRIPTION: 5.20

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

void charges(int side, char fillCharacter);

int main()
{
	int side;
	char fillCharacter;
	
	printf("Enter the length of the square: ");
	scanf("%d",&side);
	
	printf("Enter the character to make the square with: ");
	fillCharacter=getch();
	
	printf("%d and %c\n",side,fillCharacter);
	charges(side,fillCharacter);
	
	return 0;
}

void charges(int side, char fillCharacter)
{
	int i,k;
	for(i=0;i<side;i++)
	{
		for(k=0;k<side;k++)
		{
			printf("%c",fillCharacter);
		}
		printf("\n");
	}
	
}
