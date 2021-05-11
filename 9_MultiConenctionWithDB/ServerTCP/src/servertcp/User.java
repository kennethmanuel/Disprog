/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertcp;

import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author bodyflicker
 */
public class User extends MyConnection{
	private String username;
    private String password;

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
	
	public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public void insert() {
        try {
            if (!connect.isClosed()) {
				stat = (Statement) connect.createStatement();
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement(
                        "INSERT INTO user(username, password) "
                        + "VALUES(?,?)");
                sql.setString(1, username);
                sql.setString(2, password);
                sql.executeUpdate();
            } else {
				System.out.println("Koneksi Hilang");
			}
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // true = user found
    public boolean login() {
        try {
            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("SELECT username, password FROM user "
                    + "WHERE username = '" + this.username
                    + "' AND password = '" + this.password + "'");
            
            if (result.next()) {
                connect.close();
                return true;
                
            } else {
                connect.close();
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    // true = username doesn't exist
    public boolean Register() {
        try {
            stat = (Statement) connect.createStatement();

            result = stat.executeQuery("SELECT * FROM user "
                    + "WHERE username = '" + this.username + "'");

            if (!result.next()) {
                connect.close();
                return true;
            } else {
                connect.close();
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
}
