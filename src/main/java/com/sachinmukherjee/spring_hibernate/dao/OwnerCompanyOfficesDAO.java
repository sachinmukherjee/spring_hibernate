package com.sachinmukherjee.spring_hibernate.dao;

import java.util.List;

import com.sachinmukherjee.spring_hibernate.entity.OwnerCompanyOffices;

public interface OwnerCompanyOfficesDAO {
	
	public List<OwnerCompanyOffices> getAllOffices();
	
	public void saveOffice(OwnerCompanyOffices ownerCompanyOffice);
	
	public OwnerCompanyOffices getOwnerCompanyOffices(int id);
	
	public void delete(OwnerCompanyOffices ownerCompanyOffice);
}
