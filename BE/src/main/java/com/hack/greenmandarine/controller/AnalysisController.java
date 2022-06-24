package com.hack.greenmandarine.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hack.greenmandarine.dto.CustomerDto;
import com.hack.greenmandarine.dto.LoanDto;
import com.hack.greenmandarine.dto.TransactionDto;
import com.hack.greenmandarine.dto.UserBehaviorDto;
import com.hack.greenmandarine.service.MainService;

@RestController
@RequestMapping("/myGM")
public class AnalysisController {

	public static final Logger logger = LoggerFactory.getLogger(AnalysisController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private MainService mainService;
	
	@GetMapping("/analysis")
	public ResponseEntity<Map<String, Object>> getCategory(@RequestBody CustomerDto customer) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		// 지출 금액 상위 3개 카테고리 뽑아서 담아줌
		// key1 : category , value = "식비" (예시)
		// key2 : total_cost , value = 352000 (예시)
		List<Map<String, Object>> categoryInfo = mainService.getCategoryInfo(customer);
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		for(Map<String, Object> temp : categoryInfo) {
			list.add(temp.get("category"));
			list.add(temp.get("total_cost"));
		}
		
		// 이부분 되는지 안되는지 확실히 모름.. 돌려봐야 알 듯. 
		resultMap.put("category1", list.get(0));
		resultMap.put("total_cost1", list.get(1));
		resultMap.put("category2", list.get(2));
		resultMap.put("total_cost2", list.get(3));
		resultMap.put("category3", list.get(4));
		resultMap.put("total_cost3", list.get(5));
		
		int transferCount = mainService.getTransferCount(customer);
		
		resultMap.put("transferCount", transferCount);
		
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	@GetMapping("/ratio")
	public ResponseEntity<Map<String, Object>> getSpendIncomeRatio(@RequestBody CustomerDto customer) throws Exception {
		
		// 수정 해야댐
		Map<String, Object> resultMap = new HashMap<>();
		
		List<TransactionDto> categoryList = mainService.getSpendIncomeRatio(customer);
		
		resultMap.put("categoryList", categoryList);
		
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	
	@GetMapping("/showOthers")
	public ResponseEntity<Map<String, Object>> showOthers(@RequestBody CustomerDto customer) throws Exception {
		// 여기는 아직 뭐 넘겨줘야할지 몰라서 customer로만 넣어둠.
		Map<String, Object> resultMap = new HashMap<>();
		
		//List<TransactionDto> categoryList = mainService.getCategoryResult(customer);
		
		resultMap.put("customerInfo", customer);
		
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	 	
}
