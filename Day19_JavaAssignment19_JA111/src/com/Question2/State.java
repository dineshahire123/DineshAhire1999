package com.Question2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.lang.*;

import com.Question1.Student;

public class State {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
	
		
		lhm.put("Maharashtra", "Mumbai");
		lhm.put("Rajstan", "Jaipur");
		lhm.put("Tamilnadu", "Chennai");
		lhm.put("Gujrat", "Gandhinagar");
		lhm.put("Karnataka", "Bengaluru");
//		  System.out.println("Mappings of LinkedHashMap : "
//                  + lhm);
		Set<Entry<String, String>> states = lhm.entrySet();

		for(Entry<String, String> state:states)
		{
			System.out.println(state.getKey()+"---->"+state.getValue());
		}
	}
}
