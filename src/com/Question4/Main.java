package com.Question4;

public class Main {

	public static Person generatePerson(Person person)
	{
		return person;
		
	}
	
	
	public static void main(String[] args) {
	  Person std = generatePerson(new Student());
	Person inst =  generatePerson(new Instructor());
		
	
		System.out.println(std.getName());
		
		System.out.println(std.getGender());

		System.out.println(inst);

	}
}
