package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.repo.service.UserService;


@Controller
public class UserController {

		@Autowired
		UserService service;
	
		@RequestMapping("/")
		public String index(Model model)
		{
			User u = new User(); 
			model.addAttribute("user", u);
			model.addAttribute("users", service.getUsers());
			return "index";
		}
		
//		@RequestMapping(value = "/addStudent",method = RequestMethod.POST)
		@PostMapping("/addUser")
		public String register(@ModelAttribute("user") User u)
		{
			service.addOrUpdateUser(u);
			return "redirect:/";
		}
		
		
		@GetMapping("/delete")
		public String delete(@RequestParam("id") int id)
		{
			service.deleteUser(id);
			return "redirect:/";
		}
		
		@GetMapping("/update")
		public String update(@RequestParam("id") int id,Model model)
		{
			User u = service.getUser(id);
			model.addAttribute("user", u);
			model.addAttribute("users", service.getUsers());
			return "index";
		}
		
		
}
