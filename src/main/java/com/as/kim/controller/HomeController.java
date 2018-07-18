package com.as.kim.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.Local;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.as.kim.service.BoardService;
import com.as.kim.service.LoginService;
import com.as.kim.service.dao.LoginDAO;
import com.as.kim.vo.BoardVO;
import com.as.kim.vo.LoginVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	@Resource(name="loginService")
	private LoginService loginService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
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
