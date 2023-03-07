package com.te.springbootpdfgenerator.service;

import java.io.IOException;

import com.lowagie.text.DocumentException;
import com.te.springbootpdfgenerator.bean.Employee;

import jakarta.servlet.http.HttpServletResponse;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);

	public void export(HttpServletResponse response) throws DocumentException, IOException;

}
