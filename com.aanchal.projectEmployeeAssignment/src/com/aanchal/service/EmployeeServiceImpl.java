package com.aanchal.service;

import java.util.ArrayList;


import com.aanchal.beans.Employee;
import com.aanchal.persistence.EmployeeDaoImpl;
import com.aanchal.persistence.IEmployeeDao;

public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDao employeeDao = new EmployeeDaoImpl();
	@Override
	public Employee searchRecordById(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.searchRecordById(empId);
	}

	@Override
	public ArrayList<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return employeeDao.getAllRecords();
	}

}
