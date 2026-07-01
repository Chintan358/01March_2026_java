package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.util.ResourceNotFoundException;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo repo;
	
	@Override
	public Category create(Category cat) {
		// TODO Auto-generated method stub
		return repo.save(cat);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Category retrive(int id) {
		
		Category cat = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Category", "ID", id));
		return cat;
	}

	@Override
	public Category update(Category cat, int id) {
	
		Category cat1 = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Category", "ID", id));
		cat1.setName(cat.getName());
		return repo.save(cat1);
	}

	@Override
	public void delete(int id) {
		Category cat = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Category", "ID", id));
		repo.delete(cat);
		
	}

}
