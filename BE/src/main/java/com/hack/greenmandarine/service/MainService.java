package com.hack.greenmandarine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hack.greenmandarine.dto.CustomerDto;
import com.hack.greenmandarine.dto.LoanDto;
import com.hack.greenmandarine.dto.PolicyDto;
import com.hack.greenmandarine.dto.TransactionDto;
import com.hack.greenmandarine.dto.UserBehaviorDto;
import com.hack.greenmandarine.mapper.MainMapper;


@Service
public class MainService {

	@Autowired
	private  MainMapper mainMapper;
	
	public CustomerDto generateGMScore(CustomerDto customer) throws Exception {
		
		CustomerDto result = null;
		
		if(customer.getGm_yn() == "N") {
			
			// 청귤점수 구하는 로직 작성.
			UserBehaviorDto userBehavior = mainMapper.getUserBehavior(customer);
			int gmScore = 500;
			int gmGrade = 3;
			customer.setGm(gmScore);
			customer.setGm_grade(gmGrade);
			
			mainMapper.generate(customer);
			result = mainMapper.getInfo(customer);
		}
			
		return result;
	}
	
	public UserBehaviorDto recommendMethod(CustomerDto customer) throws Exception {
		
		return mainMapper.recommend(customer);
		
	}
	
	public List<LoanDto> checkPossLoan(CustomerDto customer) throws Exception {
		
		// 대출 가능 상품 로직 구현 
		return mainMapper.checkPossLoan(customer);
		
	}
	
	public List<Map<String, Object>> getCategoryInfo(CustomerDto customer) throws Exception {
		
		return mainMapper.categoryInfo(customer);
		
	}
	public int getTransferCount(CustomerDto customer) throws Exception {
		
		return mainMapper.transferCount(customer);
		
	}
	
	public List<TransactionDto> getSpendIncomeRatio(CustomerDto customer) throws Exception {
		
		// 수정 필요
		return mainMapper.spendIncomeRatio(customer);
		
	}
	
	public List<PolicyDto> getPolicy(CustomerDto customer) throws Exception {
		
		// 수정 필요
		return mainMapper.getPolicy(customer);
		
	}
	
	// showOthers 처리할 메서드 필요
	
	
}
