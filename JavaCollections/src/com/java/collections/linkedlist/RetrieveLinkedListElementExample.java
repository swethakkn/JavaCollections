package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class RetrieveLinkedListElementExample {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		
		//get first element of the linkedList by getFirst() method
		System.out.println("First Element : " + fruits.getFirst());
		
		//get last element of the linkedList by getLast() method
		System.out.println("Last Element : " + fruits.getLast());
		
		//get element of specified index of linkedList by  method
		System.out.println("Element at Index 2 : " + fruits.get(2));
		
		// get all elements by iterating the list using enhanced for loop
		for(String fruit : fruits)
			System.out.println(fruit);
		
	}

}
