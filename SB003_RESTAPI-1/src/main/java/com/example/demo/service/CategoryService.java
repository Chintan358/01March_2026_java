package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {

	
		public Category create(Category cat);
		public List<Category> list();
		public Category retrive(int id);
		public Category update(Category cat, int id);
		public void delete(int id);
		
	
}
