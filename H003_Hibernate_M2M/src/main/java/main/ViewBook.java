package main;

import java.time.Period;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Author;
import model.Book;





public class ViewBook {
	public static void main(String[] args) {
			
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Author.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
	
		List<Author> authors = s.createQuery("from Author").list();
	
		for(Author a : authors)
		{
			System.out.println(a.getId()+" "+a.getName());
			for(Book b : a.getBooks())
			{
				System.out.println(b.getId()+" "+b.getName());
			}
		}
		
		
		
	}
}
