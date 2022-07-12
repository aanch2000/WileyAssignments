package com.aanchal.service;

import java.util.ArrayList;

import com.aanchal.beans.Project;

public interface IProjectService {
	Project searchRecordById(int empId);

	ArrayList<Project> getAllRecords();
}
