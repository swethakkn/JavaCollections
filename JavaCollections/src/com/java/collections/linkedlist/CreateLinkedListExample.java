package com.java.collections.linkedlist;
//Linked list implements both List and Dequeue Interfaces
import java.util.LinkedList;

// add(); add(index,element); addFirst();addLast();
public class CreateLinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		// adding elements to the linkedList
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		System.out.println(fruits);
		
		// adding element at specified index
		fruits.add(2, "Grapes");
		System.out.println("After adding element at index 2 =>" + fruits);
		
		// adding element at first of list
		fruits.addFirst("Watermelon");
		System.out.println("After adding element at first =>" + fruits);
		
		// adding element at first of list
		fruits.addLast("Strawberry");
		System.out.println("After adding element at last =>" + fruits);
		
		
		
	}

}
