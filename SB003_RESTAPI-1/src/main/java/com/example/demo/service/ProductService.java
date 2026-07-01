package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;
import com.example.demo.model.Product;

public interface ProductService {

	public Product create(Product product);
	public List<Product> list(int page, int size,String sortby, String sorttype);
	public Product retrive(int id);
	public Product update(Product product, int id);
	public void delete(int id);
	public List<Product> productByCategory(Category c);
}
