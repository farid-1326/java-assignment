package com.te.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.springsecurity.dto.AuthenticationRequest;
import com.te.springsecurity.dto.AuthenticationResponse;
import com.te.springsecurity.entity.Employee;
import com.te.springsecurity.jwtutil.EmployeeJWT;
import com.te.springsecurity.response.SuccessResponse;
import com.te.springsecurity.service.EmployeeService;
import com.te.springsecurity.service.EmployeeServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeJWT employeeJWT;

	@Autowired
	private EmployeeService serv;

	@Autowired
	private AuthenticationManager manager;

	@Autowired
	private EmployeeJWT jwt;

	@Autowired
	private UserDetailsService detailsService;

	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> getAuthenticate(@RequestBody AuthenticationRequest request) {
		manager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmpId(), request.getPassword()));
		UserDetails loadUserByUsername = detailsService.loadUserByUsername(request.getEmpId());
		String generateToken = jwt.generateToken(loadUserByUsername);
		return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse(generateToken), HttpStatus.OK);

	}

	@PostMapping("/add")
	public ResponseEntity<?> register(@RequestBody Employee employee) {
		Employee addEmployee = serv.addEmployee(employee);
		if (addEmployee != null) {

			return new ResponseEntity<String>("DATA SAVED", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("DATA NOT SAVED", HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("/get")
	public ResponseEntity<Employee> getEmployee(String id) {

		Employee employee = serv.getEmployee(id);

		if (employee != null) {
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} else {
			return new ResponseEntity<Employee>(employee, HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("/findEmpWithSorting")
	public ResponseEntity<SuccessResponse> findEmployeeWithSorting(String field) {
		List<Employee> findEmployeeWithSorting = serv.findEmployeeWithSorting(field);
		if (!findEmployeeWithSorting.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().count(findEmployeeWithSorting.size()).t(findEmployeeWithSorting).build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().count(findEmployeeWithSorting.size()).t(findEmployeeWithSorting).build(),
					HttpStatus.BAD_GATEWAY);

		}
	}

	@GetMapping("/findEmpWithPagination")
	public ResponseEntity<SuccessResponse> findEmployeeWithPagination(Integer offset, Integer pageSize) {
		Page<Employee> findEmployeeWithPagination = serv.findEmployeeWithPagination(offset, pageSize);
		if (!findEmployeeWithPagination.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder()
					.count(findEmployeeWithPagination.getSize()).t(findEmployeeWithPagination).build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder()
					.count(findEmployeeWithPagination.getSize()).t(findEmployeeWithPagination).build(),
					HttpStatus.BAD_GATEWAY);

		}
	}

	@GetMapping("/findEmpWithPaginationSorting")
	public ResponseEntity<SuccessResponse> findEmployeeWithPaginationSorting(Integer offset, Integer pageSize,
			String field) {
		Page<Employee> findEmployeeWithPaginationSorting = serv.findEmployeeWithPaginationSorting(offset, pageSize,
				field);
		if (!findEmployeeWithPaginationSorting.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder()
					.count(findEmployeeWithPaginationSorting.getSize()).t(findEmployeeWithPaginationSorting).build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder()
					.count(findEmployeeWithPaginationSorting.getSize()).t(findEmployeeWithPaginationSorting).build(),
					HttpStatus.BAD_GATEWAY);

		}
	}

	@GetMapping("/getParticularEmployee")
	public ResponseEntity<SuccessResponse> getParticularEmployee(HttpServletRequest request) {
		String header = request.getHeader("Authorization");
		String jwt = header.substring(7);
		Employee particularEmployee = serv.getParticularEmployee(employeeJWT.extractUsername(jwt));
		if (particularEmployee != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().t(particularEmployee).build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().t(particularEmployee).build(),
					HttpStatus.BAD_GATEWAY);
		}
	}
	
}
