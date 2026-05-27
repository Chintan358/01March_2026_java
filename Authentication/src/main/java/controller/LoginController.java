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

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			
			
			UserDao dao = new UserDao();
			if(dao.loginCheck(user))
			{
				HttpSession session = req.getSession();
				session.setAttribute("user", username);
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			}
			else
			{
				req.setAttribute("err", "Invalid credentials");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
			
		}
}
