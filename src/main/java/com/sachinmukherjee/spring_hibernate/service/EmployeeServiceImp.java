package com.sachinmukherjee.spring_hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachinmukherjee.spring_hibernate.dao.EmployeeDetailsDAO;
import com.sachinmukherjee.spring_hibernate.entity.EmployeeDetails;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeDetailsDAO employeeDao;
	
	@Override
	public List<EmployeeDetails> getAllEmployees() {
		return employeeDao.getEmployees();
	}

	@Override
	public EmployeeDetails getEmployee(int id) {
		return employeeDao.getEmploye(id);
	}

	@Override
	public void addEmployee(EmployeeDetails employee) {
		employeeDao.saveEmployee(employee);

	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);

	}

}
