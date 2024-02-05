package com.java.collections.ArrayList;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWAysToIterateBeforeJava8 {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("C","C++","Java","Python","Spring");
		System.out.println(courses);
		
		// Basic for loop to iterate
		for(int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i));
		}
		
		//Enhanced for loop
		for(String course : courses) {
			System.out.println(course);
		}
		
		// Basic loop with Iterator
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		// iterator with while loop
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = (String) iterator.next();
			System.out.println(course);
			
		}
		
		//Java8 Stream + lambda
		courses.stream().forEach(course -> System.out.println(course));
		
		// Java 8 foreach + lambda
		courses.forEach(course -> System.out.println(course));
	}

}
