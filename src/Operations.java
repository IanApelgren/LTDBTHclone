/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.gui;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author jamescooke
 */
public class Operations {
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
}
