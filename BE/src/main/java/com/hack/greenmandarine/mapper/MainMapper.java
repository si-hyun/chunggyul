package com.hack.greenmandarine.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.hack.greenmandarine.dto.CustomerDto;
import com.hack.greenmandarine.dto.LoanDto;
import com.hack.greenmandarine.dto.PolicyDto;
import com.hack.greenmandarine.dto.TransactionDto;
import com.hack.greenmandarine.dto.UserBehaviorDto;


public interface MainMapper {
	public void generate(CustomerDto customer) throws SQLException;
	public CustomerDto getInfo(CustomerDto customer) throws SQLException;
	public UserBehaviorDto getUserBehavior(CustomerDto customer) throws SQLException;
	public UserBehaviorDto recommend(CustomerDto customer) throws SQLException;
	public List<LoanDto> checkPossLoan(CustomerDto customer) throws SQLException;
	public List<Map<String,Object>> categoryInfo(CustomerDto customer) throws SQLException;
	public int transferCount(CustomerDto customer) throws SQLException;
	public List<TransactionDto> spendIncomeRatio(CustomerDto customer) throws SQLException;
	public List<PolicyDto> getPolicy(CustomerDto customer) throws SQLException;
}