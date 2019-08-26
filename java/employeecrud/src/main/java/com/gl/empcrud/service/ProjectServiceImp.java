package com.gl.empcrud.service;

import com.gl.empcrud.model.Employee;
import com.gl.empcrud.model.Project;
import com.gl.empcrud.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Set;

public class ProjectServiceImp implements ProjectService{
    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public void registerProject(Project project){

    }
    @Override
    public List<Project> listAllProjects(){
        return null;
    }
    @Override
    public Set<Employee> listAllEmployeeByProjectId(long projectId){
        return null;
    }


}
