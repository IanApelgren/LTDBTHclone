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
                    "INSERT INTO login (Fname,Lname,Email,Username,Password) VALUES (fname,lname,email,uname,pword)";
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(frame, "DB Error" + e.getMessage());
        }
        return false;
    }
}
