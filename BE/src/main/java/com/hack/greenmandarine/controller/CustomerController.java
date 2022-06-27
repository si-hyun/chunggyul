package com.hack.greenmandarine.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.greenmandarine.dto.CustomerDto;
import com.hack.greenmandarine.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {

	public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private CustomerService customerService;

	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody CustomerDto customer) {
		Map<String, Object> resultMap = new HashMap<>();
		HttpStatus status = null;
		try {
			CustomerDto loginUser = customerService.login(customer);
			if (loginUser != null) {
				resultMap.put("message", SUCCESS);
				resultMap.put("customerInfo", loginUser);
				status = HttpStatus.ACCEPTED;
			} else {
				resultMap.put("message", FAIL);
				status = HttpStatus.ACCEPTED;
			}
		} catch (Exception e) {
			logger.error("로그인 실패 : {}", e);
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}
}
