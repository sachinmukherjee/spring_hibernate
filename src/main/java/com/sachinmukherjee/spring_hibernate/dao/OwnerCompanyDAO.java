package com.sachinmukherjee.spring_hibernate.dao;

import java.util.List;

import com.sachinmukherjee.spring_hibernate.entity.OwnerCompany;

public interface OwnerCompanyDAO {
	
	public List<OwnerCompany> getAllOwnerCompanies();
	
	public void saveCompany(OwnerCompany owner_company);
	
	public OwnerCompany getOwnerCompany(int id);
	
	public void deleteOwnerCompany(int id);
	
}
