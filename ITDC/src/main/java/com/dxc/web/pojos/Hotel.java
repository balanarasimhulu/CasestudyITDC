package com.dxc.web.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hotel 
{
	@Id
	private int hid;
	private String hname;
	private String address;
	private int trooms;
	private int arooms;
	private double cproom;
	public Hotel() {
		super();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String Address) {
		address = Address;
	}

	

	public Hotel(int hid, String hname, String address, int trooms, int brooms, int arooms, double cproom) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.address = address;
		this.trooms = trooms;
		this.arooms = arooms;
		this.cproom = cproom;
	}

	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getTrooms() {
		return trooms;
	}
	public void setTrooms(int trooms) {
		this.trooms = trooms;
	}
	public double getCproom() {
		return cproom;
	}

	public void setCproom(double Cproom) {
		cproom = Cproom;
	}

	public int getArooms() {
		return arooms;
	}
	public void setArooms(int arooms) {
		this.arooms = arooms;
	}

	@Override
	public String toString() {
		return "Hotel [hid=" + hid + ", hname=" + hname + ", address=" + address + ", trooms=" + trooms + 
				 ", arooms=" + arooms + ", cproom=" + cproom + "]";
	}


	
	
	
}
