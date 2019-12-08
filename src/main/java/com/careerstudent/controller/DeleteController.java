package com.careerstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.careerstudent.model.Delete;
import com.careerstudent.service.DeleteService;

@RestController
public class DeleteController {

	@Autowired
	private DeleteService deleteservice;
	
	@PostMapping(path="/delete")
	@ResponseBody
	
	public ResponseEntity<?> deletedata(@RequestParam("id") int id) {
		Delete d1 = new Delete();
		
			deleteservice.userdelete(id);
			d1.setResponse(200);
			return  new ResponseEntity<>(d1,HttpStatus.OK);
	}
}
