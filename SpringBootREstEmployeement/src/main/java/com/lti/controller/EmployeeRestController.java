package com.lti.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;
@RestController
@RequestMapping(path="employees")
@CrossOrigin
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;


	//http://localhost:9098/employees
	@RequestMapping(method=RequestMethod.GET)
	public List<Employee> viewAllEmployees(){
		List<Employee> list= service.findAllEmployees();
		return list;
	}
	
	//http://localhost:9098/employees/1
		@RequestMapping(path="{empId}", method=RequestMethod.GET)
		public Employee findEmployeeById(@PathVariable("empId") int employeeId){
			return service.findEmployeeById(employeeId);
		}
		
		//http://localhost:9098/employees/1
	@RequestMapping(path="{empId}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("empId") int employeeId){
			boolean res= service.removeEmployee(employeeId);
		}
	
	//http://localhost:9098/employees
		@RequestMapping( method=RequestMethod.POST)
		public void addEmployee(@RequestBody Employee employee){
				boolean res= service.addEmployee(employee);
			}
		

		//http://localhost:9098/employees
			@RequestMapping( method=RequestMethod.PUT)
		public void modifyEmployee(@RequestBody Employee employee){
				Employee res= service.modifyEmployee(employee);
			}
				
				
	
}
