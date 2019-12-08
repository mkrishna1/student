package com.careerstudent.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.careerstudent.dao.UpdateDao;
//import com.careerstudent.model.Update;

@Repository
public class UpdateDaoImpl implements UpdateDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public int updatedatadao(int id, String userid, String name, String mobile, String password) {
		String sql = "update student " + " set userid = ?, name = ?, mobile = ?, password = ?";
        return jdbcTemplate.update(sql);
	}
}
