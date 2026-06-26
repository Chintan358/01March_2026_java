package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.util.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public User create(User user) {
		
		return repo.save(user);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User retrive(int id) {
		
		User user = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		return user;
	}

	@Override
	public void destroy(int id) {
		User user = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		repo.delete(user);
		
	}

	@Override
	public User update(User user, int id) {
		
		User u = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		u.setName(user.getName());
		u.setEmail(user.getEmail());
		u.setPhone(user.getPhone());
		return repo.save(u);
	}

}
