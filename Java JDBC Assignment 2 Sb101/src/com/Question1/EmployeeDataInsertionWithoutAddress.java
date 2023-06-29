package com.Question1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDataInsertionWithoutAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID :");
		
		int eid = sc.nextInt();
		
		System.out.println("Enter Employee Name :");
		
		String name = sc.next();
		
		System.out.println("Enter Employee Salary :");
		
		int salary = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db2";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "Dinesh@8421643738")) {
			
			PreparedStatement ps = conn.prepareStatement("insert into employee2 (eid, name, salary) values (?, ?, ?) ");
			
			ps.setInt(1, eid);
			
			ps.setString(2, name);
			
			ps.setInt(3, salary);
			
			int x = ps.executeUpdate();
			
			if(x > 0)
			{
				System.out.println(x + " " + "Record Inserted...!");
			}
			else
			{
				System.out.println("Record not Inserted...!");
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}

}
