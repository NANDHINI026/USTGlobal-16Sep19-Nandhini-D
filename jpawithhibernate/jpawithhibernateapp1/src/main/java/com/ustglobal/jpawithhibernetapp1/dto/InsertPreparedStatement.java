package com.ustglobal.jpawithhibernetapp1.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class InsertPreparedStatement {
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			//Step 1 Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2 Get the Connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue Sql query
			String sql = "insert into employee_info values(?,?,?,?)";
			//stmt = conn.createStatement();
			//int count = stmt.executeUpdate(sql);
			
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
