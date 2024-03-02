/*Kyle Parris
 * 1804904
 * 01/11/2022
 */


package labTest1;

import java.util.Arrays;

public class Student {
	private String studFname;
	private String studLname;
	private int idNum;
	private char[] subject = new char[4];
	
	public Student() {
		this.studFname = "Firstname";
		this.studLname = "Lastname";
		this.idNum = 1234;
	}
	
	public Student(String studFname, String studLname, int idNum, char sub1,char sub2,char sub3,char sub4) {
		this.studFname = studFname;
		this.studLname = studLname;
		this.idNum = idNum;
		this.subject[0] = sub1;
		this.subject[1] = sub2;
		this.subject[2] = sub3;
		this.subject[3] = sub4;
	}
	
	public Student(String studFname, String studLname, int idNum, char sub1,char sub2,char sub3) {
		this.studFname = studFname;
		this.studLname = studLname;
		this.idNum = idNum;
		this.subject[0] = sub1;
		this.subject[1] = sub2;
		this.subject[2] = sub3;
	}
	
	public Student(String studFname, String studLname, int idNum, char sub1,char sub2) {
		this.studFname = studFname;
		this.studLname = studLname;
		this.idNum = idNum;
		this.subject[0] = sub1;
		this.subject[1] = sub2;
	}
	
	public Student(Student student) {
		this.studFname = student.studFname;
		this.studLname = student.studLname;
		this.idNum = student.idNum;
		this.subject = student.subject;
	}

	public String getStudFname() {
		return studFname;
	}

	public void setStudFname(String studFname) {
		this.studFname = studFname;
	}

	public String getStudLname() {
		return studLname;
	}

	public void setStudLname(String studLname) {
		this.studLname = studLname;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	

	public char[] getSubject() {
		return subject;
	}

	public void setSubject(char[] subject) {
		this.subject = subject;
	}
	
	public void display() {
		System.out.println(toString());
		displayStudSubjects();
		System.out.println();
	}

	public void displayStudInfo() {
		System.out.println(toString());
	}
	
	public void displayStudSubjects() {
		int i=0;
		System.out.print("Subjects: ");
		for(i=0;i<4;i++) {
			if(this.subject[i] == 'P' || this.subject[i] == 'p' ) {
				System.out.print("Physics, ");
			}
			if(this.subject[i] == 'C' || this.subject[i] == 'c' ) {
				System.out.print("Chemistry, ");
			}
			if(this.subject[i] == 'M' || this.subject[i] == 'm' ) {
				System.out.print("Maths, ");
			}
			if(this.subject[i] == 'E' || this.subject[i] == 'e' ) {
				System.out.print("English, ");
			}
			if(this.subject[i] == 'A' || this.subject[i] == 'a' ) {
				System.out.print("Accounts, ");
			}
			if(this.subject[i] == 'B' || this.subject[i] == 'b' ) {
				System.out.print("Biology, ");
			}
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Student's Name: " + studFname + " " + studLname + "\nStudent's ID#: " + idNum ;
	}
		

}
