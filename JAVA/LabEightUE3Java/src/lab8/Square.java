package lab8;

public class Square extends Shape {
	private double length;
	
	public Square(String color, double length) {
		this.color = color;
		this.length = length;
	}

	@Override
	public void area() {
		System.out.println("The area of this " + color + " square is: " + (length*length));
	}
	
	
}
