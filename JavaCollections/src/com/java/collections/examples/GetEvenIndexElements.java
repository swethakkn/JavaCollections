package com.java.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetEvenIndexElements {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Kiwi");
		fruits.add("Lichi");
		fruits.add("Mango");
		fruits.add("Berries");
		System.out.println(fruits);
		
		/*
		 * for(String fruit : fruits) { int index = fruits.indexOf(fruit); if(index%2 ==
		 * 0) fruits.remove(index); }
		 */
		
		/*for (Iterator iterator = fruits.iterator(); iterator.hasNext();) {
			String fruit = (String) iterator.next();
			int index = fruits.indexOf(fruit);
			if(index%2 ==0) {
				fruits.remove(index);
			}
			
		}*/
		int iterarorIndex = 0;
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) { // check whether iterator has next element
			
			//System.out.println(iterarorIndex);
			
			it.next();  // iterator gets the next element
			if(iterarorIndex%2 == 0)
				it.remove(); // removes the iterator element when index is even
			
			iterarorIndex++; //incrementing the iterator index to check even/odd
		}
		System.out.println(fruits);

			
	}

}
