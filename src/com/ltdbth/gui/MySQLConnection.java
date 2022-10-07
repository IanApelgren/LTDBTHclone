/*
 * @author Ian Apelgren
 * @author James Cooke
 * MySQLConnection houses all the methods we need to connect and query our local SQL server
 */

import java.sql.*;
/**
 * houses data to connect and login to our server
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
            Connection myConn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Appstate123");
            
            return myConn;
            
    }
}
