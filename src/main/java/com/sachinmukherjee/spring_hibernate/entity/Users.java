package com.sachinmukherjee.spring_hibernate.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username",unique = true)
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="userfullname")
	private String userfullname;
	
	@Column(name = "created_at")
	private Timestamp created_at;

	@OneToOne(mappedBy = "user",
			cascade = CascadeType.REMOVE
			)
	private EmployeeDetails employee;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "owner_company_id")
	private OwnerCompany owner_company;
	
	public Users() {
	}

	public Users(String username, String password, String userfullname,OwnerCompany owner_company) {
		this.username = username;
		this.password = password;
		this.userfullname = userfullname;
		this.owner_company = owner_company;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public String getUserfullname() {
		return userfullname;
	}

	public void setUserfullname(String userfullname) {
		this.userfullname = userfullname;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public int getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public EmployeeDetails getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDetails employee) {
		this.employee = employee;
	}
	
	public OwnerCompany getOwner_company() {
		return owner_company;
	}

	public void setOwner_company(OwnerCompany owner_company) {
		this.owner_company = owner_company;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", userfullname=" + userfullname + ", created_at="
				+ created_at + "]";
	}
	
	
}
