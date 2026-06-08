package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class ViewStudents {
	public static void main(String[] args) {
		
		
	
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		List<Student> al =  s.createQuery("from Student").list();
		for(Student st : al)
		{
			System.out.println(st.getId()+" "+st.getName()+" "+st.getEmail());
		}
		
		
		tx.commit();
		
		
		
	}
}
