package lab8;

public class Triangle extends Shape {
	private double base;
	private double height;
	private double hypotenuse;
	
	public Triangle(String color, double base, double height, double hypotenuse) {
		this.color = color;
		this.base = base;
		this.height = height;
		this.hypotenuse = hypotenuse;	
	}
	
	//Overloading of the parameter method.
	public void parameter(double side) {
		System.out.println("The parameter of this " + color + " triangle is: " + (3*side));
	}
	
	public void parameter(double base, double height, double hypotenuse) {
		System.out.println("The parameter of this " + color + " triangle is: " + (base + height + hypotenuse));
	}
	
	public void parameter() {
		System.out.println("The parameter of this " + color + " triangle is: " + (base + height + hypotenuse));
	}
	
	@Override 
	public void area() {
		System.out.println("The area of this " + color + " triangle is: " + ((0.5*base)*height));
	}

}
