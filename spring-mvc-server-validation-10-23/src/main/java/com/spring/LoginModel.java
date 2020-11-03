package com.spring;

import org.springframework.stereotype.Component;

@Component
public class LoginModel {

	public static boolean isValid(String user,String pass) {
		if(user.equals(pass)) {
			return true;
		}
			
		return false;
	}

	public boolean isAuthenticated(String username, String password) {
		if(username.equals(password)) {
			return true;
		}
		return false;
	}
}
