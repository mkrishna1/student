package com.careerstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.careerstudent.model.CustomErrorType;
import com.careerstudent.model.Login;
import com.careerstudent.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	@PostMapping(path="/login")
	@ResponseBody
	public ResponseEntity<?> loginmethod(@RequestBody Login log) {
		String userid = log.getUserid();
		String password = log.getPassword();
		Login l1=new Login();
		if(!userid.isEmpty()&&!password.isEmpty()) {
			 l1 = loginservice.userlogin(userid, password);
		
		}
		
		if(l1!=null) {
			
			l1.setResponse(200);
			return new ResponseEntity<Login>(l1,HttpStatus.OK);
			
		}else {
			
			CustomErrorType c1 = new CustomErrorType();
			c1.setResponse(500);
			c1.setMessage("Incorrect Userid or Password");
			return new ResponseEntity<>(c1, HttpStatus.OK);
			
		}
		
	}
}
