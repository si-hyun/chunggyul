package com.hack.greenmandarine.mapper;

import java.sql.SQLException;

import com.hack.greenmandarine.dto.CustomerDto;


public interface CustomerMapper {
	public CustomerDto login(CustomerDto customer) throws SQLException;
	//public CustomerDto userInfo(String userid) throws SQLException;
	//public boolean deleteInfo(String userid);
	//public boolean updateInfo(CustomerDto customer);
	//public int checkId(String userid);
	//public boolean insertInfo(CustomerDto customer);
}