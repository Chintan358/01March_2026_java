package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Product;

public class ProductDao {
	
	SessionFactory sf = null;
	public ProductDao() {
		
		sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
	}
	
	public int addProduct(Product p)
	{
		int i=0;
		try {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.persist(p);
			tx.commit();
			i=1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public ArrayList<Product> allProducts()
	{
		ArrayList<Product> al = new ArrayList();
		try {
			
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			al = (ArrayList<Product>) s.createQuery("from Product").list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	
	public int deleteProduct(int id)
	{
		int i = 0;
		try {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			Product p = s.load(Product.class, id);
			s.delete(p);
			tx.commit();
			i=1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public Product productById(int id)
	{
		Product p = new Product();
		try {
			
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			p = s.load(Product.class, id);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	public int updateProduct(Product p)
	{
		int i=0;
		try {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.merge(p);
			tx.commit();
			i=1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
}
