package com.spring;

public class HelloBean {

	private String message ;  //dependency variable

	
	
	public HelloBean(String message) {
		super();
		this.message = message;
	}



	public void printMessage() {
		System.out.println(message);
	}
}
