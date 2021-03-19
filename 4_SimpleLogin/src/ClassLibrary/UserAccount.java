/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassLibrary;

import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bodyflicker
 */
public class UserAccount extends MySqlConnection {

    private String email;
    private String password;
    //MySqlConnection mysqlconnection = new MySqlConnection();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserAccount() {
        getConnection("localhost", "160419041_simplelogin", "root", "");
    }

    public UserAccount(String email, String password) {
        // getConnection("localhost", "160419041_simplelogin", "root", "");
        setEmail(email);
        setPassword(password);
    }

    public void insert() {
        getConnection("localhost", "160419041_simplelogin", "root", "");
        try {
            // statement = (Statement) dbConnection.createStatement();
            if (!dbConnection.isClosed()) {
                PreparedStatement sql = (PreparedStatement) dbConnection.prepareStatement(
                        "INSERT INTO useraccount "
                        + "VALUES(?,?)");
                sql.setString(1, email);
                sql.setString(2, password);
                sql.executeUpdate();
            }
            dbConnection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // true = user found
    public boolean login() {
        getConnection("localhost", "160419041_simplelogin", "root", "");
        ArrayList<UserAccount> collection = new ArrayList<>();
        try {
            statement = (Statement) dbConnection.createStatement();

            result = statement.executeQuery(
                    "SELECT * FROM useraccount "
                    + "WHERE email = '" + this.email
                    + "' AND password = '" + this.password + "'");
            
            
            if (result.next()) {
                dbConnection.close();
                return true;
                
            } else {
                dbConnection.close();
                return false;
                
            }
            

        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    // true = email doesn't exist
    public boolean Register() {
        getConnection("localhost", "160419041_simplelogin", "root", "");
        ArrayList<UserAccount> collection = new ArrayList<>();
        try {
            statement = (Statement) dbConnection.createStatement();

            result = statement.executeQuery(
                    "SELECT * FROM useraccount "
                    + "WHERE email = '" + this.email + "'");

            if (!result.next()) {
                dbConnection.close();
                return true;
            } else {
                dbConnection.close();
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

}
