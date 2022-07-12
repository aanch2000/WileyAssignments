package com.aanchal.database;

import java.util.ArrayList;

import com.aanchal.beans.Employee;


public class EmployeeDataSource {
	private static ArrayList<Employee> employeeList=new ArrayList<Employee>();
	static {
		employeeList.add(new Employee(101, "AAAA", "Associate", "IT", 55000));
		employeeList.add(new Employee(102, "BBBB", "Associate", "IT", 55000));
		employeeList.add(new Employee(104, "DDDD", "Associate", "IT", 55000));
		employeeList.add(new Employee(103, "CCCC", "Associate", "IT", 55000));
		employeeList.add(new Employee(105, "EEEE", "Associate", "IT", 55000));
		
		employeeList.add(new Employee(106, "FFFF", "Associate", "IT", 55000));
		employeeList.add(new Employee(107, "GGGG", "Associate", "IT", 55000));
		employeeList.add(new Employee(109, "IIII", "Associate", "IT", 55000));
		employeeList.add( new Employee(110, "JJJJ", "Associate", "IT", 55000));
		
		
	}
	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeDataSource.employeeList = employeeList;
	}
}
