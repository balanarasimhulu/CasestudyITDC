package com.dxc.web.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.web.Dao.IDao;
import com.dxc.web.pojos.Booking;
import com.dxc.web.pojos.Customer;
import com.dxc.web.pojos.Head;
import com.dxc.web.pojos.Hotel;
@Service
public class Services implements IServices 
{
	@Autowired
	IDao idao;
	public String adminSignup(Head a)
	{
		System.out.println("1");
		return idao.adminSignup(a);
		
	}
	public String adminSignin(Head a)
	{
		System.out.println("1");
		return idao.adminSignin(a);	
	}
	public String addHotel(Hotel h)
	{
		return idao.addHotel(h);
	}
	 public List<Hotel> displayHotels()
	 {
		 return idao.displayHotels();
	 }
	 public List<Hotel> hotelName(int h)
	 {
		 return idao.hotelName(h);
	 }
	 public String customerSignup(Customer c)
	 {
		 return idao.customerSignup(c);
	 }
	 public String customerSignin(Customer c)
	 {
		 return idao.customerSignin(c);
	 }
	 public List<Booking> bookHotel(Booking b,Hotel h,String mobile)
	 {
		 return idao.bookHotel(b,h,mobile);
	 }
	 public List<Booking> pastBookings(String a)
	 {
		 return idao.pastBookings(a);
		 
	 }
		public List<Booking> requestCustomer(int bookid)
		{
			return idao.requestCustomer(bookid);
		}
  public List<Booking> displayCancel() 
	{
	  return idao.displayCancel();
    }
  public String displayDone()
  {
	  return idao.displayDone();
  }
  public List<Booking> getdailybookings()
  {
	  return idao.getdailybookings();
  }


}
