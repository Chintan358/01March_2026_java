package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
		public void addOrUpdateStudent(Student st);
		public List<Student> getStudents();
		public Student getStudent(int id);
		public void deleteStudent(int id);
}
