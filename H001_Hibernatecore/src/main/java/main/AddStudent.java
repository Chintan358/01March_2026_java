package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class AddStudent {
	public static void main(String[] args) {
		
		
		Student st = new Student();
		st.setId(4);
		st.setName("Deepakk");
		st.setEmail("dipak@gmail.com");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		s.saveOrUpdate(st);
		
		tx.commit();
		
		
		
	}
}
