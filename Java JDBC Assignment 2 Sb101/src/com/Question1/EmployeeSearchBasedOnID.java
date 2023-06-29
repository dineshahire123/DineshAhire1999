package com.Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeSearchBasedOnID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID to get details :");
		
		int eid = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/db2";
		
		try{
                 
			Connection conn = DriverManager.getConnection(url, "root", "Dinesh@8421643738");
			PreparedStatement ps = conn.prepareStatement("select * from employee2 where eid = ?");
			
			ps.setInt(1, eid);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
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
			else
			{
				System.out.println("Record not Found...!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
		
	}

}
