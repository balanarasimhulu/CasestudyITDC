package com.dxc.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.web.pojos.Customer;

public interface Moncustomer extends MongoRepository<Customer, Integer>
{
	

}
