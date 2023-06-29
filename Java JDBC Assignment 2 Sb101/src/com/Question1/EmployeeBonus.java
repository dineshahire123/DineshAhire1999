package com.Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeBonus {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db2";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "Dinesh@8421643738")) {
			
			PreparedStatement ps = conn.prepareStatement("update employee2 set salary = salary + 500");
			
			int x = ps.executeUpdate();
			
			if(x > 0)
				
			{
				System.out.println(x + " " + "Record Updated...!");
			}
			else
			{
				System.out.println("Record not Updated...!");
			}			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
}
