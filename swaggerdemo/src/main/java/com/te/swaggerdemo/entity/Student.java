package com.te.swaggerdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	private Integer rollNo;

	private String name;

	private Integer age;

}
