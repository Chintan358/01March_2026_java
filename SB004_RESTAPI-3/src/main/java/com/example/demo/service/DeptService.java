package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.model.Department;

public interface DeptService {

	
	public DepartmentDto create(DepartmentDto dept);
	public List<DepartmentDto> list();
	public DepartmentDto retrive(int id);
	public void destroy(int id);
	public DepartmentDto update(DepartmentDto dept, int id);
	
}
