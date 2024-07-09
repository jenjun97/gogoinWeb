package com.gogoinWeb.users;

public class UserModel {
	private Integer id;
	private String uname;

	public UserModel(Integer id, String uname) {
		this.id = id;
		this.uname = uname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

}
