package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.DeptService;
import com.example.demo.service.EmpService;
import com.example.demo.util.APIResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emps")
public class EmpController {

	@Autowired
	DeptService deptService;
	
	@Autowired
	EmpService empService;
	
	@PostMapping("/dept/{id}")
	public ResponseEntity<EmployeeDto> create(@Valid @RequestBody EmployeeDto dto,@PathVariable("id") int id)
	{
		dto.setDept(deptService.retrive(id));
		EmployeeDto createdDept = empService.create(dto);
		return new ResponseEntity<>(createdDept,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<EmployeeDto>> list()
	{
		List<EmployeeDto> all = empService.list();
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
	@GetMapping("/dept/{id}")
	public ResponseEntity<List<EmployeeDto>> empbydept(@PathVariable("id") int id)
	{
		DepartmentDto dt = deptService.retrive(id);
		List<EmployeeDto> all = empService.empbyDept(dt);
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDto> retrive(@PathVariable("id") int id)
	{
		EmployeeDto dto = empService.retrive(id);
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse> delete(@PathVariable("id") int id)
	{
		empService.destroy(id);
		APIResponse resp = new APIResponse();
		resp.setMessage("Emp deleted");
		resp.setSuccess(true);
		return new ResponseEntity<>(resp,HttpStatus.OK);
	}
	
	
	@PutMapping("/{id}/dept/{did}")
	public ResponseEntity<EmployeeDto> update(@RequestBody EmployeeDto dept, @PathVariable("id") int id,@PathVariable("did") int did)
	{
		dept.setDept(deptService.retrive(did));
		EmployeeDto updated = empService.update(dept,id);
		return new ResponseEntity<>(updated,HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
}
