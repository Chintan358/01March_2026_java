package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.util.ResourceNotFoundException;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public EmployeeDto create(EmployeeDto dto) {
		
		Employee e = mapper.map(dto, Employee.class);
		Employee created = repo.save(e);
		
		return mapper.map(created, EmployeeDto.class);
	}
	@Override
	public List<EmployeeDto> list() {
		
		List<Employee> emp = repo.findAll();
		List<EmployeeDto> dtos = 
				emp.stream().map(emps->{
					return mapper.map(emps, EmployeeDto.class);
				}).toList();
		return dtos;
	}

	@Override
	public List<EmployeeDto> empbyDept(DepartmentDto dept) {
		
		List<Employee> emp = repo.findByDept(mapper.map(dept, Department.class));
		List<EmployeeDto> dtos = 
				emp.stream().map(emps->{
					return mapper.map(emps, EmployeeDto.class);
				}).toList();
		return dtos;
	}

	@Override
	public EmployeeDto retrive(int id) {
		
		Employee e = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		
		return mapper.map(e, EmployeeDto.class);
	}

	@Override
	public void destroy(int id) {
		Employee e = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		repo.delete(e);
		
	}

	@Override
	public EmployeeDto update(EmployeeDto dto, int id) {
		
		Employee e = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		e.setName(dto.getName());
		e.setPhone(dto.getPhone());
		e.setDept(mapper.map(dto.getDept(), Department.class));
		
		
		
		return mapper.map(repo.save(e), EmployeeDto.class);
		
	}

}
