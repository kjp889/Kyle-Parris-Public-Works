package lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int numer = 0;
		int denom = 0;
		Fraction simple = new Fraction();
		Fraction sum = new Fraction();
		Fraction prod = new Fraction();
		
		System.out.println("Press 1 to simplify a fraction");
		System.out.println("Press 2 to add two fractions");
		System.out.println("Press 3 to multiply two fractions");
		System.out.println("____________________________________________________");
		
		choice = input.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter fraction numerator: ");
			numer = input.nextInt();
			System.out.print("Enter fraction denominator: ");
			denom = input.nextInt();
			
			Fraction f = new Fraction(numer,denom);
			
			simple = f.simplify(f);
			simple.display();
		}
		if(choice == 2) {
			System.out.print("Enter first fraction numerator: ");
			numer = input.nextInt();
			System.out.print("Enter first fraction denominator: ");
			denom = input.nextInt();
			Fraction f1 = new Fraction(numer,denom);
			System.out.println();
			System.out.print("Enter second fraction numerator: ");
			numer = input.nextInt();
			System.out.print("Enter second fraction denominator: ");
			denom = input.nextInt();
			Fraction f2 = new Fraction(numer,denom);
			
			sum = sum.addFractions(f1, f2);
			sum.display();
		}
		if(choice == 3) {
			System.out.print("Enter first fraction numerator: ");
			numer = input.nextInt();
			System.out.print("Enter first fraction denominator: ");
			denom = input.nextInt();
			Fraction f1 = new Fraction(numer,denom);
			System.out.println();
			System.out.print("Enter second fraction numerator: ");
			numer = input.nextInt();
			System.out.print("Enter second fraction denominator: ");
			denom = input.nextInt();
			Fraction f2 = new Fraction(numer,denom);
			
			prod = prod.multiplyFractions(f1, f2);
			prod.display();
		}	
	}
}
