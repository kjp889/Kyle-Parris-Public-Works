package server;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import domain.Student;

public class Server {
	private ServerSocket serverSocket;
	private Socket connSocket;
	private ObjectOutputStream objOs;
	private ObjectInputStream objIs;
	private static Connection dbConn;
	private Statement state;
	private ResultSet result;
	
	public Server() {
		createConnection();
		waitForRequests();		
	}
	
	private void createConnection() {
		try {
			serverSocket = new ServerSocket(8888);
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
	
	private static Connection getDatabaseConnection() {
		if(dbConn == null) {
			try {
				String url = "jdbc:mysql://localhost:3306";
				dbConn = DriverManager.getConnection(url, "root", "P@rri$889");
				
				JOptionPane.showMessageDialog(null, "Connected", 
						"JDBC Stat", JOptionPane.INFORMATION_MESSAGE);
			}catch(SQLException ex) {
				JOptionPane.showMessageDialog(null, "could not connect" + ex, 
						"failed", JOptionPane.ERROR_MESSAGE);
			}
		}
		return dbConn;
	}
	
	private void closeConnection() {
		try {
			objOs.close();
			objIs.close();
			connSocket.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void waitForRequests() {
		String action = "";
		getDatabaseConnection();
		Student studObj = null;
		try {
			while(true) {
				connSocket = serverSocket.accept();
				this.configureStreams();
				try {
					action = (String) objIs.readObject();
					
					if(action.equals("Add Student")) {
						studObj = (Student) objIs.readObject();
						//addStudentToFile(studObj);
						objOs.writeObject(true);
					}else if(action.equals("Find Student")) {
						int studId = (int) objIs.readObject();
						//studObj = findStudentById(studId);
						objOs.writeObject(studObj);
					}
				}catch(ClassNotFoundException ex) {
					ex.printStackTrace();
				}catch(ClassCastException e) {
					e.printStackTrace();
				}
				this.closeConnection();
			}
		}catch(EOFException ex) {
			ex.printStackTrace();
			System.out.println("Terminated Connection");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
