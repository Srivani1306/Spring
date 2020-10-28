package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.spring")
public class WebConfig {

	@Bean
	public LoginModel loginModel() {
		return new LoginModel();
	}
	
	@Bean
	public InternalResourceViewResolver getViewResolver() { 
		InternalResourceViewResolver viewResolver = 
				                  new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/jsp");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
