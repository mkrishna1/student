package com.careerstudent.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.careerstudent.dao.DeleteDao;
//import com.careerstudent.model.Delete;

@Repository
public class DeleteDaoImpl implements DeleteDao{

	@Autowired
	JdbcTemplate jdbctemplate;
	
	@Override
	public int userdeletedao(int id) {
		String sql = "delete from student where id='"+id+"'";
		
		return jdbctemplate.update(sql);
//		try {
//			return this.jdbctemplate.queryForObject(sql, new BeanPropertyRowMapper<Delete>(Delete.class), id);
//		} catch (Exception e) {
//			
//		} return null;
	}
}
