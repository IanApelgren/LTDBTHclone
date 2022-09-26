/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.ltdbth.gui;
import java.sql.*;
/**
 *
 * @author jamescooke
 */
public class MySQLConnection {

        public static Connection getConnection() throws Exception{
            String dbRoot = "jdbc:mysql://";
            String hostName = "localhost:3306/";
            String dbName = "";
            String dbUrl = dbRoot + hostName + dbName;
            
            String hostUsername = "root";
            String hostPassword = "Appstate123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myConn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root","Appstate123");
            
            return myConn;
            
    }
}
