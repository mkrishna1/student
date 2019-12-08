package com.careerstudent.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerstudent.service.LoginService;
import com.careerstudent.dao.LoginDao;
import com.careerstudent.model.Login;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao logindao;
	
	@Override
	public Login userlogin(String userid, String password) {
		return logindao.userlogindao(userid, password);
	}
	
	@Override
	public boolean usercheck(String userid, String password) {
		boolean status = false;
		if(logindao.usercheckdao(userid, password)>0) {
			status = true;
		}
		return status;
	}
}
