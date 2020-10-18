package com.spring;

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	public Employee(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	} 
	
	public void displayData() {
		System.out.println("Emp id="+id);
		System.out.println("Emp name="+name);
		System.out.println("Emp salary="+salary);
	}
}
