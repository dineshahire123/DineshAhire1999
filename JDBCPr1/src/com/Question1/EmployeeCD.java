package com.Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeCD {
     
	static Connection con;
	public static Connection creatC()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/db2";
			String user = "root";
			String password = "Dinesh@8421643738";
			
			try {
				con = DriverManager.getConnection(url, user, password);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return con;	
		
	}
	
}
