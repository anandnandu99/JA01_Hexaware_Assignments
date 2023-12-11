package com.hexaware.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springboot1.entity.Employee;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(Springboot1Application.class, args);
	
		Employee  emp =		context.getBean(Employee.class);
	
			System.out.println(emp);
	}

}