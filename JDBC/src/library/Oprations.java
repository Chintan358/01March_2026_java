package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Oprations {
	Connection cn = null;

	public Oprations() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar", "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Scanner sc = new Scanner(System.in);

	public void addBook() {
		System.out.println("Enter book name : ");
		String name = sc.next();
		

		try {
			if (isExsit(name)) {
				System.out.println("Book already exist !!!");
			} else {
				
				System.out.println("Enter book price : ");
				double price = sc.nextDouble();
				System.out.println("Enter Book qty : ");
				int qty = sc.nextInt();
				PreparedStatement ps = cn.prepareStatement("insert into library values(?,?,?,?)");

				ps.setInt(1, 0);
				ps.setString(2, name);
				ps.setDouble(3, price);
				ps.setInt(4, qty);

				int i = ps.executeUpdate();
				if (i > 0) {
					System.out.println("Book added succssfully.");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void viewBook() {
		try {
			PreparedStatement ps = cn.prepareStatement("select * from library");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteBook()
	{
		System.out.println("Enter book name : ");
		String name = sc.next();
		if(isExsit(name))
		{
			try {
				PreparedStatement ps =
						cn.prepareStatement("delete from library where name=?");
				ps.setString(1, name);
				int i = ps.executeUpdate();
				if(i>0)
				{
					System.out.println("Book is deleted !!!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("Book not found !!!");
		}
	}

	public void issueBook() {
		
		System.out.println("Enter book name : ");
		String name = sc.next();
		
		if(isExsit(name))
		{
			PreparedStatement ps;
			try {
				ps = cn.prepareStatement("select * from library where name=?");
				ps.setString(1, name);
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					int qty = rs.getInt(4);
					if(qty>=1)
					{
						qty--;
						PreparedStatement ps1 = 
								cn.prepareStatement("update library set qty=? where name=?");
						ps1.setInt(1, qty);
						ps1.setString(2, name);
						
						int i = ps1.executeUpdate();
						if(i>0)
						{
							System.out.println("Book issued !!!");
						}
						
					}
					else
					{
						System.out.println("Book currently not availble !!!");
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		else
		{
			System.out.println("book not found !!!");
		}
	}

	public boolean isExsit(String name) {
		boolean b = false;
		try {
			PreparedStatement ps = cn.prepareStatement("select * from library where name=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				b = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
