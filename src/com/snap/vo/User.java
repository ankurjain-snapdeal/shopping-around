package com.snap.vo;

public class User {

	private String uname;
	private String pwd;
	private String loginid;
	public User(String uname, String pwd, String loginid) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.loginid = loginid;
	}
	public String getUname() {
		return uname;
	}
	public String getPwd() {
		return pwd;
	}
	public String getLoginid() {
		return loginid;
	}
	
}
