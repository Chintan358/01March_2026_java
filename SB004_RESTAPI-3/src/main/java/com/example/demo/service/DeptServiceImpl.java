package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepo;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	DepartmentRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public DepartmentDto create(DepartmentDto dept) {
		
		Department d = mapper.map(dept, Department.class);
		Department created  = repo.save(d);
		return mapper.map(created, DepartmentDto.class);
	}

	@Override
	public List<DepartmentDto> list() {
		
		List<Department> depts = repo.findAll();
//		List<DepartmentDto> dtos = new ArrayList<>();
//		for(Department dt : depts)
//		{
//			dtos.add(mapper.map(dt, DepartmentDto.class));
//		}
		
		List<DepartmentDto> dtos = 
				depts.stream().map(dept->{
					return mapper.map(dept, DepartmentDto.class);
				}).toList();
		
		
		return dtos;
	}

	@Override
	public DepartmentDto retrive(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DepartmentDto update(DepartmentDto dept, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
