package com.niit.dao;
import java.util.List;

import com.niit.model.Product;

public interface ProductDao 
{
public void addProduct(Product product);
public Product getProduct(int pdId);
public void deleteProduct(int pdId);
public void updateProduct(Product product);
public List<Product> DisplayProduct();

}
