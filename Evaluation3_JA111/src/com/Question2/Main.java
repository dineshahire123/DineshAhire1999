package com.Question2;

public class Main {

	public static void main(String[] args) {
		
		Loan loan = new Loan();
		PermanentEmployee pe = new PermanentEmployee(12000, 13, "Dinesh");
		TemporaryEmployee te =new TemporaryEmployee(14, "Yash", 16, 17);
		
		pe.calculateSalary(0);
		te.calculateSalary(0);

	double pemployee = 	loan.calculateLoanAmount(pe);
	double temployee = 	loan.calculateLoanAmount(te);
	double p2employee = 	loan.calculateLoanAmount(new PermanentEmployee(12, 13, "Dinesh"));
		
		
	System.out.println("The Loan of Permanent Employee is : "+ pemployee);
	System.out.println("The Loan of Temporary Employee is : "+ temployee);
	System.out.println("The Loan of Null Employee is : "+ p2employee);
	
	
	


		
	}
}
