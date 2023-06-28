package com.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.Question1.Student;

public class Main {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		
		student.add(new Student(23,"Dinesh",99));
		student.add(new Student(24,"Yash",98));
		student.add(new Student(25,"Ak",97));
		student.add(new Student(26,"Ishwar",96));
		student.add(new Student(27,"PI",95));


		Stream<Student> st = student.stream();

		
		List<Employee> list = st.map(s-> new Employee()).collect(Collectors.toList());
//		List<Employee> anotherList = student.stream().map(s->new Employee(a,b,c)).collect(Collectors.toList());
	System.out.println(list);
	}
}

