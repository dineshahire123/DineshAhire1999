package com.Question3;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m)
	{
	  switch(m)
	  {
	  case JAN : System.out.println("This is the 1st Month of the year January");
	  break;
	  case FEB : System.out.println("This is the 2nd Month of the year February");
	  break;
	  case MAR : System.out.println("This is the 3rd Month of the year March");
	  break;
	  case APR : System.out.println("This is the 4th Month of the year April");
	  break;
	  case MAY : System.out.println("This is the 5th Month of the year May");
	  break;
	  case JUN : System.out.println("This is the 6th Month of the year June");
	  break;
	  case JUL : System.out.println("This is the 7th Month of the year July");
	  break;
	  case AUG : System.out.println("This is the 8th Month of the year August");
	  break;
	  case SEP : System.out.println("This is the 9th Month of the year September");
	  break;
	  case OCT : System.out.println("This is the 10th Month of the year Ocgtober");
	  break;
	  case NOV : System.out.println("This is the 11th Month of the year November");
	  break;
	  case DEC : System.out.println("This is the 12th Month of the year December");
	  break;
	  default:
		  System.out.println("Invalid Month Name");
	  }
	}
	
	
	public static void main(String[] args) {
	   System.out.println("Enter the name of Month");
	   Scanner sc = new Scanner(System.in);
	   Demo d1 = new Demo();
	   Month mo = Month.valueOf(sc.next());
	   d1.showDetails(mo);
	   
	}
}
