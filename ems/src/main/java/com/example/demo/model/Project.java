package com.example.demo.model;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="project_id")
    private long project_id;

    @Column(name="name")
    private String name;

  
    @OneToMany
    @JoinColumn(name="project_id")
    private List<Employee> employees;
    

   
    public Project(String name) {
        this.name = name;
    }

    public Project(long project_id, String name,List<Employee> employees) {
       this.project_id = project_id;
       this.name = name;
       this.employees=employees;
    }

    public Project() {
    }

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmploees(List<Employee> employees) {
        this.employees = employees;
    }
}