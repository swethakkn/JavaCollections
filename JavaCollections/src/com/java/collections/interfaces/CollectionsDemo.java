package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionsDemo {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		
		
		System.out.println(fruits); // displays all elements
		fruits.remove("Banana"); // removes the one that is passed
		System.out.println(fruits); 
		System.out.println(fruits.contains("Grapes"));
		fruits.forEach((element) -> { // lambda expression
			System.out.println(element);
		});
		System.out.println(fruits.getClass());
		System.out.println(fruits.iterator());
		fruits.clear();
		System.out.println(fruits);
	}

}
