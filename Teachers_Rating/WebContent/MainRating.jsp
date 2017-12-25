<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Rating Page</title>
</head>
<form action = "MasterController" method = "POST">
<body>
	<center>
		<p>
			Ratings for
			<%=(String) request.getAttribute("selectedTeacher")%></p>
		<br>
		<br>
		<p>
			1. Lorem ipsum dolor sit amet, consectetur adipiscing elit? &nbsp; &nbsp;<select
				name="Q1">
				<option value=1>1</option>
				<option value=2>2</option>
				<option value=3 selected="selected">3</option>
				<option value=4>4</option>
				<option value=5>5</option>
			</select>
		</p>
		<br>
		<br>
		<p>
			2. Duis quis ipsum ultrices, mattis ligula et, feugiat quam? &nbsp; &nbsp;<select
				name="Q2">
				<option value=1>1</option>
				<option value=2>2</option>
				<option value=3 selected="selected">3</option>
				<option value=4>4</option>
				<option value=5>5</option>
			</select>
		</p>
		<br>
		<br>
		<p>
			3. Fusce a luctus neque. Nunc ut eros sem. Curabitur a erat felis? &nbsp; &nbsp;<select
				name="Q3">
				<option value=1>1</option>
				<option value=2>2</option>
				<option value=3 selected="selected">3</option>
				<option value=4>4</option>
				<option value=5>5</option>
			</select>
		</p>
		<br>
		<br><input type = "hidden" name = "sName" value = "<%= (String)request.getAttribute("sName")%>">
		<input type = "hidden" name = "sTeacher" value = "<%=(String) request.getAttribute("selectedTeacher")%>">
		<button type = "Submit" name = "action" value = "FinalRating">Submit</button>
	</center>
</body>
</form>
</html>