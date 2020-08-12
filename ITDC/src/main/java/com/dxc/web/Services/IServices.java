package com.dxc.web.Services;

import java.util.List;

import com.dxc.web.pojos.Booking;
import com.dxc.web.pojos.Customer;
import com.dxc.web.pojos.Head;
import com.dxc.web.pojos.Hotel;

public interface IServices 
{
	public String adminSignup(Head a);
	public String adminSignin(Head a);
	public String addHotel(Hotel h);
	public List<Hotel> displayHotels();
	public List<Hotel> hotelName(int h);
	public String customerSignup(Customer c);	
	public String customerSignin(Customer c);
	public List<Booking> bookHotel(Booking b,Hotel h,String mobile);
	public List<Booking> pastBookings(String s);
	public List<Booking> requestCustomer(int bookid);
	public List<Booking> displayCancel();
	public String displayDone();
	public List<Booking> getdailybookings();
	
}
