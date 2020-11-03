package com.spring;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Login.class.equals(clazz);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("validate called");
		ValidationUtils.rejectIfEmpty(errors, "username", "user.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "user.pass.empty");
		
		Login login = (Login) target;
		System.out.println("login");
	}

}
