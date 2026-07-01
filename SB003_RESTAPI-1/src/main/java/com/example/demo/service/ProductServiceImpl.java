package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.util.ResourceNotFoundException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo repo;
	
	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public List<Product> list(int page, int size,String sortby, String sorttype) {
		
		Sort sort = sorttype.equals("asc")?Sort.by(sortby).ascending():Sort.by(sortby).descending();
		
		
		Pageable pageable = PageRequest.of(page, size,sort);
	    Page<Product> productPage = repo.findAll(pageable);

		return productPage.getContent();
	}

	@Override
	public Product retrive(int id) {
		Product p  = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "Id", id));
		return p;
	}

	@Override
	public Product update(Product product, int id) {
		Product p  = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "Id", id));
		p.setName(product.getName());
		p.setPrice(product.getPrice());
		p.setQty(product.getQty());
		p.setCategory(product.getCategory());
		
		return repo.save(p);
	}

	@Override
	public void delete(int id) {
	
		Product p  = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "Id", id));
		repo.delete(p);
	}

	@Override
	public List<Product> productByCategory(Category c) {
		
		return repo.findByCategory(c);
	}

}
