package controller;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class LogContorller extends HttpServlet {
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			ServletContext cx = req.getServletContext();
			String current = (String)cx.getAttribute("current");
			String total = (String)cx.getAttribute("total");
			
			req.setAttribute("current", current);
			req.setAttribute("total", total);
			req.getRequestDispatcher("log.jsp").forward(req, resp);
		}
}
