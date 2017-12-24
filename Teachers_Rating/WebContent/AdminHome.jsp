<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin's Home</title>
</head>
<body>
	<%
		String department = (String) request.getAttribute("Department");
	%>
	<center>
		<h1>
			Welcome admin (<%=department%>)
		</h1>
		<br> <br>
		<button type="Submit" name="ANT" value="ANT">Add New Teacher</button>
		<br><br>
		<button type="Submit" name="RT" value="RT">Remove Teacher</button>
		<br><br>
		<button type="Submit" name="GRFT" value="GRFT">Generate
			Rating for a Teacher</button>
		<br><br>
	</center>
</body>
</html>