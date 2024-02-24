//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 19/09/2021
//DESCRIPTION: Question 6.11 Answer

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>
#define SIZE 12

/* function main begins program execution */
int main( void ) 
{ 
/* initialize a */
	int a[ SIZE ] = { 2, 6, 4, 8, 10, 12,-5,4,89, 68, 45, 37 }; 
 	int pass; /* passes counter */
 	int i,comp=11; /* comparisons counter */
 	int hold; /* temporary location used to swap array elements */
 
	printf( "Data items in original order\n" );
 
 	/* output original array */
 	for ( i = 0; i < SIZE; i++ )
 	{
 		printf( "%4d", a[ i ] );
 	} /* end for */

	/* bubble sort */ 
	/* loop to control number of passes */ 
	for ( pass = 1; pass < SIZE; pass++ ) 
	{ 
		//TO TEST MODIFICATIONS
 		//printf("\nNUMBER of PASS %d \t NUMBER of COMPARISON %d",pass,comp);
 		 	
		hold=0;
 		/* loop to control number of comparisons per pass */ 
 		for ( i = 0; i < comp; i++ ) 
 		{ 
 
 			/* compare adjacent elements and swap them if first
 			element is greater than second element */ 
 			if ( a[ i ] > a[ i + 1 ] ) 
			{ 
 				hold = a[ i ]; 
				a[ i ] = a[ i + 1 ]; 
				a[ i + 1 ] = hold; 
			} /* end if */ 
		} /* end inner for */
		
		comp--;//reduces the number of comparisons each passing
		
		//Should break the loop if no swaps are made
		if (hold==0)
		{
			break;
		}
		
		/*TO TEST MODIFICATIONS
		printf( "\nData items after each PASS \n" );
	 	for ( i = 0; i < SIZE; i++ ) 
		{
	 		printf( "%4d", a[ i ] );
	 	}	
	 	printf( "\n" );*/
		
	} /* end outer for */ 
 

	printf( "\nData items in ascending order\n" );

	/* output sorted array */
 	for ( i = 0; i < SIZE; i++ ) 
	{
 		printf( "%4d", a[ i ] );
 	} /* end for */

 	printf( "\n" );
 	return 0; /* indicates successful termination */
 	} /* end main */
