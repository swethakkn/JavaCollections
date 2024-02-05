package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class RemoveElementsFromHashSetExample {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Mango");
		fruits.add("Grapes");
		System.out.println(fruits);
		
		// HashSet remove method
		fruits.remove("Mango");
		System.out.println(fruits);
		
		//HashSet removeAll method
		Set<String> fruits1 = new HashSet<>();
		fruits1.add("Apple");
		fruits1.add("Banana");
		fruits.removeAll(fruits1); // removes all fruits1 collection
		System.out.println(fruits);
		
		// HashSet clear method to remove all elements
		fruits.clear();
		System.out.println(fruits);
	}

}
