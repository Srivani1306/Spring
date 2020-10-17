package com.spring;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class AppConfig {
	
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://@localhost:3306/development?serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("abc123");
		return dataSource;
	}

	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
		}
	
	@Bean
	public EmployeeDAO employeeDAO() {
		//EmployeeDAO employeeDAO = new EmployeeDAO();
		
		return  new EmployeeDAO();
	}
	
	
		
	
}
