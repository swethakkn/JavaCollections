package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysToIterateSet {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Mango");
		fruits.add("Grapes");
		System.out.println(fruits);
		
		//Enhanced For loop
		for(String fruit : fruits)
			System.out.println(fruit);
		System.out.println("-----------------");
		
		//Basic loop with Iterator
		for (Iterator<String> iterator = fruits.iterator(); iterator.hasNext();) {
			String fruit = (String) iterator.next();
			System.out.println(fruit);
		}
		System.out.println("-----------------");
		
		//While loop with Iterator
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fruit = (String) iterator.next();
			System.out.println(fruit);	
		}
		System.out.println("-----------------");
		
		//JDK 8 foreach() method with lambda
		fruits.forEach(fruit -> System.out.println(fruit));
		System.out.println("-----------------");
		
		//JDK 8 Stream + foreach() + lambda expression
		fruits.stream().forEach(fruit -> System.out.println(fruit));
		System.out.println("-----------------");
		//to exclude an element and print set
		fruits.stream().filter(fruit -> !"Mango".equals(fruit)).forEach(fruit -> System.out.println(fruit));
	}

}
