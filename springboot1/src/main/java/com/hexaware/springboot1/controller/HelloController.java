package com.hexaware.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot1.entity.Employee;

@Controller
@RequestMapping("/controller")
public class HelloController {  // HelloController internally act as servlet
	
	
		@RequestMapping(path="/hello")
		@ResponseBody
		public String sayHello() {
			
			
			return "<h1 style='color:red'>Hello Friends from Controller in HTML format</h1>";
			
		}
		
		@RequestMapping("/get")
		@ResponseBody
		public String  getData() {
			
			
			Employee emp = new Employee();
			emp.setEid(111);
			emp.setEname("Javeed");
			emp.setSalary(5000.0);
			
			return emp.toString();
			
		}
		@RequestMapping("/movie")
		@ResponseBody
		public String saymovie() {
			
			
			return "<h1 style='color:red'>Hello Friends from Controller in HTML format</h1>";
			
		
	
		}}

