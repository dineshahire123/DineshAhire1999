package com.Question1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDataDeletion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee  ID to delete it :");
		
		int eid = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db2";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "Dinesh@8421643738")) {
			
			PreparedStatement ps = conn.prepareStatement("delete from employee2 where eid = ?");
			
			ps.setInt(1, eid);
						
			int x = ps.executeUpdate();
			
			if(x > 0)
			{
				System.out.println(x + " " +"Record Deleted...!");
			}
			else
			{
				System.out.println("Record not Found...!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
