package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

@WebServlet("/logout")
public class Logoutcontroller extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			HttpSession session = req.getSession(false);
			session.removeAttribute("user");
			session.invalidate();
			
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
			
		}
}
