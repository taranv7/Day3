package com.example.demo.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.MyRepo1.Repository;

@Service
public class EmpService {

	@Autowired
	private Repository repo;

	// addEmployee
	public Employee addemployee(Employee obj) {
		return repo.save(obj);
	}

	// getEmployee
	public List<Employee> getemployee() {
		List<Employee> arr = new ArrayList<>();
		arr = repo.findAll();
		return arr;
	}
	
	//deleteById  
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	//getById
	public Optional<Employee> findById(Long id) {
		Optional<Employee> emp = repo.findById(id);
		return emp;
	}

}
