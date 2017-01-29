package com.niit.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.dao.ProductDao;
import com.niit.dao.UserDao;
import com.niit.model.Product;
import com.niit.model.User;




public class UserServicesImpl {
	@Autowired
    UserDao userDao;
	public int AddUser(User user) {
		
		return userDao.AddUser(user);

	}
	
	public List<User> DisplayUser() {
		return userDao.Display
				User();
	
	}

}
