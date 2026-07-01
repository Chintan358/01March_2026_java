package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import com.example.demo.util.APIResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class Productcontroller {
	
	@Autowired
	ProductService service;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ModelMapper mapper;
	
	@PostMapping("/category/{id}")
	public ResponseEntity<ProductDto> create(@Valid @RequestBody Product p,@PathVariable("id") int id)
	{
		Category c = categoryService.retrive(id);
		p.setCategory(c);
		Product createdProduct = service.create(p);
		ProductDto dto = productToDto(createdProduct);
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<ProductDto>> list(
			@RequestParam(defaultValue = "0",name = "page") int page,
			@RequestParam(defaultValue = "5" ,name="size") int size,
			@RequestParam(defaultValue = "name",name = "sortby") String sortby,
			@RequestParam(defaultValue = "asc" ,name="sorttype") String  sorttype
			)
	{
		List<Product> products = service.list(page,size,sortby,sorttype);
		List<ProductDto> dtos = new ArrayList<>();
		for(Product pro : products)
		{
			dtos.add(productToDto(pro));
		}
		
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> retrive(@PathVariable int id)
	{
			Product p = service.retrive(id);
			ProductDto dto = productToDto(p);
			
			return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse> destroy(@PathVariable("id") int id)
	{
		service.delete(id);
		APIResponse resp = new APIResponse();
		resp.setMessage("Product deleted");
		resp.setSuccess(true);
		
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@PutMapping("/{pid}/category/{cid}")
	public ResponseEntity<ProductDto> update(@RequestBody Product p,@PathVariable("pid") int pid, @PathVariable("cid") int cid)
	{
		Category c = categoryService.retrive(cid);
		p.setCategory(c);
		Product updatedProduct = service.update(p,pid);
		ProductDto dto = productToDto(updatedProduct);
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
	}
	
	@GetMapping("/category/{id}")
	public ResponseEntity<List<ProductDto>> productbycat(@PathVariable("id") int id)
	{
		Category c = categoryService.retrive(id);
		List<Product> products = service.productByCategory(c);
		List<ProductDto> dtos = new ArrayList<>();
		for(Product pro : products)
		{
			dtos.add(productToDto(pro));
		}
		
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	
	
	public ProductDto productToDto(Product p)
	{
//		ProductDto dto = new ProductDto();
//		dto.setId(p.getId());
//		dto.setName(p.getName());
//		dto.setPrice(p.getPrice());
//		dto.setQty(p.getQty());
//		dto.setCategory(CategoryController.categoryToDto(p.getCategory()));
		
		ProductDto dto = mapper.map(p, ProductDto.class);
		return dto;
	}
	
	

}
