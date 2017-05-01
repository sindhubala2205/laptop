package com.niit.services;

import java.util.List;

import com.niit.model.User;

public interface UserServices {

	public void add(User user);

	public void update(User user);
	
	public User edit(int cid);

	public void delete(int cid);

	public User getUser(int cid);

	public List<User> getAllUser();

}