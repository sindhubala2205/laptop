package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

@Service("UserServices")
@Transactional(propagation=Propagation.SUPPORTS, rollbackFor=Exception.class)
public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao userDao;


	public void add(User user) {
		userDao.add(user);
	}

	
	public void update(User user) {
		userDao.update(user);
	}


	public User edit(int cid) {
		return userDao.edit(cid);
	}

	
	public void delete(int cid) {
		userDao.delete(cid);
	}

	
	public User getUser(int cid) {
		return userDao.getUser(cid);
	}


	public List<User> getAllUser() {
		return userDao.getAllUser();

	}

}