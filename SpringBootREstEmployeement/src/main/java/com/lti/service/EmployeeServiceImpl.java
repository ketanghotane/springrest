package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao dao;// = new EmployeeDaoImpl();
	
	
	@Transactional
	public boolean addEmployee(Employee employee) {
		int result = getDao().createEmployee(employee);
		if(result == 1){
			return true;
		}else{
			return false;
		}
	}
	public List<Employee> findAllEmployees() {
		List<Employee> list = getDao().readAllEmployees();
		return list;
	}                        
	@Transactional
	public boolean removeEmployee(int employeeId) {
		int result = getDao().deleteEmployee(employeeId);
		if(result == 1){
			return true;
		}else{
			return false;
		}
	}
	@Transactional
	public Employee modifyEmployee(Employee employee) {
		Employee employee2 = getDao().updateEmployee(employee);
		return employee2;
	}
	public EmployeeDao getDao() {
		return dao;
	}
	public void setDao(EmployeeDao dao) {
		System.out.println("setDao");
		this.dao = dao;
	}
	public Employee findEmployeeById(int employeeId) {
		return dao.readEmployeeById(employeeId);
		
	}
	
	
	
	
}
