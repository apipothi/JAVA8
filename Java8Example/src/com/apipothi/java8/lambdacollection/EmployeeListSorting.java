package com.apipothi.java8.lambdacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeListSorting {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1001, "JOHN", "S");
		Employee emp2 = new Employee(1004, "ASS", "D");
		Employee emp3 = new Employee(1004, "JOY", "K");
		Employee emp4 = new Employee(1002, "JEMS", "L");
		Employee emp5 = new Employee(1005, "DEMITRY", "A");

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);

		System.out.println("Before Sorting");
		System.out.println(employeeList);

		Collections.sort(employeeList, new SortByFname());

		System.out.println("After Sorting-by First Name ");
		System.out.println(employeeList);

		Collections.sort(employeeList, new SortByID());

		System.out.println("After Sorting-by ID ");
		System.out.println(employeeList);
		
		Collections.sort(employeeList, new SortByLname());

		System.out.println("After Sorting-by Last Name ");
		System.out.println(employeeList);
		
		System.out.println("*************After JAVA 8************");
		
		System.out.println("After Sorting-by ID ");
		employeeList.sort(Comparator.comparing(e -> e.getEmp_id()));
		System.out.println(employeeList);
		
		
		System.out.println("After Sorting-by First Name ");
		employeeList.sort(Comparator.comparing(e -> e.getEmp_Fname()));
		System.out.println(employeeList);
		
		System.out.println("After Sorting-by Last Name ");
		employeeList.sort(Comparator.comparing(e -> e.getEmp_Lname()));
		System.out.println(employeeList);
		
		System.out.println("After Sorting-by Last Name ");
		employeeList.sort(Comparator.comparing(e -> e.getEmp_Lname()));
		System.out.println(employeeList);
	}
}
