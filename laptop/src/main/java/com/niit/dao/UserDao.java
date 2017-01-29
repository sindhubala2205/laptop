package com.niit.dao;
import java.util.List;

import com.niit.model.User;
public interface UserDao
{
	public  int AddUser(User user);
	
	
	public List<User> DisplayUser();
	

}
