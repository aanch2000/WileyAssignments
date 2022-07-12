package com.aanchal.persistence;

import java.util.HashSet;

import com.aanchal.beans.Employee;
import com.aanchal.beans.Project;

public interface IProjectEmployee {
	boolean allocate(Employee emp,Project pro);

	boolean dellocate(Employee emp, Project pro);

	HashSet<Employee> getEmployeesByProjectID(Project pro);
}
