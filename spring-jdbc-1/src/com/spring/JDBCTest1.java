package com.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest1 {

	

	/*	public static void main(String[] args) throws Exception  {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection connection = DriverManager.getConnection("jdbc:mysql://@localhost:3306/development?serverTimezone=UTC","root","abc123");
			System.out.println("DB connected");
			connection.close();
			System.out.println("connection closed");
		}*/
	
	
	public static void main(String[] args) {
		Connection connection = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			connection  = DriverManager.getConnection("jdbc:mysql://@localhost:3306/development?serverTimezone=UTC","root","abc123");
			System.out.println("DB connected");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not loaded or respective jars not available");
			e.printStackTrace();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("connection closed");
		}
	}
	}

