package com.vodafone.ems.master;

import java.util.List;

import com.vodafone.ems.exception.DepartmentNotFoundException;
import com.vodafone.ems.model.Department;

public interface DepartmentCRUD {
	public long 			addDepartment(String name, String location);
	public List<Department>	getAllDepartments();
	public Department 		getDepartmentById(long id) 				throws DepartmentNotFoundException;
	public Department 		updateDepartment(Department department)	throws DepartmentNotFoundException;
	public void 			removeDepartment(long id)				throws DepartmentNotFoundException;
}