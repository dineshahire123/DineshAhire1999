package com.Question2;

import java.util.Scanner;

public class Demo {
    static int total=0;
    static int avg = 0;
	
	public static void main(String[] args) {
		System.out.println("Enter the Numbers of Student");
		Scanner sc =new Scanner(System.in);
		int ab = sc.nextInt();
		
		
		for(int i=0; i<ab; i++)
		{
		System.out.println("Student :" +(i+1));
	     Student stud = new Student();
	    
	     System.out.println("Enter roll of Student");
	     stud.setRoll(sc.nextInt());
	     System.out.println("Enter the name of Student");
	     stud.setName(sc.next());
	     System.out.println("Enter the address of the Student");
	     stud.setAddress(sc.next());
	     System.out.println("Enter the Marks of the Student");

	       stud.setMarks(sc.nextInt());
	       total = total + stud.getMarks();

		     System.out.println("Roll of Student is :" + stud.getRoll());
		     System.out.println("Name of Student is : " + stud.getName());
		     System.out.println("Address of Student is :" + stud.getAddress());
		     System.out.println("Marks of Student of Student is : " + stud.getMarks());

		     System.out.println("*********************************************");
	      

		} 
		
		avg = total/ab;
		
		System.out.println("Average of the Student is :"+avg);
		
	  



	
		
		 
		
		
	}
}
