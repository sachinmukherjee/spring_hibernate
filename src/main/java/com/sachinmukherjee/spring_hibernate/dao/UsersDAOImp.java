package com.sachinmukherjee.spring_hibernate.dao;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sachinmukherjee.spring_hibernate.entity.Users;


@Repository
public class UsersDAOImp implements UsersDAO {
	
	//need to inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Users> getUsers() {
		
		//get the hibernate session
		Session session =  sessionFactory.getCurrentSession();
		//create a query 
		Query<Users> theQuery = 
					 session.createQuery("from Users", Users.class);
		//execute the query and get result set
		List<Users> users = theQuery.getResultList();
 		//return the result
		return users;
	}
	
	public Users getUser(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		Users user = session.get(Users.class, id);
		return user;
	}
	
	public void saveUser(Users user) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
	}
	
	public void deleteUser(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		Users user = session.get(Users.class, id);
		session.delete(user);
	}

}
