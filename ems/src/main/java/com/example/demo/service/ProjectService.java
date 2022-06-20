
package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    
    public Project addProject(Project project){
        return projectRepository.save(project);
    }
    public List<Project> getProjects(){
        return projectRepository.findAll();
    }
}

