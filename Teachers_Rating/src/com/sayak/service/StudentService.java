package com.sayak.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sayak.dao.StudentDao;
import com.sayak.model.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();
	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
	public Student getStudent(String rollNumber) {
		logger.info("Starting getStudent() method with "+rollNumber);
		return studentDao.getStudent(rollNumber);
	}

}
