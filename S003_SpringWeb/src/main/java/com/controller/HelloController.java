package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.StudentDao;
import com.model.Student;

@Controller
public class HelloController {
	
		@Autowired
		StudentDao dao;
	
		@RequestMapping("/")
		public String index(Model model)
		{
			Student st = new Student();
			model.addAttribute("student", st);
			model.addAttribute("students", dao.getStudents());
			return "index";
		}
		
//		@RequestMapping(value = "/addStudent",method = RequestMethod.POST)
		@PostMapping("/addStudent")
		public String register(@ModelAttribute("student") Student st)
		{
			dao.addOrUpdateStudent(st);
			return "redirect:/";
		}
		
		
		@GetMapping("/delete")
		public String delete(@RequestParam("id") int id)
		{
			dao.deleteStudent(id);
			return "redirect:/";
		}
		
		@GetMapping("/update")
		public String update(@RequestParam("id") int id,Model model)
		{
			Student st = dao.getStudent(id);
			model.addAttribute("student", st);
			model.addAttribute("students", dao.getStudents());
			return "index";
		}
}









