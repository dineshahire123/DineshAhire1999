package com.Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dtb {
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String dob= sc.next();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
		try {
		
		LocalDate date = LocalDate.parse(dob,dtf);
		
//		LocalDate date2 = LocalDate.parse(dtf);


		String result= date.format(DateTimeFormatter.ofPattern("EEEE"));
		System.out.println("Your Birthday day is :"+result);
		}catch (Exception e){
		System.out.println("Invalid Date Format");

	}
	}
}
