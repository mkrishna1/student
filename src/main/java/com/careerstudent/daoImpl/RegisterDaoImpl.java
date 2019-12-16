package com.careerstudent.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.careerstudent.dao.RegisterDao;
import com.careerstudent.model.Register;

@Repository
public class RegisterDaoImpl implements RegisterDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertformlist (List<Register> list) {
		for(Register s1:list) {
			String str = s1.getName();
				String[] Str = str.split(" ");
					for(int i=0;i<Str.length;) {
						String sql = "insert into student (userid, username, name, mobile, password) values (?,?,?,?,?)";
						jdbcTemplate.update(sql, s1.getUserid(),s1.getUsername(),s1.getName(),s1.getMobile(),s1.getPassword());
						break;
					}
		}
	}
	
}
