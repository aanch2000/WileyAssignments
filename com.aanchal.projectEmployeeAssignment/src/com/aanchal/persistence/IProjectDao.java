package com.aanchal.persistence;

import java.util.ArrayList;

import com.aanchal.beans.Project;

public interface IProjectDao {
	Project searchRecordById(int empId);

	ArrayList<Project> getAllRecords();
}
