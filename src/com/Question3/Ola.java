package com.Question3;

public class Ola {

	
	
	 public Car bookCar(int numberOfPassenger,int numberOfKMs)
    {
		 if(numberOfPassenger<=3)
		 {
			 return new HatchBack();
		 }
		 else
		 {
			 return new Sedan();
		 }
		 
	}
	 
	 public int calculateBill(Car car)
	 {
		HatchBack hat = new HatchBack();
		 int number =  hat.getNumberOfKms();
		 
		 int fare = hat.getFarePerKm();
		 System.out.println(number);
		 System.out.println(fare);
		 int total = number*fare;
				 return total;
		 
	 }
}
