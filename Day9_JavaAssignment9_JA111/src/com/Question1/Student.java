package com.Question1;

import java.util.Scanner;

public class Student {

	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	 Student()
	{
		
	}
	 
	 
	 public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public void displayDetails()
	 {
        
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Roll Number");
	    int roll = sc.nextInt();
	    System.out.println("Enter name");
	    String name = sc.next();
	    System.out.println("Enter marks");
	    int marks = sc.nextInt();
//	    System.out.println("Enter Grade");
//	    char grade = sc.next().charAt(0);
		
	   char result =  calculateGrade(roll,name,marks,grade);
	   
	   System.out.println("Roll No. of Student is : " + roll);
	   System.out.println("Name of Student is : " + name);
	   System.out.println("Marks of Student is : " + marks);
	   System.out.println("Student Grade is : "+result);
	   System.out.println("=======================================================");
		
	 }
	 
	 
	 
	 
	 @Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade
				+ ", calculateGrade()=" + calculateGrade(marks, name, marks, grade) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	private char calculateGrade(int roll,String name, int marks, char grade)
	 {
		if(marks>=500)
		{
		 grade ='A';
		}
		else if(marks<500 && marks>=400)
		{
			grade = 'B';
		}
		else 
		{
			grade = 'C';
		}
		return grade;
		 
	 }
	 
}
