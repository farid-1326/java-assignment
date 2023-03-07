package com.te.springbootpdfgenerator.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;
import com.te.springbootpdfgenerator.bean.Employee;
import com.te.springbootpdfgenerator.service.EmployeeService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/addEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
		Employee addEmployee = service.addEmployee(employee);
		if (addEmployee != null) {
			return new ResponseEntity<String>("Data saved", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Data not saved", HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/pdf")
	private void pdfGenerte(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		String currentDateAndTime = dateFormat.format(new Date());
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=pdf_" + currentDateAndTime + ".pdf";
		response.setHeader(headerKey, headerValue);
		service.export(response);

	}

}
