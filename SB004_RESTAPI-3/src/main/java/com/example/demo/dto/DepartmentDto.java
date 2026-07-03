package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DepartmentDto {
	
	private int id;
	
	@NotBlank(message = "Name is required !!!")
	private String name;
}
