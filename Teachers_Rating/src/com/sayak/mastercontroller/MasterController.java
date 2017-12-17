package com.sayak.mastercontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MasterController
 */
@WebServlet("/MasterController")
public class MasterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MasterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1 = request.getParameter("n1");		
		if(n1.equals("Student_Login")){
			rd = request.getRequestDispatcher("StudentLogin.jsp");
			rd.forward(request, response);
		}
		else if(n1.equals("Admin_login")){
			rd = request.getRequestDispatcher("AdminLogin.jsp");
			rd.forward(request, response);
		}
	}

}
