package com.hdfc.service;

/*
 * @Author: Javeed TL
 * 
 */

public interface IBank {
	
	
	public static final String IFSC  = "HDFC123";  // all variables are public static final
	
	public abstract void deposit();
	public abstract void withdraw();  // all methods are public abstract

}
