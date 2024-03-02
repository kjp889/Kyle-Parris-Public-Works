package tutmar6;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class StudentDB {
	
	private static java.sql.Connection link = null;
	
	public static java.sql.Connection getDatabaseConnection(){
		String url = "jdbc:mysql://localhost:3308/";		
		try {
			link = DriverManager.getConnection(url, "utech", "");
			
			if(link != null) {
				JOptionPane.showMessageDialog(null, "Connected", 
						"JDBC Stat", JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return link;
	}
	
	public static void main(String[] args) {
		StudentDB n = new StudentDB();
		
		n.getDatabaseConnection();
	}
}
