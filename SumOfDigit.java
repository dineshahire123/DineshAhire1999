package com.Question10;

public class SumOfDigit {

	public static void main(String[] args) {
		
		
		String a = sum(1234512312);
		System.out.println(a);
	}

	public static String sum(int i) {
		// TODO Auto-generated method stub
		String bag = "";
		if(i==1)
		{
			bag =  i + " ";
			return bag;
		}
		bag = bag + i%10 +  sum(i/10);
	 return bag;
		
	}
	
}
