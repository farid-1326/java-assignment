package com.te.SpringEmailDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.SpringEmailDemo.service.EmailSenderServiceWithAttatchment;
import com.te.SpringEmailDemo.service.EmailSenderServiceWithoutAttachment;

@RestController
public class EmailController {

	@Autowired
	private EmailSenderServiceWithAttatchment withAttatchment;
	
	@Autowired
	private EmailSenderServiceWithoutAttachment withoutAttachment;
	
	@GetMapping("/sendMailWithOutAttachment")
	public ResponseEntity<?> sendMail() {
		
		String[] emailArray= {"karthikeyan5k5k5@gmail.com","sathishenfield1996@gmail.com"};
		withoutAttachment.sendEmail(emailArray, "MY SUBJECT", "sample msg from farid");
		
		return new ResponseEntity<String>("Email Sent",HttpStatus.OK);
	}
	
	@GetMapping("/sendMailWithAttachment")
	public ResponseEntity<?> sendMailWithAttatchment(){
		String[] emailArray= {"karthikeyan5k5k5@gmail.com","sathishenfield1996@gmail.com"};
		withAttatchment.sendEmail(emailArray, "MY SUBJECT", "sample msg from farid","C:\\Users\\FARID\\battery-report.html");
		
		return new ResponseEntity<String>("Email Sent",HttpStatus.OK);
	}
	
	
}
