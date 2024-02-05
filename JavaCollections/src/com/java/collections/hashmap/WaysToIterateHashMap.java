package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WaysToIterateHashMap {
	public static void main(String[] args) {
		Map<String, Integer> numberMap = new HashMap<>();
		numberMap.put("One", 1);
		numberMap.put("Two", 2);
		numberMap.put("Three", 3);
		numberMap.put("Four", 4);
		numberMap.put("Five", 5);
		numberMap.put("Six", 6);
		numberMap.put("null", 0);
		System.out.println(numberMap);
		
		// enhanced for loop
		for(Map.Entry<String, Integer> entry : numberMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("-------------");
		//using Iterator
		
		Iterator<Map.Entry<String, Integer>> iterator = numberMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry =  iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("-------------");
		
		// Java8 for each
		
		numberMap.forEach((key,value)-> System.out.println(key + " : " + value));
	}

}
