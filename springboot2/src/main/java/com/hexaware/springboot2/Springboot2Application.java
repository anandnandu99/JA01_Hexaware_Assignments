package com.hexaware.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springboot2.entity.Employee;

@SpringBootApplication
public class Springboot2Application {

	public static void main(String[] ar) {
	ApplicationContext context =	SpringApplication.run(Springboot2Application.class, ar);
	
		Employee  emp =		context.getBean(Employee.class);
	
			System.out.println(emp);
	}

}
