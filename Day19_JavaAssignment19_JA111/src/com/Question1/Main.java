package com.Question1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Map<String,Student> studentMap = new HashMap<>();
		
		studentMap.put("Mumbai",new Student(165,"Yash",550));
		studentMap.put("Delhi",new Student(168,"Shubham",850));
		studentMap.put("Bengaluru",new Student(167,"Ishwar",670));
		studentMap.put("Pune",new Student(163,"Dinesh",910));
  
		
		Set<Map.Entry<String,Student>> studentSet = studentMap.entrySet();
		Set<Map.Entry<String,Student>> treeStudent = new TreeSet<>(new Markcomparator());
			
		for(Map.Entry<String, Student> setMap:studentSet)
		{
			
			treeStudent.add(setMap);
		}
		
		for(Map.Entry<String, Student> 
				result:treeStudent)
		{
			System.out.println(result.getKey()+
					"------"+result.getValue());
		}
		
		
	}
}
