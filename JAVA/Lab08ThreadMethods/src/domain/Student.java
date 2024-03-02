package domain;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String Id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Student(String Id, String firstName, String lastName, String email) {
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Student() {
		this.Id = "";
		this.firstName = "";
		this.lastName = "";
		this.email = "";
	}

	public String getId() {
		return Id;
	}

	public void setId(String stuID) {
		this.Id = stuID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [stuID=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	
	
	
}

