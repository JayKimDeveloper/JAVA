package com.as.kim.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

	@RequestMapping(value = "/member/createAccount.jsp")
	@ResponseBody
	public Map<String,Object> createAccount(HttpServletRequest request){
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userMail = request.getParameter("userMail");
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userId", userId);
		map.put("userPwd", userPwd);
		map.put("userMail", userMail);
		
		return map;
	}
	
	
}
