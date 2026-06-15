package main;

import java.time.Period;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Author;
import model.Book;





public class AddData {
	public static void main(String[] args) {
			
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Author.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Author a1 = new Author();
		a1.setName("Rahul");
		
		Author a2 = s.load(Author.class, 1);
		
		Book b = new Book();
		b.setName("C++");
		b.addAuthor(a1);
		b.addAuthor(a2);
		
		
		
		s.persist(b);
		
		
		tx.commit();
		
		
		
	}
}
