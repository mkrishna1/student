package com.careerstudent.dao;

import com.careerstudent.model.Login;

public interface LoginDao {

	Login userlogindao(String userid, String password);
	
	int usercheckdao(String userid, String password);
	
}
