package com.hexaware.pack1;

public class HelloWorld extends Object{
	
	String name;
	
	public HelloWorld() {
		
		
		
		super();     // Object();
		
		System.out.println("HelloWorld() is called obj created..");
		
		// super keyword refers to parent class obj
		
		this.name = null;  // current class obj
	
	
		
	}
	
	

	public static void main(String[] args) {

		
		System.out.println("Hello Friends");
		
		HelloWorld  h1 = new  HelloWorld();
		
		
	}

}
