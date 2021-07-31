package com.apipothi.java8.lambdacollection;

public class Employee  {
//implements Comparable<Employee>
	int emp_id;
	String emp_Fname;
	String emp_Lname;

	public Employee() {
	}

	public Employee(int emp_id, String emp_Fname, String emp_Lname) {
		super();
		this.emp_id = emp_id;
		this.emp_Fname = emp_Fname;
		this.emp_Lname = emp_Lname;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_Fname() {
		return emp_Fname;
	}

	public void setEmp_Fname(String emp_Fname) {
		this.emp_Fname = emp_Fname;
	}

	public String getEmp_Lname() {
		return emp_Lname;
	}

	public void setEmp_Lname(String emp_Lname) {
		this.emp_Lname = emp_Lname;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_Fname=" + emp_Fname + ", emp_Lname=" + emp_Lname + "]";
	}

	/*
	 * @Override public int compareTo(Employee emp0) {
	 * 
	 * return this.emp_id - emp0.emp_id; }
	 */

}
