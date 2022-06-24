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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.greenmandarine.dto.CustomerDto;
import com.hack.greenmandarine.dto.LoanDto;
import com.hack.greenmandarine.dto.UserBehaviorDto;
import com.hack.greenmandarine.service.MainService;

@RestController
@RequestMapping("/myScore")
public class ScoreController {

	public static final Logger logger = LoggerFactory.getLogger(ScoreController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private MainService mainService;

	@PutMapping("/gmScore")
	public ResponseEntity<Map<String, Object>> generateGMScore(@RequestBody CustomerDto customer) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		CustomerDto userInfo = mainService.generateGMScore(customer);

		resultMap.put("customerInfo", userInfo);
		
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	@GetMapping("/recommend")
	public ResponseEntity<Map<String, Object>> recommendMethod(@RequestBody CustomerDto customer) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		UserBehaviorDto userBehavior = mainService.recommendMethod(customer);
		
		resultMap.put("userBehavior", userBehavior);
		
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	@GetMapping("/checkLoan")
	public ResponseEntity<Map<String, Object>> checkPossibleLoan(@RequestBody CustomerDto customer) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		List<LoanDto> possLoanList = mainService.checkPossLoan(customer);
		
		resultMap.put("possLoanList", possLoanList);
		
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	
}