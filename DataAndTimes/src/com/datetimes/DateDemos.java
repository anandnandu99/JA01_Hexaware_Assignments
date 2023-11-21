package com.datetimes;

import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class DateDemos {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date);
		
		Date date2 = new Date(99999999L);

		System.out.println(date2);
		
		Date date3 = new Date(1947, 8, 15);
		System.out.println(date3);
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Currency  c = Currency.getInstance(locale);
		
		System.out.println(c);
		
		System.out.println("currency name "+c.getDisplayName());
		System.out.println("currency code  "+c.getCurrencyCode());
		System.out.println("currency symbol "+c.getSymbol());
		
		
		

	}

}
