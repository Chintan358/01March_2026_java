package controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		int id = Integer.parseInt(req.getParameter("id"));
		StudentDao dao = new StudentDao();
		if(action.equals("delete"))
		{
			int i = dao.deleteStudent(id);
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
			}
		}
		else if(action.equals("update"))
		{
			System.out.println("update calling"+id);
		}
	}
}
