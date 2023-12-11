package com.stringdemo;

public class StringTokenizerDemo {

	public static void main(String[] args) {

			String data = "Hello Friends How are you  I am fine here  Thank you";
		
		String arr[] = data.split(" ");
		
		for(String token : arr) {     // for each loop
			
			System.out.println(token);
			
		}
			

	}

}
