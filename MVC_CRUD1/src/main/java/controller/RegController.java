package controller;

import java.io.IOException;

import dao.ProductDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

@WebServlet("/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		double price = Double.parseDouble(req.getParameter("price"));
		int qty = Integer.parseInt(req.getParameter("qty"));
		
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);
		p.setQty(qty);
		
		ProductDao dao = new ProductDao();
		int i = dao.addProduct(p);
		if(i>0)
		{
			req.setAttribute("msg", "Product inserted successfully");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
	}
}
