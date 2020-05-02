package com.sachinmukherjee.spring_hibernate.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sachinmukherjee.spring_hibernate.entity.OwnerCompany;
import com.sachinmukherjee.spring_hibernate.entity.OwnerCompanyOffices;

import org.hibernate.Session;

@Repository
public class OwnerCompanyDAOImp implements OwnerCompanyDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<OwnerCompany> getAllOwnerCompanies() {
		Session session = sessionFactory.getCurrentSession();
		Query<OwnerCompany> ownerCompaniesQuery = 
							session.createQuery("from OwnerCompany", OwnerCompany.class);
		List<OwnerCompany> ownerCompany = ownerCompaniesQuery.getResultList();
		return ownerCompany;
	}
	
	public void saveCompany(OwnerCompany owner_company) {
		Session session = sessionFactory.getCurrentSession();
		List<OwnerCompanyOffices> ownerCompanyOffices = owner_company.getOwnerCompanyOffices();
		Iterator<OwnerCompanyOffices> offices = ownerCompanyOffices.iterator();
		while(offices.hasNext()) {
			OwnerCompanyOffices ownerCompanyOffice = offices.next();
			ownerCompanyOffice.setOwnerCompany(owner_company);
		}
		session.saveOrUpdate(owner_company);
	}
	
	public OwnerCompany getOwnerCompany(int id) {
		Session session = sessionFactory.getCurrentSession();
		OwnerCompany ownerCompany = session.get(OwnerCompany.class,id);
		return ownerCompany;
	}
	
	public void deleteOwnerCompany(int id) {
		Session session = sessionFactory.getCurrentSession();
		OwnerCompany owner_company = session.get(OwnerCompany.class,id);
		session.delete(owner_company);

	}

}
