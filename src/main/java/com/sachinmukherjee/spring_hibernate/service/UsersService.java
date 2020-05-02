package com.sachinmukherjee.spring_hibernate.service;

import java.util.List;

import com.sachinmukherjee.spring_hibernate.entity.Users;

public interface UsersService {
	
	public void addUser(Users user);
	
	public Users getUser(int id);
	
	public void deleteUser(int id);
	
	public List<Users> getAllUsers();
}
