package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name = req.getParameter("name");
		Part image  = req.getPart("image");
		String image_name = System.currentTimeMillis()+"_"+Paths.get(image.getSubmittedFileName()).toString();
		

		
		String path = req.getServletContext().getRealPath("/")+File.separator+"image";
		
		File f = new File(path);
		if(!f.exists())
		{
			f.mkdir();
		}
		image.write(path+File.separator+image_name);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar","root","root");
	
			PreparedStatement ps = 
					cn.prepareStatement("insert into upload values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, name);
			ps.setString(3, image_name);
			
			int i = ps.executeUpdate();
			if(i>0)
			{
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
