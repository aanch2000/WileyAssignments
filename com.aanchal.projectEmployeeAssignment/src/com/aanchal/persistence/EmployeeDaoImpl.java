package com.aanchal.persistence;

import java.util.ArrayList;
import java.util.List;

import com.aanchal.beans.Employee;
import com.aanchal.database.EmployeeDataSource;

public class EmployeeDaoImpl implements IEmployeeDao{

	@Override
	public Employee searchRecordById(int empId) {
		List<Employee> employees=EmployeeDataSource.getEmployeeList();
		for(Employee e:employees) {
			if(e.getEmpId()==empId)
				return e;
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getAllRecords() {
		return EmployeeDataSource.getEmployeeList();
	}

}
