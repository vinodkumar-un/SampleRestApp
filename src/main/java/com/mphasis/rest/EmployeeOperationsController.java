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

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee/api")
@Slf4j
public class EmployeeOperationsController {

	Employee employee = new Employee();
	public List<Employee> list = new ArrayList<>();
	
	
	@PostMapping("/emp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		log.info("End point emp data comes with: "+emp);
		list.add(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	
	@GetMapping("/emp")
	public ResponseEntity<Employee> getEmployee() {
		log.info("get data from getEmployee method");
		return new ResponseEntity<Employee>(list.get(0), HttpStatus.OK);
	}
	
	@GetMapping("/empList")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
}
