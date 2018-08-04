package com.as.kim.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.as.kim.service.LoginService;
import com.as.kim.vo.LoginVO;

@Controller
public class LoginController {

	@Resource(name="loginService")
	private LoginService loginService;
	
	@RequestMapping(value = "/loginCheck.do")
	public void loginCheck(Local locale, Model model, LoginVO loginVO, HttpSession session, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		
		if((loginVO.getId() != null && !loginVO.getId().equals("")
				&& loginVO.getPassword() != null && !loginVO.getPassword().equals(""))) {
			
			if(loginService.LoginCheck(loginVO)) {
				session.setAttribute("login", 0); // 로그인 성공시 세션
			}
			
		}
		
	}
	
}
