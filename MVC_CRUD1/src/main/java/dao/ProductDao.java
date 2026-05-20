package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Product;

public class ProductDao {
	
	Connection cn = null;
	public ProductDao() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int addProduct(Product p)
	{
		int i=0;
		try {
			PreparedStatement ps 
			 	= cn.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, p.getName());
			ps.setDouble(3, p.getPrice());
			ps.setInt(4, p.getQty());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public ArrayList<Product> allProducts()
	{
		ArrayList<Product> al = new ArrayList();
		return al;
	}
	
	public int deleteProduct(int id)
	{
		int i = 0;
		return i;
	}
	
	public Product productById(int id)
	{
		Product p = new Product();
		return p;
	}
	
	public int updateProduct(Product p)
	{
		int i=0;
		return i;
	}
	
	
}
