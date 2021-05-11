/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presensi_server_160419041;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bodyflicker
 */
public final class User extends MySQLConnection{

//	private final MySQLConnection connection = new MySQLConnection();

	private String username;
	private String password;
	private String access;

	public User(String username, String password, String access) {
		setUsername(username);
		setPassword(password);
		setAccess(access);
	}
	
	public User(String username, String password) throws SQLException {
		setUsername(username);
		setPassword(password);
		setAccess(getAccess(username, password));
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccess() {
		return access;
	}
	
	public String getAccess(String username, String password) throws SQLException {
		String sql = "SELECT sebagai FROM users "
				+ "WHERE username = '" + username + "' AND password = '" + password + "'";
		
		ResultSet result = ExecuteDQL(sql);
		result.next();
		String sebagai = result.getString("sebagai");
		return sebagai;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public void insert() {
		String sql = "INSERT INTO users (username, password, sebagai)"
				+ "VALUES('" + this.username + "','" + this.password + "','" + this.access + "')";

		ExecuteDML(sql);
	}

	public boolean login() {
		String sql = "SELECT * FROM users "
				+ "WHERE username = '" + this.username + "' AND password = '" + this.password + "'";
		
		ResultSet result = ExecuteDQL(sql);
		try {
			if(result.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException ex) {
			System.out.println(ex);
			return false;
		}
	}
}
