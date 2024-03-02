package deserialization;

import java.util.ArrayList;
import java.util.List;

import serialization.Employee;

public class DeserializationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empsList = new ArrayList<Employee>();
		empsList = Employee.readFromEmployeesFile();
		for(Employee employee: empsList) {
			System.out.println(employee);
		}

	}

}
