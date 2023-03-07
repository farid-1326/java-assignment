package com.te.springbootpdfgenerator.bean;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private String department;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate doj;

}
