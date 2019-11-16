package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Employee;
@Repository
public class EmployeeDaoImpl  implements EmployeeDao{
	@Autowired
	private JdbcTemplate template= null;
	
	
	
	
	public EmployeeDaoImpl(JdbcTemplate template) {
		this.template=template;
		// TODO Auto-generated constructor stub
	}

	private static final String INSERT_EMP_RECORD="Insert into empl(emp_id,emp_name,emp_sal) values(emp_empid.nextval,?,?)";
	private static final String DELETE_EMP_RECORD="Delete from empl where emp_id=?";
	private static final String UPDATE_EMP_RECORD="Update emp set emp_name=?,emp_sal=?,emp_id=?";
	private static final String SELECT_EMP_RECORD="select * from empl";

	
	public int createEmployee(Employee employee) {
	
		int result=getTemplate().update(INSERT_EMP_RECORD,employee.getEmployeeName(),employee.getEmployeeSalary());
		return result;
	}

	public List<Employee> readAllEmployees(Employee employee) {
	
		return null;
	}

	public List<Employee> readAllEmployees() {
		List<Employee> list=getTemplate().query(SELECT_EMP_RECORD,new EmployeeRowMapper()); 
		return list;
	}

	public int deleteEmployee(int employeeId) {
		int result=getTemplate().update(DELETE_EMP_RECORD,employeeId);
		return result;
	}

	public Employee updateEmployee(Employee employee) {

		int result=getTemplate().update(UPDATE_EMP_RECORD,employee.getEmployeeName(),employee.getEmployeeSalary(),employee.getEmployeeId());
		if(result==1)
			return employee;
		else
		return null;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	
	

}
