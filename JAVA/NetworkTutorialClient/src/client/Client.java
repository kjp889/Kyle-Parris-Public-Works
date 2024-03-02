package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JOptionPane;

import domain.Student;

public class Client implements Serializable{
	private Socket connSocket;
	private ObjectOutputStream objOs;
	private ObjectInputStream objIs;
	private String action;
	
	public Client() {
		this.createConnection();
		this.configureStreams();
	}
	
	private void createConnection() {
		try {
			connSocket = new Socket("127.0.0.1", 8001);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void configureStreams() {
		try {
			objOs = new ObjectOutputStream(connSocket.getOutputStream());
			objIs = new ObjectInputStream(connSocket.getInputStream());
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			objOs.close();
			objIs.close();
			connSocket.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	public void sendAction(String action) {
		this.action = action;
		try {
			objOs.writeObject(action);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		
	public void sendStudent(Student student) {
		try {
			objOs.writeObject(student);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendStudentId(int studId) {
		try {
			objOs.writeObject(studId);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void receiveResponse() {
		try {
			if(action.equalsIgnoreCase("Add Student")) {
				Boolean flag = (Boolean) objIs.readObject();
				if (flag == true) {
					JOptionPane.showMessageDialog(null, "Record added",
							"Add record Stat", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			if(action.equalsIgnoreCase("Find Student")) {
				Student student = new Student();
				student = (Student) objIs.readObject();
				System.out.println(student);
				if(student == null) {
					JOptionPane.showMessageDialog(null, "Record Not found",
							"find record Stat", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		}catch(ClassCastException ex) {
			ex.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
