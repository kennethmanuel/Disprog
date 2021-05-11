package presensi_server_160419041;

import java.sql.*;

/**
 *
 * @author bodyflicker
 */
public class MySQLConnection {

	public Connection dbConnection;
	private Statement statement;

	/**
	 *
	 */
	public MySQLConnection() {
		try {
			String username = "root";
			String password = "";
			String database = "presensiol";
			String url = "jdbc:mysql://localhost:3306/" + database;
			Class.forName("com.mysql.jdbc.Driver");
			dbConnection = DriverManager.getConnection(url, username, password);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	/**
	 *
	 * @param query
	 * @return
	 */
	public ResultSet ExecuteDQL(String query) {
		try {
			statement = dbConnection.createStatement();
			return statement.executeQuery(query);
		} catch (SQLException ex) {
			System.out.println(ex);
			return null;
		}
	}

	/**
	 *
	 * @param query
	 * @return number of affected rows
	 */
	public int ExecuteDML(String query) {
		try {
			statement = dbConnection.createStatement();
			return statement.executeUpdate(query);
		} catch (SQLException ex) {
			System.out.println(ex);
			return 0;
		}
	}
}
