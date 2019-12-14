package com.careerstudent.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;

public class DAOUser {

//	private long id;
	private String name,password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
