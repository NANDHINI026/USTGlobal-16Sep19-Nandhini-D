package com.ustglobal.jdbcapp;

import java.sql.*;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class ExecuteUpdate {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	
	try {
		Driver driver = new Driver(); 
		DriverManager.registerDriver(driver);
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(url);
		
		String  sql = "update employee_info set name = 'Aadhitya', salary = 50000 , gender = 'M' where id = 6";
		stmt = conn.createStatement();
		int count = stmt.executeUpdate(sql);
		
		System.out.println(count + "Row(s) updated");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
}
