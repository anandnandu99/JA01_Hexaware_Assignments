package com.hexa.springcore.entities;

public class Employee {
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Employee(int eid) {
		super();
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + "]";
	}
	

}
