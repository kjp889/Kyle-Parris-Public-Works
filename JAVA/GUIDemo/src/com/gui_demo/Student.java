package com.gui_demo;

public class Student {
	private int studId;
	private String fName;
	private String lName;
	private String[] phone = new String[3];
	private String email;
	private String password;
	private java.sql.Connection stuConn;
	
	public Student() {
		this.studId = 0;
		this.fName = "";
		this.lName = "";
		this.phone = new String[3];
		this.email = "";
		this.password = "";
		//this.stuConn = DBConnectorComplaint.getDatabaseConnection(); 
	}
	
	public Student(int studId, String fName, String lName, String phone1, String email, String password) {
		this.studId = studId;
		this.fName = fName;
		this.lName = lName;
		this.phone[0] = phone1;
		this.email = email;
		this.password = password;
	}
	
	public Student(int studId, String fName, String lName, String phone1, String phone2, String email, String password) {
		this.studId = studId;
		this.fName = fName;
		this.lName = lName;
		this.phone[0] = phone1;
		this.phone[1] = phone2;
		this.email = email;
		this.password = password;
	}
	
	public Student(int studId, String fName, String lName, String phone1, String phone2, String phone3, String email, String password) {
		this.studId = studId;
		this.fName = fName;
		this.lName = lName;
		this.phone[0] = phone1;
		this.phone[1] = phone2;
		this.phone[2] = phone3;
		this.email = email;
		this.password = password;
	}
	
	public Student(Student student) {
		this.studId = student.studId;
		this.fName = student.fName;
		this.lName = student.lName;
		this.phone = student.phone;
		this.email = student.email;
		this.password = student.password;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhone1() {
		return phone[0];
	}
	
	public String getPhone2() {
		return phone[1];
	}
	
	public String getPhone3() {
		return phone[2];
	}

	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student's ID#: " + studId + "\nStudent's Name: " + fName + " " + lName + "\nStudent's Phone#: " + 
				phone + "\nStudent's Email: " + email + "\n";
	}
	
	
	

}
