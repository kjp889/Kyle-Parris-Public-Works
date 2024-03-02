package serialization;

import java.util.ArrayList;

public class SerializationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employeesList = new ArrayList<>();
		
		employeesList.add(new Employee(10004, "John Brown", "1(876)978-1000", new Date(2,2,1990)));
		employeesList.add(new Employee(10005, "Mary Brown", "1(876)451-3500", new Date(25,12,2000)));
		employeesList.add(new Employee(10006, "John Brown", "1(876)978-5320", new Date(14,7,1975)));
		
		Employee.writeToEmployeesFile(employeesList);
	}

}
