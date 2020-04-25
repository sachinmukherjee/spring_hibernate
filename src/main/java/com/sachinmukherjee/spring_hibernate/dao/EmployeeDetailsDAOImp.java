package com.sachinmukherjee.spring_hibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sachinmukherjee.spring_hibernate.entity.EmployeeDetails;

@Repository
public class EmployeeDetailsDAOImp implements EmployeeDetailsDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<EmployeeDetails> getEmployees() {
		Session session = sessionFactory.getCurrentSession();
		Query<EmployeeDetails> query = session.createQuery("from EmployeeDetails",EmployeeDetails.class);
		List<EmployeeDetails> employees = query.getResultList();
		System.out.println(employees);
		return employees;
	}

	public void add() {
		// TODO Auto-generated method stub

	}

	public EmployeeDetails getEmploye(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	public void saveEmployee(EmployeeDetails employee) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(employee);

	}

	public void deleteEmployee(EmployeeDetails employee) {
		// TODO Auto-generated method stub

	}

}
