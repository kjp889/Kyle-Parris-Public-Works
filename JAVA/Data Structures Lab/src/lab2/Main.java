package lab2;

public class Main {
	
	/*Algorithm
	 * Factorial (n)
		f = 1
		for(i=n; i>0; i--)
			f = f * i
		return f
	*/

	
	public static int factorial_Iteration(int n) {
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
	public static void histogram_Iteration(int f, char s) {
		for(int i=1; i<=f; i++) {
			System.out.print(s);
		}
	}
	
	/*Algorithm
	 * Factorial(n) 
		If n == 0{ Return 1}
		Else
		{return n*Factorial(n-1)}
	 */
	
	public static int factorial_Recursion(int n) {
		if (n <= 0) { return 1;}
		else {return n*factorial_Recursion(n-1);}
	}

	/*Algorithm
	 * histogram_Recursion(int f, char s)
	 *	if f == 0{ return 0}
	 *  else 
	 *  {histogram_Recursion(f-1, s); print s}
	*/
	
	public static void histogram_Recursion(int f, char s) {
		if(f <= 0){ return;}
		else {histogram_Recursion(f-1, s); System.out.print(s);}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		System.out.println(factorial_Iteration(5));
		System.out.println(factorial_Recursion(5));
		
		
	}

}
