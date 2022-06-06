package com.Question4;

import java.util.Scanner;

public class Demo {
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Customer customer =new Customer();
		System.out.println("Enter the Username");
        customer.setUserName(sc.next());
        System.out.println("Enter the Mobile Number");
     
       
        
        customer.setMobileNumber(sc.next());
        
        	
  
        System.out.println("Enter the Email");

        customer.setEmail(sc.next());
        System.out.println("Enter the Password");

        customer.setPassword(sc.next());
        
        
        System.out.println("The User Name of the Customer is :"+customer.getUserName());
        System.out.println("The Mobile Number of the Customer is :"+customer.getMobileNumber());
        System.out.println("The Email of the Customer is :"+customer.getEmail());
        System.out.println("The Password of the Customer is :"+customer.getPassword());

	}
}
