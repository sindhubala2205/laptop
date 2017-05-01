package com.niit.services;

import java.util.List;

import com.niit.model.Product;

public interface ProductServices {
	public void add(Product product);

	public void update(Product product);

	public Product edit(int productid);
	
	public void delete(int productid);

	public Product getProduct(int productid);

	public List<Product> list();

}