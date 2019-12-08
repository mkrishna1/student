package com.careerstudent.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.careerstudent.dao.LoginDao;
import com.careerstudent.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Login userlogindao(String userid, String password) {
		String sql = "select userid,name,mobile,password from student where userid = ? and password = ?";
		try {
		return this.jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Login>(Login.class), userid, password);
		}catch (Exception e) {
			
		}
		return null;
	}
	
	@Override
	public int usercheckdao(String userid, String password) {
		String sql = "select count(*) from student where userid = ? and password = ?";
		return jdbcTemplate.queryForObject(sql,new Object[] {userid, password}, Integer.class);
	}
	
}
