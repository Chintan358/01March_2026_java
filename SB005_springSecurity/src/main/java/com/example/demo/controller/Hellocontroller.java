package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hellocontroller {
	
	
	    @GetMapping("/loginpage")
	    public String login() {
	        return "login";
	    }

	    @GetMapping("/home")
	    public String home() {
	        return "home";
	    }
	
	
//		@GetMapping("/")
//		public String index()
//		{
//			return "Index page";
//		}
//		
//		@GetMapping("/home")
//		public String home()
//		{
//			return "Home page";
//		}
//
		@GetMapping("/admin")
		public String admin()
		{
			return "admin";
		}
		
		@GetMapping("/user")
		public String user()
		{
			return "user";
		}

}
