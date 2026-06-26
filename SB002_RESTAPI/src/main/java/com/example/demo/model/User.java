package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min = 1)
	private String name;
	
	@NotBlank(message = "Email cannot be empty")
	private String email;
	
	@NotBlank(message = "Phone cannot be empty")
	private String phone;
}
