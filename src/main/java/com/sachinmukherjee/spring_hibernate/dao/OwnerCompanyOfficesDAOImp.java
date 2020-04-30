package com.sachinmukherjee.spring_hibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sachinmukherjee.spring_hibernate.entity.OwnerCompanyOffices;

@Repository
public class OwnerCompanyOfficesDAOImp implements OwnerCompanyOfficesDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public List<OwnerCompanyOffices> getAllOffices() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	public void saveOffice(OwnerCompanyOffices ownerCompanyOffice) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(ownerCompanyOffice);

	}

	public OwnerCompanyOffices getOwnerCompanyOffices(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(OwnerCompanyOffices ownerCompanyOffice) {
		// TODO Auto-generated method stub

	}

}
