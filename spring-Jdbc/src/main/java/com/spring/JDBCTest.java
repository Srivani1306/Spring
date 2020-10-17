package com.spring;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection connection = DriverManager.getConnection("jdbc:mysql://@localhost:3306/development?serverTimezone=UTC","root","abc123");
		System.out.println("DB connected");
	}
}
