package com.sayak.mastercontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sayak.model.Student;
import com.sayak.model.Teachers;
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
			//System.out.println("In Controller " + rollNumber);
			student = studentService.getStudent(rollNumber);
			request.setAttribute("Student", student);
			rd = request.getRequestDispatcher("StudentHome.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("AdminLogin")){
			boolean flag = false;
			String id = request.getParameter("id");
			String department = request.getParameter("Department");
			String password = request.getParameter("password");
			flag = studentService.validateAdmin(id,department,password);
			if(flag){
				request.setAttribute("Department", department);
				rd = request.getRequestDispatcher("AdminHome.jsp");
				rd.forward(request, response);
			}
		}
		else if(action.equals("RatingsProceed")){
			
			String discipline = request.getParameter("Discipline");
			String sName = request.getParameter("StudentName");
			List<String> teachers = studentService.getTeachers(discipline);
			if(teachers.size()!=0){
				request.setAttribute("Teachers", teachers);
				request.setAttribute("sName", sName);
				rd = request.getRequestDispatcher("RatingsProceed.jsp");
				rd.forward(request, response);
			}
		}
		else if(action.equals("SelectedTeacher")){
			String selectedTeacher = request.getParameter("TeacherSelected");
			//System.out.println(selectedTeacher);
			String sName = request.getParameter("sName");
			request.setAttribute("sName", sName);
			request.setAttribute("selectedTeacher", selectedTeacher);
			rd = request.getRequestDispatcher("MainRating.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("FinalRating")){
			boolean flag2 = false;
			String q1 = request.getParameter("Q1");
			String q2 = request.getParameter("Q2");
			String q3 = request.getParameter("Q3");
			String sName = request.getParameter("sName");
			String sTeacher  = request.getParameter("sTeacher");
			boolean flag1 = studentService.validateStudent(sName,sTeacher);
			//System.out.println(flag1);
			//System.out.println(!flag1);
			if(flag1){
				 flag2 = studentService.pushRatings(sName,sTeacher,q1,q2,q3);
				 if(flag2){
						rd = request.getRequestDispatcher("Success.jsp");
						rd.forward(request, response);
					}
			}
			else if(flag1==false){
				rd = request.getRequestDispatcher("Error.jsp");
				rd.forward(request, response);
			}
		}
	}
}


