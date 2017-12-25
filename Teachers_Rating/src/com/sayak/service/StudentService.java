package com.sayak.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sayak.dao.StudentDao;
import com.sayak.model.Student;
import com.sayak.model.Teachers;

public class StudentService {
	StudentDao studentDao = new StudentDao();
	boolean flag = false;
	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
	
	public Student getStudent(String rollNumber) {
		logger.info("Starting getStudent() method in Service with "+rollNumber);
		return studentDao.getStudent(rollNumber);
	}
	public boolean validateAdmin(String id, String department, String password) {
		logger.info("Starting validation of admin in Service with "+id);
		flag = studentDao.validateAdmin(id,department,password);
		return flag;
	}
	public List<String> getTeachers(String discipline) {
		logger.info("Starting getTeachers() method in Service with "+discipline);
		return studentDao.getTeachers(discipline);
	}
	public boolean pushRatings(String sName, String sTeacher, String q1, String q2, String q3) {
		logger.info("Starting fial push of Ratings in Service from "+sName + " for "+sTeacher);
		return studentDao.pushRatings(sName,sTeacher,q1,q2,q3);
	}
	public boolean validateStudent(String sName, String sTeacher) {
		logger.info("Starting validation of student in Service with "+sName);
		return studentDao.validateStudent(sName,sTeacher);
	}

}
