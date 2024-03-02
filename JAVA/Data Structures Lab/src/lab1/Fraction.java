package lab1;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction() {
		this.numerator = 1;
		this.denominator = 4;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction(Fraction fraction) {
		this.numerator = fraction.numerator;
		this.denominator = fraction.denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public void display() {
		System.out.println(toString());
	}
	
	public Fraction simplify(Fraction f) {
		int i = 1;
		int rNum = 1;
		int rDen = 1;
		int sNum = 1;
		int sDen = 1;
		for(i = 1; i <= f.denominator; i++) {
			rNum = f.numerator % i;
			rDen = f.denominator % i;
			if(rNum == 0 && rDen == 0) {
				sNum = f.numerator / i;
				sDen = f.denominator / i; 
				
				//System.out.print("" + sNum + "/" + sDen + "= ");
			}
		}
		//System.out.print("Simplification =");
		
		f.setDenominator(sDen);
		f.setNumerator(sNum);
		return f;
		
	}
	
	public Fraction addFractions(Fraction f1, Fraction f2) {
		
		Fraction sumOfFrac = new Fraction();
		
		sumOfFrac.setDenominator(f1.getDenominator() * f2.getDenominator()); 
		sumOfFrac.setNumerator((f1.getNumerator()*f2.getDenominator()) + (f2.getNumerator()*f1.getDenominator()));
		System.out.println();
		sumOfFrac.simplify(sumOfFrac);
		
		System.out.print("Sum of fractions =");
		
		return sumOfFrac;
		
	}
	
	public Fraction multiplyFractions(Fraction f1, Fraction f2) {
		
		Fraction prodOfFrac = new Fraction();
		
		prodOfFrac.setDenominator(f1.getDenominator() * f2.getDenominator()); 
		prodOfFrac.setNumerator(f1.getNumerator() * f2.getNumerator());
		System.out.println();
		prodOfFrac.simplify(prodOfFrac);
		
		System.out.print("Product of fractions =");
		
		return prodOfFrac;
		
	}

	@Override
	public String toString() {
		return " " + numerator + "/" + denominator;
	}
	
	

}
