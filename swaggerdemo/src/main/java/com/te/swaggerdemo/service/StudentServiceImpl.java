package com.te.swaggerdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.swaggerdemo.dao.StudentDAO;
import com.te.swaggerdemo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
