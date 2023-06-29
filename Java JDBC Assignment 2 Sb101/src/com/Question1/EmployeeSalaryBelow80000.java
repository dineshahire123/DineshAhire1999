package com.Question1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSalaryBelow80000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db2";
		
		try (Connection conn = DriverManager.getConnection(url, "root" , "Dinesh@8421643738")) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee2 where salary < 80000");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int i = rs.getInt("eid");
				
				String n = rs.getString("name");
				
				String a = rs.getString("address");
				
				int s = rs.getInt("salary");
				
				System.out.println("**********************");
				
				System.out.println("Employee ID :" + " " + i);
				
				System.out.println("Employee Name :" + " " + n);
				
				System.out.println("Employee Address :" + " " + a);
				
				System.out.println("Employee Salary :" + " " + s);
				
				System.out.println("***********************");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
