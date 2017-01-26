package com.niit.model;

public class User {

	int UserId;
	String name,email,pwd,cnfpwd;
	int phone_no;;

	public void get_data(String name,String email,int phone_no,String pwd,String cnfpwd) 
	{
	this.name=name;
	this.email=email;
	this.pwd=pwd;
	this.cnfpwd=cnfpwd;
	this.phone_no=phone_no;		
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCnfpwd() {
		return cnfpwd;
	}

	public void setCnfpwd(String cnfpwd) {
		this.cnfpwd = cnfpwd;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	
		
		
	

}
