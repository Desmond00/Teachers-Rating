<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ratings Home</title>
</head>
<form action = "MasterController" method = "POST">
<body>
	<%
		List<String> teachers = (ArrayList<String>) request.getAttribute("Teachers");
	%>
	<center>
		<p>Select a teacher to rate from the following</p>
		<br> <select name="TeacherSelected">
			<%
				for (String teacher : teachers) {
			%><option value="<%=teacher%>"><%=teacher%></option>
			<%
				}
			%>
		</select><input type = "hidden" name = "sName" value = "<%=(String)request.getAttribute("sName")%>">
		<button type = "Submit" name = "action" value = "SelectedTeacher">Proceed</button>
	</center>
</body>
</form>
</html>