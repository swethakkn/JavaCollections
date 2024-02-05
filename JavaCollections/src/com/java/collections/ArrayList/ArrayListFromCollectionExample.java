package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

// Create an ArrayList from another collection using ArrayList(Collection c) constructor
//Add all elements from an existing collection to the new ArrayList using addAll() method
public class ArrayListFromCollectionExample {
	public static void main(String[] args) {
		List<String> fruitList1 = new ArrayList<>();
		fruitList1.add("Apple");
		fruitList1.add("Banana");
		fruitList1.add("Grapes");
		System.out.println(fruitList1);
		
		List<String> fruitList2 = new ArrayList<>();
		fruitList2.add("Jackfruit");
		fruitList2.add("Mango");
		fruitList2.add("Lichi");
		System.out.println(fruitList2);
		
		List<String> fruits = new ArrayList<>(fruitList1);
		System.out.println(fruits);
		fruits.addAll(fruitList2);
		System.out.println(fruits);
		
		
		
	}

}
