package domain;

import java.io.Serializable;

public class Student implements Serializable{
	private int StudentID;
	private String Fname;
	private String Lname;
	private char Gender;
	private double FinalGrade;
	
	public Student() {
		StudentID = 0;
		Fname = "";
		Lname = "";
		Gender = 'm';
		FinalGrade = 0.00;
	}
	
	public Student(int studentID, String fname, String lname, char gender, double finalGrade) {
		StudentID = studentID;
		Fname = fname;
		Lname = lname;
		Gender = gender;
		FinalGrade = finalGrade;
	}
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	public double getFinalGrade() {
		return FinalGrade;
	}
	public void setFinalGrade(double finalGrade) {
		FinalGrade = finalGrade;
	}

	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", Fname=" + Fname + ", Lname=" + Lname + ", Gender=" + Gender
				+ ", FinalGrade=" + FinalGrade + "]";
	}
	
	

}
