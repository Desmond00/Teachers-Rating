<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<form action="MasterController" method=POST>
	<center>
		<body>
			<button type=Submit name="action" value="Student_Login">Login as a
				Student</button>
			<br>
			<br>
			<button type=Submit name="action" value="Admin_Login">Login as an
				Admin</button>
		</body>
	</center>
</form>
</html>