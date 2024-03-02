package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

import javax.swing.JOptionPane;

import domain.Car;
import domain.Customer;

public class ClientMultiThread implements Serializable{
	private Socket connSocket;
	private ObjectOutputStream objOs;
	private ObjectInputStream objIs;
	private String action;
	
	public ClientMultiThread() {
		this.createConnection();
		this.configureStreams();
	}
	
	private void createConnection() {
		try {
			connSocket = new Socket("127.0.0.1", 8000);
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
		
	public void sendCar(Car car) {
		try {
			objOs.writeObject(car);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendCarID(String carID) {
		try {
			objOs.writeObject(carID);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendCustomer(Customer cus) {
		try {
			objOs.writeObject(cus);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void receiveResponse() {
		try {
			if(action.equalsIgnoreCase("Process Transaction")) {
				Boolean flag = (Boolean) objIs.readObject();
				if (flag == true) {
					JOptionPane.showMessageDialog(null, "Transaction Completed",
							"Transaction Stat Record", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Transaction Could Not Be Completed",
							"Transaction Stat Record", JOptionPane.ERROR_MESSAGE);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientMultiThread client = new ClientMultiThread();
		Customer cus = new Customer(12354, "John Brown");
		
		client.sendAction("Process Transaction");
		client.sendCarID("KP8897");
		client.sendCustomer(cus);
		

	}

}
