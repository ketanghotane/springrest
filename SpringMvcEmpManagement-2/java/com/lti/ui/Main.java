package com.lti.ui;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.lti.config.JavaConfig;
import com.lti.model.Employee;

public class Main {
	public static void main(String[] args) {
	
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee employee = context.getBean("employee",Employee.class);
		/*List<Employee> list= service.findAllEmployees();
		for(Employee emp: list)
			System.out.println(emp);
		*/
		employee.setEmployeeId(2);
		employee.setEmployeeName("Prajwal");
		employee.setEmployeeSalary(1000000);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		
		}
		
		
}


