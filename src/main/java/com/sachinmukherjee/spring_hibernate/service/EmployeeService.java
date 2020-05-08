package com.sachinmukherjee.spring_hibernate.service;

import java.util.List;

import com.sachinmukherjee.spring_hibernate.entity.EmployeeDetails;

public interface EmployeeService {
	
	public List<EmployeeDetails> getAllEmployees();
	
	public EmployeeDetails getEmployee(int id);
	
	public void addEmployee(EmployeeDetails employee);
	
	public void deleteEmployee(int id);
}
