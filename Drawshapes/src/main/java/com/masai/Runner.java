package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Circle c = ctx.getBean("c", Circle.class);
	
		Triangle t = ctx.getBean("t",Triangle.class);
		
		Cylinder cy = ctx.getBean("cy",Cylinder.class);
		
		c.draw();
		cy.draw();
		t.draw();
	}
}
