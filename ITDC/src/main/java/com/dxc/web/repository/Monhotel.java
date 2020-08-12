package com.dxc.web.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.web.pojos.Hotel;

public interface Monhotel extends MongoRepository<Hotel , Integer>
{
	public List<Hotel> findHotelByhid(int hid);
	

}
