package com.sayak.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sayak.model.Student;
import com.sayak.service.StudentService;

public class StudentDao {
	private static final Logger logger = LoggerFactory.getLogger(StudentDao.class);
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	boolean flag;
	public Student getStudent(String rollNumber) {
		logger.info("getStudent in DAO started");
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
	public boolean validateAdmin(String id, String department, String password) {
		logger.info("validateAdmin() in DAO started");
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123456");
			ps = con.prepareStatement("select * from Admin where id = ? and department = ? and password = ?");
			ps.setString(1, id);
			ps.setString(2, department);
			ps.setString(3, password);
			rs = ps.executeQuery();
			if(rs.next()){
				flag = true;
			}
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}

}
