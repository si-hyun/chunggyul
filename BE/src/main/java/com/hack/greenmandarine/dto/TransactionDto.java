package com.hack.greenmandarine.dto;

import java.util.Date;

public class TransactionDto {
	
	private String trans_code;
	private String t_category;
	private String product_type;
	private int	   cost;
	private int    trans_bf_balance;
	private int	   trans_af_balance;
	private Date   trans_date;

	public String getTrans_code() {
		return trans_code;
	}

	public void setTrans_code(String trans_code) {
		this.trans_code = trans_code;
	}

	public String getT_category() {
		return t_category;
	}

	public void setT_category(String t_category) {
		this.t_category = t_category;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getTrans_bf_balance() {
		return trans_bf_balance;
	}

	public void setTrans_bf_balance(int trans_bf_balance) {
		this.trans_bf_balance = trans_bf_balance;
	}

	public int getTrans_af_balance() {
		return trans_af_balance;
	}

	public void setTrans_af_balance(int trans_af_balance) {
		this.trans_af_balance = trans_af_balance;
	}

	public Date getTrans_date() {
		return trans_date;
	}

	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}

	public TransactionDto() {
		
	}

	public TransactionDto(String trans_code, String t_category, String product_type, int cost, int trans_bf_balance,
			int trans_af_balance, Date trans_date) {
		super();
		this.trans_code = trans_code;
		this.t_category = t_category;
		this.product_type = product_type;
		this.cost = cost;
		this.trans_bf_balance = trans_bf_balance;
		this.trans_af_balance = trans_af_balance;
		this.trans_date = trans_date;
	}
	
}
