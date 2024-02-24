//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 04/10/2021
//DESCRIPTION: Class Work 1

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

//ProtoTypes
int imax(int num1, int num2);
void squareGeo(int num1);
float sqVol(void);
int total(int arr[]);

int main()
{
	int num1,num2,larger,sum,arr[9]={1,2,3,4,5,6,7,8,9};
	float vol;
	
	printf("Enter two numbers to compare: ");
	scanf("%d %d",&num1,&num2);
	larger = imax(num1,num2);
	printf("%d is the larger number\n*********************************\n",larger);
	
	printf("Enter the length of one side of the Square: ");
	scanf("%d",&num1);
	squareGeo(num1);
	
	printf("\n*******************************\n");
	
	vol = sqVol();
	printf("Volume of the square = %.2f",vol);
	
	printf("\n*******************************\n");
	sum = total(arr);
	printf("Sum of numbers in array is %d",sum);	
}

int imax(int num1, int num2)
{
	int large = num2;

	if(num1>num2)
	{
		large = num1;
	}

	return large;
}


void squareGeo(int num1)
{
	int parameter, area;
	parameter = num1 * 4;
	area = num1 * num1;

	printf("Parameter = %d \nArea = %d",parameter,area);
}

float sqVol(void)
{
	float lenght,vol;

	printf("enter lenght: ");
	scanf ("%f",&lenght);

	vol = lenght*lenght*lenght;

	return vol;
}

int total(int arr[])
{
	int i, sum = 0;

	for(i=0;i<9;i++)
	{
		sum += arr[i];
	}

	return sum;
}
