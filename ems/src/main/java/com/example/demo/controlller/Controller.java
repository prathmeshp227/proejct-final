package com.example.demo.controlller;

import com.example.demo.model.Employee;
import com.example.demo.model.Project;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class Controller {

    @Autowired
    public EmployeeService employeeService;

    @Autowired
    public ProjectService projectService;


    @GetMapping("/search{id}")
    public Employee getEmployeeById(@RequestParam int id){
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("/searchName{name}")
    public List<Employee> getEmployeeByName(@RequestParam String name){
        return employeeService.findEmployeeByName(name);
    }
    
    @GetMapping("/SearchByStatus{status}")
    public List<Employee> getEmployeeByStatus(@RequestParam String status){
        return employeeService.findEmployeeByStatus(status);
    }

    @GetMapping("/employee")
    public List<Employee> getEmployeeAll(){
        return employeeService.getAll();
    }

    

    @DeleteMapping("/delete{id}")
    public List<Employee> deleteEmployee(@RequestParam int id){
        employeeService.deleteEmployee(id);
        return employeeService.getAll();
    }


    @PostMapping("/create")
    public String addEmployee(@RequestBody Employee employee){
        Employee newEmployee=employeeService.addEmployee(employee);
        return "User "+newEmployee.getName()+" is Successfully Created ";
    }


    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee){
        Employee editedEmployee=employeeService.updateEmployee(employee);
        return "User "+editedEmployee.getName()+" is Successfully Updated ";
    }
    

  
    
    @PostMapping("/addproject")
    public String addProject(@RequestBody Project project){
        projectService.addProject(project);
        return "Project is Successfully Created ";
    }

    @GetMapping("/projects")
    public List<Project> getProject(){
        return projectService.getProjects();
    }
    
    @GetMapping("/skills")
    public List<Project> getSkills(String skills){
        return projectService.getSkills(skills);
    }
    
    @GetMapping("/days/lessthen")
	public List<Project> getDaysleftLessThen (long daysleft) {
		return projectService.getDaysleftLessThen(daysleft);
	}
    
    @GetMapping("/notstaffed")
	public List<Project> getProjectNotStaffed() {
		return projectService.getProjectNotStaffed();
	}
    
    
    //@GetMapping("/findbystatus/{status}")
    //public List<Employee> findbystatus(@PathVariable String status){
     //   return employeeService.findByStatus(status);
    //}
}
