package com.careerstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.careerstudent.model.CustomErrorType;
import com.careerstudent.model.Update;
import com.careerstudent.service.UpdateService;

@RestController
@Repository
public class UpdateController {

	@Autowired
	UpdateService updateservice;
	
	@PostMapping(path="/update")
	@ResponseBody
	
	public ResponseEntity<?> updatedata(@RequestParam("id") int id, String userid, String name, String mobile, String password) {
		Update u1 = new Update();
		CustomErrorType c1 = new CustomErrorType();
	
		updateservice.updateservice(id, userid, name, mobile, password);
//		Integer.parseInt(u1.setId(id));
		u1.setUserid(userid);
		u1.setName(name);
		u1.setMobile(mobile);
		u1.setPassword(password);
		c1.setResponse(200);
		return new ResponseEntity<>(c1, HttpStatus.OK);

	}
//	public ResponseEntity<?> updatedata(@RequestBody Update update) {
//		int id = Integer.parseInt(update.getId());
//		String userid = update.getUserid();
//		String name = update.getName();
//		String mobile = update.getMobile();
//		String password = update.getPassword();
//		CustomErrorType c1 = new CustomErrorType();
//		
//		updateservice.updateservice(id, userid, name, mobile, password);
//		Integer.parseInt(update.setId(id));
//		update.setUserid(userid);
//		update.setName(name);
//		update.setMobile(mobile);
//		update.setPassword(password);
//		c1.setResponse(200);
//		return new ResponseEntity<>(c1, HttpStatus.OK);
//		
//	}
}
