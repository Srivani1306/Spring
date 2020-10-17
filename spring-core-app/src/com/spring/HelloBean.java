package com.spring;

public class HelloBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void PrintMessage() {
	System.out.println(message);
	}
}
