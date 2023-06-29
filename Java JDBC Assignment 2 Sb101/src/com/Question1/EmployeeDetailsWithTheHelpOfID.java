package com.Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDetailsWithTheHelpOfID {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id ");
		
	    int eid = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url  =  "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String pass = "Dinesh@8421643738";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			String q = "select salary from employee2 where eid = ?";
			
			PreparedStatement ps = con.prepareStatement(q);
			
		    ps.setInt(1, eid);
		  
		    ResultSet rs = ps.executeQuery();
		  
		   while(rs.next())
		   {
			   int s = rs.getInt("salary");
			  System.out.println("Employee Salary is  : " + s);
		   }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
	
	
}
