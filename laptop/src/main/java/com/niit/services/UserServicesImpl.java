package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.dao.UserDao;
import com.niit.model.Product;
import com.niit.model.User;

public class UserServicesImpl {
	 @Autowired
	 UserDao userDao;
	 
	 @Transactional
	public void addUser(User user) {
		
		
		 userDao.addUser(user);
		 }
	
@Transactional
	public List<User> DisplayUser() {
		return userDao.DisplayUser();
		
	}

}
