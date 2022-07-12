package com.aanchal.service;

import java.util.HashSet;

import com.aanchal.beans.Employee;
import com.aanchal.beans.Project;

public interface IProjectEmployeeService {
	boolean allocate(Employee emp, Project pro);

	boolean dellocate(Employee emp, Project pro);

	HashSet<Employee> getEmployeesByProjectID(Project pro);
}
