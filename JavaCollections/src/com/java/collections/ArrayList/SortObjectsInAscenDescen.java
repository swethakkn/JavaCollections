package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjectsInAscenDescen {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10,"Swetha",35,35000));
		employees.add(new Employee(30,"Rithwik",26,32000));
		employees.add(new Employee(40,"Vihaan",20,25000));
		employees.add(new Employee(20,"Venkat",38,50000));
		System.out.println(employees);
		
		Collections.sort(employees, new MySort()); // sorts in ascending order
		System.out.println(employees);
		
		 
		// using lambda expression to sort
		Collections.sort(employees,(o1,o2)-> (int)(o1.getEmpSalary()-o2.getEmpSalary())); // ascending order
		System.out.println(employees);
		Collections.sort(employees,(o1,o2)-> (int)(o2.getEmpSalary()-o1.getEmpSalary())); // decending order
		System.out.println(employees);
	}

}

class MySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int)(o1.getEmpSalary()-o2.getEmpSalary());
	}
	
}
