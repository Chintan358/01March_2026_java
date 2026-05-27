package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class RegFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		
		
		String uname = req.getParameter("username");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String pass = req.getParameter("password");
		String cpass = req.getParameter("confirm_password");
		
		RequestDispatcher rd = req.getRequestDispatcher("reg.jsp");
		
		if(uname=="" || uname==null)
		{
			req.setAttribute("unameErr", "Username Required !!!");
			rd.forward(req, resp);
		}
		
		if(email=="" || email==null)
		{
			req.setAttribute("emailErr", "Email Required !!!");
			rd.forward(req, resp);
		}
		
		if(phone=="" || phone==null)
		{
			req.setAttribute("phoneErr", "Phone Required !!!");
			rd.forward(req, resp);
		}
		
		if(pass=="" || pass==null)
		{
			req.setAttribute("passErr", "Password Required !!!");
			rd.forward(req, resp);
		}
		
		if(cpass=="" || cpass==null)
		{
			req.setAttribute("cpassErr", "Confirm password Required !!!");
			rd.forward(req, resp);
		}
		else if(!cpass.equals(pass))
		{
			req.setAttribute("cpassErr", "Confirm password must be same as a password !!!");
			rd.forward(req, resp);
		}
		
		chain.doFilter(req, resp);
		
	}
}
