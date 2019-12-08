package com.careerstudent.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerstudent.dao.RegisterDao;
import com.careerstudent.model.Register;
import com.careerstudent.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterDao registerdao;
	
	@Override
	public void insertdata(List<Register> list) {
		registerdao.insertformlist(list);
	}
}
