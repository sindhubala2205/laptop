package com.niit.dao;

import java.io.Serializable;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired(required=false)
	SessionFactory sessionFactory;

	@Override
	@Transactional


	public int addProduct(Product product) {
		 Session session = sessionFactory.openSession();
		  Transaction tx = (Transaction)session.beginTransaction();
		  session.saveOrUpdate(product);
		  tx.commit();
		  Serializable id = session.getIdentifier(product);
		  session.close();
		  return (Integer) id;
	
		// TODO Auto-generated method stub

	}

	public int deleteProduct(int id) {
	 Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  Product product = (Product) session.load(Product.class, id);
	  session.delete(product);
	  tx.commit();
	  Serializable ids = session.getIdentifier(product);
	  session.close();
	  return (Integer) ids;
	 }
	

	public List<Product> DisplayProduct() {
		Session session = sessionFactory.openSession();
		  @SuppressWarnings("unchecked")
		  List productList = session.createQuery("from Product")
		    .list();
		  session.close();
		  return productList;

	}
public Product getProductById(int id){
	Session session = sessionFactory.openSession();
	  Product product = (Product) session.load(Product.class, id);
	  return product;
}


@Override
public int updateProduct(Product product) {
	 Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(product);
	  tx.commit();
	  Serializable id = session.getIdentifier(product);
	  session.close();
	  return (Integer) id;
}

}
