package com.online.onlinemarketbackend.dao;

import java.util.List;

import com.online.onlinemarketbackend.dto.Product;

public interface ProductDAO {
	
	Product get(int productID);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);

	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryID);
	List<Product> getLatestActiveProducts(int count);
	
}
