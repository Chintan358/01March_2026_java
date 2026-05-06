package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	
	
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String uname = req.getParameter("uname");
			String email = req.getParameter("email");
			int age = Integer.parseInt(req.getParameter("age"));
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar","root","root");
			
				PreparedStatement ps = cn.prepareStatement("insert into student values(?,?,?,?)");
				ps.setInt(1, 0);
				ps.setString(2, uname);
				ps.setString(3, email);
				ps.setInt(4, age);
				
				int i = ps.executeUpdate();
				if(i>0)
				{
					System.out.println("Data inserted");
				}
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}
