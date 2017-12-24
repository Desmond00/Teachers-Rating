<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function checker() {
		console.log("I am called");
		var department = document.getElementById("Department");
		var selection = department.options[department.selectedIndex].value;
		console.log(selection);
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin's Portal</title>
</head>
<form action="MasterController" method="POST">
	<body>
		<center>
			<h1>Admin Login</h1>
			<br> <br> ID: <input type=text name="id"><br>
			<br>Department:<select name = "Department" id="Department">
				<option value="CSE" selected="selected">CSE</option>
				<option value="IT">IT</option>
				<option value="ECE">ECE</option>
			</select> <br> <br> Password: <input type=password name="password"><br>
			<br>
			<button type="Submit" name=action value="AdminLogin"
				onclick="return checker()">Login</button>
		</center>
	</body>
</form>
</html>