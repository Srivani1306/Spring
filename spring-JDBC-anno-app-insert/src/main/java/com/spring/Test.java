package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println(context);
		
		
		EmployeeDAO dao = (EmployeeDAO) context.getBean("employeeDAO");
		/*List list = dao.readEmployees();
		System.out.println(list);
		for(Object employee : list) {
			System.out.println(employee);
		}*/
		
		Employee employee = new Employee();
		employee.setId(110);
		employee.setSname("ammu6.j ");
		employee.setSalary(120000);
		
		int noOfrecords = dao.insertEmployee(employee);
		System.out.println("No Of Records"+noOfrecords);
		
		List list = dao.readEmployees();
		System.out.println(list);
	}
}

