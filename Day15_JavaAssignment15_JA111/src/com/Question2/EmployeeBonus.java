package com.Question2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {

	 public double employeeBo(String s)
	 {
		 try {
				LocalDate date1 = LocalDate.parse(s);
				
				
			    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				String custromFormat = date1.format(dtf);
				} 
				catch(Exception e){
					System.out.println("Invalid");
				}
				
		return 0;
		 
	 }
	public static void main(String[] args) {
		
		EmployeeBonus employeeB = new EmployeeBonus();
		employeeB.employeeBo("23-02-2017");
		
		
		
	}
} 
