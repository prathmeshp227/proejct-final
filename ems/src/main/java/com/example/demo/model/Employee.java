
package com.example.demo.model;



import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name="employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="empname")
    private String name;

    @Column(name="emplastname")
    private String lastname;

    @Column(name="projectstatus")
    private String status;
    
    @Column(name="project_id")
    private long project_id;



    
    
    public Employee() {
    }

    public Employee(String name, String lastname, String status,long project_id) {
        this.name = name;
        this.lastname = lastname;
        this.status = status;
        this.project_id= project_id;
    

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public long getProject_id(){
    	return project_id;
    }
    public void setProject_id(long project_id) {
    	this.project_id=project_id;
    }

 
    
  

}
