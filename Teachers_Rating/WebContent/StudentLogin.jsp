<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script language="javascript">
	function checker(p1) {
		//alert("here");
		//alert(p1);
		xmlHttp = GetXmlHttpObject();
		//alert(xmlHttp);
		var url = "checker.jsp?n1=" + p1;
		//alert(url);
		xmlHttp.open("GET", url, true);
		xmlHttp.onreadystatechange = stateChanged
		xmlHttp.send(null);
	}

	function stateChanged() {
		var showdata = xmlHttp.responseText;
		//alert(showdata);
		document.getElementById("show").innerHTML = showdata;
	}
	function GetXmlHttpObject() {
		var xmlHttp = null;
		try {
			//Firefox, Opera 8.0+, Safari
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			//Internet Explorer
			try {
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			}
			//Google Chrome
			catch (e) {
				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
		}
		return xmlHttp;
	}
	function disabler() {
		//alert("disabler() is called");
		var content = document.getElementById("show").textContent.trim();
		//console.log(content);
		var correct = "Roll Number Correct";
		var incorrect = "Roll Number Incorrect";
		if (content == correct) {
			return true;
		} else if (content == incorrect) {
			return false;
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student's Login</title>
</head>
<form action="MasterController" method="POST">
	<center>
		<body>
			<table border=2>
				<tr>
					<td>Enter your University Roll Number:</td>
					<td><input type="text" name="rollNumber" onkeyup="checker(this.value)">
						<div id="show"></div></td>
				</tr>
				<tr>
					<td colspan="2"><button type="Submit" name="action"
							value="StudentLogin" onclick="return disabler()">Login</button></td>
				</tr>
			</table>
		</body>
	</center>
</form>
</html>