#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int fibonacci(int num);

int main()
{
	int num,fib;
	
	printf("Enter the number to find: ");
	scanf("%d",&num);
	
	fib=fibonacci(num);
	
	printf("\nThe %d number in the fibonacci series is: %d",num,fib);

	return 0;
}

int fibonacci(int num)
{
	int initial1=0,initial2=1,ans,i;
	for(i=0;i<num;i++)
	{
		ans=initial1+initial2;
		initial1=initial2;
		initial2=ans;
	}
	return initial1;	
}
