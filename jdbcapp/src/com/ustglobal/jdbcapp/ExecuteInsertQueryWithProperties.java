package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQueryWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			//Step 1 Load the driver
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			
			//Step 2 Get the Connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//Step 3 Issue Sql query
			String sql = prop.getProperty("insert-query");
			
			
			pstmt = conn.prepareStatement(sql);
			
			String eid = args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2,name);
			
			String esalary = args[2];
			int salary = Integer.parseInt(esalary);
			pstmt.setInt(3, salary);
			
			String gender = args[3];
			pstmt.setString(4,gender);
			
			int count = pstmt.executeUpdate();


			
			//Step 4 read the result
			System.out.println(count + " Row(s) inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(pstmt!= null) {
					pstmt.close();
				}

				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}// end of main()
}
