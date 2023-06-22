package com.Question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s1 = new Student(12,"Dinesh",new Address(),"dinesh@12.com");
		
		FileOutputStream fos = new FileOutputStream("d://student.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
	   
		oos.writeObject(s1);
		
		System.out.println("Serialized the child");
		System.out.println("After Deserialization");
		
		FileInputStream fis = new FileInputStream("d://student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		

		Student s2 = (Student)ois.readObject();
		
	    System.out.println(s2);
//		System.out.println(s2.getAddress());
	    
	}
	
	
	
}
