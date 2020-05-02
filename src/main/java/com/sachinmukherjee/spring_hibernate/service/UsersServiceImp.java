package com.sachinmukherjee.spring_hibernate.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sachinmukherjee.spring_hibernate.dao.UsersDAO;
import com.sachinmukherjee.spring_hibernate.entity.Users;

@Service
@Transactional
public class UsersServiceImp implements UsersService {
	
	@Autowired
	private UsersDAO userDao;
	
	
	public void addUser(Users user) {
		userDao.saveUser(user);

	}

	public Users getUser(int id) {
		return userDao.getUser(id);

	}

	public void deleteUser(int id) {
		userDao.deleteUser(id);

	}

	public List<Users> getAllUsers() {
		return userDao.getUsers();
	}
	
	

}
