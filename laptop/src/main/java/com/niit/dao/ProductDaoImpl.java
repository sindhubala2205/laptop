
package com.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Product;

@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void add(Product product) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(product);
		tx.commit();
		session.close();

	}

	
	public void update(Product product) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();
		session.close();
	}

	
	public Product edit(int productid) {
		Session session = this.sessionFactory.openSession();
		Product product = (Product) session.load(Product.class, productid);
		session.close();
		return product;
	}

	
	public void delete(int productid) {

		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(edit(productid));
		tx.commit();
		session.close();

	}

	
	public Product getProduct(int productid) {
		Session session = this.sessionFactory.openSession();
		Product product = (Product) session.load(Product.class, productid);
		return product;

	}

	@SuppressWarnings("unchecked")
	
	public List<Product> list() {
		Session session = this.sessionFactory.openSession();
		List<Product> productList = session.createQuery("from Product").list();
		session.close();
		return productList;
	}

}