package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Product
{
	

	int pdId,psize,pprice;
	String pdname,pdclr;
	int phone_no;

	public void get_data(String pdname,String pdclr,int pdId,int psize,int pprice) 
	{
	this.pdId=pdId;
	this.psize=psize;
	this.pprice=pprice;
	this.pdname=pdname;
	this.pdclr=pdclr;	
	this.phone_no=phone_no;


	}

}
