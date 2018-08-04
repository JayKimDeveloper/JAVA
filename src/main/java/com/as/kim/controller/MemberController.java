package com.as.kim.controller;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	@RequestMapping(value = "/member/createAccount")
	public String createAccount(String value) {

		logger.info(value);
		
		
		return "/member/createAccount";
	}

	@RequestMapping(value = "/member/selectAccount")
	public Map<String, Object> selectAccount(HttpServletRequest request) {

		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userMail = request.getParameter("userMail");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("userPwd", userPwd);
		map.put("userMail", userMail);

		return map;
	}

	
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
