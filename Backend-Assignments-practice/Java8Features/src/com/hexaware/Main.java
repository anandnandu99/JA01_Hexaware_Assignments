package com.hexaware;

public class Main {

	public static void main(String[] args) {


		MyInterface mi = (int a,int b)->{ return a+b; }; // lambda expresson.
		
			int result =		mi.add(5,5);

			System.out.println("Result : "+result);
	}

}
