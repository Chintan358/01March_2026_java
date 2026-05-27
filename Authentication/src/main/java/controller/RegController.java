package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/reg")
public class RegController extends HttpServlet {
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			
			UserDao dao = new UserDao();
			int i = dao.addUser(user);
			if(i>0)
			{
				req.setAttribute("msg", "Registration successfully !!!");
				req.getRequestDispatcher("reg.jsp").forward(req, resp);
			}
			
			
			
		}
}
