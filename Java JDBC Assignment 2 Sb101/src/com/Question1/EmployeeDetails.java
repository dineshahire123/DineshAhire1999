package com.Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDetails {
   
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String pass = "Dinesh@8421643738";
		
		try {
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		String q = "select * from employee2";
		
		PreparedStatement ps = con.prepareStatement(q);
		
		ResultSet rs = ps.executeQuery();
		
		
		while(rs.next())
		{
			int n = rs.getInt("eid");
			String i  = rs.getNString("name");
			String j = rs.getString("address");
			int k = rs.getInt("salary");
			
			System.out.println("*********************");
			System.out.println("Employee Id is : " + n);
			System.out.println("Employee name is : " + i);
			System.out.println("Employee Address is : "+ j);
			System.out.println("Employee Salary is : " + k);
			
			
			
			System.out.println("*********************");
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
