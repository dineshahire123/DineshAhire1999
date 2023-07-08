package com.Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
	
		try {
		Connection con = 	DriverManager.getConnection(url, "root", "Dinesh@8421643738");
		
		if(con != null)
		{
			System.out.println("connected...");
		}
		else
		{
			System.out.println("not connected....");
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
