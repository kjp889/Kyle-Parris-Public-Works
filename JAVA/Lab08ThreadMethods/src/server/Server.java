package server;

import java.io.EOFException;
import java.io.IOException;

import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import javax.swing.JOptionPane;



public class Server implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ServerSocket serverSocket;
	private Socket connectionSocket;
	
	public static Connection dBConn = null;
	private static int numClients = 0;
	
	
	
	public Server() {
		this.createConncection();
		this.waitForRequests();
	}
	
	
	
	private void waitForRequests() {
		
		getDatabaseConnection();
	
		try {
			while(true) {
				connectionSocket = serverSocket.accept();
				numClients++;
				ThreadedClass threadedClass = new ThreadedClass(connectionSocket);
				Thread thread = new Thread(threadedClass);
				thread.start();
				System.out.println("Connected Threads: " +numClients);
				
			}
			
		}catch(EOFException ex) {
			System.out.println("Client has terminated connections with the server");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	 
	
	private void createConncection() {
		try {
			serverSocket = new ServerSocket(8888);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static Connection getDatabaseConnection() {
		if(dBConn == null) {//If connection was made to the xmapp server
			
			String url = "jdbc:mysql://localhost:3306/dblab";
			
			try {
				//1. Get Connection to localhost/xampp server
				dBConn = DriverManager.getConnection(url, "root", "");
				
				if(dBConn != null) {//If connection was made to the xmapp server
					System.out.println("COnnection to Database Established");
				}
				else {
					JOptionPane.showMessageDialog(null, "Unable To Establish Connection!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}catch (SQLSyntaxErrorException e) {
				System.err.println("SQL Exception: " + e.getMessage());
			}catch (SQLException e) {
				System.err.println("SQL Exception: " + e.getMessage());

			}catch (Exception e) {
				System.err.println("Unexpexted Error: " + e.getMessage());
			}
			
			
		}

		return dBConn;
	}
	
	
}



















