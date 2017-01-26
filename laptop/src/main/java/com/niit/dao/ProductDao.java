package com.niit.dao;
import java.util.List;

import com.niit.model.Product;

public interface ProductDao 
{
public void addProduct();
public void deleteProduct();
public void updateProduct();
public List<Product> DisplayProduct();

}
