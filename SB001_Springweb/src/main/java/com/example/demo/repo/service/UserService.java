package com.example.demo.repo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
		public void addOrUpdateUser(User user);
		public List<User> getUsers();
		public User getUser(int id);
		public void deleteUser(int id);
		
	
}
