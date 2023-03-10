package com.mphasis.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.model.Employee;

@RestController
@RequestMapping("/employee/api")
public class EmployeeOperationsController {

	Employee employee = new Employee();
	public List<Employee> list = new ArrayList<>();
	
	
	@GetMapping("/empList")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	@PostMapping("/emp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		list.add(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	
}
