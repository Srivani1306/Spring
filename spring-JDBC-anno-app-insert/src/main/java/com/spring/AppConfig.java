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
	
	
	@Autowired
	private Environment env;
	
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("MySQLJdbcDriverClass"));
		dataSource.setUrl(env.getRequiredProperty("MySQLJdbcUrl"));
		dataSource.setUsername(env.getRequiredProperty("MySQLUsername"));
		dataSource.setPassword(env.getRequiredProperty("MYSQLPassword"));
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
		return new EmployeeDAO();
	}
}

