package com.careerstudent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Update {
	 public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String id,userid,username,name,mobile,password;

	 public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserid() {
		 return userid;
	 }

	 public void setUserid(String userid) {
		 this.userid = userid;
	 }
}
