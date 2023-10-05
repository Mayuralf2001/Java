package com.vodafone.ems.master;

import java.util.ArrayList;
import java.util.List;

import com.vodafone.ems.exception.DepartmentNotFoundException;
import com.vodafone.ems.model.Department;

public class DepartmentCRUDImpl implements DepartmentCRUD {
	private List<Department> departments;
	
	public DepartmentCRUDImpl() {
		departments = new ArrayList<Department>(); 
	}

	@Override public long addDepartment(String name, String location) {
		Department newDepartment = new Department(name, location);
		departments.add(newDepartment);
		return newDepartment.getId();
	}

	@Override public List<Department> getAllDepartments() {
		return departments;
	}

	@Override public Department getDepartmentById(long id) throws DepartmentNotFoundException {
		boolean found = false;
		Department foundDepartment = null;
		for(Department department : departments) {
			if(department.getId() == id) {
				foundDepartment = department;
				found = true;
				break;
			}
		}
		if(!found) throw new DepartmentNotFoundException("Department with id " + id + " not found.");
		return foundDepartment;
	}

	@Override public Department updateDepartment(Department department) throws DepartmentNotFoundException {
		Department foundDepartment = getDepartmentById(department.getId());
		foundDepartment.setName(department.getName());
		foundDepartment.setLocation(department.getLocation());
		return foundDepartment;
	}

	@Override public void removeDepartment(long id) throws DepartmentNotFoundException {
		departments.remove(getDepartmentById(id));
	}
}