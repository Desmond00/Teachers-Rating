<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.sayak.model.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student's Portal</title>
</head>
<form action = "MasterController" method = "POST">
<body>
	<center>
		<%
			Student student = (Student) request.getAttribute("Student");
		%>
		<p>
			Welcome <%= student.getName()%>
		</p>
		<table border = 2>
		<tr>
			<th>Roll Number</th>
			<th>Discipline</th>
			<th>Passing Year</th>
			<th>Current Year</th>
		</tr>
		<tr>
			<td><%= student.getRoll_number() %></td>
			<td><%= student.getDiscipline() %></td>
			<td><%= student.getPassing_year() %></td>
			<td><%= student.getCurrent_year() %></td>
		</tr>
		</table>
		<br><br> 
		<input type = "hidden" name = "Student_CurrentYear" value = "<%=student.getCurrent_year() %>">
		<input type = "hidden" name = "StudentName" value = "<%=student.getName() %>">
		<input type = "hidden" name = "Discipline" value = "<%=student.getDiscipline() %>">
		<button type = "Submit" name = "action" value = "RatingsProceed">Proceed to Rate</button>
	</center>
</body>
</form>
</html>