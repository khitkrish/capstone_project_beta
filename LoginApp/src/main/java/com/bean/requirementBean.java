package com.bean;

public class requirementBean {
private  int id;
private String name;
private String email;
private String phone;
private String date;
private String donatename ;
private String donatenum;
private String adress;
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getDonatenum() {
	return donatenum;
}
public void setDonatenum(String donatenum) {
	this.donatenum = donatenum;
}
private int reid;
private int posted;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDonatename() {
	return donatename;
}
public void setDonatename(String donatename) {
	this.donatename = donatename;
}
public int getReid() {
	return reid;
}
public void setReid(int reid) {
	this.reid = reid;
}
public int getPosted() {
	return posted;
}
public void setPosted(int posted) {
	this.posted = posted;
}
@Override
public String toString() {
	return "requirementBean [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", date=" + date
			+ ", donatename=" + donatename + ", donatenum=" + donatenum + ", adress=" + adress + ", reid=" + reid
			+ ", posted=" + posted + "]";
}

}
