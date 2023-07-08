package com.Question1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDao {

	public static boolean insertEmployeeToDB(Employee emp) {
		// TODO Auto-generated method stub
		
		boolean f = false;
		try {
			Connection con = EmployeeCD.creatC();
			
			String q = "insert into employee(eid,name,address,salary) values (?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getAddress());
			pstmt.setInt(4, emp.getSalary());
			
			pstmt.executeUpdate();
			
			f = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}

}
