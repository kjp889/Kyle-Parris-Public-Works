package client;

import domain.Student;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		Student student = new Student(1003,"james","brown");
		/*
		client.sendAction("Add Student");
		System.out.println("Message sent to server");
		client.sendStudent(student);
		System.out.println("Record sent to server");
		client.receiveResponse();
		System.out.println("Response received from server");*/
		
		client.sendAction("Find Student");
		client.sendStudentId(1005);
		client.receiveResponse();
	}

}
