package com.sayak.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sayak.model.Student;

public class StudentDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public Student getStudent(String rollNumber) {
		Student s = new Student();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123456");
			ps = con.prepareStatement("select * from STUDENTS_ROLLNUMBERS where ROLL_NUMBER = ?");
			ps.setString(1, rollNumber);
			rs = ps.executeQuery();
			while(rs.next()){
				s.setRoll_number(rs.getString(1));
				s.setName(rs.getString(2));
				s.setDiscipline(rs.getString(3));
				s.setPassing_year(rs.getInt(4));
				s.setPassing_year(rs.getInt(5));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

}
