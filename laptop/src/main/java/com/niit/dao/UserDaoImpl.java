package com.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.User;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void add(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(user);
		tx.commit();
		session.close();

	}

	
	public void update(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
		session.close();
	}


	public User edit(int cid) {
		Session session = this.sessionFactory.openSession();
		User user = (User) session.load(User.class, cid);
		session.close();
		return user;
	}

	
	public void delete(int cid) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(edit(cid));
		tx.commit();
		session.close();
	}

	
	public User getUser(int cid) {
		Session session = this.sessionFactory.openSession();
		User user = (User) session.load(User.class, cid);
		return user;
	}

	@SuppressWarnings("unchecked")
	
	public List<User> getAllUser() {
		Session session = this.sessionFactory.openSession();
		List<User> userList = session.createQuery("from User").list();
		session.close();
		return userList;
	}

}