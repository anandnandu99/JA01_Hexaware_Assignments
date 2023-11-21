package crud.pract;

import java.util.List;
import java.util.Scanner;

//import dao.Employee;
//import dao.EmployeeDAO;

public class Crud { // UI or Presentation Layer

	public static void main(String[] args) {

		CustomerDAO dao = new CustomerDAO();

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		while (flag) {

			System.out.println("Welcome to EMS");
			System.out.println("1. INSERT CUSTOMER");
			System.out.println("2. UPDATE CUSTOMER");
			System.out.println("3. DELETE BY  CUSTOMER ID");
			System.out.println("4. GET CUSTOMER BY ID");
			System.out.println("5. GET ALL CUSTOMER ");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:

				System.out.println("Enter custid");
				int custid = scanner.nextInt();
				System.out.println("Enter custname");
				scanner.nextLine(); // to handle enter key
				String custname = scanner.nextLine();
				System.out.println("Enter custcountry");
				String custcountry = scanner.nextLine();

				
				Customer cust = new Customer(custid, custname, custcountry);

				int count = dao.insertCustomer(cust);

				System.out.println(count + "record affected");

				break;

			case 2:

				System.out.println("Enter custid");
				int custid1 = scanner.nextInt();
				System.out.println("Enter custname");
				scanner.nextLine(); // to handle enter key
				String custname1 = scanner.nextLine();
				System.out.println("Enter custcountry");
				String custcountry1 = scanner.nextLine();

				Customer cust1 = new Customer(custid1, custname1, custcountry1);

				int count1 = dao.updateCustomer(cust1);

				System.out.println(count1 + "  record affected");

				break;

			case 3:

				System.out.println("Enter custid to Delete Record");
				int custid2 = scanner.nextInt();
				int count2 = dao.deleteCustomer(custid2);

				System.out.println(count2 + "  record affected");

				break;

			case 4:
				System.out.println("Enter custid to Search Customer Record");
				int custid3 = scanner.nextInt();
				
				Customer customer =	dao.getCustomerById(custid3);
							
				System.out.println(customer);

				break;
				
			case 5:
				  List<Customer>  list =   dao.getAllCustomers();
				  
				  	for (Customer custObj : list) {
				  		System.out.println(custObj);
						
					}
				  
				  break;
				  
			case 0:

				flag = false;

				break;

			default:
				
				System.err.println("Invalid Input");
				
				break;
			}

		}

	}

}