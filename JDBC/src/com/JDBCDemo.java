package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCDemo {
	public static void main(String[] args) {
		
		Connection cn = null;
		try
		{
			//Load the driver :
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			// Define the Connection URL
			String url = "jdbc:mysql://localhost:3306/dhurandhar";
			String user = "root";
			String pass = "root";
			
			// Establish the Connection
			cn =  DriverManager.getConnection(url,user,pass);
			System.out.println("connection established");
			
			
			//  Create a Statement [statement, preparedst,  collablest]
			Statement st = cn.createStatement();
			
			// Execute a Query
			ResultSet rs =  st.executeQuery("select * from student");
			
			//:Processthe Result
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString("name");
				String email = rs.getString(3);
				
				System.out.println(id+" "+name+" "+email);
			}
			
			// Close the Connection
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
}
