<%@include file="connect.jsp"%>
<%
	try {
		//out.println(con);
		PreparedStatement ps = con.prepareStatement("select roll_number from STUDENTS_ROLLNUMBERS where ROLL_NUMBER=?");
		ps.setInt(1, Integer.parseInt(request.getParameter("n1")));
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			out.println("<font color=green>Roll Number Correct</font>");
		} else
			out.println("<font color=red>Roll Number Incorrect</font>");
		con.close();
	} catch (Exception e) {
		out.println(e);
	}
%>