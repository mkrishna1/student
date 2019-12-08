package com.careerstudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.careerstudent.model.Register;
import com.careerstudent.service.RegisterService;

@RestController
public class RegisterController {
	
	@Autowired
	RegisterService registerservice;

	@PostMapping(path="/register")
	@ResponseBody
	public ResponseEntity<?> Registerdata(@RequestBody List<Register> list) {
		Register e1 = new Register();
		
		if(list.isEmpty()) {
			e1.setResponse(500);
			return  new ResponseEntity<>(e1,HttpStatus.OK);
		} else {
			registerservice.insertdata(list);
			e1.setResponse(200);
			return new ResponseEntity<Register>(e1,HttpStatus.OK);
		}
		
	}
}
