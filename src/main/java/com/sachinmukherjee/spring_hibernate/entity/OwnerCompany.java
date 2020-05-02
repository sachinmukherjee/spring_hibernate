package com.sachinmukherjee.spring_hibernate.entity;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "owner_company")
public class OwnerCompany {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "short_name")
	private String short_name;
	
	@OneToMany(mappedBy = "owner_company",fetch = FetchType.LAZY)
	private Set<Users>  users;
	
	@OneToMany(mappedBy = "ownerCompany", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<OwnerCompanyOffices> ownerCompanyOffices;
	
	public OwnerCompany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OwnerCompany(String name, String short_name) {
		this.name = name;
		this.short_name = short_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}
	
	public List<OwnerCompanyOffices> getOwnerCompanyOffices() {
		return ownerCompanyOffices;
	}

	public void setOwnerCompanyOffices(List<OwnerCompanyOffices> ownerCompanyOffices) {
		this.ownerCompanyOffices = ownerCompanyOffices;
	}

	@Override
	public String toString() {
		return "OwnerCompany [id=" + id + ", name=" + name + ", short_name=" + short_name +"]";
	}
	
	public void addOwnerCompanyOffices(OwnerCompanyOffices ownerCompanyOffice) {
		if(ownerCompanyOffices == null) {
			ownerCompanyOffices = new ArrayList<OwnerCompanyOffices>();
		}
		
		ownerCompanyOffices.add(ownerCompanyOffice);
		ownerCompanyOffice.setOwnerCompany(this);
	}
	
	

}
