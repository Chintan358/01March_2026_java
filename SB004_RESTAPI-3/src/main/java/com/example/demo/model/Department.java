package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="dept")
@Data
public class Department {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		
		@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
		private List<Employee> emps;
}	
