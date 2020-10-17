package com.spring;



import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.LinkedCaseInsensitiveMap;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println(context);
		
		
		EmployeeDAO dao = (EmployeeDAO) context.getBean("employeeDAO");
		
		Employee employee = new Employee();
		employee.setId(109);
		employee.setname("ammu j");
		employee.setSalary(125000);
		
		int noOfrecords = dao.insertEmployee(employee);
		System.out.println("No Of Records"+noOfrecords);
		
		List list = dao.readEmployees();
		
		for(Object object : list) {
			Map newMap = (LinkedCaseInsensitiveMap)object;
			System.out.println("id=" + newMap.get("id")+" " +"|"+ "name" + newMap.get("name") +" ");
		}
		
		List list4 = dao.readEmployeeByName("sri venkateswara");
		System.out.println(list4);
		/*
		 * List list2 = dao.readEmployeesById(101);
		 * System.out.println(list2);
		 * for(Object object : list2) {
		 * Employee emp = (Employee)object;
		 *  System.out.println(emp);
		 *  }
		 */
		   
		  // update method call
		  // Employee employee1 = new Employee();
		   employee.setId(101);
		   employee.setname("sree");
		   employee.setSalary(99900);
		   
		   int updatedRows = dao.updateEmployee(employee);
		   System.out.println(updatedRows);
		 
		 /*  //delete
		 *  int deleteRows = dao.deleteEmployee(103);
		 *   System.out.println(deleteRows);
		 *   
		 *   //List list3 = dao.readEmployeesByName("Nit");
		 *   System.out.println(list3);
		 *   }
		 */
	}
}
