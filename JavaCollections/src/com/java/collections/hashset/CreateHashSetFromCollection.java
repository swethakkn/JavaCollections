package com.java.collections.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CreateHashSetFromCollection {
	public static void main(String[] args) {
		Set<String> fruits1 = new LinkedHashSet<>();
		fruits1.add("Apple");
		fruits1.add("Banana");
		fruits1.add("Mango");
		fruits1.add(null);
		fruits1.add("Kiwi");
		fruits1.add("Mango");
		fruits1.add("Grapes");
		
		/*
		 * // we can create fruits1 collection List of ArrayList bcoz its also a
		 * collection Set<String> fruits = new TreeSet<>(fruits1);
		 * fruits.addAll(fruits1); // you can use add all also to add fruits1 collection
		 * to fruits anything works fruits.add("Kiwi"); fruits.add("Mango");
		 * fruits.add("Grapes");
		 * System.out.println(fruits);
		 */
		System.out.println(fruits1);

		
	}

}
