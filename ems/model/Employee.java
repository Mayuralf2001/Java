package com.vodafone.ems.model;

public class Employee {
	private static long lastId;
	
	private long 		id;
	private String 		name;
	private Department	department; // Has-A Relation
	private double 		salary;
	
	public long 		getId() 								{ return id; }

	public String 		getName() 								{ return name; }
	public void 		setName(String name) 					{ this.name = name; }
	
	public Department 	getDepartment() 						{ return department; }
	public void 		setDepartment(Department department) 	{ this.department = department; }
	
	public double 		getSalary() 							{ return salary; }
	public void 		setSalary(double salary) 				{ this.salary = salary; }

	public Employee(String name, Department department, double salary) {
		id 				= ++lastId;
		this.name 		= name;
		this.department = department;
		this.salary 	= salary;
	}
	
	public Employee() {}

	@Override public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
}