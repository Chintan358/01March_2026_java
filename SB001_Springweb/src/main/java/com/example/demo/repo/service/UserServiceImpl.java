package com.example.demo.repo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public void addOrUpdateUser(User user) {
		repo.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User getUser(int id) {
		
		User user =  repo.findById(id).orElseThrow();
		return user;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
