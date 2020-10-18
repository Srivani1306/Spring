package com.spring;

public class HelloBean {

	private String message ;  //dependency variable

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println(message);
	}
}
