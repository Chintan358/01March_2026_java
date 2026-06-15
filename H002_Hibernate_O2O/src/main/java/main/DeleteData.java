package main;

import java.time.Period;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Passport;
import model.Person;



public class DeleteData {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Passport.class)
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		

		Person p = s.get(Person.class, 1);
		
		
		s.delete(p);
		
		tx.commit();
		
	}
}
