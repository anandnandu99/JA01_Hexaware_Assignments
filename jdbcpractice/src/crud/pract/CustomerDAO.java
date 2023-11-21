package crud.pract;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO { // DAO is Java class communicate with DB

	Connection conn = DBUtil.getDBConnection();

	public int insertEmployee(Customer cust) {

		String insertQuery = "insert into Customer values(?,?,?)";
		// ? positional parameters

		int count = 0;

		try {

			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, cust.getcustid());
			pstmt.setString(2, cust.getcustname());
			pstmt.setString(3, cust.getcustcountry());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// insert query

		return count;

	}

	public int updateCustomer(Customer cust) {

		// update query
		int count = 0;

		String updateQuery = "update customer set custname = ? , custcountry = ?  where custid = ?";

		try {

			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, cust.getcustname());
			pstmt.setString(2, cust.getcustcountry());
			pstmt.setInt(3, cust.getcustid());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int deleteCustomer(int custid) {

		String deleteQuery = "delete from customer where custid = ?";
		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, custid);
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public Customer getCustomerById(int custid) {

		String selectOne = "select * from Customer where custid = ?";

		Customer customer = null;

		try {

			PreparedStatement pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, custid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int custid1 = rs.getInt("custid");
				String custname = rs.getString("custname");
				String custcountry = rs.getString("custcountry");

				customer = new Customer(custid1, custname, custcountry);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customer;
	}

	public List<Customer> getAllEmployees() {

		List<Customer> list = new ArrayList<Customer>();

		String selectAll = "select * from customer";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(selectAll);
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int custid1 = rs.getInt("custid");
				String custname = rs.getString("custname");
				String custcountry = rs.getString("custcountry");

				Customer customer = new Customer(custid1, custname, custcountry);

				list.add(customer);

			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		
		return list;
	}

	public int insertCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}