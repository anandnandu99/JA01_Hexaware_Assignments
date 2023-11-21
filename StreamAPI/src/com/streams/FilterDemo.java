package com.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;


public class FilterDemo {
	public static void main(String[] args) {
		int arr[]= {23,43,54,65,75,34,54,34};
		IntStream stream=Arrays.stream(arr);
		//stream.limit(4).forEach(System.out::println);
		//stream.distinct().forEach(System.out::println);
		int ar2[]= {5,10,15,20};
		IntStream stream2=Arrays.stream(ar2);
		OptionalInt optional=stream2.reduce((a,b)->{return a+b;});
		if(optional.isPresent()) {
			int result=optional.getAsInt();
			System.out.println(result);
		}
	}
}
