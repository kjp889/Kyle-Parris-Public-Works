
public class Driver {
	private int licenseNumber;
	private int points;
	
	public Driver(int licenseNumber, int points) {
		this.licenseNumber = licenseNumber;
		this.points = points;
	}
	public void addPoints(int points) {
		this.points += points;
	}
	
	public void clearPoints() {
		this.points = 0;
	}
	
	public void viewTotalPoints() {
		System.out.println("License No: " + licenseNumber);		
		System.out.println("Total Points Accumulated: " + points);		
	}
	
	public void subtractPoints(int points) {
		this.points -= points;
	}

}
