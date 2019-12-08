package com.careerstudent.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerstudent.dao.DeleteDao;
//import com.careerstudent.model.Delete;
import com.careerstudent.service.DeleteService;

@Service
public class DeleteServiceImpl implements DeleteService{

	@Autowired
	DeleteDao deletedao;
	
	@Override
	public int userdelete(int id) {
		return deletedao.userdeletedao(id);
	}
}
