package com.apipothi.java8.lambdacollection;

import java.util.Comparator;

public class SortByLname implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getEmp_Lname().compareTo(o2.getEmp_Lname());

	}

}
