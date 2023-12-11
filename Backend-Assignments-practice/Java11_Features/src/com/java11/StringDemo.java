package com.java11;

import java.util.stream.Stream;

public class StringDemo {
	public static void main(String[] args) {
		String str=new String("Hello world\n Welcome to java");
		
		Stream<String> stream =str.lines();
		stream.filter((line)->{return!line.isBlank();})
         .map((line)->{return line.strip();})
         .forEach(System.out::println);
	}

}
