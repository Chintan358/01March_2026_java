package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Product p = new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQty(rs.getInt(4));
				al.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	
	public int deleteProduct(int id)
	{
		int i = 0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("delete from product where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public Product productById(int id)
	{
		Product p = new Product();
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from product where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQty(rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	public int updateProduct(Product p)
	{
		int i=0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("update product set name=?,price=?,qty=? where id=?");
			ps.setString(1, p.getName());
			ps.setDouble(2, p.getPrice());
			ps.setInt(3, p.getQty());
			ps.setInt(4, p.getId());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
}
