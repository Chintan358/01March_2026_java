package main;

import java.time.Period;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;




public class ViewData {
	public static void main(String[] args) {
		
		
		
		
	
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class) 
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		Category c = s.load(Category.class, 2);
		
		System.out.println(c.getId()+" "+c.getName());
		for(Product p : c.getProducts())
		{
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
		}
		
	
		
	}
}
