package com.dxc.web.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.web.pojos.Booking;
@Repository
public interface Mongobooking  extends MongoRepository<Booking, Integer>
{
	public List<Booking> findBookingBycusid(String s);
	public List<Booking> findBookingBybid(int s);
	public List<Booking> findBookingBystatus(String s);

}
