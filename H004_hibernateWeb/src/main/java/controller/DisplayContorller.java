package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

import java.io.IOException;
import java.util.ArrayList;

import dao.ProductDao;


@WebServlet("/display")
public class DisplayContorller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductDao dao = new ProductDao();
		ArrayList<Product> products = dao.allProducts();
		req.setAttribute("products", products);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
		
	}

	

}
