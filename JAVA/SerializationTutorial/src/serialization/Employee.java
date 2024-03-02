package serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable {
	private int empId;
	private String name;
	private String teleNum;
	private Date dob;
	
	public Employee() {
		this.empId = 0;
		this.name = "";
		this.teleNum = "0(000)000-0000";
		this.dob = new Date(1,1,1700);
	}
		
	public Employee(int empId, String name, String teleNum, Date dob) {
		this.empId = empId;
		this.name = name;
		this.teleNum = teleNum;
		this.dob = dob;
	}
	
	public Employee(Employee emp) {
		this.empId = emp.empId;
		this.name = emp.name;
		this.teleNum = emp.teleNum;
		this.dob = emp.dob;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeleNum() {
		return teleNum;
	}

	public void setTeleNum(String teleNum) {
		this.teleNum = teleNum;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public static void writeToEmployeesFile(ArrayList<Employee> employeesList) {
		FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
		
		try {
			fileOut = new FileOutputStream("./src/EmployeeDB.ser");
			out = new ObjectOutputStream(fileOut);
			
			for(Employee employee : employeesList) {
				out.writeObject(employee);
			}
			out.flush();
			out.close();
			System.out.printf("Serialized employee data is saved\n");
		}catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	public static ArrayList<Employee> readFromEmployeesFile(){
		ArrayList<Employee> employeesList = new ArrayList<>();
		FileInputStream fileIn = null;
		ObjectInputStream in = null;
		Employee employee;
		try {
			fileIn = new FileInputStream("./src/EmployeeDB.ser");
			in = new ObjectInputStream(fileIn);
			while(true) {
				try {
					employee = (Employee) in.readObject();
					if(employee != null) {
						employeesList.add(employee);
					}else if(employee == null) {
						break;
					}
				}catch (ClassNotFoundException e) {
					System.out.println("Object could not be converted to a User");
				}catch(EOFException e) {
					break;
				}
			}
		}catch (IOException i) {
			i.printStackTrace();
		}
		return employeesList;
	}

	@Override
	public String toString() {
		return "Employee ID: " + empId + "\nName: " + name 
				+ "\nPhone Number: " + teleNum 
				+ "\nDate Of Birth: " + dob + "\n";
	}
	
	

}
