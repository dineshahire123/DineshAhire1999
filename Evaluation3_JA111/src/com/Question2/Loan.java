package com.Question2;

public class Loan {
	
    Loan()
     {
    	 
     }
	
	public double calculateLoanAmount(Employee PermanentE)
	{
		double sal = PermanentE.salary;	
		double amount = 0 ;
		System.out.println();
		if(PermanentE instanceof PermanentEmployee)
		{
		
		   amount = (sal/15)*100;
		   System.out.println(sal);
		
		   
		}
		else if(PermanentE instanceof TemporaryEmployee)
		{
			
			   amount = (sal/10)*100;
			
			   
			}
		
		return amount;
		
		
	}
}
