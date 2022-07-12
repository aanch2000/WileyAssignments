package com.aanchal.service;

import java.util.ArrayList;

import com.aanchal.beans.Employee;

public interface IEmployeeService {
	Employee searchRecordById(int empId);
	ArrayList<Employee> getAllRecords(); 
}
