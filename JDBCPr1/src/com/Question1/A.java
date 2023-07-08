package com.Question1;

public class A {

	
	public A()
	{
	System.out.println("inside constructor....");	
	}
	
	{
		System.out.println("inside the non-static block");
	}
	
	static
	{
		System.out.println("inside static block");
	}
	
	void funA()
	{
		System.out.println("inside fun A");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("inside main");
		
		A a1  =  new A();
		
		a1.funA();
		
		
	}

}
