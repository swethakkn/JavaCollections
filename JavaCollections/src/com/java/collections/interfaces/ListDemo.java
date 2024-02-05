package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		// allows duplicate values
		elements.add("Element1");
		elements.add("Element2");
		elements.add("Element2");
		elements.add("Element4");
		System.out.println(elements);
		
		// allows null values
		elements.add(null);
		elements.add(null);
		System.out.println(elements);
		
		//List displays in insertion order
		elements.clear();
		elements.add("Element1"); //index 0
		elements.add("Element2");//index 1
		elements.add("Element3");//index 2
		elements.add("Element4");//index 3
		System.out.println(elements);
		
		//List elements can be accessed by index
		System.out.println(elements.get(2));
		System.out.println(elements.get(0));
				
	}

}
