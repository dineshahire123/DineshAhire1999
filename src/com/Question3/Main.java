package com.Question3;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("Enter the Number of Passengers");
	  Scanner sc = new Scanner(System.in);
	    
	  int pass =  sc.nextInt();
	  System.out.println("Ener the Number of Km");
	  int km = sc.nextInt();
	  
	  Ola ol = new Ola();
	 Car myCar =  ol.bookCar(pass,km);
	 
	  
	  int res = ol.calculateBill(myCar);
	  
	  System.out.println("The Total fare amount is :"+res);
	  
	 int total =  ol.calculateBill(myCar);
	  System.out.println("The total is : "+ total);
	  
	  System.out.println("*******************************");
	  
	}
}
