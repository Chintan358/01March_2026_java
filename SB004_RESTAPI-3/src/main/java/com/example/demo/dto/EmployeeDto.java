package com.example.demo.dto;

import com.example.demo.model.Department;

import lombok.Data;

@Data
public class EmployeeDto {
		
	
	
	private int id;
	private String name;
	private String phone;
	private DepartmentDto dept;
	private String image;
}
