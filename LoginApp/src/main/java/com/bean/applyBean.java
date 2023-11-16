package com.bean;

public class applyBean {
 
	private int id;
	private int reid;
	private String name;
	private String number;
	private String email;
	private String date;
	private String time;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getemail() {
		return email;
	}
	public void setPhone(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReid() {
		return reid;
	}
	public void setReid(int reid) {
		this.reid = reid;
	}
	@Override
	public String toString() {
		return "applyBean [id=" + id + ", reid=" + reid + ", name=" + name + ", number=" + number + ", email=" + email
				+ ", date=" + date + ", time=" + time + "]";
	}
	
	
	
}
