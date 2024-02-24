//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 11/10/2021
//DESCRIPTION: 5.21

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

void charges(int shape,int side,char fillCharacter);

int main()
{
	int shape,side;
	char fillCharacter;
	
	printf("----1 for Square----\n");
	printf("----2 for Triangle--\n");
	printf("----3 for Rectangle-\n");
	printf("----4 for Diamond---\n");
	printf("----5 for Trapezoid-\n");
	printf("________________________________________\n");
	printf("Enter a number for the shape to print: ");
	scanf("%d",&shape);
	
	if(shape==1||shape==2||shape==3||shape==4||shape==5)
	{
		if(shape!=4)
		{
			printf("Enter the length of the base of the shape: ");
			scanf("%d",&side);	
		}	
			
		printf("Enter the character to make the shape with: ");
		fillCharacter=getch();	
	}
	
	charges(shape,side,fillCharacter);
	
	return 0;
}

void charges(int shape,int side,char fillCharacter)
{
	int i,k,spc;
	
	switch(shape)
	{
		case 1:
			for(i=0;i<side;i++)
			{
				for(k=0;k<side;k++)
				{
					printf("%c",fillCharacter);
				}
				printf("\n");
			}
			break;
			
		case 2:
			for(i=0;i<=side;i++)
			{
				for(k=0;k<i;k++)
				{
					printf("%c",fillCharacter);
				}
				printf("\n");
			}
			break;
			
		case 3:
			for(i=0;i<side;i++)
			{
				for(k=0;k<side-2;k++)
				{
					printf("%c",fillCharacter);
				}
				printf("\n");
			}
			break;
			
		case 4:
		
			break;	
			
		case 5:
			
			break;
		
		default:
			printf("\nInvald Selection");
	}
	
	
}
