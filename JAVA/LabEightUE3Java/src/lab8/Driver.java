package lab8;

public class Driver {

	public static void main(String[] args) {
		Triangle triangle = new Triangle("blue", 3, 4, 5);
		triangle.parameter();
		triangle.area();
		triangle.parameter(6);
		triangle.parameter(4, 5, 6);
		
		Circle circle = new Circle("pink", 5);
		circle.area();
		
		Square square = new Square("yellew", 10);
		square.area();
		
		Parallelogram parallelogram	= new Parallelogram("Black", 8, 6);	
		parallelogram.area();
		
	}

}
