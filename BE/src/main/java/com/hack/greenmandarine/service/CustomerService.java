package com.hack.greenmandarine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hack.greenmandarine.dto.CustomerDto;
import com.hack.greenmandarine.mapper.CustomerMapper;


@Service
public class CustomerService {

	@Autowired
	private  CustomerMapper customerMapper;
	
	public CustomerDto login(CustomerDto customer) throws Exception {
		if(customer.getCustomer_id() == null || customer.getCustomer_pw() == null)
			return null;
		return customerMapper.login(customer);
	}
}
