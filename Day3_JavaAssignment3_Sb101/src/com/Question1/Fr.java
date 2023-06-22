package com.Question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Fr {
     
	public static void main(String[] args) throws IOException {
	    
		Path p = Paths.get("d://abc.txt");
		List<String> list = Files.readAllLines(p);
		
		System.out.println("Reading All lines");
		for(String line:list)
		{
			System.out.println(line);
		}
	}
}

