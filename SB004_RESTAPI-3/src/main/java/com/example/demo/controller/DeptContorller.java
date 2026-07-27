package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.service.DeptService;
import com.example.demo.util.APIResponse;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/depts")
@Tag(name = "Department API", description = "Operations related to Department")
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
	
	@GetMapping("/{id}")
	public ResponseEntity<DepartmentDto> retrive(@PathVariable("id") int id)
	{
		DepartmentDto dto = deptService.retrive(id);
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse> delete(@PathVariable("id") int id)
	{
		deptService.destroy(id);
		APIResponse resp = new APIResponse();
		resp.setMessage("Dept deleted");
		resp.setSuccess(true);
		return new ResponseEntity<>(resp,HttpStatus.OK);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<DepartmentDto> update(@RequestBody DepartmentDto dept, @PathVariable("id") int id)
	{
		DepartmentDto updated = deptService.update(dept,id);
		return new ResponseEntity<>(updated,HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
}
