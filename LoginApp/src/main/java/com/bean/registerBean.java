package com.bean;

public class registerBean {
	private String firstname;
	private String lastname;
	private String email;
	private String num;
	private int id;
	private String password;
	private String user;
	private String confirmpass;

	public String getConfirmpass() {
		return confirmpass;
	}

	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;

	}

	@Override
	public String toString() {
		return "registerBean [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", num=" + num + ", id=" + id + ", password=" + password + ", user=" + user + "]";
	}



}
