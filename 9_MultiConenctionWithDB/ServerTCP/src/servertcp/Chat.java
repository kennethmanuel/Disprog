/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertcp;


import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author Kenneth
 */
public class Chat extends MyConnection{

	private int id;
	private String content;
	private String time_chat;
	private String username;
	
	public Chat(String _content, String _time_chat, String _username) {
		this.content = _content;
		this.time_chat = _time_chat;
		this.username = _username;
		getConnection();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime_chat() {
		return time_chat;
	}

	public void setTime_chat(String time_chat) {
		this.time_chat = time_chat;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void insert() {
		try {
			if(!connect.isClosed()) {
				stat = (Statement) connect.createStatement();
				PreparedStatement sql = (PreparedStatement) connect.prepareStatement(
				"insert into chat(content, time_chat, username) values(?,?,?) ");
				sql.setString(1, getContent());
				sql.setString(2, getTime_chat());
				sql.setString(3, getUsername());
				sql.executeUpdate();
			} else {
				System.out.println("Koneksi HIlang");
			}
		} catch (Exception ex) {
			System.out.println("Error di insert: " + ex);
		}
	}
	
	public void remove() {
		try {
			if(!connect.isClosed()) {
				stat = (Statement) connect.createStatement();
				PreparedStatement sql = (PreparedStatement) connect.prepareStatement(
				"delete from chat where username = ?");
				sql.setString(1, getUsername());
				sql.executeUpdate();
			} else {
				System.out.println("Koneksi Hilang");
			}
		} catch (Exception ex) {
			System.out.println("Error di insert: " + ex);
		}
	}
}
