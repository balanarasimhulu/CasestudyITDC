package com.dxc.web.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer 
{
	@Id
	private String cid;
	private String cpassword;
	public Customer() {
		super();
	}
	public Customer(String cid, String cpassword) {
		super();
		this.cid = cid;
		this.cpassword = cpassword;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cpassword=" + cpassword + "]";
	}
	
	

}
