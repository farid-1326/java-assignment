package com.te.swaggerdemo.service;

import java.util.List;

import com.te.swaggerdemo.entity.Student;

public interface StudentService {

	public Student addStudent(Student student);

	public List<Student> getAllStudents();
}
