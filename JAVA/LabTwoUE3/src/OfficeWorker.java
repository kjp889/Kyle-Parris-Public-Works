
public class OfficeWorker {
	private int employeeNumber;
	private String firstName;
	private String lastName;
	private String department;
	private Date doe;
	
	public OfficeWorker(int employeeNumber, String firstName, String lastName, String department, int day, int month, int year) {
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		Date doe = new Date(day,month,year);
		this.doe = doe;
	}
	
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	
	public void display() {
		System.out.println("Employee Number: " + employeeNumber);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Department: " + department);
		System.out.print("Date of Employment: "); doe.display();
	}

}
