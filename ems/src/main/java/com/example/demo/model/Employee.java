
package com.example.demo.model;



import javax.persistence.*;



@Entity
@Table(name="employee")
public class Employee {


    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="empname")
    private String name;

    @Column(name="emplastname")
    private String lastname;

    @Column(name="projectstatus")
    private String status;
    
    @Column(name="project_id")
    private long pid;

    

    
    
    public Employee() {
    }

    public Employee(String name, String lastname, String status,long pid) {
        this.name = name;
        this.lastname = lastname;
        this.status = status;
        this.pid= pid;
    

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
    	return pid;
    }
    public void setProject_id(long pid) {
    	this.pid=pid;
    }

 
    
  

}
