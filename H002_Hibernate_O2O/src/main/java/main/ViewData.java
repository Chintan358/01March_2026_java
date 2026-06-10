package main;

import java.time.Period;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Passport;
import model.Person;



public class ViewData {
	public static void main(String[] args) {
		
		
		
		
	
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Passport.class)
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
//		List<Person> persons = s.createQuery("from Person").list();
//		for(Person p : persons)
//		{
//			System.out.println(p.getId()+" "+p.getName()+" "+p.getEmail()+" "+p.getPassport().getCountry()+" "+p.getPassport().getNumber());
//		}
		
		Person p = s.get(Person.class, 10);
		
			System.out.println(p.getId()+" "+p.getName()+" "+p.getEmail()+" "+p.getPassport().getCountry()+" "+p.getPassport().getNumber());
		
		
	}
}
