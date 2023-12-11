package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {


			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				
Connection conn =	
DriverManager.getConnection("jdbc:mysql://localhost:11211/customer_db","root","root");
			
			Statement stmt = conn.createStatement();
			
			String query = " insert into customer values(4,'Adam','China') ";

				int count =	 stmt.executeUpdate(query);
			
			System.out.println(count +" No. of records affected");
				
					conn.close();
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		

	}

}