/*
 * @author Ian Apelgren
 * @author James Cooke
 * opperations houses all the user specific queries and inserts we would do
 */

import java.sql.*;

import javax.swing.*;
/**
 *
 * houses all opperations
 */
public class Operations {
	//create account inserts values into server making a new account
    public static boolean createAccount(String fname, String lname, String email, String uname, String pword, JFrame frame) {
        try {
            Connection myConn = MySQLConnection.getConnection();
            String mysqlQuery = 
                    "INSERT INTO userlogins.login (Fname,Lname,Email,Username,Password) VALUES (?,?,?,?,?);";
            PreparedStatement ps = myConn.prepareStatement(mysqlQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);
            ps.setString(4, uname);
            ps.setString(5, pword);
            ps.executeUpdate();
            myConn.close();
            return true;
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(frame, "DB Error" + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
    //isLogin checks to see if the login info is valid
    public static boolean isLogin(String uname, String pword, JFrame frame) {
    	try {
            Connection myConn = MySQLConnection.getConnection();
            String mysqlQuery = 
                    "SELECT * FROM userlogins.login WHERE Username = ? and Password = ?";
            
            PreparedStatement ps = myConn.prepareStatement(mysqlQuery);
            ps.setString(1, uname);
            ps.setString(2, pword);

            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
            	return true;
            }
            myConn.close();
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(frame, "DB Error" + e.getMessage());
            e.printStackTrace();
        }
    	return false;
    }
    //isUsername checks exclusivly username for more detailed error feedback
    public static boolean isUsername(String uname, JFrame frame) {
    	try {
            Connection myConn = MySQLConnection.getConnection();
            String mysqlQuery = 
                    "SELECT * FROM userlogins.login WHERE Username = ?";
            
            PreparedStatement ps = myConn.prepareStatement(mysqlQuery);
            ps.setString(1, uname);
            

            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
            	return true;
            }
            myConn.close();
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(frame, "DB Error" + e.getMessage());
            e.printStackTrace();
        }
    	return false;
    }
}
