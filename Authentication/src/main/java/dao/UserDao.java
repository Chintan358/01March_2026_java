package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserDao {
			
	Connection cn  =null;
	public UserDao() {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int addUser(User u)
	{
		int i=0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("insert into reg values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, u.getUsername());
			ps.setString(3, u.getPassword());
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public boolean loginCheck(User u)
	{
			boolean b = false;
			try {
				PreparedStatement ps =
						cn.prepareStatement("select * from reg where username=? and password=?");
				ps.setString(1, u.getUsername());
				ps.setString(2, u.getPassword());
				
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					b = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return b;
	}
	
}
