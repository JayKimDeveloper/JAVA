package com.as.kim.service.dao;

import com.as.kim.vo.LoginVO;

public interface LoginDAO {

	boolean LoginCheck(LoginVO loginVO) throws Exception;
	
}
