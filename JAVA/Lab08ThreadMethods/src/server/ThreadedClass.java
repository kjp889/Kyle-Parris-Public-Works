package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import domain.Student;

//import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ThreadedClass implements Runnable, Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	private ObjectOutputStream objOs;
	private ObjectInputStream objIs;
	private Statement stmt;
	private ResultSet result = null;
	private Socket connectionSocket;
	//private ServerSocket serverSocket;

	



	public ThreadedClass(Socket connectionSocket2) {
		this.connectionSocket = connectionSocket2;
	}



	private void configureStreams() {
		try {
			//Instantiate the output stream, using the getOutputStream method of the Socket object as argument to the constructor
			objOs = new ObjectOutputStream(connectionSocket.getOutputStream());
			//Instantiate the input stream, using the getInputStream method of the Socket object as argument to the constructor
			objIs = new ObjectInputStream(connectionSocket.getInputStream());
		}catch(IOException ex) {
			
		}
	}
	private void closeConnection() {
		try {
			objOs.close();
			objIs.close();
			connectionSocket.close();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	private Student findStudentByID(String stuId) {
		Student stuObj = new Student();
		String query = "SELECT * FROM dblab.students WHERE id = " + stuId;
		try {
			stmt = Server.dBConn.createStatement();
			result = stmt.executeQuery(query);
			
			if(result.next()) {
				stuObj.setId(result.getString(1));
				stuObj.setFirstName(result.getString(2));
				stuObj.setLastName(result.getString(3));
				stuObj.setEmail(result.getString(4));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return stuObj;
	}
	
	private void addStudentToFile(Student student) {
	    String sql = "INSERT INTO dblab.students (id, firstName, lastName, email) VALUES (?, ?, ?, ?)";
	    try (PreparedStatement pstmt = Server.dBConn.prepareStatement(sql)) {
	        pstmt.setString(1, student.getId());
	        pstmt.setString(2, student.getFirstName());
	        pstmt.setString(3, student.getLastName());
	        pstmt.setString(4, student.getEmail());
	        int rowsAffected = pstmt.executeUpdate();
	        objOs.writeObject(rowsAffected == 1);
	    } catch (IOException ioe) {
	        ioe.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void run() {
	    String action = "";
	    Server.getDatabaseConnection();

	    Student stuObj = null;

	    try {
	        // configure streams only once when the connection is established
	        this.configureStreams();
	        
	        while(true) {
	            try {
	                action = (String) objIs.readObject();                    

	                if (action.equals("Add Student")) {
	                    stuObj = (Student) objIs.readObject();
	                    addStudentToFile(stuObj);
	                    objOs.writeObject(true);
	                } else if (action.equals("Find Student")) {
	                    String stuId = (String) objIs.readObject();
	                    stuObj = findStudentByID(stuId);
	                    objOs.writeObject(stuObj);
	                }
	            } catch(SocketException ex) {
	                // handle the socket exception by closing the connection and returning
	                System.out.println("SocketException: " + ex.getMessage());
	                this.closeConnection();
	                return;
	            } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    } finally {
	        // always make sure to close the connection when the thread exits
	        this.closeConnection();
	    }
	}


	
    
}
