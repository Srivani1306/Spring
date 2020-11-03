 package com.spring;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.spring")
public class AppConfig {

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
	
	@Bean 
	public MessageSource massageSource() {
		  ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		  source.setBasename("message");
		  return source;
	}
}
