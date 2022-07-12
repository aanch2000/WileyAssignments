package com.aanchal.service;

import java.util.HashSet;

import com.aanchal.beans.Employee;
import com.aanchal.beans.Project;
import com.aanchal.persistence.IProjectEmployee;
import com.aanchal.persistence.ProjectEmployeesDaoImpl;

public class ProjectEmployeeServiceImpl implements IProjectEmployeeService {
	IProjectEmployee pedao = new ProjectEmployeesDaoImpl();

	@Override
	public boolean allocate(Employee emp, Project pro) {
		return pedao.allocate(emp, pro);
	}

	@Override
	public boolean dellocate(Employee emp, Project pro) {
		return pedao.dellocate(emp, pro);
	}

	@Override
	public HashSet<Employee> getEmployeesByProjectID(Project pro) {
		return pedao.getEmployeesByProjectID(pro);
	}

}
