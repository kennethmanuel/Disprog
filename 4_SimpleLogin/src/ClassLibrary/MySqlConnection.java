/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassLibrary;

import com.mysql.jdbc.Statement;
import java.sql.*;

/**
 *
 * @author bodyflicker
 */
public class MySqlConnection {
    // naming class with name 'Connection' conflicts with java.sql.Connection
     Connection dbConnection;
     Statement statement;
     ResultSet result;
     
     public Connection getConnection(String server, String database, String username, String password) {
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             String connectionURL = "jdbc:mysql://" + server + "/" + database;
             dbConnection = DriverManager.getConnection(connectionURL, username, password);
         } catch (Exception ex) {
             System.out.println(ex);
         }
         return dbConnection;
     }
     
}
