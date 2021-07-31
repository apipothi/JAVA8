package com.apipothi.java8.lambdacollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeSetSorting {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1001, "JOHN", "S");
		Employee emp2 = new Employee(1004, "ASS", "D");
		Employee emp3 = new Employee(1004, "JOY", "K");
		Employee emp4 = new Employee(1002, "JEMS", "L");
		Employee emp5 = new Employee(1005, "DEMITRY", "A");

		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		employeeSet.add(emp5);

		System.out.println("Before Sorting");
		System.out.println(employeeSet);

		Collection<Employee> collection = employeeSet
                .stream()
                .collect(Collectors.toCollection(HashSet::new));
		
		System.out.println("After Sorting");
		collection.forEach(collectionset -> System.out.println(collectionset));

		//System.out.println(collection);
		/*
		 * Collections.sort(employeeSet, new SortByFname());
		 * 
		 * System.out.println("After Sorting-by First Name ");
		 * System.out.println(employeeSet);
		 * 
		 * Collections.sort(employeeSet, new SortByID());
		 * 
		 * System.out.println("After Sorting-by ID "); System.out.println(employeeSet);
		 * 
		 * Collections.sort(employeeSet, new SortByLname());
		 * 
		 * System.out.println("After Sorting-by Last Name ");
		 * System.out.println(employeeSet);
		 * 
		 * System.out.println("*************After JAVA 8************");
		 * 
		 * System.out.println("After Sorting-by ID ");
		 * employeeSet.sort(Comparator.comparing(e -> e.getEmp_id()));
		 * System.out.println(employeeSet);
		 * 
		 * 
		 * System.out.println("After Sorting-by First Name ");
		 * employeeSet.sort(Comparator.comparing(e -> e.getEmp_Fname()));
		 * System.out.println(employeeSet);
		 * 
		 * System.out.println("After Sorting-by Last Name ");
		 * employeeSet.sort(Comparator.comparing(e -> e.getEmp_Lname()));
		 * System.out.println(employeeSet);
		 * 
		 * System.out.println("After Sorting-by Last Name ");
		 * employeeSet.sort(Comparator.comparing(e -> e.getEmp_Lname()));
		 * System.out.println(employeeSet);
		 */
	}
}
