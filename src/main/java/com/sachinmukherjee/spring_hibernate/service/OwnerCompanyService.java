package com.sachinmukherjee.spring_hibernate.service;

import java.util.List;

import com.sachinmukherjee.spring_hibernate.entity.OwnerCompany;

public interface OwnerCompanyService {
	
	public void addOwnerCompany(OwnerCompany ownerCompany);
	
	public OwnerCompany getOwnerCompany(int id);
	
	public void deleteOwnerCompany(int id);
	
	public List<OwnerCompany> getAllOwnerCompanies();
}
