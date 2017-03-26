
package com.niit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void  addProduct(Product product) {
		 sessionFactory.getCurrentSession().save(product);
		
		 
	}

	public void deleteProduct(int pdId) {
		sessionFactory.getCurrentSession().delete(getProduct(pdId));
	}

	public Product getProduct(int pdId)
	{
	return (Product) sessionFactory.getCurrentSession().get(Product.class, pdId);
	}



	public void  updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		

	}

	public List<Product> DisplayProduct() {
		return null;
		 
	}

	


}
