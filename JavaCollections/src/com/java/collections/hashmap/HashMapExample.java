package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		//Create HashMap which is unordered and key is unique
		Map<String, Integer> numberMap = new HashMap<>();
		numberMap.put("One", 1);
		numberMap.put("Two", 2);
		numberMap.put("Three", 3);
		numberMap.put("Four", 4);
		numberMap.put("Five", 5);
		numberMap.put("Six", 6);
		System.out.println(numberMap);
		// hashMap allows null key 
		numberMap.put("null", 0);
		System.out.println(numberMap);
		// if you try to put duplicate key then the value will be replaced
		numberMap.put("null", 10);
		System.out.println(numberMap);
		
		// size of hashset
		System.out.println(numberMap.size());
		
		// gets the value of specified key
		System.out.println(numberMap.get("Four"));
		
		// remove the specified key with value
		numberMap.remove("Three");
		System.out.println(numberMap);
		
		// remove the specified key and value if exists
		numberMap.remove("Six", 16);
		System.out.println(numberMap);
		
		// checks whether map is empty or not
		System.out.println(numberMap.isEmpty());
		
		// checks whether map has specified key or not
		System.out.println(numberMap.containsKey("Five"));
		
		// checks whether map has specified value or not
		System.out.println(numberMap.containsValue(8));
		
		// gives all keys as set
		System.out.println(numberMap.keySet());
		
		// gives all values as collection
		System.out.println(numberMap.values());
		
		
		
	}

}
