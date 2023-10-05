package com.vodafone.ems.master;

import java.util.List;

import com.vodafone.ems.exception.EmployeeNotFoundException;
import com.vodafone.ems.model.Department;
import com.vodafone.ems.model.Employee;

public interface EmployeeCRUD {
	public long 				addEmployee(String name, Department department, double salary);
	public List<Employee> 		getAllEmployees();
	public Employee 		getEmployeeById(long id) 		throws EmployeeNotFoundException;
	public Employee 		updateEmployee( Employee employee)		throws EmployeeNotFoundException;
	public void 			removeEmployee(long id)		throws EmployeeNotFoundException;
}
