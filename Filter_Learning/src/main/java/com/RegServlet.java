package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String uname = req.getParameter("username");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String pass = req.getParameter("password");
			
			PrintWriter pw = resp.getWriter();
			pw.write("<h1>Username  : "+uname+"</h1>");
			pw.write("<h1>Email  : "+email+"</h1>");
			pw.write("<h1>Phone  : "+phone+"</h1>");
			pw.write("<h1>Password  : "+pass+"</h1>");
			
			
		}
}	
