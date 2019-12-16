package com.careerstudent.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.careerstudent.dao.UserDao;
import com.careerstudent.model.DAOUser;
import com.careerstudent.model.UserDTO;

public class JwtUserDetailsService implements UserDetailsService{

	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if("javainuse".equals(username)) {
			return new User("javainuse", "$2y$12$k3SuK.uMct92e1MBWii9k.BTB/AaYKQfLGlQmTAEOZcCiqg68R6wK",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
