//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 01/10/2021
//DESCRIPTION: Class Work 2

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>
#define ROW 4
#define COL 5

int main()
{
	int arr[ROW][COL],rowIn,colIn,rowTotal[ROW],colTotal[COL],total,i;
	
	printf("Populate the array: ");
	for(rowIn=0;rowIn<ROW;rowIn++)
	{
		for(colIn=0;colIn<COL;colIn++)
		{
			scanf("%d",&arr[rowIn][colIn]);
		}
	}
	
	for(rowIn=0;rowIn<ROW;rowIn++)
	{
		total=0;
		for(colIn=0;colIn<COL;colIn++)
		{
			total+=arr[rowIn][colIn];
		}
		rowTotal[rowIn]=total;
	}
	
	for(colIn=0;colIn<COL;colIn++)
	{
		total=0;
		for(rowIn=0;rowIn<ROW;rowIn++)
		{
			total+=arr[rowIn][colIn];
		}
		colTotal[colIn]=total;
	}
	
	i=1;
	for(rowIn=0;rowIn<ROW;rowIn++)
	{
		printf("The total in row %d is %d\n",i,rowTotal[rowIn]);
		i++;
	}	
	
	i=1;
	for(colIn=0;colIn<COL;colIn++)
	{
		printf("The total in column %d is %d\n",i,colTotal[colIn]);
		i++;
	}
	
	return 0;
}
