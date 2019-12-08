package com.careerstudent.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerstudent.dao.UpdateDao;
//import com.careerstudent.model.Update;
import com.careerstudent.service.UpdateService;

@Service
public class UpdateServiceImpl implements UpdateService {

	@Autowired
	UpdateService updateservice;
	
	@Autowired
	UpdateDao updatedao;
	
	@Override
	public int updateservice(int id, String userid, String name, String mobile, String password) {
		 return updatedao.updatedatadao(id, userid, name, mobile, password);
	}
}
