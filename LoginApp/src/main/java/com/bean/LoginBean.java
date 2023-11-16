package com.bean;

public class LoginBean {
	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + passwords + "]";
	}
	
	private String userName;
	private String passwords;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String password) {
		this.passwords = password;
	}
	

}
