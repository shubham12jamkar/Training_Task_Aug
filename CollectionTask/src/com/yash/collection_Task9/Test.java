package com.yash.collection_Task9;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
		Employee employee1 = new Employee(101, "shubham", 1000, "it", "pune");
		Employee employee2 = new Employee(103, "akshay", 2000, "it", "umarkhed");
		Employee employee3 = new Employee(102, "sagar", 4000, "it", "pusad");

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}

}
