package com.example.demo.EmployeeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.EmployeeService.EmpService;

@RestController
public class Controller
{
	@Autowired
	private EmpService empserv;
	
	@GetMapping("/show")
	public List<Employee> showStudents(){
		return empserv.getemployee();
	}
	
	@PostMapping("/add")
	public Employee addStudent(@RequestBody Employee obj) {
		return empserv.addemployee(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delEmployee(@PathVariable Long id) {
		empserv.deleteById(id);
	}
	
	@GetMapping("/show/{id}")
	public Optional<Employee> findById(@PathVariable Long id) {
		return empserv.findById(id);
	}
	
}