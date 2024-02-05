package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RemoveElementsFromLinkedListExample {

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
		
		//remove first element of the linkedList
		fruits.removeFirst();
		System.out.println(fruits);
		
		//remove last element of the linkedList
		fruits.removeLast();
		System.out.println(fruits);
		
		//remove element of the linkedList at specified index
		fruits.remove(2);
		System.out.println(fruits);
		
		//remove element of the linkedList by specifying element
		fruits.remove("Kiwi");
		System.out.println(fruits);
		
		// remove first occurrence of element specified 
		fruits.removeFirstOccurrence("Banana");
		System.out.println(fruits);
		
		//remove all elements of LinkedList
		fruits.clear();
		System.out.println(fruits);

	}

}
