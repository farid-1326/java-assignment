package com.te.springsecurity.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.te.springsecurity.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public Employee getEmployee(String empId);
	
	public List<Employee> findEmployeeWithSorting(String field);
	
	public Page<Employee> findEmployeeWithPagination(Integer offset,Integer pageSize);
	
	public Page<Employee> findEmployeeWithPaginationSorting(Integer offset, Integer pageSize, String field);
	
	public Employee getParticularEmployee(String id);
}
