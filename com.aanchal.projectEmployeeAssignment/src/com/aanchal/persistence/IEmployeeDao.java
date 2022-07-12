package com.aanchal.persistence;

import java.util.ArrayList;

import com.aanchal.beans.Employee;

public interface IEmployeeDao {
	Employee searchRecordById(int empId);
	ArrayList<Employee> getAllRecords();
}
