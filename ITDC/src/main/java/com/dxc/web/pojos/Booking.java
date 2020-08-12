package com.dxc.web.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Booking 
{
	@Id
	private int bid;
	private String cusid;
	private int hotelid;
	private int norooms;
	private String fromdate;
	private String todate;
	private String status;
	public Booking() {
		super();
	}
	
	public Booking(int bid, String cusid, int hotelid, int norooms, String fromdate, String todate, String status) {
		super();
		this.bid = bid;
		this.cusid = cusid;
		this.hotelid = hotelid;
		this.norooms = norooms;
		this.fromdate = fromdate;
		this.todate = todate;
		this.status = status;
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getCusid() {
		return cusid;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public int getNorooms() {
		return norooms;
	}
	public void setNorooms(int norooms) {
		this.norooms = norooms;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", cusid=" + cusid + ", hotelid=" + hotelid + ", norooms=" + norooms
				+ ", fromdate=" + fromdate + ", todate=" + todate + ", status=" + status + "]";
	}
	
	
	
}
