package com.Question2;

public abstract class Employee {
 protected int employeeId;
 protected String employeeName;
 protected double salary;
public Employee() {
	super();
}

public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}

public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

abstract void calculateSalary(double salary);

}