package dao;

public class Customer {
	
	private int custid;
	private String custname;
	private String custcountry;
	
	public Customer() {
		
	}

	public Customer(int custid, String custname, String custcountry) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custcountry = custcountry;
	}

	public int getcustid() {
		return custid;
	}

	public void setcustid(int custid) {
		this.custid = custid;
	}

	public String getcustname() {
		return custname;
	}

	public void setcustname(String custname) {
		this.custname = custname;
	}

	public String getcustcountry() {
		return custcountry;
	}

	public void set(String custcountry ) {
		this.custcountry = custcountry;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custcountry=" + custcountry + "]";
	}
	
	
	
	
	

}