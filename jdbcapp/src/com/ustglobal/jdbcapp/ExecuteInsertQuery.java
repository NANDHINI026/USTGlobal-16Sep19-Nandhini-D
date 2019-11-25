package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	
	try {
		//Step 1 Load the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//Step 2 Get the Connection
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(url);
		
		//Step 3 Issue Sql query
		String sql = "insert into employee_info "+ " values(7,'lisani',20000,'F') ";
		stmt = conn.createStatement();
		int count = stmt.executeUpdate(sql);
		
		//Step 4 read the result
		System.out.println(count + " Row(s) inserted");
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!= null) {
				conn.close();
			}
			if(stmt!= null) {
				stmt.close();
			}

			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}// end of main()
}// end of ExecuteInsertQuery
