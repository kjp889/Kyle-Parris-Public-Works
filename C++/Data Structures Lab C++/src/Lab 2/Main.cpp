/*
 * Main.cpp
 *
 *  Created on: 20 Sep 2022
 *      Author: Kyle
 */

#include <iostream>
using namespace std;

int factorial_Recursion(int n);
void histogram_Recursion(int f, char s);
int factorial_Iteration(int n);
void histogram_Iteration(int f, char s);


/*Algorithm
 * Factorial(n)
	If n == 0{ Return 1}
	Else
	{return n*Factorial(n-1)}
 */

int factorial_Recursion(int n) {
	if (n <= 0) { return 1;}
	else {return n*factorial_Recursion(n-1);}
}

/*Algorithm
 * histogram_Recursion(int f, char s)
 *	if f == 0{ return 0}
 *  else
 *  {histogram_Recursion(f-1, s); print s}
*/

void histogram_Recursion(int f, char s) {
	if(f <= 0){ return;}
	else {histogram_Recursion(f-1, s); cout << s ;}
	}

/*Algorithm
* Factorial (n)
	f = 1
	for(i=n; i>0; i--)
		f = f * i
return f
*/


int factorial_Iteration(int n) {
	int f = 1;
	for(int i=n; i>0; i--){
		f = f * i;
	}
	return f;
}

/*Algorithm
 * histogram_Iteration(int f, char s)
 * 	for(i=1;i<=f;i++)
 * 		print s
*/
void histogram_Iteration(int f, char s) {
	for(int i=1; i<=f; i++) {
		cout << s  ;
	}
}

//int main(){

	cout << factorial_Recursion(5);
}

