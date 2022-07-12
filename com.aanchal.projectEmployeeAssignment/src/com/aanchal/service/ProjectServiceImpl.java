package com.aanchal.service;

import java.util.ArrayList;

import com.aanchal.beans.Project;
import com.aanchal.persistence.IProjectDao;
import com.aanchal.persistence.ProjectDaoImpl;



public class ProjectServiceImpl implements IProjectService {

	private IProjectDao productDao = new ProjectDaoImpl();
	@Override
	public Project searchRecordById(int empId) {
		return productDao.searchRecordById(empId);
	}

	@Override
	public ArrayList<Project> getAllRecords() {
		return productDao.getAllRecords();
	}

}
