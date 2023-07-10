
package com.Emp;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.masai.utility.EMUtil;

public class Main {
   
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
	  EntityTransaction tx = em.getTransaction();
	 
		
		Address  adr = new Address();
		adr.setCity("Malegaon2");
		adr.setPincode("5232032");
		adr.setState("MH");
		adr.setType("Address3");
		
		
		Employee emp = new Employee();
		emp.setEmpID(25);
		emp.setGender("Male");
		emp.setName("Dinesh1");
		emp.setSalary(90000);
		emp.getEmpAddress().add(adr);
	
	  
	 try
	 {
 
		  tx.begin();
		  
		  em.merge(emp);
		  
		  tx.commit();
		  em.close();
		  System.out.println("done");
	 }
	  
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	 
	}
}
