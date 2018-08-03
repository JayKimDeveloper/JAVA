package com.as.kim.controller;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {

	@Autowired
	private JavaMailSender mailSender;

	// mailForm
	@RequestMapping(value = "/mail/mailForm")
	public String mailForm() {
		
		return "/mail/mailForm";
	}
	
	// mailSending ÄÚµå
	@RequestMapping(value = "/mail/mailSending")
	public String mailSending(String toMail, String title, String content) throws FileNotFoundException, URISyntaxException{
		
		String setFrom = "kyhyun199@gmail.com";
		
		try {
			
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom(setFrom);
			messageHelper.setTo(toMail);
			messageHelper.setSubject(title);
			messageHelper.setText(content);
			
			mailSender.send(message);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "/home";
	}

	
}
