package com.te.arrayList;

import java.util.ArrayList;

public class Employee {
	int empID;
	String name;
	double salary;
	
	public Employee(int empID, String name, double salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		ArrayList<Employee> arraylist = new ArrayList<>();
		arraylist.add(new Employee(12, "Employee1", 20000));
		arraylist.add(new Employee(12, "Employee2", 50000));
		arraylist.add(new Employee(22, "Employee3", 40000));
		arraylist.add(new Employee(52, "Employee4", 30000));
		arraylist.add(new Employee(44, "Employee5", 25000));
		for (int i =0; i<arraylist.size();i++) {
			for(int j =i+1; j<arraylist.size();j++) {
			if(arraylist.get(i).empID==arraylist.get(j).empID) {
				arraylist.remove(j);
			}
			}
		}
		for(Employee x:arraylist) {
			System.out.println(x);
		}		
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}

	

}
