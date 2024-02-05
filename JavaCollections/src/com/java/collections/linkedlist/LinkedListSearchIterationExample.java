package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterationExample {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Kiwi");
		fruits.add("Lichi");
		fruits.add("Banana");
		fruits.add("Berry");
		
		System.out.println(fruits);
		
		//SEARCH ELEMENTS
		
		//search an element in linkedList
		System.out.println("Kiwi is in list : "+ fruits.contains("Kiwi"));
		
		//get index of first occurrence of an element in list
		System.out.println("Index of first banana in list is " + fruits.indexOf("Banana"));
		
		//get index of last occurrence of an element in list
		System.out.println("Index of last banana in list is " + fruits.lastIndexOf("Banana"));
		
		//ITERATE LIST
		
		//Iterator method
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fruit = (String) iterator.next();
			System.out.println(fruit);
			System.out.println("---------------------------");
		}
		
		//for Each
		fruits.forEach(fruit -> System.out.println(fruit));
		System.out.println("---------------------------");
		
		//advanced for loop
		for(String fruit : fruits)
			System.out.println(fruit);
		System.out.println("---------------------------");
		
		//Basic for loop
		for(int i=0;i<fruits.size();i++)
			System.out.println(fruits.get(i));
		
		

	}

}
