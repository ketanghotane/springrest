package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;
@RestController
@RequestMapping(path="employees")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;


	//http://localhost:9090/employees
	@RequestMapping(method=RequestMethod.GET)
	public List<Employee> viewAllEmployees(){
		List<Employee> list = service.findAllEmployees();
		return list;
	}
	
}
