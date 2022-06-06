package com.Question2;

public class TemporaryEmployee extends Employee {

	private int houseWorked;
    private int hourlyWages;
   
    
	
	public TemporaryEmployee(int employeeId, String employeeName,int houseWorked, int hourlyWages) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.houseWorked = houseWorked;
		this.hourlyWages = hourlyWages;
	}
	
	
	


	public int getHouseWorked() {
		return houseWorked;
	}


	public void setHouseWorked(int houseWorked) {
		this.houseWorked = houseWorked;
	}


	public int getHourlyWages() {
		return hourlyWages;
	}


	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}


	@Override
	void calculateSalary(double salary) {
		// TODO Auto-generated method stub
		salary = houseWorked * hourlyWages;
		System.out.println("The Temporary Employee Salary is : "+salary);
		
		
	}


}
