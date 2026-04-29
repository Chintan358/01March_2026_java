package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("enter email : ");
		String email = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar","root","root");
			
			Statement st = cn.createStatement();
			
			PreparedStatement ps  =cn.prepareStatement("update student set name=?,email=? where id=?");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, id);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("data updated succsfully");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
