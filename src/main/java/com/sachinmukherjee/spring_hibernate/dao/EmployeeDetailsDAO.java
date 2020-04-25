package com.sachinmukherjee.spring_hibernate.dao;

import java.util.List;

import com.sachinmukherjee.spring_hibernate.entity.EmployeeDetails;

public interface EmployeeDetailsDAO {
	
	public List<EmployeeDetails> getEmployees();
	
	public void add();
	
	public EmployeeDetails getEmploye(int id);
	
	public void saveEmployee(EmployeeDetails employee);
	
	public void deleteEmployee(EmployeeDetails employee);
}
