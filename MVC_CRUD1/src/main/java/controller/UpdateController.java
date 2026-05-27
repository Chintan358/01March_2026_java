package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

import java.io.IOException;

import dao.ProductDao;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/update")
public class UpdateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		int id = Integer.parseInt(req.getParameter("id"));
		
		ProductDao dao = new ProductDao();
		if(action.equals("update"))
		{
			Product p = dao.productById(id);
			req.setAttribute("p", p);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		else if(action.equals("delete"))
		{
			int i = dao.deleteProduct(id);
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
			}
		}
		
		
	}

}
