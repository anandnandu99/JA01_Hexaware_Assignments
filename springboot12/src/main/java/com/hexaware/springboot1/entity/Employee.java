package com.hexaware.springboot1.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int eid;
	private String ename;
	private double salary;
	
	public Employee() {
		
		
	}
	
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}
