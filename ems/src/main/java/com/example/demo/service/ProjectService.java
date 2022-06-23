
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
    
    
	//public Project getbyPid(long pid ) {
    	//return projectRepository.getReferenceById(pid);
    //}

    
    public Project addProject(Project project){
        return projectRepository.save(project);
    }
    public List<Project> getProjects(){
        return projectRepository.findAll();
    }
    
    public List<Project> getSkills(String skills){

        return projectRepository.findBySkillsIgnoreCase(skills);
    }
    
    public List<Project> getDaysleftLessThen (long daysleft) {
		return projectRepository.findByDaysleftLessThanEqual(daysleft);
	}
}

