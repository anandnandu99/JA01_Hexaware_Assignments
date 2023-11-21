package com.hdfc.service;


/*
 * @Author: Vishal
 * 
 */
public abstract class BankImpOne implements IBank{

	@Override
	public void deposit() {

			System.out.println("Amount Deposit");
		
	}
	
	public abstract void withdraw();

	

}
