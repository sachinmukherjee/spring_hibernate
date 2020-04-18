package com.sachinmukherjee.spring_hibernate.dao;

import java.util.List;

import com.sachinmukherjee.spring_hibernate.entity.Users;
public interface UsersDAO {
	
	public List<Users> getUsers();
	
	public void add();
	
	public Users getUser(int id);
	
	public void saveUser(Users user);
	
	public void deleteUser(int id);
}
