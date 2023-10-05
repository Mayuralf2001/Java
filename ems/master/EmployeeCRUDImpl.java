package com.vodafone.ems.master;

import java.util.ArrayList;
import java.util.List;

import com.vodafone.ems.exception.EmployeeNotFoundException;
import com.vodafone.ems.model.Department;
import com.vodafone.ems.model.Employee;

public class EmployeeCRUDImpl implements EmployeeCRUD {
	private List<Employee> employees;
	
	public EmployeeCRUDImpl() {
		employees = new ArrayList<Employee>();
	}

	@Override 
	public long addEmployee(String name, Department department, double salary) {
		Employee newEmployee = new Employee(name, department, salary);
		employees.add(newEmployee);
		return newEmployee.getId();
	}

	@Override public List<Employee> getAllEmployees() {
		return employees;
	}

	@Override 
	public Employee getEmployeeById(long id) throws EmployeeNotFoundException {
		boolean found = false;
		Employee foundEmployee = null;
		for(Employee employee : employees) {
			if(employee.getId() == id) {
				foundEmployee = employee;
				found = true;
				break;
			}
		}
		if(!found) throw new EmployeeNotFoundException("Employee with id " + id + " not found.");
		return foundEmployee;
	}

	@Override public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		Employee foundEmployee = getEmployeeById(employee.getId());
		foundEmployee.setName(employee.getName());
		foundEmployee.setDepartment(employee.getDepartment());
		foundEmployee.setSalary(employee.getSalary());
		return foundEmployee;
	}

	@Override 
	public void removeEmployee(long id) throws EmployeeNotFoundException {
		employees.remove(getEmployeeById(id));
	}

}