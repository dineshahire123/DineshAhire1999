package com.Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Student> student = new ArrayList<>();
	
		student.add(new Student(23,"Dinesh",99));
		student.add(new Student(24,"Yash",98));
		student.add(new Student(25,"Ak",97));
		student.add(new Student(26,"Ishwar",96));
		student.add(new Student(27,"PI",95));

		
		List<Student> anotherList = student.stream().filter(s->s.getMarks()<800).collect(Collectors.toList());
		
		System.out.println(anotherList);
	}
}
