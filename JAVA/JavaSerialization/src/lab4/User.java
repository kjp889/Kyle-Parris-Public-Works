package lab4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
	private String firstName;
	private String lastName;
	private int age;
	private Date signUpDate;
	
	public User() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.signUpDate = new Date(1,1,1122);
	}
	
	public User(String firstName, String lastName, int age, Date signUpDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.signUpDate = signUpDate;
	}
	
	public User(User user) {
		this.firstName = user.firstName;
		this.lastName = user.lastName;
		this.age = user.age;
		this.signUpDate = user.signUpDate;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getSignUpDate() {
		return signUpDate;
	}

	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}
	
	public static void writeToUsersDBFile(ArrayList<User> usersList) {
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		
		try {
			fileOut = new FileOutputStream("./UserDB.ser");
			objOut = new ObjectOutputStream(fileOut);
			
			for(User user : usersList) {
				objOut.writeObject(user);
			}
			objOut.flush();
			objOut.close();
			System.out.printf("Serialized employee data is saved\n");
		}catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	public static ArrayList<User> readFromUsersDBFile(){
		ArrayList<User> usersList = new ArrayList<>();
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		User user;
		try {
			fileIn = new FileInputStream("./UserDB.ser");
			objIn = new ObjectInputStream(fileIn);
			while(true) {
				try {
					user = (User) objIn.readObject();
					if(user != null) {
						usersList.add(user);
					}else if(user == null) {
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
		return usersList;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nAge: " + age + "\nSign Up Date: " + signUpDate
				+ "\n";
	}

}
