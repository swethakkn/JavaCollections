package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetWithAddMethod {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Mango");
		fruits.add("Grapes");
		System.out.println(fruits);
	}

}
