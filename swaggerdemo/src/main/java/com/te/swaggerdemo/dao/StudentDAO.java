package com.te.swaggerdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.swaggerdemo.entity.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{

}
