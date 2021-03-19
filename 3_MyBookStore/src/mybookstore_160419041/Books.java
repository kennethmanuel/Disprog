/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybookstore_160419041;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author bodyflicker
 */
public final class Books {

    private String bookid;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private int stock;

    Connection connect;
    Statement stat;
    ResultSet result;

    public Books() {
        getConnection();
    }

    public Books(String id, String title, String publisher, String author, int price, int stock) {
        getConnection();
        setBookid(id);
        setTitle(title);
        setPublisher(publisher);
        setAuthor(author);
        setPrice(price);
        setStock(stock);
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            connect = DriverManager.getConnection("jdbc:mysql://localhost/myproduct_160419041", "root", "");
        } catch (Exception ex) {

        }
        return connect;
    }

    public void insert() {
        try {
            stat = (Statement) connect.createStatement();
            if (!connect.isClosed()) {
                // prepare query
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement(
                        "INSERT INTO books VALUES(?,?,?,?,?,?)");
                // set ? parameter
                sql.setString(1, bookid);
                sql.setString(2, title);
                sql.setString(3, author);
                sql.setString(4, publisher);
                sql.setString(5, Integer.toString(price));
                sql.setString(6, Integer.toString(stock));
                // execute sql
                sql.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void update() {
        try {
            stat = (Statement) connect.createStatement();
            if (!connect.isClosed()) {
                // prepare query
                String query = "UPDATE books "
                        + "SET title=?, author=?, publisher=?, price=?, stock=? "
                        + "WHERE book_ID =? ";
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement(query);
                // set ? parameter
                sql.setString(1, title);
                sql.setString(2, author);
                sql.setString(3, publisher);
                sql.setString(4, Integer.toString(price));
                sql.setString(5, Integer.toString(stock));
                sql.setString(6, bookid);
                // execute sql
                sql.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void delete() {
        try {
            stat = (Statement) connect.createStatement();
            if (!connect.isClosed()) {
                // prepare query
                String query = "DEELTE FROM books " + 
                        "WHERE book_ID = ?";
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement(query);
                // set ? parameter
                sql.setString(1, bookid);
                // execute sql
                sql.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<Books> display() {
        ArrayList<Books> collection = new ArrayList<>();
        try {
            stat = (Statement) connect.createStatement();

            result = stat.executeQuery("SELECT * FROM books");
            while (result.next()) {
                Books book = new Books(
                        result.getString("book_ID"),
                        result.getString("title"),
                        result.getString("author"),
                        result.getString("publisher"),
                        result.getInt("price"),
                        result.getInt("stock")
                );
                collection.add(book);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return collection;
    }
}
