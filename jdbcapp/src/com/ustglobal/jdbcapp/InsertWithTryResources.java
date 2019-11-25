package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithTryResources {
public static void main(String[] args) {
	try (FileReader reader = new FileReader("db.properties")){
		Properties prop = new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driver-class-name"));
		String url = prop.getProperty("url");
		String sql = prop.getProperty("insert-query");
		try(Connection conn = DriverManager.getConnection(url , prop);
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
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
			
			}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

