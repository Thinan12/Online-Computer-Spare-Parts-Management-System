package com.supplier.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supplier.model.Supplier;
import com.supplier.service.SupplierServiceImpl;
import com.supplier.service.ISupplierService;


public class ListSupplierServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;


	public ListSupplierServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListSupplier.jsp");
		dispatcher.forward(request, response);
	}

}
