package com.example.demo.repository;

import  com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByNameIgnoreCase(String name);
    List<Employee> findByStatusIgnoreCase(String status);
    
    List<Employee> findByNameNotNullOrderById();
    //@Query("select e from employee e where e.projectstatus=?1")
    //List<Employee> findByStatus(String status);
}
