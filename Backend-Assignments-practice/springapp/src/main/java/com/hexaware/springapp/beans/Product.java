package com.hexaware.springapp.beans;

import org.springframework.stereotype.Component;

@Component
public class Product {

private int pid;
private String productName;
private double price;
public Product(int pid, String productName, double price) {
	super();
	this.pid = pid;
	this.productName = productName;
	this.price = price;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + "]";
}
}
