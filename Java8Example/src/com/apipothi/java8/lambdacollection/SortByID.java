package com.apipothi.java8.lambdacollection;

import java.util.Comparator;

public class SortByID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getEmp_id() - o2.getEmp_id();

	}

}
