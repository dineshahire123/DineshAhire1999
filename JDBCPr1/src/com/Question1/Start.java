package com.Question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Enter Employee Id");

			int eid = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Employee name");

			String  name = br.readLine();
			
			System.out.println("Enter Employee address");

			String address = br.readLine();
			
			System.out.println("Enter Employee Salary");

			int salary = Integer.parseInt(br.readLine());
			
			Employee emp = new Employee(eid,name,address, salary);
			
		boolean answer = EmployeeDao.insertEmployeeToDB(emp);
		   
		if(answer)
		{
		
			System.out.println("Added successfully...");
		}
		System.out.println(emp);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   
	}
	 
}
