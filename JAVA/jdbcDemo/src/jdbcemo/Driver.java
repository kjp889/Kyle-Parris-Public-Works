package jdbcemo;

import java.sql.*;

import javax.swing.JOptionPane;

public class Driver {
	
	public static void main(String[] args) {
		Connection myConn = null;
		String url = "jdbc:mysql://localhost:3306/Query_Management";
		try {
			if(myConn != null) {
				JOptionPane.showMessageDialog(null, "already Connected", 
						"JDBC Stat", JOptionPane.INFORMATION_MESSAGE);
			}else {
				myConn = DriverManager.getConnection(url, "root", "P@rri$889");
				JOptionPane.showMessageDialog(null, "Connected", 
						"JDBC Stat", JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
