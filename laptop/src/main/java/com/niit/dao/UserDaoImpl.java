package com.niit.dao;

import java.util.List;



import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;


import com.niit.model.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
		
		
	}
	public List<User> DisplayUser() {
		
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}
		
}