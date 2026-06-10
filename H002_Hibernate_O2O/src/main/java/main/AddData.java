package main;

import java.time.Period;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Passport;
import model.Person;



public class AddData {
	public static void main(String[] args) {
		
		
		
		
	
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Passport.class)
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		Person p =new Person();
		p.setName("Harshil");
		p.setEmail("Harshil@gmail.com");
		
		Passport p1 = new Passport();
		p1.setCountry("India");
		p1.setNumber("INP789");
		
		p.setPassport(p1);
		
		s.persist(p);
		
		tx.commit();
		
		
		
	}
}
