package com.example.demo.model;

import javax.persistence.*;

import java.util.List;


@Entity
@Table(name = "projects")
public class Project {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="project_id")
    private long pid;

    @Column(name="name")
    private String name;
    
    @Column(name="daysleft")
    private long daysleft;
    
   
    
    @Column(name="skills")
    private String skills;

  
    @OneToMany
    @JoinColumn(name="project_id")
    private List<Employee> employees;
    

   
  //  public Project(String name) {
    //    this.name = name;
    //}

    public Project(long pid, String name,String skills,long daysleft,List<Employee> employees) {
       this.pid = pid;
       this.name = name;
       this.skills=skills;
       this.daysleft=daysleft;
    
       this.employees=employees;
    }

    public Project() {
    }

    public long getProject_id() {
        return pid;
    }

    public void setProject_id(long pid) {
        this.pid = pid;
    }

    public long getDaysleft() {
        return daysleft;
    }

    public void setDaysleft(long daysleft) {
        this.daysleft = daysleft;
    }
    
   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
    
    
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmploees(List<Employee> employees) {
        this.employees = employees;
    }
}