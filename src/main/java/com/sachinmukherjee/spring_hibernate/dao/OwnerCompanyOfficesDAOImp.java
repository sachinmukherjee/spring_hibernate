package com.sachinmukherjee.spring_hibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sachinmukherjee.spring_hibernate.entity.OwnerCompanyOffices;

@Repository
public class OwnerCompanyOfficesDAOImp implements OwnerCompanyOfficesDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<OwnerCompanyOffices> getAllOffices() {
		Session session = sessionFactory.getCurrentSession();
		Query<OwnerCompanyOffices> offices = session.createQuery("from OwnerCompanyOffices");
		List<OwnerCompanyOffices> ownerCompanyOffices = offices.getResultList();
		return ownerCompanyOffices;
	}
	
	public void saveOffice(OwnerCompanyOffices ownerCompanyOffice) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(ownerCompanyOffice);

	}

	public OwnerCompanyOffices getOwnerCompanyOffices(int id) {
		Session session = sessionFactory.getCurrentSession();
		OwnerCompanyOffices ownerCompanyOffices = session.get(OwnerCompanyOffices.class, id);
		return ownerCompanyOffices;
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		OwnerCompanyOffices ownerCompanyOffices = session.get(OwnerCompanyOffices.class, id);
		session.delete(ownerCompanyOffices);
	}

	public List<OwnerCompanyOffices> getOwnerCompanyOfficesList(int ownerCompanyId) {
		Session session = sessionFactory.getCurrentSession();
		Query<OwnerCompanyOffices> query = session.createNamedQuery("OwnerCompanyOfficesLists", OwnerCompanyOffices.class);
		query.setParameter("ownerCompanyId", ownerCompanyId);
		List<OwnerCompanyOffices> ownerCompanyOffices = query.getResultList();
		return ownerCompanyOffices;
	}
																																													
}
