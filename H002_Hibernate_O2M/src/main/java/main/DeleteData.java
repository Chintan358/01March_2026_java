package main;

import java.time.Period;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;





public class DeleteData {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		

		Category p = s.load(Category.class, 1);
		
		
		s.delete(p);
		
		tx.commit();
		
	}
}
