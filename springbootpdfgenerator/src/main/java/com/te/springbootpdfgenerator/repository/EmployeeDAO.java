package com.te.springbootpdfgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springbootpdfgenerator.bean.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

}
