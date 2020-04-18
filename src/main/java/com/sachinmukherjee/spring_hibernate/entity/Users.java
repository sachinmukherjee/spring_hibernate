package com.sachinmukherjee.spring_hibernate.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	
	
	public Users() {
	}

	public Users(String username, String password, String userfullname) {
		this.username = username;
		this.password = password;
		this.userfullname = userfullname;
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

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", userfullname=" + userfullname + ", created_at="
				+ created_at + "]";
	}
	
	
}
