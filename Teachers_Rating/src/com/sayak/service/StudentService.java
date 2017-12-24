package com.sayak.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sayak.dao.StudentDao;
import com.sayak.model.Student;

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

}
