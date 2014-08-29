package com.opentext.ix.ea.demo.services;

import java.util.List;

import com.opentext.ix.ea.demo.model.Department;

public interface DepartmentService {
	
	public Department getDepartmentByid(int id);
	public List<Department> getAllDepartments();

}
