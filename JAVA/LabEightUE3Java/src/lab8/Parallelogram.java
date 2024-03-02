package lab8;

public class Parallelogram extends Shape {
	private double base;
	private double height;
	
	public Parallelogram(String color, double base, double height) {
		this.color = color;
		this.base = base;
		this.height = height;
	}
	
	public void area() {
		super.area();
		System.out.println("The area of this " + color + " parallelogram is: " + (base*height));
	}
	
	
}
