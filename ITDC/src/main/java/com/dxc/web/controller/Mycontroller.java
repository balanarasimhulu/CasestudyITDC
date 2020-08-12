package com.dxc.web.controller;

import java.util.List; 

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;     
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.web.Services.IServices;


import com.dxc.web.pojos.*;


@Controller
public class Mycontroller 
{
	Hotel h;
	String message;
	@Autowired
	IServices iser;
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/signup")
	public String signup(@ModelAttribute Head a,Model m)
	{
		System.out.println(a);
		System.out.println("hai");
		String s1= iser.adminSignup(a);
		System.out.println(s1);
		m.addAttribute("message",s1);
		return "view";
	}
	@RequestMapping("/signin")
	public String signin(@ModelAttribute Head a,Model m)
	{
		System.out.println(a);
		System.out.println("hai");
		String s1= iser.adminSignin(a);
		if(s1.equals("login success"))
		{
		System.out.println(s1);
		m.addAttribute("message",s1);
		return "adminoperations";
		}
		else
		{
			message="Loginunsuccessful";
			m.addAttribute("message",message);
			return "view";
		}
	}
	@RequestMapping("/addhotel")
	public String addHotel(@ModelAttribute Hotel h,Model m)
	{
		System.out.println(h);
		
		String s1=iser.addHotel(h);
		m.addAttribute("message",s1);
		return "view";
	}
	@RequestMapping("/displayhotel")
	public String displayHotel(Model m,HttpSession session)
	{
		
		List<Hotel> l=iser.displayHotels();
		m.addAttribute("list",l);
		return "displayhotel";
	}
	@RequestMapping("cussignup")
	public String Customer(@ModelAttribute Customer c,Model m)
	{
		String s1= iser.customerSignup(c);
		System.out.println(s1);
		m.addAttribute("message",s1);
		return "view";
	}
	@RequestMapping("/cussignin")
	public String signin(@ModelAttribute Customer c,Model m,HttpSession session)
	{
		System.out.println(c);
		session.setAttribute("customer", c);
		String s1= iser.customerSignin(c);
		System.out.println(s1);
		if(s1.equals("login success"))
		{
			m.addAttribute("message",s1);
			return "customeroperations";
		
		}
			message="Loginunsuccessful";
			m.addAttribute("message",message);
			return "view";
		
	}
	@RequestMapping("/displaynamehotel")
	public String displaynameHotel(Model m,HttpSession session)
	{
		List<Hotel> l=iser.displayHotels();
		session.setAttribute("Hotellist", l);
		System.out.println(l);
		if(l.isEmpty())
		{
			message="There are no Hotels";
			m.addAttribute("message", message);
			return "view";
		}
		m.addAttribute("list",l);
		return "displaynamehotel";
	}
	@RequestMapping("/gethotel")
	public String gethotel(@RequestParam int hid,Model m)
	{
		List<Hotel> h1=iser.hotelName(hid);
		if(!(h1.isEmpty()))
		{
		m.addAttribute("list",h1);
		return "displayhotel";
		}
		message="There is no such Hotel";
		m.addAttribute("message", message);
		return "view";
		
		
	}
	@RequestMapping("/bookhotel")
	public String bookhotel(@ModelAttribute Booking b,Model m,HttpSession session)
	{
		double Amount;
		List<Hotel> list=(List<Hotel>)session.getAttribute("Hotellist");
		System.out.println(list);
		Customer c=(Customer)session.getAttribute("customer");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(b.getHotelid()+""+list.get(i).getHid());
			System.out.println(b.getHotelid()==list.get(i).getHid());
			if(b.getHotelid()==list.get(i).getHid())
			{
				if(c.getCid().equals(b.getCusid()))
				{
					Amount=b.getNorooms()*list.get(i).getCproom();
					 List<Booking> li=iser.bookHotel( b, h,c.getCid());
					
					if(!(li.isEmpty()))
					{
					m.addAttribute("list", li);
					m.addAttribute("cost", Amount);
					return "successfullybooked";
					}
						
					else
					{
						message="N0 Available Rooms!!!";
						m.addAttribute("message", message);
						return "view";
					}
					
				}
				else
				{
					message="Customer id is invalid";
					m.addAttribute("message", message);
					return "view";
				}
			}
			else
			{
				message ="Invalid Hotel Number";
			}
		}
		m.addAttribute("message", message);
		return "view";
	}
	@RequestMapping("/pastbook")
	public String pastbookings(@ModelAttribute Booking b,Model m,HttpSession session)
	{
		Customer c=(Customer) session.getAttribute("customer");	
		List<Booking> list=iser.pastBookings(c.getCid());
		if(!(list.isEmpty())) 
		{
			m.addAttribute("list", list);
			return "pastbooking";
		}
		message="NO PAST BOOKINGS!!!";
		m.addAttribute("message", message);
		return "view";
		
	}
	@RequestMapping("/requestcancelbooking")
	public String requestforcancellation(@RequestParam int bookid,Model m,HttpSession session)
	{
		List<Booking> blist=iser.requestCustomer(bookid);
		System.out.println(blist);
		
		if(!(blist.isEmpty()))
		{
			message="Request Send to Admin";
		m.addAttribute("message", message);
		return "view";
		}
		else
		{
			message="Invalis details";
			m.addAttribute("message", message);
			return "view";
		}
		
	}
	@RequestMapping("/getdailybookings")
	public String getdailybookings(@ModelAttribute Customer c,@ModelAttribute Booking b,Model m,HttpSession session)
	{
		
		String mobile=c.getCid();
		System.out.println("daily bookings in admin controller");
		List<Booking> list=iser.getdailybookings();
		session.setAttribute("list",list );
		if(list.isEmpty()) 
		{
		   message="No Bookings";
		   m.addAttribute("message", message);
		   return "view";
		}
		else
		{
			m.addAttribute("list", list);
			m.addAttribute("mobile",mobile);
			return "dailybooklist";
		}
		
	}
	@RequestMapping("/displaycancelbooking")
	public String approveCancel(HttpSession session,Model m)
	{
		List<Booking> blist=iser.displayCancel();
		if(!(blist.isEmpty()))
		{
			m.addAttribute("list", blist);
			return "cancelbooking";
			
		}
		else
		{
			message="Their is No Request from Customer";
			m.addAttribute("message", message);
			return "view";
		}
        		  	
	}
	@RequestMapping("/nomoney")
	public String requestforcancellation(Model m,HttpSession session)
	{
		
		String b1=iser.displayDone();
		m.addAttribute("message", b1);
		return "view";
	}
}

	
	
	
	
	
	
	

	


