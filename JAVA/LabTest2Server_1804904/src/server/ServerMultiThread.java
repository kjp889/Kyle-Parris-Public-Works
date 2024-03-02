package server;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import domain.Car;
import domain.Customer;

public class ServerMultiThread implements Serializable {
	
	private ServerSocket serverSocket;
	private Socket connSocket;
	private int clientCount;
	private String threadName;
	private static Connection dbConn;
	private Statement state;
	private ResultSet result;
	private ObjectOutputStream objOs;
	private ObjectInputStream objIs;
	
	public ServerMultiThread() {
		this.createConnection();
		this.waitForRequests();
	}

	private void createConnection() {
		try {
			serverSocket = new ServerSocket(8000);
			System.out.print("waiting");
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
	
	private void waitForRequests() {
		getDatabaseConnection();
		
		try {
			while(true) {
				connSocket = serverSocket.accept();
				clientCount++;
				ClientHandler threaded = new ClientHandler(connSocket);
				Thread thread = new Thread(threaded);
				threadName= thread.getName();
				thread.start();
				System.out.println("Connected Threads: " + clientCount);
				
			}
			
		}catch(EOFException ex) {
			System.out.println("Client has terminated connections with the server");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

	public class ClientHandler implements Runnable{
		
		private Socket connSocketClient;
		
		public ClientHandler(Socket connSocketClient) {
			this.connSocketClient = connSocketClient;
			objOs = null;
			objIs = null;
		}
		
		private void configureStreams() {
			try {
				objOs = new ObjectOutputStream(connSocket.getOutputStream());
				objIs = new ObjectInputStream(connSocket.getInputStream());
			}catch(IOException ex) {
				ex.printStackTrace();
			}
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
		
		private void processTransaction(Car car, Customer cus) {
			String sql = "INSERT INTO `labtest2db`.`Transactions` (`transID`, `cusName`, `carID`, `cost`, `threadName`)"
					+ "VALUES(" + cus.getTrn() + ", '" + cus.getCusName() + "', '" + car.getCarID() + "', '" + getRentCost(car.getCarID()) 
					+ "', '" + threadName + "');";
			try {
				state = dbConn.createStatement();
				
				if (state.executeUpdate(sql) == 1) {
					objOs.writeObject(true);
				}else {
					objOs.writeObject(false);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		
		private double getRentCost(String carID) {
			double rentCost = 0;
			double carCost = 0;
			double gct = .20;
			String query = "select `cost` from `labtest2db`.`RentalCars` where `licenseNum` = '" + carID + "';";
			try {
				state = dbConn.createStatement();
				result = state.executeQuery(query);
				if(result.next()) {
					carCost = result.getDouble(1);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			rentCost = carCost + (carCost*gct);
			
			return rentCost;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1; i>=0; i++) {
				String action = "";
				getDatabaseConnection();
				Car carObj = null;
				Customer cusObj = null;
				try {
					while(true) {
						connSocket = serverSocket.accept();
						this.configureStreams();
						try {
							action = (String) objIs.readObject();
							
							if(action.equals("Process Transaction")) {
								carObj = (Car) objIs.readObject();
								cusObj = (Customer) objIs.readObject();
								//processTransaction(carObj, cusObj);
								objOs.writeObject(true);
								System.out.println(carObj.toString());
								System.out.println(cusObj.toString());
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
	
	}

}

