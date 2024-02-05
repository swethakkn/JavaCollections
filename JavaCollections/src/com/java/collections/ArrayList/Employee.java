package com.java.collections.ArrayList;

public class Employee {
	private int empID;
	private String empName;
	private int age;
	private long empSalary;
	
	public Employee(int empID, String empName, int age, long empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.age = age;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", age=" + age + ", empSalary=" + empSalary + "]";
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	

}
