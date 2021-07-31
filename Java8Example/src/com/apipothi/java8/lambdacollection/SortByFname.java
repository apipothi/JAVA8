package com.apipothi.java8.lambdacollection;

import java.util.Comparator;

public class SortByFname implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getEmp_Fname().compareTo(o2.getEmp_Fname());

	}

}
