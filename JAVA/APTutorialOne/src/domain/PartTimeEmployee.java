package domain;

public class PartTimeEmployee extends Employee implements Payable {
	
	public static final double BASICPAYRATE = 3575.65;
	
	private double overTimePay;
	
	public PartTimeEmployee() {
		super();
		this.overTimePay = 0.00;
	}
	
	public PartTimeEmployee(String id, String name, String phone, double salary, double hoursWorked, double overTimePay) {
		super(id, name, phone, salary, hoursWorked);
		this.overTimePay = overTimePay;
	}

	public PartTimeEmployee(String id, String name, String phone, double hoursWorked) {
		super(id, name, phone, hoursWorked);
	}

	@Override
	public double calculateOverTime() {
		// TODO Auto-generated method stub
		overTimePay = (BASICPAYRATE * (hoursWorked - 6) * OVTRATE);
		
		return overTimePay;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		if (hoursWorked <= 6) {
			return salary = BASICPAYRATE * hoursWorked;
		}
		return salary = BASICPAYRATE * 6 + calculateOverTime();
	}

}
