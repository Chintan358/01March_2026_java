package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Department;

public interface EmpService {

		public EmployeeDto create(EmployeeDto dto);
		public List<EmployeeDto> list();
		public List<EmployeeDto> empbyDept(DepartmentDto dept);
		public EmployeeDto retrive(int id);
		public void destroy(int id);
		public EmployeeDto update(EmployeeDto dto, int id);
		
}
