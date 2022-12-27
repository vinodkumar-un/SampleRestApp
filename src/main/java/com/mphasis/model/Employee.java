package com.mphasis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	
	public Employee() {
		super();
	}
	private Integer empId;
	private String empName;
	private int empSal;
	private String address;

}
