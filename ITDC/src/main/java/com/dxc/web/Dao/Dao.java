package com.dxc.web.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dxc.web.pojos.Booking;
import com.dxc.web.pojos.Customer;
import com.dxc.web.pojos.Head;
import com.dxc.web.pojos.Hotel;
import com.dxc.web.repository.Mangodo;
import com.dxc.web.repository.Moncustomer;
import com.dxc.web.repository.Mongobooking;
import com.dxc.web.repository.Monhotel;
@Repository
@Service
public class Dao implements IDao
{
	@Autowired
	Mangodo mon;
	@Autowired
	Monhotel mtel;
	@Autowired
	Moncustomer monc;
	@Autowired
	Mongobooking monb;
	Random random=new Random();
	List<Hotel> lhotel=new ArrayList<>();
	 public String adminSignup(Head a)
	 {
		 System.out.println(a);
		 System.out.println("2");
		 mon.save(a);
		 System.out.println("it's done");
		 return "Successfully signup";
	 }
	 public String adminSignin(Head a)
	 {
		
		 List<Head> admin=new ArrayList<>();
		 admin=mon.findAll();
		 for(int i=0;i<admin.size();i++)
		 {
			 if(admin.get(i).getId()==a.getId()&&admin.get(i).getPassword().equalsIgnoreCase(a.getPassword()))
			 {
				 return "login success";
			 }
			 
		 }
		 return "login unsuccess";
		 
	 }
	 public String addHotel(Hotel h)
	 {
		 System.out.println(h);
		 mtel.save(h);
		 
		 return "Added sucessful";
	 }
	 public List<Hotel> displayHotels()
	 {
		lhotel= mtel.findAll();
		return lhotel;
	 }
	 
	 public String customerSignup(Customer c)
	 {
		 monc.save(c);
		 return "added successful";
		 
	 }
	 public String customerSignin(Customer c)
	 {

		 List<Customer> cus=new ArrayList<>();
		 cus=monc.findAll();
		 for(int i=0;i<cus.size();i++)
		 {
			 if(cus.get(i).getCid().equals(c.getCid())&& cus.get(i).getCpassword().equalsIgnoreCase(c.getCpassword()))
			 {
				 return "login success";
			 }
			 
		 }
		 return "login unsuccess";
	 }
	 public List<Hotel> hotelName(int h)
	 {
		return mtel.findHotelByhid(h);
		 
	 }
	 public List<Booking> bookHotel(Booking b,Hotel h,String mobile)
		{
			
			List<Booking> blist=new ArrayList<>();
			blist=monb.findAll();
			
			List<Hotel> hlist=new ArrayList<>();
			hlist=mtel.findAll();

			
			List<Customer> clist=new ArrayList<>();
			clist=monc.findAll();
			
			
				for(Hotel h1:hlist)
				{
					if(h1.getHid()==b.getHotelid())
					{
					if(h1.getArooms()>=b.getNorooms())
					{
				
							int room=h1.getArooms()-b.getNorooms();
							
							System.out.println(room);
							h1.setArooms(room);
							
							int bid=random.nextInt(50);
							b.setBid(bid);
							mtel.save(h1);
							b.setStatus("room booked");
							monb.save(b);
							return monb.findBookingBybid(b.getBid());
					}
					}
				}
			return monb.findBookingBybid(b.getBid());
			
			}
		
	 public List<Booking> pastBookings(String mobile)
		{
		System.out.println(mobile);
		
			return monb.findBookingBycusid(mobile);
		}
	 public List<Booking> requestCustomer(int bookid)
		{
			List<Booking> blist=new ArrayList<>();
			blist=monb.findAll();
			for(Booking b:blist)
			{
			         if(bookid==b.getBid())
					{	 
			        	 b.setStatus("requesting for cancel room");
			        	 monb.save(b);
				          return monb.findBookingBybid(bookid);
					}
			}
			return monb.findBookingBybid(90);
		}
	 public List<Booking> getdailybookings()
	   {
		   List<Booking> blist=new ArrayList<>();
		   blist=monb.findAll();
		   return blist;
	   }	
	 public List<Booking> displayCancel()
	   {
		   List<Booking> b1=monb.findBookingBystatus("requesting for cancel room");
		   return b1;
	   }
	 public String displayDone()
	   {
		   List<Booking> b1=monb.findAll();
		   List<Hotel> h=mtel.findAll();
		   for(Booking b:b1)
		   {
			   if(b.getStatus().equals("requesting for cancel room"))
			   {
				   b.setStatus("cancelled!!!");
				   monb.save(b);
				   for(Hotel h1:h)
				   {
					   if(h1.getHid()==b.getHotelid())
					   {
						   int rooms=h1.getArooms()+b.getNorooms();
		                   h1.setArooms(rooms);
				
					   mtel.save(h1);
					   }
					   
				   }
				   }
				   
			   }
		   
		   
		   return "Successfully cancelled";
	   }
	   
	
}


	 
	 
