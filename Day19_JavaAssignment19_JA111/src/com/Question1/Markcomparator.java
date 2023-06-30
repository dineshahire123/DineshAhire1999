package com.Question1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Markcomparator implements Comparator<Map.Entry<String,Student>>{

	@Override
	public int compare(Entry<String, Student>o1, Entry<String, Student>o2)
	{
		Student st1 = o1.getValue();
		Student st2 = o2.getValue();
		
		if(st1.getMarks()>st2.getMarks())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
		
		
		
		
	}

}
