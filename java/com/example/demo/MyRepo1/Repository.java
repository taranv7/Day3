package com.example.demo.MyRepo1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Employee;

public interface Repository extends JpaRepository<Employee, Long> {

}
