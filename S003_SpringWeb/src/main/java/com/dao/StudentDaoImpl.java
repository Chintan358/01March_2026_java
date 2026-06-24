package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public void addOrUpdateStudent(Student st) {
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		s.merge(st);
		tx.commit();
		
	}

	@Override
	public List<Student> getStudents() {
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		return s.createQuery("from Student").list();
	}

	@Override
	public Student getStudent(int id) {
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		return s.load(Student.class, id);
	}

	@Override
	public void deleteStudent(int id) {
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		Student st = s.load(Student.class, id);
		s.delete(st);
		tx.commit();
	}

}
