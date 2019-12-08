package com.careerstudent.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@PostMapping(path="/user")
	@ResponseBody
	
	public void userdata(@RequestBody User u) {
		
		System.out.println(u.getUsername());
	}

}
