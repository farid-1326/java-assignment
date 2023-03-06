package com.te.SpringEmailDemo.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailSenderServiceWithAttatchment {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String[] toEmail, String subject, String body, String attachment) {
		MimeMessage createMimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(createMimeMessage, true);
			helper.setFrom("faridhere1326@gmail.com");
			helper.setTo(toEmail);
			helper.setText(body);
			helper.setSubject(subject);
			FileSystemResource dataSource = new FileSystemResource(new File(attachment));

			helper.addAttachment(dataSource.getFilename(), dataSource);
			mailSender.send(createMimeMessage);
			System.out.println("sent");
		} catch (MessagingException e1) {

			e1.printStackTrace();
		}

	}
}
