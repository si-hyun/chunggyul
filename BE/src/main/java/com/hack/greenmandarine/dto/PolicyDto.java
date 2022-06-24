package com.hack.greenmandarine.dto;

import java.util.Date;

public class PolicyDto {
	
	private String policy_no;
	private String policy_name;
	private String p_category;
	private String p_condition;
	private String detail;
	private int	   gm;
	private Date   start_date;
	private Date   end_date;

	public String getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

	public String getP_condition() {
		return p_condition;
	}

	public void setP_condition(String p_condition) {
		this.p_condition = p_condition;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getGm() {
		return gm;
	}

	public void setGm(int gm) {
		this.gm = gm;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public PolicyDto() {
		
	}

	public PolicyDto(String policy_no, String policy_name, String p_category, String p_condition, String detail, int gm,
			Date start_date, Date end_date) {
		super();
		this.policy_no = policy_no;
		this.policy_name = policy_name;
		this.p_category = p_category;
		this.p_condition = p_condition;
		this.detail = detail;
		this.gm = gm;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	
	
}
