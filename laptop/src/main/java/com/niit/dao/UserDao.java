package com.niit.dao;
import java.util.List;

import com.niit.model.User;
public interface UserDao
{
	public  void addUser(User user);
	
	
	public List<User> DisplayUser();
	

}
