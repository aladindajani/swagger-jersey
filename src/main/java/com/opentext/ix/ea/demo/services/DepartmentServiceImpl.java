package com.opentext.ix.ea.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.opentext.ix.ea.demo.model.Department;

public class DepartmentServiceImpl implements DepartmentService
{
	private static List<Department> listOfDepartments = new ArrayList<Department>();

	static
	{
		listOfDepartments.add(new Department(1, "HR", "active"));
		listOfDepartments.add(new Department(2, "BENEFITS", "active"));
		listOfDepartments.add(new Department(3, "SALES", "active"));
		listOfDepartments.add(new Department(4, "OPERATIONS", "active"));
		listOfDepartments.add(new Department(5, "SUPPORT", "active"));
		listOfDepartments.add(new Department(6, "MARKETING", "active"));
		listOfDepartments.add(new Department(7, "DEVELOPMENT", "active"));
		listOfDepartments.add(new Department(8, "SUPPORT", "active"));
		listOfDepartments.add(new Department(9, "ACCOUNTING", "active"));
		listOfDepartments.add(new Department(10, "FACILITIES", "active"));
	}
	
	@Override
	public Department getDepartmentByid(int id) 
	{
		for(int i=0; i<listOfDepartments.size(); i++)
		{
			Department dept = listOfDepartments.get(i);
			if(dept.getId() == id)
			{
				return dept;
			}
		}
		
		return null;
		
	}

	@Override
	public List<Department> getAllDepartments() {
		return listOfDepartments;
	}

}
