package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Service("ProductServices")
@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
public class ProductServicesImpl implements ProductServices {

	@Autowired
	ProductDao productDao;

	
	public void add(Product product) {
		productDao.add(product);
	}


	public void update(Product product) {
		productDao.update(product);
	}

	
	public Product edit(int productid) {
		return productDao.edit(productid);
	}
	
	
	public void delete(int productid) {
		productDao.delete(productid);

	}


	public Product getProduct(int productid) {
		return productDao.getProduct(productid);
	}

	public List<Product> list() {
		return productDao.list();
	}

}