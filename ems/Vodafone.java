package com.vodafone.ems;

import java.util.Scanner;

import com.vodafone.ems.exception.DepartmentNotFoundException;
import com.vodafone.ems.exception.EmployeeNotFoundException;
import com.vodafone.ems.master.DepartmentCRUD;
import com.vodafone.ems.master.DepartmentCRUDImpl;
import com.vodafone.ems.master.EmployeeCRUD;
import com.vodafone.ems.master.EmployeeCRUDImpl;
import com.vodafone.ems.model.Department;
import com.vodafone.ems.model.Employee;

public class Vodafone {
	
	private static Scanner input = new Scanner(System.in);
	
	private static DepartmentCRUD 	departmentCRUD 	= new DepartmentCRUDImpl();
	private static EmployeeCRUD 	employeeCRUD 	= new EmployeeCRUDImpl();
	
	public static void main(String[] args) {
		int choice = 0;
		do {
			input = new Scanner(System.in);
			sop("MENU\n");
			sop("----\n");
			sop("1. Department Master\n");
			sop("2. Employee   Master\n");
			sop("0. Exit\n");
			sop("Choice? ");
			choice = input.nextInt();
			try {
				switch(choice) {
					case 1:  departmentMaster(); break;
					case 2:  employeeMaster();	break;
					case 0:  break;
					default: throw new Exception("Invalid Choice. Enter any Choice [1 or 2] or 0 to Exit.");
				}
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
			sop("\n");
		} while(choice != 0);
		sop("Thank you for using Employee Management System.");
	}
	
	private static void departmentMaster() {
		int choice = 0;
		do {
			input = new Scanner(System.in);
			sop("\n");
			sop("Department Master\n");
			sop("-----------------\n");
			sop("1. Add Department\n");
			sop("2. Get All Department Details\n");
			sop("3. Get Department Detail By It's ID\n");
			sop("4. Update A Department Detail\n");
			sop("5. Remove A Department\n");
			sop("0. Exit\n");
			sop("Choice? ");
			choice = input.nextInt();
			try {
				switch(choice) {
					case 1:  addDepartment();		break;
					case 2:  getAllDepartments();	break;
					case 3:  getDepartmentById();	break;
					case 4:  updateDepartment(); 	break;
					case 5:  removeDepartment(); 	break;
					case 0:  break;
					default: throw new Exception("Invalid Choice. Enter any Choice [1 - 5] or 0 to Exit.");
				}
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
			sop("\n");
		} while(choice != 0);
	}
	
	private static void addDepartment() {
		input = new Scanner(System.in);
		sop("Department Name? ");
		String name = input.nextLine();
		sop("Location? ");
		String location = input.nextLine();
		sop("Department Added with ID " + departmentCRUD.addDepartment(name, location) + "\n");
	}
	
	private static void getAllDepartments() {
		for(Department department : departmentCRUD.getAllDepartments()) {
			sop(department + "\n");
		}
	}
	
	private static void getDepartmentById() {
		input = new Scanner(System.in);
		sop("Department ID? ");
		long id = input.nextLong();
		try {
			sop(departmentCRUD.getDepartmentById(id) + "\n");
		} catch(DepartmentNotFoundException dnfe) {
			System.err.println(dnfe.getMessage());
		}
	}
	
	private static void updateDepartment() {
		input = new Scanner(System.in);
		sop("Department ID? ");
		long id = input.nextLong();
		input.nextLine();
		try {
			Department department = departmentCRUD.getDepartmentById(id);
			sop("Department Name: " + department.getName() + ", New Name? ");
			String name = input.nextLine();
			sop("Department Location: " + department.getLocation() + ", New Location? ");
			String location = input.nextLine();
			department.setName(name);
			department.setLocation(location);
			sop(departmentCRUD.updateDepartment(department) + "\n");
		} catch(DepartmentNotFoundException dnfe) {
			System.err.println(dnfe.getMessage());
		}
	}
	
	private static void removeDepartment() {
		input = new Scanner(System.in);
		sop("Department ID? ");
		long id = input.nextLong();
		input.nextLine();
		try {
			Department department = departmentCRUD.getDepartmentById(id);
			sop(department + "\n");
			sop("Do you wish to remove this department [y/n]? ");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("y")) {
				departmentCRUD.removeDepartment(id);
				sop("Department with " + id + " removed successfully.");
			}
		} catch(DepartmentNotFoundException dnfe) {
			System.err.println(dnfe.getMessage());
		}
	}
	
	private static void employeeMaster() {
		int choice = 0;
		do {
			input = new Scanner(System.in);
			sop("\n");
			sop("Employee Master\n");
			sop("---------------\n");
			sop("1. Add Employee\n");
			sop("2. Get All Employee Details\n");
			sop("3. Get Employee Detail By It's ID\n");
			sop("4. Update A Employee Detail\n");
			sop("5. Remove A Employee\n");
			sop("0. Exit\n");
			sop("Choice? ");
			choice = input.nextInt();
			try {
				switch(choice) {
					case 1:  addEmployee();		break;
					case 2:  getAllEmployees();	break;
					case 3:  getEmployeeById();	break;
					case 4:  updateEmployee(); 	break;
					case 5:  removeEmployee(); 	break;
					case 0:  break;
					default: throw new Exception("Invalid Choice. Enter any Choice [1 - 5] or 0 to Exit.");
				}
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
			sop("\n");
		} while(choice != 0);
	}
	
	private static void addEmployee() {
		input = new Scanner(System.in);
		sop("Employee Name? ");
		String name = input.nextLine();
		long id = 0;
		Department department = null;
		while(true) {
			try {
				sop("Department ID? ");
				id = input.nextLong();
				department = departmentCRUD.getDepartmentById(id);
				break;
			} catch(DepartmentNotFoundException dnfe) {
				System.err.println(dnfe.getMessage());
			}
		}
		sop("Salary? ");
		double salary = input.nextDouble();
		sop("Employee Added with ID " + employeeCRUD.addEmployee(name, department, salary) + "\n");
	}
	
	private static void getAllEmployees() {
		for(Employee employee : employeeCRUD.getAllEmployees()) {
			sop(employee + "\n");
		}
	}
	
	private static void getEmployeeById() {
		input = new Scanner(System.in);
		sop("Employee ID? ");
		long id = input.nextLong();
		try {
			sop(employeeCRUD.getEmployeeById(id) + "\n");
		} catch(EmployeeNotFoundException enfe) {
			System.err.println(enfe.getMessage());
		}
	}
	
	private static void updateEmployee() {
		input = new Scanner(System.in);
		sop("Employee ID? ");
		long id = input.nextLong();
		input.nextLine();
		try {
			Employee employee = employeeCRUD.getEmployeeById(id);
			sop("Employee Name: " + employee.getName() + ", New Name? ");
			String name = input.nextLine();
			long departmentId = 0;
			Department department = null;
			while(true) {
				try {
					sop("Department ID: " + employee.getDepartment().getId() + ", New ID? ");
					departmentId = input.nextLong();
					department = departmentCRUD.getDepartmentById(departmentId);
					break;
				} catch(DepartmentNotFoundException dnfe) {
					System.err.println(dnfe.getMessage());
				}
			}
			sop("Employee Salary: " + employee.getSalary() + ", New Salary? ");
			double salary = input.nextDouble();
			employee.setName(name);
			employee.setDepartment(department);
			employee.setSalary(salary);
			sop(employeeCRUD.updateEmployee(employee) + "\n");
		} catch(EmployeeNotFoundException enfe) {
			System.err.println(enfe.getMessage());
		}
	}
	
	private static void removeEmployee() {
		input = new Scanner(System.in);
		sop("Employee ID? ");
		long id = input.nextLong();
		input.nextLine();
		try {
			Employee employee = employeeCRUD.getEmployeeById(id);
			sop(employee + "\n");
			sop("Do you wish to remove this employee [y/n]? ");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("y")) {
				employeeCRUD.removeEmployee(id);
				sop("Employee with " + id + " removed successfully.");
			}
		} catch(EmployeeNotFoundException enfe) {
			System.err.println(enfe.getMessage());
		}
	}
	
	private static void sop(String message) { System.out.print(message); }
	
}