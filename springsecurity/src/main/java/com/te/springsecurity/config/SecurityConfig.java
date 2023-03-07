package com.te.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.te.springsecurity.filter.EmployeeJWTFilter;
import com.te.springsecurity.jwtutil.EmployeeJWT;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private EmployeeJWTFilter filter;
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
		
		
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/add")
		.hasRole("ADMIN")
		.requestMatchers("/get")
		.hasAnyRole("ADMIN","USER")
		.requestMatchers("/findEmpWithSorting")
		.hasAnyRole("ADMIN","USER")
		.requestMatchers("/findEmpWithPagination")
		.hasAnyRole("ADMIN","USER")
		.requestMatchers("/findEmpWithPaginationSorting")
		.hasAnyRole("ADMIN","USER")
		.requestMatchers("/getParticularEmp")
		.hasAnyRole("ADMIN","USER")
		.requestMatchers("/authenticate")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.addFilterBefore(filter,UsernamePasswordAuthenticationFilter.class);
		
		return httpSecurity.build();
	}
}
