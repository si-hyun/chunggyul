package com.hack.greenmandarine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.greenmandarine.dto.CustomerDto;
import com.hack.greenmandarine.dto.LoanDto;
import com.hack.greenmandarine.dto.PolicyDto;
import com.hack.greenmandarine.dto.TransactionDto;
import com.hack.greenmandarine.dto.UserBehaviorDto;
import com.hack.greenmandarine.service.MainService;

@RestController
@RequestMapping("/calendar")
public class PolicyController {

	public static final Logger logger = LoggerFactory.getLogger(PolicyController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private MainService mainService;
	
	@GetMapping("/policy")
	public ResponseEntity<Map<String, Object>> getIncomeAndSpendRatio(@RequestBody CustomerDto customer) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		List<PolicyDto> policyList = mainService.getPolicy(customer);
		
		resultMap.put("customerInfo", customer);
		resultMap.put("policyList", policyList);
		
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	 	
}
