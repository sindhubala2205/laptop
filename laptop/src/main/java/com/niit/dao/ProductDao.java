package com.niit.dao;
import java.util.List;

import com.niit.model.Product;

public interface ProductDao 
{
public int addProduct(Product product);
public Product getProductById(int id);
public int deleteProduct(int id);
public int updateProduct(Product product);
public List<Product> DisplayProduct();

}
