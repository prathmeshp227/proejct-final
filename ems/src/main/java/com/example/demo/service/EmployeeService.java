

package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.model.Project;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    //@Autowired
    //private ProjectRepository projectRepository;


    
    public Employee addEmployee(Employee employee){
    	//Project project=projectRepository.getByPid((employee.getId()));
    	//long x= project.getTeams();
    	//project.setTeams(x+1);
    	//projectRepository.save(project);
        return employeeRepository.save(employee);
        
    }

    public Employee findEmployeeById(long id){
        Optional<Employee> employee=employeeRepository.findById(id);
        return employee.get();
    }

    public List<Employee> getAll(){
        return employeeRepository.findByNameNotNullOrderById();
    }

    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }

    public List<Employee> findEmployeeByName(String name){

        return employeeRepository.findByNameIgnoreCase(name);
    }
    
    public List<Employee> findEmployeeByStatus(String status){

        return employeeRepository.findByStatusIgnoreCase(status);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);

    }
    
    
   
    
    

}