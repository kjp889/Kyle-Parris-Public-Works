//Kyle Parris
//1804904

package controller;

import java.sql.*;

import javax.swing.JOptionPane;

import model.Watch;

public class Actions {
	Connection myConn = null;
	Statement myState = null;
	ResultSet myResult = null;
	
	public static void createARecord(Watch watch) {
		String sql = "INSERT INTO `watchesdb`.`watches` (`soa`, `material`, `brand`, `price`) VALUES "
				+ "('" + watch.getSoa() + "', '" + watch.getMaterial() + "', '" + watch.getBrand() + "', '" + watch.getPrice() + "');";
		try {
			Connection myConn = DbConn.getDatabaseConnection();
			Statement myState = myConn.createStatement();
						
			if (myState.executeUpdate(sql) == 1) {
				JOptionPane.showMessageDialog(null, "Record added",
						"Add record Stat", JOptionPane.INFORMATION_MESSAGE);
				
			}else {
				JOptionPane.showMessageDialog(null, "Failed",
						"Add record Stat", JOptionPane.ERROR_MESSAGE);
				
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static Watch findAWatch(String soa) {
		String sql = "SELECT * FROM `watchesdb`.`watches` WHERE `watches`.`soa` = '" + soa + "'; ";
		Watch wat = new Watch();
		try {
			Connection myConn = DbConn.getDatabaseConnection();
			Statement myState = myConn.createStatement();
			ResultSet myResult = myState.executeQuery(sql);			
			if (myResult.next()) {
				wat.setSoa(myResult.getString(1));
				wat.setMaterial(myResult.getString(2));
				wat.setBrand(myResult.getString(3));
				wat.setPrice(myResult.getDouble(4));
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return wat;
	}
	
	public static void updateARecord(String soa, double price) {
		String sql = "UPDATE `watchesdb`.`watches` SET `price` = '" + price + "' WHERE `soa` = '" + soa + "';";
	    try {
	        Connection dbConn = DbConn.getDatabaseConnection();
	        PreparedStatement stmt = dbConn.prepareStatement(sql);
	        
	        int rowsUpdated = stmt.executeUpdate();
	        if (rowsUpdated == 1) {
	            JOptionPane.showMessageDialog(null, "Record updated successfully",
	                    "Update record Status", JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(null, "Failed to update record",
	                    "Update record Status", JOptionPane.ERROR_MESSAGE);
	        }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
		
	}
	
	public static void deleteARecord(String soa) {
		String sql = "DELETE FROM `watchesdb`.`watches`  WHERE `soa` = '" + soa + "';";
	    try {
	        Connection dbConn = DbConn.getDatabaseConnection();
	        PreparedStatement stmt = dbConn.prepareStatement(sql);
	        
	        int rowsUpdated = stmt.executeUpdate();
	        if (rowsUpdated == 1) {
	            JOptionPane.showMessageDialog(null, "Record updated successfully",
	                    "Update record Status", JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(null, "Failed to update record",
	                    "Update record Status", JOptionPane.ERROR_MESSAGE);
	        }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	}

}
