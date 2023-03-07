package com.te.swaggerdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.swaggerdemo.entity.Student;
import com.te.swaggerdemo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/addStudent")
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		Student addStudent = service.addStudent(student);
		if (addStudent != null) {
			return new ResponseEntity<Student>(addStudent, HttpStatus.OK);
		} else {
			return new ResponseEntity<Student>(addStudent, HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("getAllStudents")
	public ResponseEntity<?> getAllStudents() {
		List<Student> allStudents = service.getAllStudents();
		if (!allStudents.isEmpty()) {
			return new ResponseEntity<List<Student>>(allStudents, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Student>>(allStudents, HttpStatus.BAD_GATEWAY);
		}
	}
}
