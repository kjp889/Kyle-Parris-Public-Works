package lab8;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}
	
	@Override
	public void area() {
		//System.out.println("The area of this " + color + " circle is:" + (3.142*(radius*radius)));
		System.out.println("The area of this " + color + " circle is:" + (3.142*Math.pow(radius,2)));
		//System.out.println("The area of this " + color + " circle is:" + (Math.PI*Math.pow(radius,2)));
	}
	
}
