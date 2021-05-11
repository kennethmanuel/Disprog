/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertcp;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Kenneth
 */
public class MyConnection {
	Connection connect;
	Statement stat;
	ResultSet result;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/week9_160419041", "root", "");
		} catch (Exception ex) {
			System.out.println("Error Get Connection: " + ex);
		}
		return connect;
	}
}
