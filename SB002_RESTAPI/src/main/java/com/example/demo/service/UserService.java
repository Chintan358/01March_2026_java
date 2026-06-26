package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
		public User create(User user);
		public List<User> list();
		public User retrive(int id);
		public void destroy(int id);
		public User update(User user, int id);
		
		
}
