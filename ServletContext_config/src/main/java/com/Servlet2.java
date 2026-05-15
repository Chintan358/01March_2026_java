package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		pw.write("<h1>Servlet2 calling</h1>");
		ServletContext cx = req.getServletContext();
		String db =  cx.getInitParameter("DB");
		pw.write("<h2>DB : "+db+"</h2>");
		
		ServletConfig cf = getServletConfig();
		String path =  cf.getInitParameter("path");
		pw.write("<h2>path : "+path+"</h2>");
	}
}
