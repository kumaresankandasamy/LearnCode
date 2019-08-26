package com.gl.empcrud.service;

import com.gl.empcrud.model.Employee;
import com.gl.empcrud.model.Project;


import java.util.List;
import java.util.Set;

public interface ProjectService {
    void registerProject(Project project);
    List<Project> listAllProjects();
    Set<Employee> listAllEmployeeByProjectId(long projectId);
}
