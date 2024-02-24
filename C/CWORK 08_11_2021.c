#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

typedef struct{
	char model[30];
	char make[30];
	int year;
}CAR;

void CarFunction(CAR c1);

int main()
{
	CAR car1;
	
	printf("Enter the model of the car: ");
	gets(car1.model);
	printf("Enter the make of the car: ");
	gets(car1.make);
	printf("Enter the year the car was made: ");
	scanf("%d",&car1.year);
	
	CarFunction(car1);
	
	return 0;
}

void CarFunction(CAR c1)
{
	printf("\n\nThe model of the car is %s",c1.model);
	printf("\nThe make of the car is %s",c1.make);
	printf("\nThe year of the car is %d",c1.year);
}
