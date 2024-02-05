package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetOverviewDemo {
	public static void main(String[] args) {
		avoidDuplicate();
		allowNullValue();
	}
	//HashSet avoids duplicate elements also doesn't follow insertion order
	private static void avoidDuplicate() {
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Mango");
		fruits.add("Grapes");
		System.out.println(fruits);
	}
	
	// HashSet allows null value by following avoid duplicate nature
	private static void allowNullValue() {
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add(null);
		fruits.add("Mango");
		fruits.add("Grapes");
		System.out.println(fruits);
	}
	
	
	

}
