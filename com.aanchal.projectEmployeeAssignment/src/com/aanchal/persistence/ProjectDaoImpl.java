package com.aanchal.persistence;

import java.util.ArrayList;
import java.util.List;

import com.aanchal.beans.Project;
import com.aanchal.database.ProjectDataSource;

public class ProjectDaoImpl implements IProjectDao{

	@Override
	public Project searchRecordById(int empId) {
		List<Project> project = ProjectDataSource.getProjectList();
		for (Project p : project) {
			if (p.getProjectId() == empId)
				return p;
		}
		return null;
	}

	@Override
	public ArrayList<Project> getAllRecords() {
		return ProjectDataSource.getProjectList();
	}

}
