package com.spring;

public class HelloBean {

	private String message ;  //dependency variable

	
	
	public HelloBean(String message) {
		
		this.message = message;
	}



	public void printMessage() {
		System.out.println(message);
	}
}
