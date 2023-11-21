package com.hexaware.springboot2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot2.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@RequestMapping(path = "/openform", method = RequestMethod.GET)
	public String openForm() {

		return "add_employee";
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addEmployeeData(HttpServletRequest request) {

		int eid = Integer.parseInt(request.getParameter("eid")); // "101"
		String ename = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));

		Employee emp = new Employee(eid, ename, salary);

		return   "<h1 style ='color:green'>"+emp.toString()+"<h1>";

		
		
		
	}

}
