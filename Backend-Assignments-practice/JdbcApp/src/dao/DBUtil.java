package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {  // Factory Class

	public static Connection getDBConnection() { // Factory method

		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_db", "root", "root");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;

	}

}