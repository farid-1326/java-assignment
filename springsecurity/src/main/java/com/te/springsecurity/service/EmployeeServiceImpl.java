package com.te.springsecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.te.springsecurity.dao.EmployeeDAO;
import com.te.springsecurity.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  dao.save(employee);
	}

	@Override
	public Employee getEmployee(String empId) {
		// TODO Auto-generated method stub
		 Employee employee = dao.findById(empId).get();
		 return employee;
		 
	}

	@Override
	public List<Employee> findEmployeeWithSorting(String field) {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.ASC,field));
	}

	@Override
	public Page<Employee> findEmployeeWithPagination(Integer offset, Integer pageSize) {
		// TODO Auto-generated method stub
		return dao.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Page<Employee> findEmployeeWithPaginationSorting(Integer offset, Integer pageSize, String field) {
		// TODO Auto-generated method stub
		return dao.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(Sort.Direction.ASC,field)));
	}

	@Override
	public Employee getParticularEmployee(String id) {
		// TODO Auto-generated method stub
		Optional<Employee> findById = dao.findById(id);
		return findById.get();
	}

}
