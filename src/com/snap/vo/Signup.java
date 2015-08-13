package com.snap.vo;

public class Signup {

	private String username;
	private String password;
	private String emailid;
	
	private String address;
	private int phoneno;
	
	public Signup(String username, String password, String emailid, String address, int phoneno) {
		super();
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.address = address;
		this.phoneno = phoneno;
		}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmailid() {
		return emailid;
	}

	public String getAddress() {
		return address;
	}

	public int getPhoneno() {
		return phoneno;
	}
	
}
