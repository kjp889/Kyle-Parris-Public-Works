package domain;

import java.io.Serializable;

public class Student implements Serializable{
	private int stuID;
	private String fName;
	private String lName;
	
	public Student() {
		this.stuID = 0;
		this.fName = "";
		this.lName = "";
	}

	public Student(int stuID, String fName, String lName) {
		this.stuID = stuID;
		this.fName = fName;
		this.lName = lName;
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
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

	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", fName=" + fName + ", lName=" + lName + "]";
	}

	
}
