
public class Main {

	public static void main(String[] args) {
		Driver A = new Driver(12345, 0);
		A.viewTotalPoints();
		A.addPoints(5);
		A.viewTotalPoints();
		A.addPoints(3);
		A.viewTotalPoints();
		A.clearPoints();
		A.viewTotalPoints();
		
		System.out.println();//adds blank line
		
		Driver B = new Driver(6789, 0);
		B.viewTotalPoints();
		B.addPoints(1);
		B.viewTotalPoints();
		B.addPoints(9);
		B.viewTotalPoints();
		B.subtractPoints(2);
		B.viewTotalPoints();
	}
}
