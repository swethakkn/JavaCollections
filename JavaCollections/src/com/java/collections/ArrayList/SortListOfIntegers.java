package com.java.collections.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListOfIntegers {
	public static void main(String[] args) {
		// simple way of sorting integers
		List<Integer> list = Arrays.asList(10,40,50,30,20);
		System.out.println(list);
		Collections.sort(list); // sorts list in Ascending order
		System.out.println(list);
		Collections.reverse(list); // reverses the list means from ascending to descending order
		System.out.println(list);

	}

}
