package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

public class ProductServicesImpl {
	 @Autowired
	 ProductDao productDao;
	 
	 @Transactional
		public void addProduct(Product product) {
		 productDao.addProduct(product);
		     
	 }
	 @Transactional
	 public void deleteProduct(int pdId)
	 {   productDao.deleteProduct(pdId);
		
		 
	 }
	 @Transactional
	 public void updateProduct(Product product)
	 {
		  productDao.updateProduct(product);
	
	 }
	 
     @Transactional
	public List<Product> DisplayProduct() {
		return productDao.DisplayProduct();
	 }
	}
