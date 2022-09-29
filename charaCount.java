package com.Question4;

import java.util.HashMap;
import java.util.Map;

public class charaCount {

	public static void charCount(String str)
	{
		str = str.toUpperCase();

	    int n = str.length();
	   
	    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	    char[]  s2 = str.toCharArray();
	    
	    for(char a: s2)
	    {
	    	if(Character.isSpaceChar(a))
	    	{
	    		continue;
	    	}
	    	
	    	if(charMap.containsKey(a))
	    	{
	    		charMap.put(a, charMap.get(a)+1);
	    		
	    	}
	    	else
	    	{
	    		charMap.put(a, 1);
	    	}
	    	
	    }
	    System.out.println(str + " " +  charMap);
		
	}
	
	
	 public static void main(String[] args) {
		
		 String s1 = "India is my Country";
	
		 charCount(s1);
	}
}
