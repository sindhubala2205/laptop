package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

public class ProductServicesImpl {
	 @Autowired
	 ProductDao productDao;


	public int addProduct(Product product) {
		 return productDao.addProduct(product);
	}

	

	public List<Product> DisplayProduct(Product product) {
		return productDao.DisplayProduct();

	}

}
