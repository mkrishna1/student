package com.careerstudent.service;

import com.careerstudent.model.Login;

public interface LoginService {

	Login userlogin(String userid, String password);
	
	boolean usercheck(String userid, String password);
}
