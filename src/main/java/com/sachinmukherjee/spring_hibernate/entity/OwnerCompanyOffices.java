package com.sachinmukherjee.spring_hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="owner_company_offices")
@NamedQuery(name = "OwnerCompanyOfficesLists",
			query = "from OwnerCompanyOffices where owner_company_id = :ownerCompanyId"
			)
public class OwnerCompanyOffices {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="location")
	private String location;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "owner_company_id")
	private OwnerCompany ownerCompany;
	
	@OneToMany(mappedBy = "ownerCompanyOffices", cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
	private List<Users> users;

	public OwnerCompanyOffices() {
		super();
	}

	public OwnerCompanyOffices(String name, String location) {
		this.name = name;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public OwnerCompany getOwnerCompany() {
		return ownerCompany;
	}

	public void setOwnerCompany(OwnerCompany ownerCompany) {
		this.ownerCompany = ownerCompany;
	}
	
	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "OwnerCompanyOffices [id=" + id + ", name=" + name + ", location=" + location +"]";
	}
	
	
	
	
}
