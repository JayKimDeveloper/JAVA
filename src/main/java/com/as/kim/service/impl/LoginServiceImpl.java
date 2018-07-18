package com.as.kim.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.as.kim.service.LoginService;
import com.as.kim.service.dao.LoginDAO;
import com.as.kim.vo.LoginVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;
	
	@Autowired
	private SqlSession sql;
	
	@Override
	@Transactional
	public boolean LoginCheck(LoginVO loginVO) throws Exception {
		
		int count = Integer.parseInt(
				sql.selectOne("loginCheck", loginVO).toString());
		
		if(count > 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
