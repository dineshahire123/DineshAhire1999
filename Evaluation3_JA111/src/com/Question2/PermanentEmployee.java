package com.Question2;

public class PermanentEmployee extends Employee {
	private double basicPay;

	double pf = basicPay*0.12;
	@Override
	void calculateSalary(double salary) {
		// TODO Auto-generated method stub
		
		
		salary = basicPay-pf;
		System.out.println("The Permanent Empoployee Salary is : "+ salary);
		
	}

	
	public PermanentEmployee(double basicPay,int employeeId,String employeeName) {
		super();
		this.basicPay = basicPay;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	
	
}
