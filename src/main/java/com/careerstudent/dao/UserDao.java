package com.careerstudent.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerstudent.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, String> {

	UserDao findByUsername(String username);
}
