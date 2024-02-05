package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AddUserDefinedObjectToHashMap {

	public static void main(String[] args) {
		Map<Integer,Student> students = new HashMap<>();
		students.put(1,new Student("Swetha" , "Kakani"));
		students.put(2,new Student("Venkat" , "Arikatla"));
		students.put(3,new Student("Rithwik" , "Arikatla"));
		students.put(4,new Student("Vihaan" , "Arikatla"));
		
		System.out.println(students);
		

	}

}
