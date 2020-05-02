package com.sachinmukherjee.spring_hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachinmukherjee.spring_hibernate.dao.OwnerCompanyDAO;
import com.sachinmukherjee.spring_hibernate.entity.OwnerCompany;
import com.sachinmukherjee.spring_hibernate.entity.OwnerCompanyOffices;

@Service
@Transactional
public class OwnerCompanyServiceImp implements OwnerCompanyService {
	
	@Autowired
	private OwnerCompanyDAO ownerCompanyDAO;
	
	public void addOwnerCompany(OwnerCompany ownerCompany) {
		ownerCompanyDAO.saveCompany(ownerCompany);

	}

	public OwnerCompany getOwnerCompany(int id) {
		return ownerCompanyDAO.getOwnerCompany(id);
	}

	public void deleteOwnerCompany(int id) {
		ownerCompanyDAO.deleteOwnerCompany(id);

	}
	
	public List<OwnerCompany> getAllOwnerCompanies(){
		return ownerCompanyDAO.getAllOwnerCompanies();
	}
	
}
