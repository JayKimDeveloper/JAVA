package com.as.kim.service;

import com.as.kim.vo.LoginVO;

public interface LoginService {

	boolean LoginCheck(LoginVO loginVO) throws Exception;
	
}
