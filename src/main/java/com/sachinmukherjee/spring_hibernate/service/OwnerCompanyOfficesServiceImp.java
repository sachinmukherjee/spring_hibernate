package com.sachinmukherjee.spring_hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachinmukherjee.spring_hibernate.dao.OwnerCompanyOfficesDAO;
import com.sachinmukherjee.spring_hibernate.entity.OwnerCompanyOffices;

@Service
@Transactional
public class OwnerCompanyOfficesServiceImp implements OwnerCompanyOfficesService {
	
	@Autowired
	private OwnerCompanyOfficesDAO ownerCompanyOfficesDAO;
	
	public void addOwnerCompanyOffice(OwnerCompanyOffices ownerCompanyOffice) {
		ownerCompanyOfficesDAO.saveOffice(ownerCompanyOffice);
	}

	public OwnerCompanyOffices getOwnerCompanyOffice(int id) {
		return ownerCompanyOfficesDAO.getOwnerCompanyOffices(id);
	}

	public void delete(int id) {
		ownerCompanyOfficesDAO.delete(id);

	}

	public List<OwnerCompanyOffices> getAllOwnerCompanyOffices() {
		return ownerCompanyOfficesDAO.getAllOffices();
	}
	
	public List<OwnerCompanyOffices> getAllOfficesOfOwnerCompanies(int ownerCompanyId){
		return ownerCompanyOfficesDAO.getOwnerCompanyOfficesList(ownerCompanyId);
	}

}
