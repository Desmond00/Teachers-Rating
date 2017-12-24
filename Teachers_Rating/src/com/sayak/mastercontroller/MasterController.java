package com.sayak.mastercontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sayak.model.Student;
import com.sayak.service.StudentService;

/**
 * Servlet implementation class MasterController
 */
@WebServlet("/MasterController")
public class MasterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd = null;
	StudentService studentService = new StudentService();
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
		String action = request.getParameter("action");	
		if(action.equals("Student_Login")){
			//System.out.println(action);
			rd = request.getRequestDispatcher("StudentLogin.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("Admin_Login")){
			rd = request.getRequestDispatcher("AdminLogin.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("StudentLogin")){
			Student student = null;
			//System.out.println("Student after getting logged in " + action);
			String rollNumber = request.getParameter("rollNumber");
			System.out.println("In Controller " + rollNumber);
			student = studentService.getStudent(rollNumber);
			request.setAttribute("Student", student);
			rd = request.getRequestDispatcher("StudentHome.jsp");
			rd.forward(request, response);
		}
	}

}
