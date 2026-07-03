package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.service.DeptService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/depts")
public class DeptContorller {

	@Autowired
	DeptService deptService;
	
	@PostMapping("/")
	public ResponseEntity<DepartmentDto> create(@Valid @RequestBody DepartmentDto dto)
	{
		DepartmentDto createdDept = deptService.create(dto);
		return new ResponseEntity<>(createdDept,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<DepartmentDto>> list()
	{
		List<DepartmentDto> all = deptService.list();
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
}
