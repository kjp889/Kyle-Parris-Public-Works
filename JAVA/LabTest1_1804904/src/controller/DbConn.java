//Kyle Parris
//1804904

package controller;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DbConn {
	private static java.sql.Connection conn;
	
	public static java.sql.Connection getDatabaseConnection(){
		String url = "jdbc:mysql://localhost:3306";
		
		try {
			conn = DriverManager.getConnection(url, "root", "P@rri$889");
			
			if(conn != null) {
				JOptionPane.showMessageDialog(null, "Connected", 
						"JDBC Stat", JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
