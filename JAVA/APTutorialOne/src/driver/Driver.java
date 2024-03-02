package driver;

import domain.Employee;
import domain.PartTimeEmployee;
import domain.Payable;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable payee = new PartTimeEmployee("DBM001", "Deian Morrison", "8764273432", 80);
		double overTime;
		
		overTime = payee.calculateOverTime();
		System.out.println(overTime);
		System.out.println(payee);
		
		Employee emp = (Employee)payee;
		double salary;
		
		salary = emp.calculatePay();
		System.out.println(salary);
				
		System.out.println(emp);
	}

}
