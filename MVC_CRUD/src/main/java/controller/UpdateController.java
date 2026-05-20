package controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

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
			Student st = dao.StudentById(id);
			req.setAttribute("st", st);
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int age = Integer.parseInt( req.getParameter("age"));
		
		Student st =  new Student();
		st.setId(id);
		st.setName(name);
		st.setEmail(email);
		st.setAge(age);
		
		StudentDao dao = new StudentDao();
		int i = dao.updateStudent(st);
		if(i>0)
		{
			req.setAttribute("msg", "update successfully");
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
		
		
	}
}
