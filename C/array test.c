





#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
int main()
{ 

	int numbers[10]; 
	int i, sq, cb; 
	char ram[10] = "kyle";
	

	
	for (i = 0; i < 10; i++) //accepts 10 numbers from the user
	{    
    	printf("Please enter number: ");
    	scanf("%d", &numbers[i]); 
	}

	for (i = 0; i < 10; i++) //prints the numbers, square and cube
	{
    	sq = numbers[i] * numbers[i];
    	cb = numbers[i] * numbers[i] * numbers[i];
    	printf("%d  %d  %d", numbers[i], sq, cb); 
	}
	printf ("%s",ram);

	return 0;
}

