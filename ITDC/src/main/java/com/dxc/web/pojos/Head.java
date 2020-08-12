package com.dxc.web.pojos;

import org.springframework.data.annotation.Id; 
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Head 
{
	@Id
	private int id;
	private String password;
	public Head() {
		super();
	}
	public Head(int id, String password) {
		super();
		this.id = id;
		this.password = password;
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
		return "Admin [id=" + id + ", password=" + password + "]";
	}	
	
	
	
	
}
