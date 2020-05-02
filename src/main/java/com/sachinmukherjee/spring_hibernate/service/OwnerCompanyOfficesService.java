package com.sachinmukherjee.spring_hibernate.service;

import java.util.List;

import com.sachinmukherjee.spring_hibernate.entity.OwnerCompanyOffices;

public interface OwnerCompanyOfficesService {
	
	public void addOwnerCompanyOffice(OwnerCompanyOffices ownerCompanyOffice);
	
	public OwnerCompanyOffices getOwnerCompanyOffice(int id);
	
	public void delete(int id);
	
	public List<OwnerCompanyOffices> getAllOwnerCompanyOffices();
	
	public List<OwnerCompanyOffices> getAllOfficesOfOwnerCompanies(int ownerCompanyId);
}
