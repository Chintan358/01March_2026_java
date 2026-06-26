package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.util.APIResponse;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public ResponseEntity list()
	{
		List<User> users = service.list();
		return new ResponseEntity(users,HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> create(@Valid @RequestBody User user)
	{
		//System.out.println(user.getName()+" "+user.getEmail()+" "+user.getPhone());
		User createUser = service.create(user);
		return new ResponseEntity<>(createUser,HttpStatus.CREATED);	
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> retrive(@PathVariable("id") int id)
	{
		User user = service.retrive(id);
		return new ResponseEntity<>(user,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<APIResponse> destroy(@PathVariable("id") int id)
	{
		service.destroy(id);
		APIResponse api = new APIResponse();
		api.setMessage("User Deleted Successfully");
		api.setSuccess(true);
		return new ResponseEntity<APIResponse>(api,HttpStatus.OK);
	}
	@PutMapping("/users/{id}")
	public ResponseEntity<User> update(@RequestBody User user, @PathVariable("id") int id)
	{
		User updateUser = service.update(user, id);
		return new ResponseEntity<>(updateUser,HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
	
	

}
