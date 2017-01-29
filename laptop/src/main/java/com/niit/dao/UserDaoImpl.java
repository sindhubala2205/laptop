package com.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional

	public int AddUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = (Transaction)session.beginTransaction();
		session.saveOrUpdate(user);
		tx.commit();
		session.close();
		return 0;
	}

	public List<User> DisplayUser() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<User> userList = session.createQuery("User").list();
		return userList;
	}
	


}

