package com.example.demo.controller;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import com.example.demo.util.APIResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@Autowired
    ModelMapper mapper;

	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> list()
	{
		List<Category> cat =service.list();
		List<CategoryDto> dtos = new ArrayList<>();
		for(Category c  :cat)
		{
			dtos.add(categoryToDto(c));
		}
		
		return new ResponseEntity<>(dtos,HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<CategoryDto> create(@Valid @RequestBody Category cat)
	{
		Category createdCategory = service.create(cat);
		CategoryDto dto = mapper.map(createdCategory, CategoryDto.class);
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoryDto> retrive(@PathVariable("id") int id)
	{
		Category cat =service.retrive(id);
		CategoryDto dto = categoryToDto(cat);
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CategoryDto> update(@RequestBody Category cat,@PathVariable("id") int id)
	{
		Category updatecat = service.update(cat, id);
		CategoryDto dto = categoryToDto(updatecat);
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse> delete(@PathVariable ("id") int id)
	{
	    service.delete(id);
	    APIResponse api=new APIResponse();
	    api.setMessage("category delete sucessfully");
	    api.setSuccess(true);
	    return new ResponseEntity<APIResponse>(api,HttpStatus.OK);
	}
	
	
	
	public  CategoryDto categoryToDto(Category category)
	{
		CategoryDto dto = new CategoryDto();
		dto.setId(category.getId());
		dto.setName(category.getName());
		
		//CategoryDto dto = mapper.map(category, CategoryDto.class);
		return dto;
	}
	
	
	
}
