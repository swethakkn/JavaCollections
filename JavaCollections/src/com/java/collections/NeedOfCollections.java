package com.java.collections;



public class NeedOfCollections {
	public static void main(String[] args) {
		
		// assigning integers to variable
		int a =12;
		int b = 15;
		//assigning so many integers to one variable is possible in arrays
		
		int intarray[] = new int[10];
		intarray[0] = 10;
		intarray[1] = 20;
		intarray[2] = 30;
		intarray[3] = 40;
		// here intarray (an array)can store 10 integer values 
		/* Limitations of an array are
		 * 1) Array size is fixed 
		 * 2) Arrays can hold only homogeneous data elements
		 * 3) Ready made API support to work with data is not available
		 */
		// if you have 2 class student and book
		Student[] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
		// cant assign Book object to students object event though you know every class super class is object class
		//students[2] = new Book();
		// but you can do as below
		
		Object[] obj = new Object[10];
		obj[0] = new Student();
		obj[1] = new Book();
		// To overcome all these limitations of array, we need collections Framework introduced from JDK 1.2
		
	}

}

class Student{
	
}
class Book{
	
}