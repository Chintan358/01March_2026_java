package main;

import java.time.Period;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;




public class AddData {
	public static void main(String[] args) {
		
		
		
		
	
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
//		Category c = new Category();
//		c.setName("Cloths");
//		
//		
//		Product p1 = new Product();
//		p1.setName("Shirt");
//		p1.setPrice(500);
//		p1.setCategory(c);
//		
//		Product p2 = new Product();
//		p2.setName("Tshirt");
//		p2.setPrice(400);
//		p2.setCategory(c);
		
		
		
		Category c = s.load(Category.class, 1);
		
		
		
		Product p1 = new Product();
		p1.setName("AC");
		p1.setPrice(50000);
		p1.setCategory(c);
		
	
		
		
		
		s.persist(p1);
		
		
		tx.commit();
		
		
		
	}
}
