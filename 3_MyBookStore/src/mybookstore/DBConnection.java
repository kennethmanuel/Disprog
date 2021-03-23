import java.sql.*;

public class DBConnection {

    public DBConnection() {
        try{
            String username = "root";
            String password = "";
            String database = "kantor";
            String url = "jdbc:mysql://localhost:3306/"+database;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
                    System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private Connection conn;
    private Statement stat;

    public ResultSet GetData(String query){
        try{
            stat = conn.createStatement();
            return stat.executeQuery(query);
        }catch(SQLException ex){
            return null;
        }
    }

    public int ManipulasiData(String query){
        try{
            stat = conn.createStatement();
            return stat.executeUpdate(query);
        }catch(SQLException ex){
            return 0;
        }
    }

}